/**
 *  Task: The Odd Ones
    Odd numbers are NOT divisible by 2. 
    Write a Javascript program that prints out all the odd numbers between 1 and 20. Your code must use a for-loop.
 */


for(let oddNumber = 0; oddNumber <= 20; oddNumber++){
    if((oddNumber%2) != 0){
        console.log(oddNumber);
    }
}