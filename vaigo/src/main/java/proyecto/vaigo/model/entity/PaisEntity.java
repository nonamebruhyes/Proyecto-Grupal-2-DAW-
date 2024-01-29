package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;
@Data
@Entity
@Table(name = "PAIS", schema = "vaigo", catalog = "")
public class PaisEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private int id;
	@Basic
	@Column(name = "PAIS")
	private String pais;
	@OneToMany(mappedBy = "paisByIdPais")
	private Collection<CiudadesEntity> ciudadesById;
	@OneToMany(mappedBy = "paisByIdPais")
	private Collection<ExcursionEntity> excursionsById;
	@OneToMany(mappedBy = "paisByIdPais")
	private Collection<HotelEntity> hotelsById;
	@OneToMany(mappedBy = "paisByIdPais")
	private Collection<ViajesEntity> viajesById;
}