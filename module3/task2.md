1. You can concatenate a number and a string in Javascript. 
    const date = "Friday" + 5 "th";

2. Semi-colon can be used at the beginning of a line in javascript code. E.g;
    ;var a = 2
    ;console.log(a)

3. Undefined is not a reserved word. 
    const undefined = meeeee;

4. NaN (Not a Number) is of type "number" in Javascript.
    typeof NaN // number

5. Surprisingly typeof null is an 'object'.
    typeof null // object

6. In javascript the comparison operators act really weird in many cases. Examples;
    NaN == NaN // -> false
    NaN === NaN // -> false
    [] == true // -> false
    [] === true // -> false

7. Functions are considered "first class citizens" in Javascript. This means that function can be assigned to variables, passed as arguments to  other functions, and returned from functions just like any other data type. This functional programming aspect of JavaScript enables developers to write more flexible and concise code, promoting modularity and code reusability.

8. "alert()" and "console.log()" are not javascript: Surprised right? Well, the "alert()" and "console.*()" functions that we use in JavaScript are not actually included in the JS specification. In fact, many other JS APIs and methods such as fetch(), getCurrentLocation(), getUserMeta(), and file operation methods like fs.write() are not specified by the TC39 committee. Although these APIs and methods may look like JavaScript functions and object methods, they are not defined by the JS language. They follow the syntax rules of JS, but their behaviors are actually controlled by the environment in which the JS engine is running. In other words, these APIs and methods are simply guests in the JS playground, rather than being an official part of the JS specification.

9. Javascript has Backwards compatibility, not forwards: This means that code written in the past should still work in the present and future.

10. In javascript the difference in parenthesis position can make two functions different. Example;

function f1() {
   return
   {
      grade: 'A+'
   }
}

function f2() {
   return {
      grade: 'A+'
   }
}
typeof f1() === typeof f2(); // -> false
