package proyecto.vaigo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import proyecto.vaigo.Service.*;
import proyecto.vaigo.model.dto.*;

import java.util.List;

@RestController
public class ListController {

	@Autowired
	private CiudadesService ciudadesService;
	@Autowired
	private PaisService paisService;

	@Autowired
	private TerrenoService terrenoService;

	@Autowired
	private TransporteService transporteService;

	@Autowired
	private TipoHotelService tipoHotelService;


	@GetMapping("/api/ciudades")
	public List<CiudadesDTO> getCiudades(){
		return ciudadesService.findAll();
	}
	@GetMapping("/api/paises")
	public List<PaisDTO> getPaises(){
		return paisService.findAll();
	}
	@GetMapping("/api/terrenos")
	public List<TerrenoDTO> getTerrenos(){
		return terrenoService.findAll();
	}
	@GetMapping("/api/transportes")
	public List<TransporteDTO> getTransportes(){
		return transporteService.findAll();
	}
	@GetMapping("/api/estancias")
	public List<TipohotelDTO> getTiposHotel(){
		return tipoHotelService.findAll();
	}

}
