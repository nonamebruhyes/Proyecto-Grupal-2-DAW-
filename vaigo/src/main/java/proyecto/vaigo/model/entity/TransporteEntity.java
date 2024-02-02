package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;
@Data
@Entity
@Table(name = "transporte", schema = "vaigo", catalog = "")
public class TransporteEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private int id;
	@Basic
	@Column(name = "TIPO")
	private String tipo;
	@Basic
	@Column(name = "PRECIO")
	private Double precio;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		TransporteEntity that = (TransporteEntity) o;
		return id == that.id && Objects.equals(tipo, that.tipo) && Objects.equals(precio, that.precio);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, tipo, precio);
	}
}