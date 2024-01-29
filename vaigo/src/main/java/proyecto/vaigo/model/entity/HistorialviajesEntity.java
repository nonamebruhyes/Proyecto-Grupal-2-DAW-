package proyecto.vaigo.model.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "HISTORIALVIAJES", schema = "vaigo", catalog = "")
public class HistorialviajesEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private int id;
	@Basic
	@Column(name = "ID_USUARIO")
	private int idUsuario;
	@Basic
	@Column(name = "ID_VIAJE")
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
	@Column(name = "Id_itinerario")
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdViaje() {
		return idViaje;
	}

	public void setIdViaje(int idViaje) {
		this.idViaje = idViaje;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Integer getNumpersonas() {
		return numpersonas;
	}

	public void setNumpersonas(Integer numpersonas) {
		this.numpersonas = numpersonas;
	}

	public Double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public int getIdItinerario() {
		return idItinerario;
	}

	public void setIdItinerario(int idItinerario) {
		this.idItinerario = idItinerario;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		HistorialviajesEntity that = (HistorialviajesEntity) o;
		return id == that.id && idUsuario == that.idUsuario && idViaje == that.idViaje && idItinerario == that.idItinerario && Objects.equals(comentario, that.comentario) && Objects.equals(numpersonas, that.numpersonas) && Objects.equals(precioTotal, that.precioTotal);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, idUsuario, idViaje, comentario, numpersonas, precioTotal, idItinerario);
	}

	public UsuariosEntity getUsuariosByIdUsuario() {
		return usuariosByIdUsuario;
	}

	public void setUsuariosByIdUsuario(UsuariosEntity usuariosByIdUsuario) {
		this.usuariosByIdUsuario = usuariosByIdUsuario;
	}

	public ViajesEntity getViajesByIdViaje() {
		return viajesByIdViaje;
	}

	public void setViajesByIdViaje(ViajesEntity viajesByIdViaje) {
		this.viajesByIdViaje = viajesByIdViaje;
	}

	public ItinerarioEntity getItinerarioByIdItinerario() {
		return itinerarioByIdItinerario;
	}

	public void setItinerarioByIdItinerario(ItinerarioEntity itinerarioByIdItinerario) {
		this.itinerarioByIdItinerario = itinerarioByIdItinerario;
	}
}
