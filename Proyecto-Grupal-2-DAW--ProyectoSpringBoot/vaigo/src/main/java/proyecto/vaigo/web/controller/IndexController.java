package proyecto.vaigo.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import proyecto.vaigo.Service.*;
import proyecto.vaigo.model.dto.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class IndexController {
    private static final Logger log =
            LoggerFactory.getLogger(IndexController.class);

    @GetMapping("/index")
    public ModelAndView inicio() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(" index.html");

        return modelAndView;
    }

    @Autowired
    private CiudadesService ciudadesService;
    @Autowired
    private ViajesService viajesService;
    @Autowired
    private UsuariosService usuariosService;
    @Autowired
    private ExcursionService excursionService;
    @Autowired
    private ItinerarioService itinerarioService;

    @RequestMapping("/listadociudades")
    public List<CiudadesDTO> findAll() {

        log.info("ClienteRestController - findAll: Mostramos todos los clientes");

        List<CiudadesDTO> listaCiudadesDTO = ciudadesService.findAll();
        return listaCiudadesDTO;
    }

    @GetMapping("/listaporpais")
    public List<CiudadesDTO> findAllid() {

        log.info("ClienteRestController - findAll: Mostramos todos los clientes");
/*
        List<CiudadesDTO> listaCiudadesDTO = ciudadesService.findAllID();

 */
        return null;
    }

    @GetMapping("/filtro")
    public List<ViajesDTO> findFiltro() {

        log.info("ClienteRestController - findAll: Mostramos todos los clientes");

        List<ViajesDTO> viajesDTOList = viajesService.findFiltro();


        return viajesDTOList;
    }


    @GetMapping("/buscarUsuario")
    public void BuscUsu(@ModelAttribute("usuarioDTO") UsuariosDTO usuariosDTO) {

        log.info("CuentaController - save: Salvando la cuenta del cliente: " +
                usuariosDTO.getId());


        // invocamos la operacion save a la capa de servicio de cuenta
     //   usuariosService.findUsuario(usuariosDTO);
    }
    @PostMapping("/buscarExcursion")
            public ExcursionDTO BuscEx(@RequestBody ExcursionDTO excursionDTO) {

        log.info("CuentaController - save: Salvando la cuenta del cliente: " +
                excursionDTO.getId());
        // invocamos la operacion save a la capa de servicio de cuenta
        return excursionService.findById(excursionDTO);
    }
    @GetMapping("/api/Itinerario")
    public ItinerarioDTO mostrarunIti (@RequestParam String dato){
        log.info(dato);
        ItinerarioDTO itinerarioDTO=new ItinerarioDTO();
        itinerarioDTO.setId(Integer.parseInt(dato));

        log.info("CuentaController - save: Salvando la cuenta del cliente: " +
                itinerarioDTO);
        // invocamos la operacion save a la capa de servicio de cuenta
        return itinerarioService.findById(itinerarioDTO);
    }
}
