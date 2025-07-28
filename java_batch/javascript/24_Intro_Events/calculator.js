let valueA=0;
let valueB=0;
const inputboxA=document.getElementById("valueA");
const inputboxB=document.querySelector("#valueB");
console.log(inputboxA);
console.log(inputboxB);
inputboxA.addEventListener("keyup",(event)=>{
    valueA=Number(event.target.value);
    console.log(event.target.value)})
inputboxB.addEventListener("keyup",(event)=>{
    valueB=Number(event.target.value);
    console.log(event.target.value)})
const button=document.getElementById("add");
[[[]]]
button.addEventListener("click",()=>{
    alert(valueA+valueB)
})






