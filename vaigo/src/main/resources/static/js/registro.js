document.getElementsByClassName("registrarb")[0].addEventListener("click", function(){
    let name = document.getElementsByClassName("nombre1")[0].value;
    let mail = document.getElementsByClassName("mail1")[0].value;
    let password = document.getElementsByClassName("contrasenya1")[0].value;
    alert("Nombre: " + name + " Password: " + password);

    const data = { username: name, password: password,mail: mail };
    const url = "http://localhost:8888/salvarUsuario";

    fetch(url, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
    })
        .then(response => response.json())
        .then(data => console.log(JSON.stringify(data)))
        .catch(error => console.error("Error:", error));
});