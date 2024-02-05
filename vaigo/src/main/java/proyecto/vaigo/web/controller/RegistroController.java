package proyecto.vaigo.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import proyecto.vaigo.Service.UsuariosService;
import proyecto.vaigo.model.dto.UsuariosDTO;

@RestController
public class RegistroController {
    private static final Logger log =
            LoggerFactory.getLogger(RegistroController.class);
    @Autowired
    private UsuariosService usuariosService;
    @GetMapping("/registro")
    public ModelAndView Registro(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("./paginashtml/registro.html");
        return mav;
    }
    @PostMapping("/salvarUsuario")
    public void save(@RequestBody UsuariosDTO usuariosDTO ) {


        log.info("CuentaController - save: Salvando la cuenta del cliente: " +
                usuariosDTO.getId());


        // invocamos la operacion save a la capa de servicio de cuenta
        usuariosService.save(usuariosDTO);
    }
}
