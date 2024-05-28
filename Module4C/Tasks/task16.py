"""
Declare a dictionary with any key-value pair of items/elements
Print the dictionary in console
Update the dictionary with two different key-value pair items
Print the dictionary in console again

Note: you can experiment with the other list functions too in the task
"""

human_being = {
    "name": "Kelechi",
    "gender": "male",
    "complexion": "dark"
}
print(human_being)

# update
human_being.update({'height': 6.5, 'hobby': 'running'})
print(human_being)

# get
gender = human_being.get('gender')
print('get_gender:', gender)

# items
tuples = human_being.items()
print('tuple:', tuples)

# keys
key = human_being.keys()
print('keys:', key)

# popitem
human_being.popitem()
print('popped:', human_being)



