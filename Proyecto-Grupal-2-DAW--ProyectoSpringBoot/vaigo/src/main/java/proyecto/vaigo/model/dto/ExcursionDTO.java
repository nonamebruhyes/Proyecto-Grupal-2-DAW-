package proyecto.vaigo.model.dto;

import jakarta.persistence.*;
import lombok.Data;
import proyecto.vaigo.model.entity.ExcursionEntity;

import java.sql.Timestamp;
import java.util.Objects;

@Data
public class ExcursionDTO {
    private int id;
    private int idCiudad;
    private String tipo;
    private Double precio;
    private String nombre;
    private Timestamp fecInicio;
    private Timestamp duracion;

public static ExcursionDTO ConvertToDTO(ExcursionEntity excursionEntity) {
        ExcursionDTO excursionDTO = new ExcursionDTO();
        excursionDTO.setId(excursionEntity.getId());
        excursionDTO.setIdCiudad(excursionEntity.getIdCiudad());
        excursionDTO.setTipo(excursionEntity.getTipo());
        excursionDTO.setPrecio(excursionEntity.getPrecio());
        excursionDTO.setNombre(excursionEntity.getNombre());
        excursionDTO.setFecInicio(excursionEntity.getFecInicio());
        excursionDTO.setDuracion(excursionEntity.getDuracion());
        return excursionDTO;
    }
    public static ExcursionEntity ConvertToEntity(ExcursionDTO excursionDTO) {
        ExcursionEntity excursionEntity = new ExcursionEntity();
        excursionEntity.setId(excursionDTO.getId());
        excursionEntity.setIdCiudad(excursionDTO.getIdCiudad());
        excursionEntity.setTipo(excursionDTO.getTipo());
        excursionEntity.setPrecio(excursionDTO.getPrecio());
        excursionEntity.setNombre(excursionDTO.getNombre());
        excursionEntity.setFecInicio(excursionDTO.getFecInicio());
        excursionEntity.setDuracion(excursionDTO.getDuracion());
        return excursionEntity;
    }
}