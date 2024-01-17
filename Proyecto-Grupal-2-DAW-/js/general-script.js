var ilustracion = document.getElementById('ilustracion');
var rectangle1 = document.getElementById('Rectangle1');
var rectangle2 = document.getElementById('Rectangle2');
var rectangle3 = document.getElementById('Rectangle3');
var abierto = false;

/* When the user clicks on the button, 
toggle between hiding and showing the dropdown content */
function myFunction() {
    event.stopPropagation();
    document.getElementById("myDropdown").classList.toggle("show");
}


function profileFunction() {
    document.getElementById("profileDropdown").classList.toggle("show");
}

// Close the dropdown if the user clicks outside of it
document.addEventListener('click', function () {
    if (abierto) {
        rectangle1.style.transform = "translate(0px,-6px)";
        rectangle3.style.transform = "translate(0px,6px)";
        abierto = false;
    }
    // Agrega la transición aquí fuera del if-else para que se aplique en ambos casos.
    rectangle1.style.transitionDuration = "0.3s";
    rectangle3.style.transitionDuration = "0.3s";
})

ilustracion.addEventListener('click', function (event) {
    if (!abierto) {
        rectangle1.style.transform = "translate(0px,21px)";
        rectangle3.style.transform = "translate(0px,-21px)";
        abierto = true;
    } else {
        rectangle1.style.transform = "translate(0px,-6px)";
        rectangle3.style.transform = "translate(0px,6px)";
        abierto = false;
    }
    // Agrega la transición aquí fuera del if-else para que se aplique en ambos casos.
    rectangle1.style.transitionDuration = "0.3s";
    rectangle3.style.transitionDuration = "0.3s";
});