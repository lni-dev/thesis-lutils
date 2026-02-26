#
# Variables
#

b1Path="../../../benchmark-results/benchmark2"
b2Path="../../../benchmark-results/benchmark3"

display="measurementsAvg"
yLabel="Execution Time (ns)"

#display="allocationsMeasurementsMedian"
#yLabel="Allocated Bytes"

#
# Code
#

import matplotlib.pyplot as plt
import numpy as np
from pathlib import Path
import json

with open(b1Path + "/summary.json", 'r') as file:
    b1Data = json.load(file)

with open(b2Path + "/summary.json", 'r') as file:
    b2Data = json.load(file)

labels = tuple(b1Data.keys())
means = {
    'benchmark 1': tuple(float(b1Data[label][display]) for label in labels),
    'benchmark 2': tuple(float(b2Data[label][display]) for label in labels),
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
    rects = ax.bar(x + offset, measurement, width, label=attribute)
    ax.bar_label(rects, fmt=custom_fmt, padding=3)
    multiplier += 1

ax.ticklabel_format(useMathText=True)
ax.set_ylabel('Execution Time (ns)')
ax.set_title('')
ax.set_xticks(x + (width/2), labels)
ax.legend(loc='upper left', ncols=2)
ax.set_ylim(0, max_value * 1.1)

plt.savefig("../../../benchmark-results/plots_for_paper/" + Path(b1Path).name + "_and_" + Path(b2Path).name + ".png", dpi=300)
plt.show()