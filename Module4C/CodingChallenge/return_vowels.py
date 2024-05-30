# Return the number of vowels in a string

def vowel_count(string):
    vowels = "aeiouAEIOU"
    return sum(1 for char in string if char in vowels)


name = 'Euphemia'
string = 'one'
strings = 'tfdvb'
print(vowel_count(name))
print(vowel_count(string))
print(vowel_count(strings))
