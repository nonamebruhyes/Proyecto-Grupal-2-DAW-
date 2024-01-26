package proyecto.vaigo.model.dto;

import lombok.Data;
import proyecto.vaigo.model.entity.Ciudades;

import java.io.Serializable;

@Data
public class CiudadesDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String ciudad;
    public static CiudadesDTO convertToDTO(Ciudades ciudades) {
        // Creamos el clienteDTO y asignamos los valores basicos
        // no
        CiudadesDTO ciudadesDTO = new CiudadesDTO();
        ciudadesDTO.setId(ciudades.getId());
        ciudadesDTO.setCiudad(ciudades.getCiudad());
        // Retorna el DTO
        return ciudadesDTO;
    }
    public static Ciudades convertToEntity(CiudadesDTO ciudadesDTO) {
        // Creamos la entidad cliente y le asignamos los valores
        Ciudades ciudades = new Ciudades();
        ciudades.setId(ciudadesDTO.getId());
        ciudades.setCiudad(ciudadesDTO.getCiudad());

        // Retorna la entidad
        return ciudades;
    }

}
