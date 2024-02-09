package proyecto.vaigo.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyecto.vaigo.model.entity.HotelEntity;

@Repository
@Transactional
public interface HotelRepository extends JpaRepository<HotelEntity, Integer> {
}
