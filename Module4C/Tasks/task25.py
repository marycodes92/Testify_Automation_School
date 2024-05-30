"""
Create a class called Utilities
Create a static method called print_name which accepts a parameter, and prints out the parameter.
Invoke the static method print_name()

You can use any of the two methods to create your static methods.
"""


class Utilities:

    @staticmethod
    def print_name(name):
        print('Full Name: ', name)


utility = Utilities()
utility.print_name('Mary Onuorah')


class Human:

    @staticmethod
    def print_name(name):
        print('First Name: ', name)


Human.print_name = staticmethod(Human.print_name)
girl = Human()
girl.print_name('Mary')
