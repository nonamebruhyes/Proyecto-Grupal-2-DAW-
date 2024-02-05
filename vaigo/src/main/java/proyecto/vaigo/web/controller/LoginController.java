package proyecto.vaigo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import proyecto.vaigo.Service.UsuariosService;
import proyecto.vaigo.model.dto.UsuariosDTO;

@RestController
public class LoginController{

    @Autowired
    private UsuariosService usuariosService;
    @GetMapping("/login")
    public ModelAndView IniciarSesion(){
       ModelAndView mav = new ModelAndView();
       mav.setViewName("./paginashtml/inicio_sesion.html");
       return mav;
    }

    @PostMapping("/login/obtenerUsuario")
    public boolean obtenerUsuario (@RequestBody UsuariosDTO usuariosDTO){
        if(usuariosService.findUsuario(usuariosDTO.getUsername(), usuariosDTO.getPassword()) == false ){
            return false;
        }
        return true;
    }
}
