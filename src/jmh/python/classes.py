import numpy as np


class SplitInfo:
    botMax = 0
    topMin = 0
    topMax = -1
    topWidth = .5

    def __init__(self, data, break_factor=10):
        if len(data) == 1:
            return

        sorted_data = sorted(data, reverse=False)

        self.topMax = sorted_data[-1]

        for i in range(1, len(sorted_data)):
            if sorted_data[i] > sorted_data[i-1]*break_factor:
                break_factor = sorted_data[i] / sorted_data[i-1]
                self.botMax = sorted_data[i-1]
                self.topMin = sorted_data[i]
                if len(sorted_data) - i == 1:
                    self.topWidth = 0.33 # The top plot has only a single datapoint, so make it smaller
        pass

class Reference:
    dict = {}

    def __init__(self, data):
        self.dict = data
        print(str(self.dict))

    def measurementsStd(self, lib_name):
        return self.dict[lib_name]["measurementsStd"]

    def measurementsAvg(self, lib_name):
            return self.dict[lib_name]["measurementsAvg"]

    def measurementsMedian(self, lib_name):
        return self.dict[lib_name]["measurementsMedian"]

    def allocationsMeasurementsStd(self, lib_name):
        return self.dict[lib_name]["allocationsMeasurementsStd"]

    def allocationsMeasurementsAvg(self, lib_name):
        return self.dict[lib_name]["allocationsMeasurementsAvg"]

    def allocationsMeasurementsMedian(self, lib_name):
        return self.dict[lib_name]["allocationsMeasurementsMedian"]

def count_outliers(x, range):
    a = np.array(x)
    upper_quartile = np.percentile(a, 75)
    lower_quartile = np.percentile(a, 25)
    IQR = (upper_quartile - lower_quartile) * range
    quartileSet = (lower_quartile - IQR, upper_quartile + IQR)
    result = 0
    for y in a.tolist():
        if not (y >= quartileSet[0] and y <= quartileSet[1]):
            result = result + 1
    return result