document.getElementById("login").addEventListener("click", function(){
    let name = document.getElementById("nombre1").value;
    let password = document.getElementById("nombre2").value;
    alert("Nombre: " + name + " Password: " + password);

    const data = { username: name, password: password };
    const url = "/login/obtenerUsuario";

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
