package proyecto.vaigo.model.entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "TIPOHOTEL", schema = "vaigo", catalog = "")
public class TipohotelEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private int id;
	@Basic
	@Column(name = "TIPO")
	private String tipo;
	@OneToMany(mappedBy = "tipohotelByIdTipohotel")
	private Collection<HotelEntity> hotelsById;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

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

	public Collection<HotelEntity> getHotelsById() {
		return hotelsById;
	}

	public void setHotelsById(Collection<HotelEntity> hotelsById) {
		this.hotelsById = hotelsById;
	}
}
