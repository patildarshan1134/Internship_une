const url = "https://fakestoreapi.com/products";

fetch(url)
  .then(response => response.json())
  .then(data => {
    const products = data.products || data.data || data;
    console.log(data);

    const productsDiv = document.getElementById("products");

    products.forEach(product => {
      const productDiv = document.createElement("div");
      productDiv.style.border = "1px solid #ccc";
      productDiv.style.margin = "10px";
      productDiv.style.padding = "10px";
      productDiv.style.width = "300px";
      productDiv.style.textAlign = "center";

      const title = document.createElement("h3");
      title.textContent = product.title;

      const img = document.createElement("img");
      img.src = product.image;
      img.alt = product.title;
      img.style.width = "100px";
      img.style.height = "100px";
      img.style.objectFit = "contain";

      const price = document.createElement("p");
      price.textContent = `Price: $${product.price}`;
      price.style.fontWeight = "bold";


const AddtocartButton  = document.createElement("button");
      AddtocartButton.textContent = "Add to Cart";
     AddtocartButton.style.backgroundColor = "#28a745";
     
    
      productDiv.appendChild(title);
      productDiv.appendChild(img);
      productDiv.appendChild(price);

      productsDiv.appendChild(productDiv);

          productDiv.appendChild(AddtocartButton);


    });
  });