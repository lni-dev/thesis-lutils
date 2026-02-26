import matplotlib.pyplot as plt
import numpy as np


#
# Fixed value script
#

labels = ("lwjgl", "ffma", "lutils", "jna")
means = {
    'experiment 1': (118695278, 94844143, 73165734, 79408842),
    'experiment 2': (117634620, 97781989, 81092109, 80251941),
    'experiment 3': (229391244, 248829148, 247704301, 349907362),
}

x = np.arange(len(labels))  # the label locations
width = 0.25  # the width of the bars
multiplier = 0

fig, ax = plt.subplots(layout='constrained')

def custom_fmt(x):
    return f"{x / 100000000:.2f}"

for attribute, measurement in means.items():
    offset = width * multiplier
    rects = ax.bar(x + offset, measurement, width, label=attribute)
    ax.bar_label(rects, fmt=custom_fmt, padding=3)
    multiplier += 1

ax.ticklabel_format(useMathText=True)
ax.set_ylabel('Execution Time (ns)')
ax.set_title('Startup Execution Times Across All Experiments')
ax.set_xticks(x + width, labels)
ax.legend(loc='upper left', ncols=3)
ax.set_ylim(0, 349907362 * 1.1)

plt.show()

for i, label in enumerate(labels):
    print(label)
    print(f"    e3 - e2: {(means['experiment 3'][i] - means['experiment 2'][i]):.10f}")
    print(f"    e3 - e1: {(means['experiment 3'][i] - means['experiment 1'][i]):.10f}")
    print(f"    e3 / e2: {(means['experiment 3'][i] / means['experiment 2'][i]):.2f}")
    print(f"    e3 / e1: {(means['experiment 3'][i] / means['experiment 1'][i]):.2f}")
