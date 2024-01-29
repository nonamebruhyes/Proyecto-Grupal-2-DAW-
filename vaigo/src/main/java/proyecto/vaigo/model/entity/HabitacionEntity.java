package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Objects;
@Data
@Entity
@Table(name = "HABITACION", schema = "vaigo", catalog = "")
public class HabitacionEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private int id;
	@Basic
	@Column(name = "ESTADO")
	private String estado;
	@Basic
	@Column(name = "INICIO")
	private Date inicio;
	@Basic
	@Column(name = "ID_HOTEL")
	private int idHotel;
	@Basic
	@Column(name = "FIN")
	private Date fin;
	@ManyToOne
	@JoinColumn(name = "ID_HOTEL", referencedColumnName = "ID", nullable = false)
	private HotelEntity hotelByIdHotel;
}