package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;
@Data
@Entity
public class TipoHotel {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID", nullable = false)
	private int id;
	@Basic
	@Column(name = "TIPO", nullable = true, length = 30)
	private String tipo;
	@OneToMany(mappedBy = "tipohotelByIdTipohotel")
	private Collection<Hotel> hotelsById;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		TipoHotel tipoHotel = (TipoHotel) o;
		return id == tipoHotel.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
