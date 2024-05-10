"""
Create a function that prints out "Hello World"
Invoke the same function in it own body
Invoke the function outside the function block

Take note of the function invoke and put the Python whitespace rule in mind
"""

def greet():
    print("Hello World")
    greet()
    return

greet()