
let selector= document.getElementById("selector");
window.addEventListener("load", function (event)  {

 let data1 = "2";
 let url = "http://localhost:8888/api/ItiTodo?dato="+data1+"";

 // Concatena el dato como parámetro en la URL
 let urlWithParam = `${url}?dato=${data1}`;

 fetch(url, {
     method: "GET",
     headers: {
         "Content-Type": "application/json"
     }
 })
     .then(response => response.json())
     .then(data => console.log(data))

});




function crearElementoTexto(texto = "Ejemplo", tipo = "div", padre = contenido) {
    let elemento = document.createElement(tipo);
    elemento.textContent = texto;
    padre.appendChild(elemento);
    return elemento;
}