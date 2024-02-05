document.getElementsByClassName("registrarb")[0].addEventListener("click", function(){
    let name = document.getElementsByClassName("nombre1")[0].value;
    let mail = document.getElementsByClassName("mail1")[0].value;
    let password = document.getElementsByClassName("contrasenya1")[0].value;
    let contra2=document.getElementsByClassName("contrasenya2")[0].value;
    alert("Nombre: " + name + " Password: " + password);

    let validEmail = /^\w+([.-_+]?\w+)*@\w+([.-]?\w+)*(\.\w{2,10})+$/;
         let bool = true;
            if (name == '') {
            console.log("1")
                bool = false;
            }
             if(!(/^[a-zA-ZáéíóúüÜÁÉÍÓÚñÑ\s-]{3,30}$/).test(name)){
console.log("2")
                    bool = false;
                }

                if (mail == '') {
console.log("3")
                    bool = false;
                }
                if (password == '') {
console.log("4")
                    bool = false;
                }
                if(!(/(?!^[0-9]*$)(?!^[a-zA-Z]*$)^([a-zA-Z0-9]{5,10}$)/).test(password)){
console.log("5")
                    bool = false;
                }

                if (contra2 == '') {
console.log("6")
                    bool = false;
                }
                if(!(/(?!^[0-9]*$)(?!^[a-zA-Z]*$)^([a-zA-Z0-9]{5,10}$)/).test(contra2)){
console.log("7")
                    bool = false;

                }

                if (password != contra2) {
console.log("8")
                    bool = false;
                }
                if (!validEmail.test(mail)) {
console.log("9")
                    bool = false;
                }

                if(bool==true){

  const data = { username: name, correo:mail,password: password };
  console.log(data);

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
}else{
console.log("Error");
}
});