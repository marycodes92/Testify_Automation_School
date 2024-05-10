"""
Use for loop to iterate from 0 to 10

For each iteration print out "Number ", i

If the i value is equal to 2 add the continue
a
If the i value is equal to 8 dd the break statement

For instruction 2, to print out Number and i, use the statement in your loop, print("Number", i)
"""

number = 10

for i in range(number):
    if i == 2:
        continue
    if i == 8:
        break
    print("Number ", i)
