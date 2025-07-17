                    
                                ##### Introduction to Objects
             1. intro_Objects.js
         =>       - JavaScript objects are collections of key-value pairs.
                    - Created using {} notation.

                    const person = {
                    name: "Darshan",
                    age: 21
                    };

             2. _dot_bracket.js
          =>        - Accessing object properties:
                    - Dot notation: person.name
                    - Bracket notation: person["age"]

             3. computed_properties.js
           =>        - Dynamically set keys in objects.
                    const key = "email";
                    const user = {
                    [key]: "darshanpatil@example.com"
                    };


             4. iterate_objects.js
          =>         - Loop through object properties using for...in.
                    for (let key in person) {
                    console.log(key, person[key]);
                    }


             5. object_destructuring.js
           =>         - Extract values from objects into variables.
                    const { name, age } = person;


              6. nested_destructuring.js
            =>        - Destructure nested objects.
                    const user = { name: "Darshan", address: { city: "Nashik" } };
                    const { address: { city } } = user;


              7. object_inside_array.js
           =>         - Array of objects and accessing inner data.
                    const users = [{ name: "D" }, { name: "P" }];
                    console.log(users[0].name);


             8. spread_operator.js
           =>         - Copy or merge objects using ...
                    const newUser = { ...person, gender: "male" };




                 ############   Functions in JavaScript...!!



             1. Intro_function.js
                    - Basic function structure.
                    function greet() {
                    console.log("Hello!");
                    }


             2. function_declaration.js
                    - Declaring named functions.
                    function add(a, b) {
                    return a + b;
                    }


             3. function_expression.js
                    - Assigning functions to variables.
                    const multiply = function(x, y) {
                    return x * y;
                    };


             4. arrow_functions.js
                    - Shorter syntax using =>.
                    const subtract = (a, b) => a - b;


             5. callback_function.js
                    - Function passed as argument.
                    setTimeout(() => {
                    console.log("Callback!");
                    }, 1000);


              6. func_return_func.js
                    - Function returning another function.
                    function outer() {
                    return function inner() {
                    console.log("Returned Function");
                    };
                    }


             7. function_inside_function.js
                    - Nested functions with local scope.
                    function main() {
                    function helper() {
                    console.log("Helper function");
                    }
                    helper();
                    }


             8. default_parameter.js
                    - Provide default values.
                    function greet(name = "Guest") {
                    console.log("Hi", name);
                    }


             9. rest_parameters.js
                    - Handling multiple arguments.
                    function sum(...args) {
                    return args.reduce((a, b) => a + b);
                    }


             10. param_destructing.js
                    - Destructure function parameters.
                    function showUser({ name, age }) {
                    console.log(name, age);
                    }


             11. blockscope_vs_function.js
                    - let and const have block scope, var has function scope.


             12. lexical_Scope.js
                    - Inner functions can access outer variables due to lexical scope.


             13. hoisting_Intro.js
                    - Function declarations are hoisted, but expressions are not.
                    greet(); // Works
                    function greet() {
                    console.log("Hi!");
                    }
