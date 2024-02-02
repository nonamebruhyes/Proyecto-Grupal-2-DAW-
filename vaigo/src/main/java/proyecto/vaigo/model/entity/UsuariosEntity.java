package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;
@Data
@Entity
@Table(name = "usuarios", schema = "vaigo", catalog = "")
public class UsuariosEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private int id;
	@Basic
	@Column(name = "username")
	private String username;
	@Basic
	@Column(name = "CORREO")
	private String correo;
	@Basic
	@Column(name = "IMGPERFIL")
	private String imgperfil;
	@Basic
	@Column(name = "PASSWORD")
	private String password;
	@Basic
	@Column(name = "ROL")
	private String rol;
	@Basic
	@Column(name = "FREGISTRO")
	private Timestamp fregistro;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		UsuariosEntity that = (UsuariosEntity) o;
		return id == that.id && Objects.equals(username, that.username) && Objects.equals(correo, that.correo) && Objects.equals(imgperfil, that.imgperfil) && Objects.equals(password, that.password) && Objects.equals(rol, that.rol) && Objects.equals(fregistro, that.fregistro);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, username, correo, imgperfil, password, rol, fregistro);
	}
}
