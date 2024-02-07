package proyecto.vaigo.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SeleccionItinerarioController {

    private static final Logger log =
            LoggerFactory.getLogger(SeleccionItinerarioController.class);
    @GetMapping("/seleccionItinerario")
    public ModelAndView inicio() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("./paginashtml/seleccionaritinerario.html");

        return modelAndView;
    }
}
