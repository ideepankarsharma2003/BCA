// javascript
// Variable identifiers
var myVariable = 10;
var firstName = "John";

// Function identifier
function greet(name) {
  console.log("Hello, " + name + "!");
}

// Object identifier
var person = {
  name: "Alice",
  age: 25
};

// Using identifiers in code
greet(firstName);
console.log(person.name);























function calculateSum(a, b) {
  return a + b;
}

let result = calculateSum(3, 5);
// result is 8







// 1. ** parseInt **: Converts a string to an integer.
let number1 = parseInt("42");
// number is 42

// 2. ** parseFloat **: Converts a string to a floating - point number.
let number2 = parseFloat("3.14");
// number is 3.14

// 3. ** setTimeout **: Executes a function after a specified delay(in milliseconds).
setTimeout(function() {
  console.log("Delayed function executed");
}, 2000); // Executes after 2 seconds

// 4. ** alert **: Displays an alert dialog box with a specified message.
alert("Hello, world!");

// 5. ** console.log **: Outputs a message or object to the web console.
console.log("Hello, world!");






// 1. ** push **: Adds one or more elements to the end of an array.
let fruits1 = ["apple", "banana"];
fruits1.push("orange");
// fruits is now ["apple", "banana", "orange"]


// 2. ** pop **: Removes the last element from an array and returns it.
let fruits2 = ["apple", "banana", "orange"];
let lastFruit = fruits2.pop();
// lastFruit is "orange"
// fruits is now ["apple", "banana"]


// 3. ** concat **: Concatenates two or more arrays and returns a new array.
let fruits3 = ["apple", "banana"];
let moreFruits = ["orange", "grape"];
let allFruits = fruits3.concat(moreFruits);
// allFruits is ["apple", "banana", "orange", "grape"]


// 4. ** join **: Joins all elements of an array into a string, with an optional separator.
let fruits4 = ["apple", "banana", "orange"];
let fruitString = fruits4.join(", ");
// fruitString is "apple, banana, orange"


// 5. ** slice **: Returns a shallow copy of a portion of an array into a new array.
let fruits5 = ["apple", "banana", "orange", "grape"];
let citrusFruits = fruits5.slice(2);
// citrusFruits is ["orange", "grape"]


// 6. ** indexOf **: Returns the index of the first occurrence of a specified element in an array, or - 1 if not found.
let fruits6 = ["apple", "banana", "orange"];
let bananaIndex = fruits6.indexOf("banana");
// bananaIndex is 1















```
In JavaScript, errors and exceptions are mechanisms used to handle and manage unexpected or erroneous situations that can occur during the execution of a program.When an error or exception occurs, it interrupts the normal flow of the program and provides information about the issue encountered.Here are some common types of errors and exceptions in JavaScript:

1. ** Syntax Errors **: These occur when the code is not valid JavaScript.This can happen when you have missing brackets, missing quotes, or extra characters that are not valid in JavaScript.
2. ** Reference Errors **: These occur when the code references a variable that is not defined.
3. ** Type Errors **: These occur when an operation is performed on a value of an inappropriate type.
4. ** Range Errors **: These occur when a numeric value is not within the acceptable range.
5. ** Custom Errors **: JavaScript also allows you to create custom errors using the (Error) constructor.

```

```
1. ** Syntax Errors **: These occur when the code violates the syntax rules of the JavaScript language.It could be due to missing or misplaced characters, incorrect punctuation, or incorrect use of keywords.Syntax errors are usually detected by the JavaScript interpreter during the initial parsing of the code and prevent the code from running.

    Example:
```
let x = 5;
console.log(x;
// SyntaxError: missing ) after argument list


```
2. ** Reference Errors **: These occur when an invalid reference is made to a variable or function that does not exist or is out of scope.It typically happens when trying to access an undeclared variable or a variable that is not accessible in the current context.

    Example:
```
console.log(nonExistentVariable);
// ReferenceError: nonExistentVariable is not defined


```
3. ** Type Errors **: These occur when an operation is performed on a value of an inappropriate type.It can happen when trying to call a non - function, accessing properties on non - objects, or using incompatible operators.

    Example:
```
let num = 42;
num.toUpperCase();
// TypeError: num.toUpperCase is not a function

```
4. ** Range Errors **: These occur when a numeric value is not within the acceptable range.It usually happens when using methods like 'Array' or 'String' with invalid index values or specifying incorrect arguments for functions that expect a specific range of values.

    Example:
```
let arr = [1, 2, 3];
arr[10];
// RangeError: Invalid array length


```
5. ** Custom Errors **: JavaScript also allows you to create custom errors using the 'Error' constructor.Custom errors can be useful when you want to provide more specific information about an error or handle specific cases in your code.

    Example:
```
throw new Error("Custom error message");

```
To handle errors and exceptions, JavaScript provides the 'try...catch' statement, which allows you to attempt executing a block of code and catch any resulting errors or exceptions.This helps in gracefully handling errors and taking appropriate actions without abruptly terminating the program.

    Example:
```
try {
  // Code that might throw an error
  let result = someFunction();
} catch (error) {
  // Code to handle the error
  console.log("An error occurred:", error.message);
}
                                 
```
By using 'try...catch', you can capture and handle specific types of errors, perform error logging, display user - friendly error messages, or take alternative actions to recover from errors.
```
