var abierto = false;
var a = document.getElementById("dropdown-content");

/* When the user clicks on the button, 
toggle between hiding and showing the dropdown content */
function FiltroFunction() {
    event.stopPropagation();

    if (!abierto) {
        window.scrollTo(0, 0);
        a.classList.toggle("show-2");
        a.style = "display:block;"
        abierto = true;
        document.body.style.overflow = "hidden";
    } else {
        window.scrollTo(0, 0);
        window.setTimeout(removethis()
            , 500);
        a.classList.toggle("show-2-out");
        abierto = false;
    }

}

function removethis() {
    a.classList.toggle("show-2");
    a.classList.toggle("show-2-out");
    a.style = "display:none;"
    document.body.style.overflow = "auto";
}

window.addEventListener('resize', function () {
    if (window.innerWidth >= 800) {
        a.style = "display:block;"
    }
    if (window.innerWidth <= 800) {
        a.style = "display:none;"
    }
})

let selectpanes = document.getElementById("planes");
let selectciudaes = document.getElementById("ciudades");
let selectpaises = document.getElementById("paises");
let selectterrenos = document.getElementById("terrenos");
let selecttransportes = document.getElementById("transportes");
let selectestancias = document.getElementById("estancias");
window.addEventListener('load', function (e) {
    cargarfiltros("ciudades");
    cargarfiltros("paises");
    cargarfiltros("terrenos");
    cargarfiltros("transportes");
    cargarfiltros("estancias");
    if (window.location.toString().includes("?")){
        fetch(window.location.toString().replace("?", "/")).then(response => response.json()).then(data => {

        }).catch(error => console.error(error));
    }else{
        fetch("http://localhost:8888/todo").then(response => response.json()).then(data => {

        }).catch(error => console.error(error));
    }
});
function crearElementoTexto( texto ,tipo , padre , valor ) {
    let elemento = document.createElement(tipo);
    elemento.textContent = texto;
    padre.appendChild(elemento);
    elemento.value = valor;
    return elemento;
}

function cargarfiltros(url){
    fetch("http://localhost:8888/api/"+url)
        .then(response => response.json()).then(data => {
        switch (url) {
            case "ciudades":
                selectciudaes.innerHTML = "<option value='0'>Todos</option>";
                data.forEach(element => {
                    crearElementoTexto(element.ciudad, "option", selectciudaes, element.id);
                });
                break;
            case "paises":
                let paises = data;
                selectpaises.innerHTML = "<option value='0'>Todos</option>";
                paises.forEach(element => {
                    crearElementoTexto(element.pais, "option", selectpaises, element.id);
                });
                break;

            case "terrenos":
                selectterrenos.innerHTML = "<option value='0'>Todos</option>";
                let terrenos = data;
                terrenos.forEach(element => {
                    crearElementoTexto(element.tipo, "option", selectterrenos, element.id);
                });
                break;

            case "transportes":
                selecttransportes.innerHTML = "<option value='0'>Todos</option>";
                let transportes = data;
                transportes.forEach(element => {
                    crearElementoTexto(element.tipo, "option", selecttransportes, element.id);
                });
                break;

            case "estancias":
                selectestancias.innerHTML = "<option value='0'>Todos</option>";
                let estancias = data;
                estancias.forEach(element => {
                    crearElementoTexto(element.tipo, "option", selectestancias, element.id);
                });
                break;
            default:
                break;

        }
    }).catch(error => console.error('Error:', error));}
