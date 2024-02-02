package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;
@Data
@Entity
@Table(name = "hotel", schema = "vaigo", catalog = "")
public class HotelEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private int id;
	@Basic
	@Column(name = "NOMBRE")
	private String nombre;
	@Basic
	@Column(name = "ID_CIUDAD")
	private int idCiudad;
	@Basic
	@Column(name = "ID_TIPOHOTEL")
	private int idTipohotel;
	@Basic
	@Column(name = "PRECIO")
	private Double precio;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		HotelEntity that = (HotelEntity) o;
		return id == that.id && idCiudad == that.idCiudad && idTipohotel == that.idTipohotel && Objects.equals(nombre, that.nombre) && Objects.equals(precio, that.precio);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre, idCiudad, idTipohotel, precio);
	}
}