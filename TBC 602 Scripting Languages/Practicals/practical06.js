// js program to find sum of two numbers
function sum(array) {
    result= 0
    array.forEach(element => {
        result+=element
    });
    return result
}


const arr= [1, 2, 3, 4, 5, 6, 7]
console.log("The sum of arr is: ", sum(arr))
