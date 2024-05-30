# Create a function that filters out negative numbers

def filter_negative_num(arrNum):
    return [i for i in arrNum if i >= 0]


numbers_array = [3, -1, 4, -1, 5, -9, 2, -6, 5, 3, -5]
print(filter_negative_num(numbers_array))
