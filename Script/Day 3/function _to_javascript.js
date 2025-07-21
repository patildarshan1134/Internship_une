


const Person = {
    Name:"Darshuu",
    Roll_no:124
}


console.log(Person.Name);
console.log(Person["Roll_no"]);

Person.gen = "Male";
Person["College"] = "KKWP";


//Accessing object in javaScript
for(let key in Person){
console.log(Person[key]);
}

//Second Way by Object.key
console.log(Object.keys(Person));