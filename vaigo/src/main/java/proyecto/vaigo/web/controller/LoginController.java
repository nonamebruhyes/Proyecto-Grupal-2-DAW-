package proyecto.vaigo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
    public boolean obtenerUsuario(@RequestParam(value = "username") String username , @RequestParam(value = "password") String password){

        if(usuariosService.findUsuario(username, password) == null){
            return false;
        }
        return true;
    }
}
