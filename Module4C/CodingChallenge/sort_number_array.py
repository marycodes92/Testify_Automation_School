# Sort an array of numbers in descending order

def sort_array_descending(arr):
    return sorted(arr, reverse=True)


student_grade = [160, 30, 15, 40, 5]
ages = [ 35, 20, 90, 3, 9]

print(sort_array_descending(student_grade))
print(sort_array_descending(ages))
