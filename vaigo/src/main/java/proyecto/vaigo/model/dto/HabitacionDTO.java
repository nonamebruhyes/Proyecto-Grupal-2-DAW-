package proyecto.vaigo.model.dto;

import lombok.Data;
import proyecto.vaigo.model.entity.Ciudades;
import proyecto.vaigo.model.entity.Habitacion;

import java.io.Serializable;
import java.util.Date;

@Data
public class HabitacionDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String estado;
    private Date fechaInicio;
    private Date fechaFin;

    public static HabitacionDTO convertToDTO(Habitacion habitacion) {
        // Creamos el clienteDTO y asignamos los valores basicos
        HabitacionDTO habitacionDTO = new HabitacionDTO();
        habitacionDTO.setId(habitacion.getId());
        habitacionDTO.setEstado(habitacion.getEstado());
        habitacionDTO.setFechaInicio(habitacion.getFechaInicio());
        habitacionDTO.setFechaFin(habitacion.getFechaFin());
        // Retorna el DTO
        return habitacionDTO;
    }
    public static Habitacion convertToEntity(HabitacionDTO habitacionDTO) {
        // Creamos la entidad cliente y le asignamos los valores
        Habitacion habitacion = new Habitacion();
        habitacion.setId(habitacionDTO.getId());
        habitacion.setEstado(habitacionDTO.getEstado());
        habitacion.setFechaInicio(habitacionDTO.getFechaInicio());
        habitacion.setFechaFin(habitacionDTO.getFechaFin());
        // Retorna la entidad
        return habitacion;
    }

}
