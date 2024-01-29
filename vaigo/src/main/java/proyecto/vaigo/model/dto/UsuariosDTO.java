package proyecto.vaigo.model.dto;

import lombok.Data;
import proyecto.vaigo.model.entity.UsuariosEntity;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;


@Data
public class UsuariosDTO implements Serializable{
    private int id;
    private String username;
    private String password;
    private String imgperfil;
    private String correo;
    private String rol;
    private Timestamp fregistro;

    public static UsuariosDTO convertToDTO(UsuariosEntity usuarios){
        UsuariosDTO usuariosDTO = new UsuariosDTO();
        usuariosDTO.setId(usuarios.getId());
        usuariosDTO.setUsername(usuarios.getUsername());
        usuariosDTO.setCorreo(usuarios.getCorreo());
        usuariosDTO.setPassword(usuarios.getPassword());
        usuariosDTO.setImgperfil(usuarios.getImgperfil());
        usuariosDTO.setRol(usuarios.getRol());
        usuariosDTO.setFregistro(usuarios.getFregistro());
        
        return usuariosDTO;
    }
    public static UsuariosEntity convertToEntity(UsuariosDTO usuariosDTO){
        UsuariosEntity usuarios =  new UsuariosEntity();
        usuarios.setId(usuariosDTO.getId());
        usuarios.setUsername(usuariosDTO.getUsername());
        usuarios.setCorreo(usuariosDTO.getCorreo());
        usuarios.setPassword(usuariosDTO.getPassword());
        usuarios.setImgperfil(usuariosDTO.getImgperfil());
        usuarios.setRol(usuariosDTO.getRol());
        usuarios.setFregistro(usuariosDTO.getFregistro());

        return usuarios;
    }

}
