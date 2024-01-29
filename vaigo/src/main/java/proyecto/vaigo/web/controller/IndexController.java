package proyecto.vaigo.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import proyecto.vaigo.Service.CiudadesServiceImpl;
import proyecto.vaigo.model.dto.CiudadesDTO;

import java.util.List;

@RestController
@RequestMapping("/")
public class IndexController {
    private static final Logger log =
            LoggerFactory.getLogger(IndexController.class);

    @GetMapping("/index")
    public ModelAndView inicio(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    }
    @Autowired
    private CiudadesServiceImpl ciudadesServiceImpl;

    @RequestMapping(method = RequestMethod.GET)
    public List<CiudadesDTO> findAll() {

        log.info("ClienteRestController - findAll: Mostramos todos los clientes");

        List<CiudadesDTO> listaCiudadesDTO = ciudadesServiceImpl.findAll();
        return listaCiudadesDTO;
    }

}
