window.addEventListener("load", function (event)  {
 let data1 = "1";
 let url = "http://localhost:8888/api/buscarUsu?dato="+data1+"";

 // Concatena el dato como parámetro en la URL

 fetch(url, {
     method: "GET",
     headers: {
         "Content-Type": "application/json"
     }
 })
     .then(response => response.json())
     .then(data =>{datosUsu(data)})
});

function datosUsu(data){
let nombre=document.getElementById('nombre1');
let mail=document.getElementById('correo1');
let contra=document.getElementById('password1');
console.log(data.username);
nombre.setAttribute('value',data.username);
mail.setAttribute('value',data.correo);
contra.setAttribute('value',data.password);

}