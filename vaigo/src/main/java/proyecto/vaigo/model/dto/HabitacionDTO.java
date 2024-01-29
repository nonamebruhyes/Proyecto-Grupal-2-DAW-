package proyecto.vaigo.model.dto;

import lombok.Data;
import proyecto.vaigo.model.entity.HabitacionEntity;

import java.io.Serializable;
import java.sql.Date;


@Data
public class HabitacionDTO implements Serializable {
    private int id;
    private String estado;
    private Date inicio;
    private Date fin;
    private int idHotel;

    public static HabitacionDTO convertToDTO(HabitacionEntity habitacion) {
        // Creamos el clienteDTO y asignamos los valores basicos
        HabitacionDTO habitacionDTO = new HabitacionDTO();
        habitacionDTO.setId(habitacion.getId());
        habitacionDTO.setEstado(habitacion.getEstado());
        habitacionDTO.setFin(habitacion.getFin());
        habitacionDTO.setInicio(habitacion.getInicio());
        habitacionDTO.setIdHotel(habitacion.getIdHotel());
        // Retorna el DTO
        return habitacionDTO;
    }
    public static HabitacionEntity convertToEntity(HabitacionDTO habitacionDTO) {
        // Creamos la entidad cliente y le asignamos los valores
        HabitacionEntity habitacion = new HabitacionEntity();
        habitacion.setId(habitacionDTO.getId());
        habitacion.setEstado(habitacionDTO.getEstado());
        habitacion.setInicio(habitacionDTO.getInicio());
        habitacion.setFin( habitacionDTO.getFin());
        habitacion.setIdHotel(habitacionDTO.getIdHotel());
        // Retorna la entidad
        return habitacion;
    }

}
