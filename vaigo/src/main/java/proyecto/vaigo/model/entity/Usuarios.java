package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Objects;
@Data
@Entity
public class Usuarios {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID", nullable = false)
	private int id;
	@Basic
	@Column(name = "username", nullable = false, length = 30)
	private String username;
	@Basic
	@Column(name = "CORREO", nullable = false, length = 30)
	private String correo;
	@Basic
	@Column(name = "IMGPERFIL", nullable = true, length = 200)
	private String imgperfil;
	@Basic
	@Column(name = "PASSWORD", nullable = false, length = 10)
	private String password;
	@Basic
	@Column(name = "ROL", nullable = true, length = 1)
	private String rol;
	@Basic
	@Column(name = "FREGISTRO", nullable = false)
	private Timestamp fregistro;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Usuarios usuarios = (Usuarios) o;
		return id == usuarios.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
