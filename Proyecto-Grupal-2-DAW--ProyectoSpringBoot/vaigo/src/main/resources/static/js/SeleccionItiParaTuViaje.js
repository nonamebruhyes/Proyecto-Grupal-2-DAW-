
let selector= document.getElementById("selector");
window.addEventListener("load", function (event)  {
 let url = window.location.toString();
  url = url.replace("?", "/");
 // Concatena el dato como parámetro en la URL
 fetch(url, {
     method: "GET",
     headers: {
         "Content-Type": "application/json"
     }
 })
     .then(response => response.json())
     .then(data => VerIti(data))

});

function VerIti(data){


 let url2 = "http://localhost:8888/ItiEx?dato="+data.idCiudad+"";
                        fetch(url2, {
                            method: "GET",
                            headers: {
                                "Content-Type": "application/json"
                            }
                        })
                            .then(response => response.json() )
                            .then(data => {
                            VerIti2(data)
                            })


}

function VerIti2(data){
let ida=0;
let cont2=1;
for (let i = 0; i < data.length; i++) {
                    if(!(ida==data[i].idItinerario)){
                    crearElementoTexto(data[i].idItinerario,cont2, 'option', selector);
                    cont2+=1;
                    ida=data[i].idItinerario;
                    }
                }
                selector.addEventListener('change',function(){

                let value=selector.value;
                let padre=document.getElementById('exMostrar');
                padre.innerHTML='';
                let datosJson=data;
                let cont=1;
                    for(let i = 0; i < datosJson.length; i++){
                    const data1 = { "id": datosJson[i].idExcursion};


                    let url = "http://localhost:8888/buscarExcursion";
                        fetch(url, {
                            method: "POST",
                            headers: {
                                "Content-Type": "application/json"
                            },
                            body:  JSON.stringify(data1)
                        })
                            .then(response => response.json() )
                            .then(data => {
                            MostrarExcursiones(data,cont)
                            cont+=1;
                            })


                            }

                });
}

function MostrarExcursiones(texto = "Ejemplo",cont){

let padre=document.getElementById('exMostrar');
let padre2 = document.createElement('section');
let excursion = document.createElement('h3');
let nombre = document.createElement('p');
let precio = document.createElement('p');
excursion.textContent='Excursion '+cont+':';
nombre.textContent=texto.nombre;
precio.textContent=texto.precio;
padre2.appendChild(excursion)
padre2.appendChild(nombre)
padre2.appendChild(precio)
padre.appendChild(padre2);


}


function crearElementoTexto(value = "Ejemplo",texto = "Ejemplo", tipo = "div", padre = contenido) {
    let elemento = document.createElement(tipo);
    elemento.textContent = texto;
    elemento.setAttribute("value", value);
    padre.appendChild(elemento);
    return elemento;
}