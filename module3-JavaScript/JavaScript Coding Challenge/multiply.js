//Print a table containing multiplication tables.

// The below functions prints multiplication table for any number you pass to the function call
function multiplicationTable(firstNumber) {
    for (let i = 1; i <= 10; i++) {
        const result = firstNumber * i;
        console.log(`${firstNumber} x ${i} = ${result}`);
    }
}

multiplicationTable(4);