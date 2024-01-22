var abierto = false;

/* When the user clicks on the button, 
toggle between hiding and showing the dropdown content */
function FiltroFunction() {
    event.stopPropagation();
   var a= document.getElementById("dropdown-content");
 
   if(!abierto){
    a.style="display:block;"
    abierto=true;
   }else{
    a.style="display:none;"
    abierto = false;
   }

}