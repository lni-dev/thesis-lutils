#
# Variables
#

b1Path="../../../benchmark-results/benchmark2"
b2Path="../../../benchmark-results/benchmark5"
b1Path="../../../benchmark-results/benchmark3"
b2Path="../../../benchmark-results/benchmark7"
b1RefPath=None
b2RefPath=None
b1RefPath="../../../benchmark-results/benchmark3reference"
b2RefPath="../../../benchmark-results/benchmark7reference"

#
# Code
#

import matplotlib.pyplot as plt
import numpy as np
from pathlib import Path
import json

def draw(display, yLabel):
    with open(b1Path + "/summary.json", 'r') as file:
        b1Data = json.load(file)

    with open(b2Path + "/summary.json", 'r') as file:
        b2Data = json.load(file)

    labels = tuple(b1Data.keys())
    means = {
        'experiment 1': tuple(float(b1Data[label][display]) for label in labels),
        'experiment 2': tuple(float(b2Data[label][display]) for label in labels),
    }

    if b1RefPath is not None and b2RefPath is not None:
        with open(b1RefPath + "/summary.json", 'r') as file:
            b1RefData = json.load(file)

        with open(b2RefPath + "/summary.json", 'r') as file:
            b2RefData = json.load(file)

        refMeans = {
            'experiment 1': tuple(float(b1RefData[label][display]) for label in labels),
            'experiment 2': tuple(float(b2RefData[label][display]) for label in labels),
        }

    colors = {
        'experiment 1': "#1a80bb",
        'experiment 2': "#ea801c",
    }

    refColors = {
        'experiment 1': "#462087",
        'experiment 2': "#a00000",
    }


    max_value = max(v for tup in means.values() for v in tup)

    x = np.arange(len(labels))  # the label locations
    width = 0.33  # the width of the bars
    multiplier = 0

    fig, ax = plt.subplots(layout='constrained')

    def custom_fmt(x):
        return f"{x:.0f}"

    for attribute, measurement in means.items():
        offset = width * multiplier
        rects = ax.bar(x + offset, measurement, width, label=attribute, zorder=3, color=colors[attribute])
        if b1RefPath is not None and b2RefPath is not None:
            ax.bar(x + offset, refMeans[attribute], width,label="reference", zorder=4, color=refColors[attribute])
        ax.bar_label(rects, fmt=custom_fmt, padding=3)
        multiplier += 1

    ax.ticklabel_format(useMathText=True)
    ax.set_ylabel(yLabel)
    ax.set_title('')
    ax.set_xticks(x + (width/2), labels)
    ax.legend(loc='upper left', ncols=2)
    ax.set_ylim(0, max_value * 1.1)

    plt.savefig("../../../benchmark-results/plots_for_paper/" + display + "_of_" + Path(b1Path).name + "_and_" + Path(b2Path).name + ".png", dpi=300)
    plt.show()

draw("measurementsAvg", "Execution Time (ns)")
draw("allocationsMeasurementsMedian", "Allocated Bytes")