package proyecto.vaigo.model.dto;

import lombok.Data;
import proyecto.vaigo.model.entity.Excursion;


import java.io.Serializable;
import java.util.Date;

@Data
public class ExcursionDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long idPais;
    private Long idCiudad;
    private String tipo;
    private String nombre;
    private Date fechaInicio;
    private Date horaInicio;/* Duda sobre tipo de variable que utilizar para el tiempo*/
    private Date duracion;/* Duda sobre tipo de variable que utilizar para el tiempo*/

    public static ExcursionDTO convertToDTO(Excursion excursion) {
        // Creamos el clienteDTO y asignamos los valores basicos
        ExcursionDTO excursionDTO = new ExcursionDTO();
        excursionDTO.setId(excursion.getId());
        excursionDTO.setIdPais(excursion.getIdPais());
        excursionDTO.setIdCiudad(excursion.getIdCiudad());
        excursionDTO.setTipo(excursion.getTipo());
        excursionDTO.setNombre(excursion.getNombre());
        excursionDTO.setFechaInicio(excursion.getFechaInicio());
        excursionDTO.setHoraInicio(excursion.getHoraInicio());
        excursionDTO.setDuracion(excursion.getDuracion());
        // Retorna el DTO
        return excursionDTO;
    }
    public static Excursion convertToEntity(ExcursionDTO excursionDTO) {
        // Creamos la entidad cliente y le asignamos los valores
        Excursion excursion = new Excursion();
        excursion.setId(excursionDTO.getId());
        excursion.setIdPais(excursionDTO.getIdPais());
        excursion.setIdCiudad(excursionDTO.getIdCiudad());
        excursion.setTipo(excursionDTO.getTipo());
        excursion.setNombre(excursionDTO.getNombre());
        excursion.setFechaInicio(excursionDTO.getFechaInicio());
        excursion.setHoraInicio(excursionDTO.getHoraInicio());
        excursion.setDuracion(excursionDTO.getDuracion());
        // Retorna la entidad
        return excursion;
    }
}
