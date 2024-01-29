package proyecto.vaigo.model.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		HabitacionEntity that = (HabitacionEntity) o;
		return id == that.id && idHotel == that.idHotel && Objects.equals(estado, that.estado) && Objects.equals(inicio, that.inicio) && Objects.equals(fin, that.fin);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, estado, inicio, idHotel, fin);
	}

	public HotelEntity getHotelByIdHotel() {
		return hotelByIdHotel;
	}

	public void setHotelByIdHotel(HotelEntity hotelByIdHotel) {
		this.hotelByIdHotel = hotelByIdHotel;
	}
}
