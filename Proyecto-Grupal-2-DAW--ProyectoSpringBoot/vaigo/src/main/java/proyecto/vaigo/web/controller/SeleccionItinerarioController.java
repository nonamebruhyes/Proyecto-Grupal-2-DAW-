package proyecto.vaigo.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import proyecto.vaigo.Service.ItinerarioExcursionService;
import proyecto.vaigo.model.dto.ItinerarioExcursionesDTO;

import java.util.List;

@RestController
public class SeleccionItinerarioController {

    private static final Logger log = LoggerFactory.getLogger(SeleccionItinerarioController.class);
    @Autowired
    private ItinerarioExcursionService itinerarioExcursionService;
    @GetMapping("/seleccionItinerario")
    public ModelAndView inicio() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("./paginashtml/seleccionaritinerario.html");

        return modelAndView;
    }
    @GetMapping("/api/ItiTodo")
    public List<ItinerarioExcursionesDTO> mostrarItiDeUnViaje (@RequestParam String dato){

        return itinerarioExcursionService.todosItiEx(dato);
    }
}
