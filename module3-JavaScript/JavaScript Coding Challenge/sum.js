// Calculate the sum of numbers within an array

const myArray = [30, 2, 80, 32, 4];

const result = myArray.reduce((initial, current)=> initial + current, 0);

console.log(result);