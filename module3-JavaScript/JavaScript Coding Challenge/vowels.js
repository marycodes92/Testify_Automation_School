// Return the number of vowels in a string.

function vowelCount(words) {
    // Convert the string to lowercase to handle both lowercase and uppercase vowels and defining regex to match vowels
    words = words.toLowerCase();
    const regex = /[aeiou]/g;
    const matches = words.match(regex);
    return matches ? matches.length : 0;
}

console.log(vowelCount('my name is MARY, I AM A BIG TESTER')) //This function returns all vowels in any word/sentence passed as argument, irrexpective of whether it is uppercase or lowercase