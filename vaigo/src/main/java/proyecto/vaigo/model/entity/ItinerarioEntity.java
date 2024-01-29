package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;
@Data
@Entity
@Table(name = "ITINERARIO", schema = "vaigo", catalog = "")
public class ItinerarioEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private int id;
	@Basic
	@Column(name = "ID_EXCURSION")
	private int idExcursion;
	@OneToMany(mappedBy = "itinerarioByIdItinerario")
	private Collection<HistorialviajesEntity> historialviajesById;
	@ManyToOne
	@JoinColumn(name = "ID_EXCURSION", referencedColumnName = "ID", nullable = false)
	private ExcursionEntity excursionByIdExcursion;
}