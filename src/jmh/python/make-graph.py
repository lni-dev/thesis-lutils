import matplotlib.pyplot as plt
import numpy as np
import sys
from os import listdir
import json

from classes import SplitInfo, Reference, count_outliers

#
# Variables
#
benchmarkDir="../../../benchmark-results/benchmark6"

#
# Code
#


def to_forks_avg(array):
    diff = (max(array) - min(array))
    timeAvg = {
        "min": min(array),
        "max": max(array),
        "diff": diff,
        "diff/array[0] (percentage)": f"{((diff / array[0]) * 100):.2f}" + "%"
    }
    return timeAvg


class BenchmarkResults:
    libName = ""
    # Measured time for each iteration
    measurements = []
    measurementsStd = 0
    measurementsAvg = 0
    measurementsMax = 0
    # Allocation Measurements
    allocationsMeasurements = []
    allocationsMeasurementsStd = 0
    allocationsMeasurementsAvg = 0
    allocationsMeasurementsMedian = 0
    allocationsMeasurementsMax = 0

    # Forks
    forksTimeStd = []
    forksTimeAvg = []
    forksTimeMedian = []
    forksAllocStd = []
    forksAllocAvg = []
    forksAllocMedian = []

    def __init__(self, data):
        self.libName = data[0]["benchmark"].split(".")[3]
        self.measurements = data[0]["primaryMetric"]["rawData"][0]
        self.measurementsStd = np.std(self.measurements)
        self.measurementsAvg = np.average(self.measurements)
        self.measurementsMedian = np.median(self.measurements)
        self.allocationsMeasurements = data[0]["secondaryMetrics"]["gc.alloc.rate.norm"]["rawData"][0]
        self.allocationsMeasurementsStd = np.std(self.allocationsMeasurements)
        self.allocationsMeasurementsAvg = np.average(self.allocationsMeasurements)
        self.allocationsMeasurementsMedian = np.median(self.allocationsMeasurements)

        self.measurementsMax = max(self.measurements)
        self.allocationsMeasurementsMax = max(self.allocationsMeasurements)
        self.measurementsMin = min(self.measurements)
        self.allocationsMeasurementsMin = min(self.allocationsMeasurements)

        self.forksTimeStd = []
        self.forksTimeAvg = []
        self.forksTimeMedian = []
        self.forksAllocStd = []
        self.forksAllocAvg = []
        self.forksAllocMedian = []
        for i, item in enumerate(data[0]["primaryMetric"]["rawData"]):
            self.forksTimeStd.append(np.std(item))
            self.forksTimeAvg.append(np.average(item))
            self.forksTimeMedian.append(np.median(item))

        for i, item in enumerate(data[0]["secondaryMetrics"]["gc.alloc.rate.norm"]["rawData"]):
            self.forksAllocStd.append(np.std(item))
            self.forksAllocAvg.append(np.average(item))
            self.forksAllocMedian.append(np.median(item))

        if data[0]["secondaryMetrics"]["gc.alloc.rate.norm"]["scoreUnit"] != "B/op":
            raise ValueError("scoreUnit is not B/op, but is " + data[0]["secondaryMetrics"]["gc.alloc.rate.norm"]["scoreUnit"])

    def __len__(self):
        if self.libName == "lwjgl":
            return 0
        elif self.libName == "ffma":
            return 1
        elif self.libName == "lutils":
            return 2
        elif self.libName == "jna":
            return 3
        else:
            raise ValueError("Unknown lib name: " + self.libName)

    def to_forks_json(self):
        data = {
            "fork count": len(self.forksTimeAvg),
            "avg(exec. time)": to_forks_avg(self.forksTimeAvg),
            "median(exec. time)": to_forks_avg(self.forksTimeMedian),
            "std(exec. time)": to_forks_avg(self.forksTimeStd),
            "avg(alloc. rate)": to_forks_avg(self.forksAllocAvg),
            "median(alloc. rate)": to_forks_avg(self.forksAllocMedian),
            "std(alloc. rate)": to_forks_avg(self.forksAllocStd),
        }
        return data

    def to_json(self, lwjgl=None, ref:Reference=None):
        data = {
            "measurementsStd": f"{self.measurementsStd:.10f}",
            "measurementsAvg": f"{self.measurementsAvg:.10f}",
            "measurementsMedian": f"{self.measurementsMedian:.10f}",
            "measurementsMin": f"{self.measurementsMin:.10f}",
            "measurementsMax": f"{self.measurementsMax:.10f}",
            "measurementOutlierCount": f"{count_outliers(self.measurements, 1.5)}",
            "allocationsMeasurementsStd": f"{self.allocationsMeasurementsStd:.10f}",
            "allocationsMeasurementsAvg": f"{self.allocationsMeasurementsAvg:.10f}",
            "allocationsMeasurementsMedian": f"{self.allocationsMeasurementsMedian:.10f}",
            "allocationsMeasurementsMin": f"{self.allocationsMeasurementsMin:.10f}",
            "allocationsMeasurementsMax": f"{self.allocationsMeasurementsMax:.10f}",
            "allocationsMeasurementOutlierCount": f"{count_outliers(self.allocationsMeasurements, 1.5)}",
            "std/median(exec. time)": f"{(self.measurementsStd / self.measurementsMedian)*100:.2f}%",
            "std/average(exec. time)": f"{(self.measurementsStd / self.measurementsAvg)*100:.2f}%",
            "std/median(alloc. rate)": f"{(self.allocationsMeasurementsStd / self.allocationsMeasurementsMedian)*100:.2f}%",
            "std/average(alloc. rate)": f"{(self.allocationsMeasurementsStd / self.allocationsMeasurementsAvg)*100:.2f}%",
        }

        if lwjgl is not None:
            data["average/lwjgl (exec. time)"] = f"{(self.measurementsAvg / lwjgl.measurementsAvg):.2f}"
            data["median/lwjgl (exec. time)"] = f"{(self.measurementsMedian / lwjgl.measurementsMedian):.2f}"
            data["average/lwjgl (alloc. rate)"] = f"{(self.allocationsMeasurementsAvg / lwjgl.allocationsMeasurementsAvg):.2f}"
            data["median/lwjgl (alloc. rate)"] = f"{(self.allocationsMeasurementsMedian / lwjgl.allocationsMeasurementsMedian):.2f}"

        if ref is not None:
            data.update({
                "diff(op, *)": "op(measurement) - op(reference); diff/op(measurement)",
                "diff(avg, exec. time)": f"{(self.measurementsAvg - float(ref.measurementsAvg(self.libName))):.10f}; {((self.measurementsAvg - float(ref.measurementsAvg(self.libName)))/self.measurementsAvg) * 100:.2f}%",
                "diff(median, exec. time)": f"{(self.measurementsMedian - float(ref.measurementsMedian(self.libName))):.10f}; {((self.measurementsMedian - float(ref.measurementsMedian(self.libName)))/self.measurementsMedian) * 100:.2f}%",
                "diff(avg, alloc. rate)": f"{(self.allocationsMeasurementsAvg - float(ref.allocationsMeasurementsAvg(self.libName))):.10f}; {((self.allocationsMeasurementsAvg - float(ref.allocationsMeasurementsAvg(self.libName)))/self.allocationsMeasurementsAvg) * 100:.2f}%",
                "diff(median, alloc. rate)": f"{(self.allocationsMeasurementsMedian - float(ref.allocationsMeasurementsMedian(self.libName))):.10f}; {((self.allocationsMeasurementsMedian - float(ref.allocationsMeasurementsMedian(self.libName)))/self.allocationsMeasurementsMedian) * 100:.2f}%",

            })


        return data

