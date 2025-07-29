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

      const addToCartButton = document.createElement("button");
      addToCartButton.textContent = "Add to Cart";
      addToCartButton.style.backgroundColor = "#28a745";
      addToCartButton.style.color = "white";
      addToCartButton.style.border = "none";
      addToCartButton.style.padding = "8px 12px";
      addToCartButton.style.cursor = "pointer";


      addToCartButton.addEventListener("click", () => {
window.open("cart.html","_self");
        alert(`Added to cart: ${product.title}`);
        console.log(`Added to cart: ${product.title} (ID: ${product.id})( Price: $${product.price})`);
      });

     
      productDiv.appendChild(title);
      productDiv.appendChild(img);
      productDiv.appendChild(price);
      productDiv.appendChild(addToCartButton);

      productsDiv.appendChild(productDiv);
    });
  });
