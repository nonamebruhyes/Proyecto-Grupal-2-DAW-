package proyecto.vaigo.model.dto;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data
public class ViajesDTO implements Serializable{
    private int id;
    private int pais;
    private int  ciudades;
    private int numeroPersonas;
    private Date fechaIda;
    private Date fechaVuelta;
    private Long idTerreno;
    private Long idItinerario;
    private String Descripcion;
    private Long idHotel;
/*

    public static ViajesDTO convertToDTO(Viajes viajes){
        ViajesDTO viajesDTO = new ViajesDTO();
        viajesDTO.setId(viajes.getId());
        //viajesDTO.setPais(viajes.getPais());
        //viajesDTO.setCiudades(viajes.getCiudades());
        viajesDTO.setNumeroPersonas(viajes.getNumeroPersonas());
        viajesDTO.setFechaIda(viajes.getFechaIda());
        viajesDTO.setFechaVuelta(viajes.getFechaVuelta());
        viajesDTO.setIdItinerario(viajes.getIdItinerario());
        viajesDTO.setIdTerreno(viajes.getIdTerreno());
        viajesDTO.setIdHotel(viajes.getIdHotel());
        viajesDTO.setDescripcion(viajes.getDescripcion());

        return viajesDTO;
    }

    public static Viajes convertoToEntity(ViajesDTO viajesDTO){
        Viajes viajes = new Viajes();
        viajes.setId(viajesDTO.getId());
        //viajes.setPais(viajesDTO.getPais());
        //viajes.setCiudades(viajesDTO.getCiudades());
        viajes.setNumeroPersonas(viajesDTO.getNumeroPersonas());
        viajes.setFechaIda(viajesDTO.getFechaIda());
        viajes.setFechaVuelta(viajesDTO.getFechaVuelta());
        viajes.setIdTerreno(viajesDTO.getIdTerreno());
        viajes.setIdItinerario(viajesDTO.getIdItinerario());
        viajes.setDescripcion(viajesDTO.getDescripcion());
        viajes.setIdHotel(viajesDTO.getIdHotel());

        return viajes;
    }

 */
}