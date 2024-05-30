# Calculate the sum of numbers within an array

import numpy as np

def sum_of_numbers(array):
    array_of_numbers = np.array(array)
    total_sum = np.sum(array_of_numbers)
    return total_sum


print(sum_of_numbers([1, 3, 5, 6, 2]))
print(sum_of_numbers([1, 3, 5]))
