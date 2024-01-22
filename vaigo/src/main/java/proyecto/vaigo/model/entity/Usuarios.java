package proyecto.vaigo.model.entity;

import lombok.Data;
import java.util.Date;
import java.util.Objects;

@Data
public class Usuarios {
    private Long id;
    private String username;
    private String correo;
    private String password;
    private String rol;
    private Date fechaDeRegistro;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuarios usuarios = (Usuarios) o;
        return Objects.equals(id, usuarios.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
