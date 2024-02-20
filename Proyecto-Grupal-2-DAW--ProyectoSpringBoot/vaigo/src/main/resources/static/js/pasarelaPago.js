window.addEventListener("load", function (event)  {
let datosRecoje=JSON.parse(localStorage.getItem("datospasa"));
console.log(datosRecoje);
console.log(datosRecoje.itinerario_id);


let url1 = "http://localhost:8888/HotelCiu?dato="+datosRecoje.viaje_idCiudad+"";
                        fetch(url1, {
                            method: "GET",
                            headers: {
                                "Content-Type": "application/json"
                            }
                        })
                            .then(response => response.json() )
                            .then(data => {
                            console.log(data)
                            })


let url2 = "http://localhost:8888/ViaCiu?dato="+datosRecoje.viaje_idCiudad+"";
                        fetch(url2, {
                            method: "GET",
                            headers: {
                                "Content-Type": "application/json"
                            }
                        })
                            .then(response => response.json() )
                            .then(data => {
                            console.log(data)
                            })


let url3 = "http://localhost:8888/ItiID?dato="+datosRecoje.itinerario_id+"";
                        fetch(url3, {
                            method: "GET",
                            headers: {
                                "Content-Type": "application/json"
                            }
                        })
                            .then(response => response.json() )
                            .then(data => {
                            console.log(data)
                            })
});