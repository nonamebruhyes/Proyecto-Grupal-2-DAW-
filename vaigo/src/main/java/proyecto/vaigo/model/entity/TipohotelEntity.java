package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;
@Data
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
}