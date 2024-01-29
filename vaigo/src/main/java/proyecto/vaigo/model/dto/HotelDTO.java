package proyecto.vaigo.model.dto;

import lombok.Data;
import proyecto.vaigo.model.entity.HotelEntity;
@Data
public class HotelDTO {
	private int id;
	private String nombre;
	private int idPais;
	private int idCiudad;
	private int idTipohotel;
	private Double precio;

	public static HotelDTO convertoToDTO(HotelEntity hotel){
		HotelDTO hotelDTO = new HotelDTO();
		hotelDTO.setId(hotel.getId());
		hotelDTO.setNombre(hotel.getNombre());
		hotelDTO.setIdPais(hotel.getIdPais());
		hotelDTO.setIdCiudad(hotelDTO.getIdCiudad());
		hotelDTO.setIdTipohotel(hotel.getIdTipohotel());
		hotelDTO.setPrecio(hotel.getPrecio());
	}

	public static Hotel convertoToEntity(HotelDTO hotelDTO){
		Hotel hotel = new Hotel();
		hotel.setId(hotel.getId());
		hotel.setNombre(hotel.getNombre());
		hotel.setIdPais(hotel.getIdPais());
		hotel.setIdCiudad(hotelDTO.getIdCiudad());
		hotel.setIdTipohotel(hotel.getIdTipohotel());
		hotel.setPrecio(hotel.getPrecio());
	}
}
