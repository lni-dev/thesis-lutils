#
# Variables
#

dir="../../../benchmark-results/allocation_benchmark/"

#
# Code
#

import matplotlib.pyplot as plt
import numpy as np
import sys
from os import listdir
import json
from matplotlib.ticker import LogLocator, FuncFormatter

with open(dir + "optimizationtests.AllocateBenchmark.json", 'r') as file:
    data = json.load(file)

all = {}
std = {}
mins = {}
maxs = {}

for run in data:
    size = int(run["params"]["size"])
    time = run["primaryMetric"]["score"]
    benchmarkName = run["benchmark"].split(".")[-1][8:].lower().replace("_", " ")
    rawData = run["primaryMetric"]["rawData"][0]
    
    if benchmarkName not in all:
        all[benchmarkName] = {}
        std[benchmarkName] = 0
        mins[benchmarkName] = 100000
        maxs[benchmarkName] = 0

    all[benchmarkName][size] = time
    std[benchmarkName] = std[benchmarkName] + np.std(rawData)
    mins[benchmarkName] = min(mins[benchmarkName], time)
    maxs[benchmarkName] = max(maxs[benchmarkName], time)

allTimes = {}
any_benchmark = next(iter(all.values()))
sizes = sorted(list(any_benchmark.keys()))

for benchmarkName, stdSum in std.items():
    print("std(" + benchmarkName + "): " + str(stdSum / len(sizes)))
    print("min(" + benchmarkName + "): " + str(mins[benchmarkName]))
    print("max(" + benchmarkName + "): " + str(maxs[benchmarkName]))

for benchmarkName, runs in all.items():
    allTimes[benchmarkName] = [None] * len(sizes)
    i = 0
    for size in sizes:
        allTimes[benchmarkName][i] = runs[size]
        i = i+1


print("sizes: " + str(sizes))

fontsize=16
plt.rcParams.update({'font.size': fontsize})
# Complete plot

for benchmarkName, times in allTimes.items():
    print(benchmarkName + ": " + str(times))
    plt.plot(sizes, times, marker='o', markersize=2, label=benchmarkName)


plt.xscale('log')
plt.title('')
plt.xlabel('Allocation Size (bytes)', fontsize=fontsize)
plt.ylabel('Execution Time (ns)', fontsize=fontsize)
plt.legend(fontsize=13)
plt.xticks(fontsize=fontsize)
plt.yticks(fontsize=fontsize)
plt.ylim(bottom=0)
plt.tight_layout()
plt.savefig(dir + "/graph.png", dpi=300)
plt.show()

# Only the small sizes
keep = int(len(sizes)*0.4)
for benchmarkName, times in allTimes.items():
    plt.plot(sizes[:keep], times[:keep], marker='o', markersize=2, label=benchmarkName)


plt.title('')
plt.xlabel('Allocation Size (bytes)', fontsize=fontsize)
plt.ylabel('Execution Time (ns)', fontsize=fontsize)
plt.legend(fontsize=13)
plt.xticks(fontsize=fontsize)
plt.yticks(fontsize=fontsize)
plt.ylim(bottom=0)
plt.tight_layout()
plt.savefig(dir + "/graph_small.png", dpi=300)
plt.show()

