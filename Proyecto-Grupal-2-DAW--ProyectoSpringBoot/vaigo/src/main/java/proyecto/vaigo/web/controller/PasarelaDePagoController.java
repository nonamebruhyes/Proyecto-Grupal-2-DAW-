package proyecto.vaigo.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import proyecto.vaigo.Service.ItinerarioExcursionService;
import proyecto.vaigo.Service.ViajesService;
import proyecto.vaigo.model.dto.ViajesDTO;

@RestController
public class PasarelaDePagoController {
    private static final Logger log =
            LoggerFactory.getLogger(PasarelaDePagoController.class);

    @Autowired
    private ItinerarioExcursionService itinerarioExcursionService;
    @Autowired
    private ViajesService viajesService;

    @GetMapping("/pasarelaPago")
    public ModelAndView inicio() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("./paginashtml/pasarelaPago.html");
        return modelAndView;
    }


}
