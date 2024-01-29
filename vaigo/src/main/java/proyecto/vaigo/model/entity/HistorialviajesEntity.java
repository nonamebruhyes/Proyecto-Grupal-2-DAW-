package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Data
@Entity
@Table(name = "HISTORIALVIAJES", schema = "vaigo", catalog = "")
public class HistorialviajesEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private int id;
	@Basic
	@Column(name = "ID_USUARIO",insertable=false, updatable=false)
	private int idUsuario;
	@Basic
	@Column(name = "ID_VIAJE",insertable=false, updatable=false)
	private int idViaje;
	@Basic
	@Column(name = "COMENTARIO")
	private String comentario;
	@Basic
	@Column(name = "NUMPERSONAS")
	private Integer numpersonas;
	@Basic
	@Column(name = "Precio_total")
	private Double precioTotal;
	@Basic
	@Column(name = "Id_itinerario",insertable=false, updatable=false)
	private int idItinerario;
	@ManyToOne
	@JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID", nullable = false)
	private UsuariosEntity usuariosByIdUsuario;
	@ManyToOne
	@JoinColumn(name = "ID_VIAJE", referencedColumnName = "ID", nullable = false)
	private ViajesEntity viajesByIdViaje;
	@ManyToOne
	@JoinColumn(name = "Id_itinerario", referencedColumnName = "ID", nullable = false)
	private ItinerarioEntity itinerarioByIdItinerario;
}