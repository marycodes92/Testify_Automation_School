"""
Declare a list with any value and number of item/element
Print the list in console
Sort the list
Print the list in console again

Note: you can experiment with the other list functions too in the task.
"""

students = ["Mary", "Euphemia", "Joy", "Love", "Etiena", "Ovo"]
print('Students:', students)

# sort
students.sort()
print('Sort: ', students)

# sort in descending order
students.sort(reverse=True)
print('Sorted_in_Descending_Order:', students)

# append
students.append("Uche")
print('New_list:', students)

# insert
students.insert(4, 'Ella')
print('list:', students)

# pop
students.pop()
print('pop:', students)

# pop by index
students.pop(3)
print('pop_index:', students)

# remove
students.remove('Etiena')
print('remove:', students)

# count
students.append("Love")
count = students.count('Love')
print('count:', count)

# extend
newList = ['Chi', 'Vivian', 'Pawlah']
students.extend(newList)
print('extend:', students)

students.reverse()
print('reversed_list:', students)