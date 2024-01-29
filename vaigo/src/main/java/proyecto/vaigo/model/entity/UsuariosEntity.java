package proyecto.vaigo.model.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "USUARIOS", schema = "vaigo", catalog = "")
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
	@OneToMany(mappedBy = "usuariosByIdUsuario")
	private Collection<HistorialviajesEntity> historialviajesById;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getImgperfil() {
		return imgperfil;
	}

	public void setImgperfil(String imgperfil) {
		this.imgperfil = imgperfil;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Timestamp getFregistro() {
		return fregistro;
	}

	public void setFregistro(Timestamp fregistro) {
		this.fregistro = fregistro;
	}

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

	public Collection<HistorialviajesEntity> getHistorialviajesById() {
		return historialviajesById;
	}

	public void setHistorialviajesById(Collection<HistorialviajesEntity> historialviajesById) {
		this.historialviajesById = historialviajesById;
	}
}
