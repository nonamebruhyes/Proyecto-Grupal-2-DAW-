package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;
@Data
@Entity
@Table(name = "historialviajes", schema = "vaigo", catalog = "")
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
	@Column(name = "NUMPERSONAS")
	private Integer numpersonas;
	@Basic
	@Column(name = "Precio_total")
	private Double precioTotal;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		HistorialviajesEntity that = (HistorialviajesEntity) o;
		return id == that.id && idUsuario == that.idUsuario && idViaje == that.idViaje && Objects.equals(numpersonas, that.numpersonas) && Objects.equals(precioTotal, that.precioTotal);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, idUsuario, idViaje, numpersonas, precioTotal);
	}
}