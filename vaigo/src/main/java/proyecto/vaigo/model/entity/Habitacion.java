package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Objects;
@Data
@Entity
public class Habitacion {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID", nullable = false)
	private int id;
	@Basic
	@Column(name = "ESTADO", nullable = true, length = 1)
	private String estado;
	@Basic
	@Column(name = "INICIO", nullable = true)
	private Date inicio;
	@Basic
	@Column(name = "ID_HOTEL", nullable = false)
	private int idHotel;
	@Basic
	@Column(name = "FIN", nullable = true)
	private Date fin;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Habitacion that = (Habitacion) o;
		return id == that.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
