let valueA = 0;
let valueB = 0;

const a=document.querySelector("#input1");
const b=document.querySelector("#input2");

console.log("A:", a);
console.log("B:", b);

a.addEventListener("keyup", (e)=>{
    console.log(e.target.value);
        valueA=Number(e.target.value);
});


b.addEventListener("keyup", (e)=>{
    console.log(e.target.value);
        valueB=Number(e.target.value);
});

console.log("Value A:", valueA);
console.log("Value B:", valueB);

const button = document.querySelector("#addButton");


button.addEventListener("click",(e)=>{
    const sum= valueA + valueB;
    alert(`Sum of given numbers are  : ${sum}`);
    

});
const subButton = document.querySelector("#subButton");
subButton.addEventListener("click",(e)=>{
    const sub= valueA - valueB;
    alert(`Subtraction of given numbers are  : ${sub}`);
    
});
const mulButton = document.querySelector("#mulButton");
mulButton.addEventListener("click",(e)=>{
    const mul= valueA * valueB;
    alert(`Multiplication of given numbers are  : ${mul}`);
    
});``