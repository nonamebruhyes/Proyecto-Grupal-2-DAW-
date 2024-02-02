package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;
@Data
@Entity
@Table(name = "excursion", schema = "vaigo", catalog = "")
public class ExcursionEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private int id;
	@Basic
	@Column(name = "ID_CIUDAD")
	private int idCiudad;
	@Basic
	@Column(name = "TIPO")
	private String tipo;
	@Basic
	@Column(name = "PRECIO")
	private Double precio;
	@Basic
	@Column(name = "NOMBRE")
	private String nombre;
	@Basic
	@Column(name = "FEC_INICIO")
	private Timestamp fecInicio;
	@Basic
	@Column(name = "DURACION")
	private Timestamp duracion;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ExcursionEntity that = (ExcursionEntity) o;
		return id == that.id && idCiudad == that.idCiudad && Objects.equals(tipo, that.tipo) && Objects.equals(precio, that.precio) && Objects.equals(nombre, that.nombre) && Objects.equals(fecInicio, that.fecInicio) && Objects.equals(duracion, that.duracion);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, idCiudad, tipo, precio, nombre, fecInicio, duracion);
	}
}
