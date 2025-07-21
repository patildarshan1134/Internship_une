const bodyElement = document.body;
console.log(bodyElement);
const divElement = document.createElement("div");
bodyElement.appendChild(divElement);
bodyElement.style.backgroundColor= "black";
bodyElement.style.display = "flex";
bodyElement.style.margin = "200px 60px";
bodyElement.style.justifyContent = "space-between";
divElement.innerHTML = 'Hi,<br> I\'m <span style = "color:darkGreen;">Sunny </span> <br> <span style="color:blue;">The Web Designer</span>';
divElement.style.margin="90px ";
divElement.style.color="white ";
divElement.style.lineHeight="2.5";
divElement.style.fontSize="30px";
divElement.style.fontWeight="3px";
divElement.style.fontFamily = " 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif";


const img1 = document.createElement('img');
img1.src ='WhatsApp_Image .jpg';
img1.style.width="400px";
img1.style.height="500px";
img1.style.border="2px solid white";
img1.style.borderRadius="80px";
img1.style.marginRight=" 60px";

document.body.appendChild(img1);