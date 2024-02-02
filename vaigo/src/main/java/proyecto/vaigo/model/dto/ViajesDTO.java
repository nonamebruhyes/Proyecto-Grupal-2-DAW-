package proyecto.vaigo.model.dto;

import lombok.Data;
import proyecto.vaigo.model.entity.ViajesEntity;

import java.io.Serializable;
import java.sql.Date;

@Data
public class ViajesDTO implements Serializable{
    private int id;
 	private int idPais;
	private int idCiudad;
    private Integer idHotel;
    private int idTerreno;
    private Integer idViajesimagenes;
    private int idTransporte;
    private Date ida;
    private Date vuelta;
    private Double puntuacion;
    private String Descripcion;


    public static ViajesDTO convertToDTO(ViajesEntity viajes){
        ViajesDTO viajesDTO = new ViajesDTO();
        viajesDTO.setId(viajes.getId());
        viajesDTO.setIdCiudad(viajes.getIdCiudad());
        viajesDTO.setIdHotel(viajes.getIdHotel());
        viajesDTO.setIdTerreno(viajes.getIdTerreno());
        viajesDTO.setIdViajesimagenes(viajes.getIdViajesimagenes());
        viajesDTO.setIda(viajes.getIda());
        viajesDTO.setVuelta(viajes.getVuelta());
        viajesDTO.setDescripcion(viajes.getDescripcion());
        viajesDTO.setIdTransporte(viajes.getIdTransporte());
        viajesDTO.setPuntuacion(viajes.getPuntuacion());
        return viajesDTO;
    }

    public static ViajesEntity convertoToEntity(ViajesDTO viajesDTO){
        ViajesEntity viajes = new ViajesEntity();
        viajes.setId( viajesDTO.getId());
        viajes.setIdCiudad( viajesDTO.getIdCiudad());
        viajes.setIdHotel( viajesDTO.getIdHotel());
        viajes.setIdTerreno( viajesDTO.getIdTerreno());
        viajes.setIdViajesimagenes( viajesDTO.getIdViajesimagenes());
        viajes.setIda( viajesDTO.getIda());
        viajes.setVuelta( viajesDTO.getVuelta());
        viajes.setDescripcion( viajesDTO.getDescripcion());
        viajes.setIdTransporte(viajesDTO.getIdTransporte());
        viajes.setPuntuacion( viajesDTO.getPuntuacion());

        return viajes;
    }
}