const fun2= ()=>{} //arrow function
 function fun1(){}  //normal function
const arr=[1,2,3,4,5,6]
 const output= arr.forEach((value,index)=>{
    // console.log(value)
    // console.log(index)
    // return value*2;
     console.log(value*2)

 })
//  console.log(output)
const abc= arr.map((value,index)=>{
    // console.log(value)
    // console.log(index)
    // return value*2;
    //  console.log(value*2)
     return value*value;
     
 })
    console.log(abc)
 const arr2=[1,2,3,4,5,6]
     const output4= arr2.map((a,b,c)=>{
        console.log(a)
       console.log(b) 
       console.log(c) 
     })