    const numbers = [4,2,5,8];
    numbers.forEach((value,index )=>{
    console.log(value);
    console.log(index);
    })
    numbers.forEach(function numloop(){
        
})
const number = [4,3,5,6,5];


const sqr = function (number){
    return number * number;
}

const sqrnumber = number.map(sqr);
console.log(sqrnumber);

const output3 = number.filter((a,b)=>{
  return a % 2 == 0;
  
})
console.log(output3);




// we can also write it as
/*
const sqrnumber = numbers.map((number)=>{
     
    return number*number;

})
console.log(sqrnumber);
*/


