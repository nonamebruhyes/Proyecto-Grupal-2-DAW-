package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;

@Data
@Entity
@Table(name = "pais", schema = "vaigo", catalog = "")
public class PaisEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private int id;
	@Basic
	@Column(name = "PAIS")
	private String pais;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PaisEntity that = (PaisEntity) o;
		return id == that.id && Objects.equals(pais, that.pais);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, pais);
	}
}