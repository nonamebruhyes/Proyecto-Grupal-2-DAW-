package proyecto.vaigo.model.dto;

import lombok.Data;
import proyecto.vaigo.model.entity.Usuarios;


import java.io.Serializable;
import java.util.Date;


@Data
public class UsuariosDTO implements Serializable{
    private static final long serialVersionUID = 1L;
    private Long id;
    private String username;
    private String correo;
    private String password;
    private String imgperfil;
    private String rol;
    private Date fechaDeRegistro;

    public static UsuariosDTO convertToDTO(Usuarios usuarios){
        UsuariosDTO usuariosDTO = new UsuariosDTO();
        usuariosDTO.setId(usuarios.getId());
        usuariosDTO.setUsername(usuarios.getUsername());
        usuariosDTO.setCorreo(usuarios.getCorreo());
        usuariosDTO.setPassword(usuarios.getPassword());
        usuariosDTO.setImgperfil(usuarios.getImgperfil());
        usuariosDTO.setRol(usuarios.getRol());
        usuariosDTO.setFechaDeRegistro(usuarios.getFechaDeRegistro());
        
        return usuariosDTO;
    }
    public static Usuarios convertToEntity(UsuariosDTO usuariosDTO){
        Usuarios usuarios =  new Usuarios();
        usuarios.setId(usuariosDTO.getId());
        usuarios.setUsername(usuariosDTO.getUsername());
        usuarios.setCorreo(usuariosDTO.getCorreo());
        usuarios.setPassword(usuariosDTO.getPassword());
        usuarios.setImgperfil(usuariosDTO.getImgperfil());
        usuarios.setRol(usuariosDTO.getRol());
        usuarios.setFechaDeRegistro(usuariosDTO.getFechaDeRegistro());

        return usuarios;
    }

}
