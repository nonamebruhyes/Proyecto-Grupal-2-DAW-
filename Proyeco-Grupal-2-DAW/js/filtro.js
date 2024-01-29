var abierto = false;

/* When the user clicks on the button, 
toggle between hiding and showing the dropdown content */
function FiltroFunction() {
    event.stopPropagation();
   var a= document.getElementById("dropdown-content");
 
   if(!abierto){
    window.scrollTo(0,0);
    a.classList.toggle("show-2");
    a.style="display:block;"
    abierto=true;
    document.body.style.overflow = "hidden";
   }else{
    window.scrollTo(0,0);
    window.setTimeout(
    function removethis()
    {
        a.classList.toggle("show-2");
        a.classList.toggle("show-2-out");
        a.style="display:none;"
        document.body.style.overflow = "auto";
    }, 500);
    a.classList.toggle("show-2-out");
    abierto = false;
   }

}