package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;
@Data
@Entity
@Table(name = "tipohotel", schema = "vaigo", catalog = "")
public class TipohotelEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private int id;
	@Basic
	@Column(name = "TIPO")
	private String tipo;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		TipohotelEntity that = (TipohotelEntity) o;
		return id == that.id && Objects.equals(tipo, that.tipo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, tipo);
	}
}