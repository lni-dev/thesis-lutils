#
# Variables
#
from classes import SplitInfo

dir="../../../benchmark-results/benchmark6"
referenceDir=None
#referenceDir="../../../benchmark-results/benchmark9reference"

#
# Code
#

import matplotlib.pyplot as plt
import numpy as np
from pathlib import Path
import json

def custom_fmt(x):
    return f"{x:.0f}"

with open(dir + "/summary.json", 'r') as file:
    data = json.load(file)

labels = tuple(data.keys())
bar_graph_exec_time_data = tuple(float(data[label]["measurementsAvg"]) for label in labels)
bar_graph_alloc_data = tuple(float(data[label]["allocationsMeasurementsAvg"]) for label in labels)

if referenceDir is not None:
    with open(referenceDir + "/summary.json", 'r') as file:
        referenceData = json.load(file)

    bar_graph_exec_time_ref_data = tuple(float(referenceData[label]["measurementsAvg"]) for label in labels)
    bar_graph_alloc_ref_data = tuple(float(referenceData[label]["allocationsMeasurementsAvg"]) for label in labels)


plt.figure()
plt.grid(axis='y', linestyle='--', linewidth=0.7, zorder=0)
plt.gca().ticklabel_format(axis='y', useMathText=True) # Make plt not use 1e7 and instead display as 10^7
rects = plt.bar(labels, bar_graph_exec_time_data, zorder=3)
plt.bar_label(rects, fmt=custom_fmt, padding=3)
if referenceDir is not None:
    plt.bar(labels, bar_graph_exec_time_ref_data, zorder=4, color="#462087")
plt.ylabel("Execution Time (ns)")
plt.xlabel('')
plt.tight_layout()
plt.ylim(0, max(bar_graph_exec_time_data) * 1.1)
plt.savefig("../../../benchmark-results/plots_for_paper/execution_time_of_" + Path(dir).name + ".png", dpi=300)
plt.show()

plt.figure()
plt.grid(axis='y', linestyle='--', linewidth=0.7, zorder=0)
plt.gca().ticklabel_format(axis='y', useMathText=True) # Make plt not use 1e7 and instead display as 10^7
rects = plt.bar(labels, bar_graph_alloc_data, zorder=3)
plt.bar_label(rects, fmt=custom_fmt, padding=3)

if referenceDir is not None:
    plt.bar(labels, bar_graph_alloc_ref_data, zorder=4, color="#462087")
plt.ylabel("Allocated Bytes")
plt.xlabel('')
plt.tight_layout()
plt.ylim(0, max(bar_graph_alloc_data) * 1.1)
plt.savefig("../../../benchmark-results/plots_for_paper/allocation_rate_of_" + Path(dir).name + ".png", dpi=300)
plt.show()

if referenceDir is None:

    split = SplitInfo(bar_graph_exec_time_data, 10)
    if split.botMax != 0:
        fig, (ax1, ax2) = plt.subplots(2, 1, sharex=True, height_ratios=[split.topWidth, 1-split.topWidth])
        fig.subplots_adjust(left=0.21, hspace=0.06)  # adjust space between Axes
        fig.supylabel("Execution Time (ns)")
        plt.xlabel('')

        # plot the same data on both Axes
        rects = ax1.bar(labels, bar_graph_exec_time_data, zorder=3)
        ax1.bar_label(rects, fmt=custom_fmt, padding=3)
        ax1.grid(axis='y', linestyle='--', linewidth=0.7, zorder=0)
        ax1.ticklabel_format(axis='y', useMathText=True) # Make plt not use 1e7 and instead display as 10^7

        rects = ax2.bar(labels, bar_graph_exec_time_data, zorder=3)
        ax2.bar_label(rects, fmt=custom_fmt, padding=3)
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

        plt.savefig("../../../benchmark-results/plots_for_paper/broken_axis__execution_time_of_" + Path(dir).name + ".png", dpi=300)
        plt.show()

    split = SplitInfo(bar_graph_alloc_data, 10)
    if split.botMax != 0:
        fig, (ax1, ax2) = plt.subplots(2, 1, sharex=True, height_ratios=[split.topWidth, 1-split.topWidth])
        fig.subplots_adjust(left=0.21, hspace=0.06)  # adjust space between Axes
        fig.supylabel("Allocated Bytes")
        plt.xlabel('')

        # plot the same data on both Axes
        rects = ax1.bar(labels, bar_graph_alloc_data, zorder=3)
        ax1.bar_label(rects, fmt=custom_fmt, padding=3)
        ax1.grid(axis='y', linestyle='--', linewidth=0.7, zorder=0)
        ax1.ticklabel_format(axis='y', useMathText=True) # Make plt not use 1e7 and instead display as 10^7

        rects = ax2.bar(labels, bar_graph_alloc_data, zorder=3)
        ax2.bar_label(rects, fmt=custom_fmt, padding=3)
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

        plt.savefig("../../../benchmark-results/plots_for_paper/broken_axis__allocation_rate_of_" + Path(dir).name + ".png", dpi=300)
        plt.show()