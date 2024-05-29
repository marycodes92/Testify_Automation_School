"""
Create a class called Human
Add an attribute leg_count with the value of 4
Add a method called get_gender() that returns "Unknown" in the Human class
Create another class called Man that extends Human

Optionally you can instantiate the classes Man and Woman then print out the values of the get_gender() method in each object instance
"""


class Human:
    leg_count = 4

    def get_gender(self):
        return 'Unknown'


class Man(Human):
    pass


class Woman(Human):
    pass


man = Man()
woman = Woman()
print(man.get_gender())
print(woman.get_gender())
