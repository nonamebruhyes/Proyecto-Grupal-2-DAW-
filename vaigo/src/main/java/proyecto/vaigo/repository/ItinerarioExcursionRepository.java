package proyecto.vaigo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import proyecto.vaigo.model.dto.ItinerarioExcursionesDTO;
import proyecto.vaigo.model.dto.ViajesDTO;
import proyecto.vaigo.model.entity.ItinerarioExcursionesEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.vaigo.model.entity.UsuariosEntity;

import java.util.List;

public interface ItinerarioExcursionRepository extends JpaRepository<    ItinerarioExcursionesEntity, Integer>{
    @Query(value = "SELECT i.* FROM itinerario_excursiones i,excursion e WHERE e.id_ciudad = :idc",
            nativeQuery = true)
    public List<ItinerarioExcursionesEntity> todosItiEx(@Param("idc") String ciudad);
}
