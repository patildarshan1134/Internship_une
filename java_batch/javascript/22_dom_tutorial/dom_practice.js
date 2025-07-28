console.log(window);
console.log(window.document);
console.dir(window.document);

console.log(document.querySelector("body"));

const bodyElement = document.querySelector("body");

const divElement = document.createElement("div");

const pElement = document.createElement("p");

const h1Element = document.createElement("h1");
console.log(divElement);

bodyElement.appendChild(divElement);

divElement.appendChild(h1Element);

divElement.appendChild(pElement);

h1Element.textContent = "heading";
pElement.textContent = "This is Paragraph";

h1Element.style.color="red";
h1Element.style.backgroundColor = "green";


