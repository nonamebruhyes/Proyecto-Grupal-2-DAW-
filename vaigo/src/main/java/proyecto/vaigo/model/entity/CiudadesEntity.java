package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;

@Data
@Entity
@Table(name = "ciudades", schema = "vaigo", catalog = "")
public class CiudadesEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private int id;
	@Basic
	@Column(name = "ID_PAIS")
	private int idPais;
	@Basic
	@Column(name = "CIUDAD")
	private String ciudad;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CiudadesEntity that = (CiudadesEntity) o;
		return id == that.id && idPais == that.idPais && Objects.equals(ciudad, that.ciudad);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, idPais, ciudad);
	}
}
