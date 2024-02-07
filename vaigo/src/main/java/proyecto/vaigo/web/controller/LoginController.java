package proyecto.vaigo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import proyecto.vaigo.Service.UsuariosService;
import proyecto.vaigo.model.dto.UsuariosDTO;

import java.util.List;

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

    @PostMapping("/api/iniciosesion")
    public boolean comprobarUsuario (@RequestBody UsuariosDTO usuariosDTO){
      if (!usuariosDTO.getCorreo().matches("^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")){
          return false;
      }
      if (!usuariosDTO.getPassword().matches( "^(?!^[0-9]*$)(?!^[a-zA-Z]*$)^([a-zA-Z0-9]{5,10})$")){
          return false;
      }
      if(usuariosService.findUsuario(usuariosDTO.getCorreo(), usuariosDTO.getPassword()) == null ){
            return false;
      }
        return true;
    }

    @PostMapping("/api/obtenerusuario")
    public UsuariosDTO obtenerusuario (@RequestBody UsuariosDTO usuariosDTO){
        return usuariosService.findUsuario(usuariosDTO.getUsername(), usuariosDTO.getPassword());
    }
}
