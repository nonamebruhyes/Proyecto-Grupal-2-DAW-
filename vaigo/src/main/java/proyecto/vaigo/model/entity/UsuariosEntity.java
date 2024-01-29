package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Data
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
}