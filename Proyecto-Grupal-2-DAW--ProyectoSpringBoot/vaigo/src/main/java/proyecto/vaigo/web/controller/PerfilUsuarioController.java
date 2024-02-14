package proyecto.vaigo.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.ModelAndView;
import proyecto.vaigo.Service.UsuariosService;
import proyecto.vaigo.model.dto.ExcursionDTO;
import proyecto.vaigo.model.dto.UsuariosDTO;

@RestController
public class PerfilUsuarioController {
    private static final Logger log =
            LoggerFactory.getLogger(PerfilUsuarioController.class);
    @Autowired
    private UsuariosService usuariosService;
    @GetMapping("/perfilUsuario")
    public ModelAndView inicio() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("./paginashtml/perfil-usuario.html");

        return modelAndView;
    }
    @GetMapping("/api/buscarUsu")
    public UsuariosDTO BuscEx(@RequestParam int dato) {

        UsuariosDTO usuariosDTO=new UsuariosDTO();
        usuariosDTO.setId(dato);

        log.info("CuentaController - save: Salvando la cuenta del cliente: " +
                usuariosDTO);
        // invocamos la operacion save a la capa de servicio de cuenta
        return usuariosService.findById(usuariosDTO);
    }
}
