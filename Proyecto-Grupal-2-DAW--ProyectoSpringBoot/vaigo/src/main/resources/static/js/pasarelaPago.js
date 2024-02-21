window.addEventListener("load", function (event)  {
let datosRecoje=JSON.parse(localStorage.getItem("datospasa"));
console.log(datosRecoje);



let url1 = "http://localhost:8888/api/Hotelid?dato="+datosRecoje.hotel_id+"";
                        fetch(url1, {
                            method: "GET",
                            headers: {
                                "Content-Type": "application/json"
                            }
                        })
                            .then(response => response.json() )
                            .then(data => {

                            let data1=data
                            let url2 = "http://localhost:8888/api/ViajeId?dato="+datosRecoje.viaje_id+"";
                                                    fetch(url2, {
                                                        method: "GET",
                                                        headers: {
                                                            "Content-Type": "application/json"
                                                        }
                                                    })
                                                        .then(response => response.json() )
                                                        .then(dat => {

                                                        let data2=dat

                                       let url3 = "http://localhost:8888/ItiID?dato="+datosRecoje.itinerario_id+"";
                                                          fetch(url3, {
                                                         method: "GET",
                                                            headers: {
                                                                "Content-Type": "application/json"
                                                         }
                                                     })
                                                            .then(response => response.json() )
                                                            .then(da => {

                                                            let data3=da

                                                            console.log(data1);
                                                            console.log(data2);
                                                            console.log(data3);
                                                            Cambios(data1,data2,data3);
                                                            })

                                                          })
                            })


});

function Cambios(data1,data2,data3){

let nomhote=document.getElementById('hotel');

nomhote.textContent=data1.nombre;

let prehote=document.getElementById('hotelpre');

prehote.textContent=data1.precio.toFixed(2)+'€';
let precio=0;

 let url4 = "http://localhost:8888/api/TransporteId?dato="+data2.idTransporte+"";
                        fetch(url4, {
                            method: "GET",
                            headers: {
                                "Content-Type": "application/json"
                            }
                        })
                            .then(response => response.json() )
                            .then(data4 => {
                            console.log(data4)

                        let tra=document.getElementById('trans');
                        tra.textContent=data4.tipo;
                        let tran=document.getElementById('prectra');
                         tran.textContent=data4.precio.toFixed(2)+'€';
                         let total=document.getElementById('total');
                            let todo=data1.precio+data4.precio;
                            for(let i = 0; i < data3.length; i++){
                            let url5 = "http://localhost:8888/api/ExcursionId?dato="+data3[i].idExcursion+"";
                                                    fetch(url5, {
                                                        method: "GET",
                                                        headers: {
                                                            "Content-Type": "application/json"
                                                        }
                                                    })
                                                        .then(response => response.json() )
                                                        .then(data5 => {
                                                       precio+=data5.precio;

                                                       let acti=document.getElementById('acti2');

                                                       acti.textContent=precio.toFixed(2)+'€';
                                                       let act=document.getElementById('acti');

                                                               act.textContent=precio.toFixed(2)+'€';
                                                               todo+=data5.precio;
                                                               total.textContent=todo.toFixed(2)+'€';
                                                        })
                                                        }
                            })






}

