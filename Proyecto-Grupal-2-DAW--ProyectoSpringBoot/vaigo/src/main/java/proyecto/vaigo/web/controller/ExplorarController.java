package proyecto.vaigo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import proyecto.vaigo.Service.*;
import proyecto.vaigo.model.dto.CiudadesDTO;
import proyecto.vaigo.model.dto.PaisDTO;

import java.util.List;

@RestController
public class ExplorarController {


	@GetMapping("/explorar")
	public ModelAndView mostrarExplorar(){
		ModelAndView mav = new ModelAndView("./paginashtml/paginaExposicionDeContenidos.html");
		return mav;
	}

@GetMapping("/explorar?")
	public String mostrarCiudades(){
		ModelAndView mav = new ModelAndView("./paginashtml/paginaCiudades.html");
		return "jojojo";
	}

}
