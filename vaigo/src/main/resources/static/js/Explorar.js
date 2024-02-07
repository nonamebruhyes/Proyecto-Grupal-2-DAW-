var abierto = false;

/* When the user clicks on the button, 
toggle between hiding and showing the dropdown content */
function FiltroFunction() {
    event.stopPropagation();
   var a= document.getElementById("dropdown-content");
 
   if(!abierto){
    window.scrollTo(0,0);
    a.classList.toggle("show-2");
    a.style="display:block;"
    abierto=true;
    document.body.style.overflow = "hidden";
   }else{
    window.scrollTo(0,0);
    window.setTimeout(
    function removethis()
    {
        a.classList.toggle("show-2");
        a.classList.toggle("show-2-out");
        a.style="display:none;"
        document.body.style.overflow = "auto";
    }, 500);
    a.classList.toggle("show-2-out");
    abierto = false;
   }
}

//obtener listas de los filtros al cargar la pagina
window.addEventListener('load', function (e) {
    var urls = ["ciudades", "paises", "terrenos", "transportes", "estancias"];

    for (let i = 0; i < urls; i++) {
        fetch("api/" + urls[i])
    }



});



//funcion para crear elemento vacio mediante el DOM
function crearElemento(tipo = "br", padre = contenido){
    let elemento = document.createElement(tipo);
    padre.appendChild(elemento);
    return elemento;
}

// funcion para crear un elemento con contenido texto mediante el DOM
function crearElementoTexto(texto = "Ejemplo", tipo = "div", padre = contenido){
    let elemento = document.createElement(tipo);
    elemento.textContent = texto;
    padre.appendChild(elemento);
    return elemento;
}



