# Print all even numbers from 0 – 100.

def even_numbers():
    evens = [num for num in range(0, 100) if num % 2 == 0]
    return evens


print(even_numbers())