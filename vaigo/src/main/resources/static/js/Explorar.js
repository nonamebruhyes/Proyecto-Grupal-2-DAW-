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

let selectpanes = document.getElementById("planes");
let selectciudaes = document.getElementById("ciudades");
let selectpaises = document.getElementById("paises");
let selectterrenos = document.getElementById("terrenos");
let selecttransportes = document.getElementById("transportes");
let selectestancias = document.getElementById("estancias");
window.addEventListener('load', function (e) {
    let urls = ["ciudades", "paises", "terrenos", "transportes", "estancias"];
    crearElementoTexto("Vaigo", "option", selectpanes, 0 );


    for (let i = 0; i < urls.length; i++) {
        fetch("http://localhost:8888/api/" + urls[i]).then(response => response.json()).then(data => {
        switch (urls[i]) {
            case "ciudades":
                ciudades = data;
                ciudades.forEach(element => {
                    crearElementoTexto(element.ciudad, "option", selectciudaes, element.id);
                });
                break;
            case "paises":
                paises = data;
                paises.forEach(element => {
                    crearElementoTexto(element.pais, "option", selectpaises, element.id);
                });
                break;
            case "terrenos":
                terrenos = data;
                terrenos.forEach(element => {
                    crearElementoTexto(element.tipo, "option", selectterrenos, element.id);
               crearElementoTexto(element.tipo, "option", selectestancias, element.id);
                });
                break;
         })
                break;
            case "transportes":
                transportes = data;
                transportes.forEach(element => {
                    crearElementoTexto(element.tipo, "option", selecttransportes, element.id);
                });
                break;
            case "estancias":
                estancias = data;
                estancias.forEach(element => {
                    crearElementoTexto(element.tipo, "option", selectestancias, element.id);
                });
                break;

                default:
                    break;

        }


        }).catch(error => console.error('Error:', error));
    }



});




function crearElemento(tipo = "br", padre = contenido){
    let elemento = document.createElement(tipo);
    padre.appendChild(elemento);
    return elemento;
}

function crearElementoTexto(texto = "Ejemplo", tipo = "div", padre = contenido, valor ){
    let elemento = document.createElement(tipo);
    elemento.textContent = texto;
    elemento.value = valor;
    padre.appendChild(elemento);
    return elemento;
}



