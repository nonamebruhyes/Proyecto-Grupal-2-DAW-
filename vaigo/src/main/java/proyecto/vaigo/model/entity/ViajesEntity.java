package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;
@Data
@Entity
@Table(name = "viajes", schema = "vaigo", catalog = "")
public class ViajesEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private int id;
	@Basic
	@Column(name = "ID_CIUDAD")
	private int idCiudad;
	@Basic
	@Column(name = "IDA")
	private Date ida;
	@Basic
	@Column(name = "VUELTA")
	private Date vuelta;
	@Basic
	@Column(name = "ID_TERRENO")
	private int idTerreno;
	@Basic
	@Column(name = "ID_HOTEL")
	private int idHotel;
	@Basic
	@Column(name = "ID_TRANSPORTE")
	private int idTransporte;
	@Basic
	@Column(name = "ID_VIAJESIMAGENES")
	private int idViajesimagenes;
	@Basic
	@Column(name = "PUNTUACION")
	private Double puntuacion;
	@Basic
	@Column(name = "descripcion")
	private String descripcion;
	@Basic
	@Column(name = "planes")
	private String planes;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ViajesEntity that = (ViajesEntity) o;
		return id == that.id && idCiudad == that.idCiudad && idTerreno == that.idTerreno && idHotel == that.idHotel && idTransporte == that.idTransporte && idViajesimagenes == that.idViajesimagenes && Objects.equals(ida, that.ida) && Objects.equals(vuelta, that.vuelta) && Objects.equals(puntuacion, that.puntuacion) && Objects.equals(descripcion, that.descripcion) && Objects.equals(planes, that.planes);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, idCiudad, ida, vuelta, idTerreno, idHotel, idTransporte, idViajesimagenes, puntuacion, descripcion, planes);
	}
}