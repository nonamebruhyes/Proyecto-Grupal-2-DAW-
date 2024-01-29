package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;
@Data
@Entity
@Table(name = "EXCURSION", schema = "vaigo", catalog = "")
public class ExcursionEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private int id;
	@Basic
	@Column(name = "ID_PAIS",insertable=false, updatable=false)
	private int idPais;
	@Basic
	@Column(name = "ID_CIUDAD",insertable=false, updatable=false)
	private int idCiudad;
	@Basic
	@Column(name = "TIPO")
	private String tipo;
	@Basic
	@Column(name = "PRECIO")
	private Double precio;
	@Basic
	@Column(name = "NOMBRE")
	private String nombre;
	@Basic
	@Column(name = "FEC_INICIO")
	private Timestamp fecInicio;
	@Basic
	@Column(name = "DURACION")
	private Timestamp duracion;
	@ManyToOne
	@JoinColumn(name = "ID_PAIS", referencedColumnName = "ID", nullable = false)
	private PaisEntity paisByIdPais;
	@ManyToOne
	@JoinColumn(name = "ID_CIUDAD", referencedColumnName = "ID", nullable = false)
	private CiudadesEntity ciudadesByIdCiudad;
	@OneToMany(mappedBy = "excursionByIdExcursion")
	private Collection<ItinerarioEntity> itinerariosById;

}
