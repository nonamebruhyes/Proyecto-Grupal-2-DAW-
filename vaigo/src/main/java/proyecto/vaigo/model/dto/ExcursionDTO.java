package proyecto.vaigo.model.dto;

import lombok.Data;
import proyecto.vaigo.model.entity.ExcursionEntity;


import java.io.Serializable;
import java.sql.Timestamp;
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

    public static ExcursionDTO convertToDTO(ExcursionEntity excursion) {

        ExcursionDTO excursionDTO = new ExcursionDTO();
        excursionDTO.setId(excursion.getId());
        excursionDTO.setDuracion(excursion.getDuracion());
        excursionDTO.setIdCiudad(excursion.getIdCiudad());
        excursionDTO.setNombre(excursion.getNombre());
        excursionDTO.setPrecio(excursion.getPrecio());
        excursionDTO.setTipo(excursion.getTipo());
        excursionDTO.setFechaInicio(excursion.getFecInicio());
        excursionDTO.setDuracion(excursion.getDuracion());
        return excursionDTO;
    }
    public static ExcursionEntity convertToEntity(ExcursionDTO excursionDTO) {
        // Creamos la entidad cliente y le asignamos los valores
        ExcursionEntity excursion = new ExcursionEntity();
        excursion.setId(excursionDTO.getId());
        excursion.setDuracion(excursionDTO.getDuracion());
        excursion.setIdCiudad(excursionDTO.getIdCiudad());
        excursion.setNombre(excursionDTO.getNombre());
        excursion.setPrecio(excursionDTO.getPrecio());
        excursion.setTipo(excursionDTO.getTipo());
        excursion.setFecInicio(excursionDTO.getFechaInicio());
        excursion.setDuracion(excursionDTO.getDuracion());
        // Retorna la entidad
        return excursion;
        }


}
