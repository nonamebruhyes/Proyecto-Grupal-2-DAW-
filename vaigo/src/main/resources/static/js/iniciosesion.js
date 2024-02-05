document.getElementById("login").addEventListener("click", function(){
    let name = document.getElementById("nombre1").value;
    let password = document.getElementById("nombre2").value;

    const data = { username: name, password: password };
    const url = "http://localhost:8888/login/obtenerUsuario";

    fetch(url, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body:  JSON.stringify(data)
    })
        .then(response => response.json())
        .then(data => function (e) {
            e.preventDefault();
        })
        .catch(error => console.error("Error:", error));
});
