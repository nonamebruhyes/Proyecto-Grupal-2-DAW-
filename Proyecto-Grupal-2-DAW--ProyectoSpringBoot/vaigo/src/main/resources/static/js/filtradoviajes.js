let selectpanes = document.getElementById("planes");
let selectciudaes = document.getElementById("ciudad");
let selectpaises = document.getElementById("pais");
let selectterrenos = document.getElementById("terreno");
let selecttransportes = document.getElementById("transporte");
let selectestancias = document.getElementById("estancia");

window.addEventListener('load', function () {
    selectpanes.innerHTML += "<option value='T'>Planes propios</option>";
    cargarfiltros("ciudades");
    cargarfiltros("paises");
    cargarfiltros("terrenos");
    cargarfiltros("transportes");
    cargarfiltros("estancias");
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



document.getElementById("filtrar").addEventListener("click", function () {
   let link = "http://localhost:8888/explorar?";
    if (selectpanes.value == "T") {
        link += "planes=" + selectpanes.value;
    }
    if (selectciudaes.value != "0") {
        link += "&ciudad=" + selectciudaes.value;
    }
if (selectpaises.value != "0") {
        link += "&pais=" + selectpaises.value;
    }
if (selectterrenos.value != "0") {
        link += "&terreno=" + selectterrenos.value;
    }
if (selecttransportes.value != "0") {
        link += "&transporte=" + selecttransportes.value;
    }
if (selectestancias.value != "0") {
        link += "&estancia=" + selectestancias.value;
    }
    window.location.href = link;
}
);