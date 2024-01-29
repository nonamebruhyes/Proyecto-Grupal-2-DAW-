package proyecto.vaigo.model.dto;

import lombok.Data;
import proyecto.vaigo.model.entity.CiudadesEntity;

import java.io.Serializable;

@Data
public class CiudadesDTO implements Serializable {

    private int id;
    private int idPais;
    private String ciudad;
    public static CiudadesDTO convertToDTO(CiudadesEntity ciudades) {
        // Creamos el clienteDTO y asignamos los valores basicos

        CiudadesDTO ciudadesDTO = new CiudadesDTO();
        ciudadesDTO.setId(ciudades.getId());
        ciudadesDTO.setIdPais(ciudades.getIdPais());
        ciudadesDTO.setCiudad(ciudades.getCiudad());
        // Retorna el DTO
        return ciudadesDTO;
    }
    public static CiudadesEntity convertToEntity(CiudadesDTO ciudadesDTO) {
        // Creamos la entidad cliente y le asignamos los valores
        CiudadesEntity ciudades = new CiudadesEntity();
        ciudades.setId(ciudadesDTO.getId());
        ciudades.setIdPais(ciudadesDTO.getIdPais());
        ciudades.setCiudad(ciudadesDTO.getCiudad());

        // Retorna la entidad
        return ciudades;
    }

}
