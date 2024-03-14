// Sort an array of numbers in descending order.

const numberArray = [30, 2, 80, 32, 4];

function sortNumberArray(array){
   return array.sort((a, b)=>{ 
        return b-a
    })
}

console.log(sortNumberArray(numberArray)) // This function sorts in descending order whatever number array passed