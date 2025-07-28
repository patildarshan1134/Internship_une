   const a=document.getElementById("valueA");
        const b=document.querySelector("#valueB");
        console.log("A=", a);
        console.log("B=", b);
    
        var valueA=0;
        var valueB=0;
    a.addEventListener("keyup",(e)=>{
        console.log(e.target.value);
        valueA=Number(e.target.value);
    })
    b.addEventListener("keyup",(e)=>{
        console.log(e.target.value);
        valueB=Number(e.target.value);
    })
    console.log(valueA);
    console.log(valueB);
    const buttonS = document.getElementById("addition");

    buttonS.addEventListener("click",()=>{
       console.log(valueA + valueB);
    })