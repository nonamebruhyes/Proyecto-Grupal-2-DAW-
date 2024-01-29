package proyecto.vaigo.model.dto;

import lombok.Data;
import proyecto.vaigo.model.entity.Excursion;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Data
public class ExcursionDTO implements Serializable {
    private int id;
    private int idPais;
    private int idCiudad;
    private String tipo;
    private String nombre;
    private Double precio;
    private Timestamp fechaInicio;
    private Timestamp duracion;

    public static ExcursionDTO convertToDTO(Excursion excursion) {

        ExcursionDTO excursionDTO = new ExcursionDTO();
        excursionDTO.setId(excursion.getId());
        excursionDTO.setDuracion(excursion.getDuracion());
        excursionDTO.setIdPais(excursion.getIdPais());
        excursionDTO.setIdCiudad(excursion.getIdCiudad());
        excursionDTO.setFechaInicio(excursion.getFecInicio());
        excursionDTO.setDuracion(excursion.getDuracion());
        return excursionDTO;
    }
    public static Excursion convertToEntity(ExcursionDTO excursionDTO) {
        // Creamos la entidad cliente y le asignamos los valores
        Excursion excursion = new Excursion();
        excursion.setId(excursionDTO.getId());
        excursion.setDuracion(excursionDTO.getDuracion());
        excursion.setIdPais(excursionDTO.getIdPais());
        excursion.setIdCiudad(excursionDTO.getIdCiudad());
        excursion.setFecInicio(excursionDTO.getFechaInicio());
        excursion.setDuracion(excursionDTO.getDuracion());
        // Retorna la entidad
        return excursion;
        }


}