def main(outliers):
    if len(sys.argv) > 1:
        output_dir = "../../../benchmark-results/" + sys.argv[1]
    else:
        output_dir = benchmarkDir

    print("Creating graph from output dir " + output_dir)

    files = listdir(output_dir)

    print("Files found: " + str(files))

    results = []
    reference = None

    for (path) in files:

        if path.startswith("summary") or path.startswith("forks_summary"):
            continue

        if not path.endswith(".json"):
            continue

        if path.startswith("reference"):
            with open(output_dir + "/" + path, 'r') as file:
                data = json.load(file)
            reference = Reference(data)
            continue

        with open(output_dir + "/" + path, 'r') as file:
            data = json.load(file)

        res = BenchmarkResults(data)
        print(res.libName + ":" + str(res.measurements))
        results.append(res)

    # Sort result array, so every graph has the same label order
    results.sort(key=len)

    # Create the boxplot graph
    box_plot_graph_data = []
    box_plot_graph_data_avgs = []
    labels = []
    bar_graph_data = []
    summary = {}
    forksSummary = {}
    box_plot_reference_data = []
    bar_graph_reference_data = []

    lwjgl_res = None
    for res in results:
        if res.libName == "lwjgl":
            lwjgl_res = res

    for res in results:
        box_plot_graph_data.append(res.measurements)
        box_plot_graph_data_avgs.append(res.measurementsAvg)
        labels.append(res.libName)
        bar_graph_data.append(res.allocationsMeasurementsMedian)
        summary[res.libName] = res.to_json(lwjgl_res, reference)
        forksSummary[res.libName] = res.to_forks_json()

        if reference is not None:
            box_plot_reference_data.append(reference.measurementsAvg(res.libName))
            bar_graph_reference_data.append(reference.allocationsMeasurementsMedian(res.libName))

    box_plot_reference_data = np.array(box_plot_reference_data, dtype=float)
    bar_graph_reference_data = np.array(bar_graph_reference_data, dtype=float)
    reference_data_positions = range(1, len(box_plot_reference_data) + 1)

    with open(output_dir + "/summary.json", "w") as f:
        json.dump(summary, f, indent=4)

    with open(output_dir + "/forks_summary.json", "w") as f:
        json.dump(forksSummary, f, indent=4)

    font_size=16
    plt.rcParams.update({'font.size': font_size})
    xlabel = '' #'Libraries'
    show_fliers=outliers
    post_fix=""
    if outliers:
        post_fix="_with_outliers"

    plt.figure()
    plt.grid(axis='y', linestyle='--', linewidth=0.7, zorder=0) # lines from left to right
    plt.boxplot(box_plot_graph_data, tick_labels=labels, zorder=3, showfliers=show_fliers)
    if reference is not None:
        plt.hlines(y=box_plot_reference_data, xmin=[p - 0.25 for p in reference_data_positions], xmax=[p + 0.25 for p in reference_data_positions],
                   linestyles='-', linewidth=1.5, color="#462087")
    plt.gca().ticklabel_format(axis='y', useMathText=True) # Make plt not use 1e7 and instead display as 10^7
    plt.title('')
    plt.ylabel('Execution Time in Nanoseconds', fontsize=font_size)
    plt.xlabel(xlabel)
    plt.ylim(bottom=0) # let 0 be at the very bottom
    plt.tight_layout()
    plt.savefig(output_dir + "/measurements" + post_fix + ".png", dpi=300)
    plt.show()

    plt.figure()
    plt.grid(axis='y', linestyle='--', linewidth=0.7, zorder=0)
    plt.gca().ticklabel_format(axis='y', useMathText=True) # Make plt not use 1e7 and instead display as 10^7
    plt.bar(labels, bar_graph_data, zorder=3)
    if reference is not None:
        print("bar_graph_data: " + str(bar_graph_data))
        print("bar_graph_reference_data: " + str(bar_graph_reference_data))
        plt.bar(labels, bar_graph_reference_data, zorder=4, color="#462087")
    plt.ylabel("Allocated Bytes (Java Heap)", fontsize=font_size)
    plt.xlabel(xlabel)
    plt.tight_layout()
    plt.savefig(output_dir + "/allocation.png", dpi=300)
    plt.show()


    # Bar chart with broken axis
    split = SplitInfo(bar_graph_data, 10)

    print("topMin: " + str(split.topMin) + ", botMax: " + str(split.botMax))

    if split.botMax != 0:
        fig, (ax1, ax2) = plt.subplots(2, 1, sharex=True, height_ratios=[split.topWidth, 1-split.topWidth])
        fig.subplots_adjust(left=0.21, hspace=0.06)  # adjust space between Axes
        fig.supylabel("Allocated Bytes (Java Heap)", fontsize=font_size)
        plt.xlabel(xlabel)

        # plot the same data on both Axes
        ax1.bar(labels, bar_graph_data, zorder=3)
        ax1.grid(axis='y', linestyle='--', linewidth=0.7, zorder=0)
        ax1.ticklabel_format(axis='y', useMathText=True) # Make plt not use 1e7 and instead display as 10^7

        ax2.bar(labels, bar_graph_data, zorder=3)
        ax2.grid(axis='y', linestyle='--', linewidth=0.7, zorder=0)
        ax2.ticklabel_format(axis='y', useMathText=True) # Make plt not use 1e7 and instead display as 10^7

        # zoom-in / limit the view to different portions of the data
        ax1.set_ylim(split.topMin * 0.95, split.topMax * 1.05)  # outliers only
        ax2.set_ylim(0, split.botMax * 1.05)  # most of the data

        # hide the spines between ax and ax2
        ax1.spines.bottom.set_visible(False)
        ax2.spines.top.set_visible(False)
        ax1.xaxis.tick_top()
        ax1.tick_params(labeltop=False)  # don't put tick labels at the top
        ax2.xaxis.tick_bottom()


        # https://matplotlib.org/stable/gallery/subplots_axes_and_figures/broken_axis.html
        d = .5  # proportion of vertical to horizontal extent of the slanted line
        kwargs = dict(marker=[(-1, -d), (1, d)], markersize=12, linestyle="none", color='k', mec='k', mew=1, clip_on=False)
        ax1.plot([0, 1], [0, 0], transform=ax1.transAxes, **kwargs)
        ax2.plot([0, 1], [1, 1], transform=ax2.transAxes, **kwargs)

        plt.savefig(output_dir + "/allocation-broken.png", dpi=300)
        plt.show()
        
    # broken box plot
    split = SplitInfo(box_plot_graph_data_avgs, 10)

    if split.botMax != 0:
        fig, (ax1, ax2) = plt.subplots(2, 1, sharex=True, height_ratios=[split.topWidth, 1-split.topWidth])
        fig.subplots_adjust(left=0.21, hspace=0.06)  # adjust space between Axes
        fig.supylabel("Execution Time in Nanoseconds", fontsize=font_size)
        plt.xlabel(xlabel)

        # plot the same data on both Axes
        ax1.boxplot(box_plot_graph_data, tick_labels=labels, zorder=3, showfliers=show_fliers)
        ax1.grid(axis='y', linestyle='--', linewidth=0.7, zorder=0)
        ax1.ticklabel_format(axis='y', useMathText=True) # Make plt not use 1e7 and instead display as 10^7

        ax2.boxplot(box_plot_graph_data, tick_labels=labels, zorder=3, showfliers=show_fliers)
        ax2.grid(axis='y', linestyle='--', linewidth=0.7, zorder=0)
        ax2.ticklabel_format(axis='y', useMathText=True) # Make plt not use 1e7 and instead display as 10^7

        # zoom-in / limit the view to different portions of the data
        ax1.set_ylim(split.topMin * 0.8, split.topMax * 1.2)  # outliers only
        ax2.set_ylim(0, split.botMax * 1.1)  # most of the data

        # hide the spines between ax and ax2
        ax1.spines.bottom.set_visible(False)
        ax2.spines.top.set_visible(False)
        ax1.xaxis.tick_top()
        ax1.tick_params(labeltop=False)  # don't put tick labels at the top
        ax2.xaxis.tick_bottom()

        # https://matplotlib.org/stable/gallery/subplots_axes_and_figures/broken_axis.html
        d = .5  # proportion of vertical to horizontal extent of the slanted line
        kwargs = dict(marker=[(-1, -d), (1, d)], markersize=12, linestyle="none", color='k', mec='k', mew=1, clip_on=False)
        ax1.plot([0, 1], [0, 0], transform=ax1.transAxes, **kwargs)
        ax2.plot([0, 1], [1, 1], transform=ax2.transAxes, **kwargs)

        plt.savefig(output_dir + "/measurements-broken" + post_fix + ".png", dpi=300)
        plt.show()


main(False)
main(True)