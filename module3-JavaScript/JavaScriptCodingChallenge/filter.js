// Create a function that filters out negative numbers

const numberArray = [-2, 0, 4, 5, -19, -10];

function filterOutNegative(arr) {
    const filtered = arr.filter((num) => num >= 0);
    return filtered;
}

console.log(filterOutNegative(numberArray)); //This functions filters out all the negative numbers in a given array and returns an array of the positive numbers