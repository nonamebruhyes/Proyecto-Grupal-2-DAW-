var abierto = false;

/* When the user clicks on the button, 
toggle between hiding and showing the dropdown content */
function FiltroFunction() {
    event.stopPropagation();
   var a= document.getElementById("dropdown-content");
 
   if(!abierto){
    window.scrollTo(0,0);
    a.style="display:block;"
    abierto=true;
    document.body.style.overflow = "hidden";
   }else{
    a.style="display:none;"
    abierto = false;
    document.body.style.overflow = "auto";
   }

}