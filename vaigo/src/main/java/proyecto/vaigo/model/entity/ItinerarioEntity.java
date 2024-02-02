package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;
@Data
@Entity
@Table(name = "itinerario", schema = "vaigo", catalog = "")
public class ItinerarioEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private int id;
	@Basic
	@Column(name = "ID_EXCURSION")
	private int idExcursion;
	@Basic
	@Column(name = "Nombre")
	private String nombre;
	@Basic
	@Column(name = "Cometario")
	private String cometario;
	@Basic
	@Column(name = "Id_historialViajes")
	private Integer idHistorialViajes;
	@Basic
	@Column(name = "puntuacion")
	private Double puntuacion;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ItinerarioEntity that = (ItinerarioEntity) o;
		return id == that.id && idExcursion == that.idExcursion && Objects.equals(nombre, that.nombre) && Objects.equals(cometario, that.cometario) && Objects.equals(idHistorialViajes, that.idHistorialViajes) && Objects.equals(puntuacion, that.puntuacion);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, idExcursion, nombre, cometario, idHistorialViajes, puntuacion);
	}
}