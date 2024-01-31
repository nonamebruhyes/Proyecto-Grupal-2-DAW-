package proyecto.vaigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import proyecto.vaigo.model.entity.CiudadesEntity;
import proyecto.vaigo.model.entity.ViajesEntity;

import java.util.List;


@Repository
@Transactional
public interface ViajesRepository extends JpaRepository<ViajesEntity, Integer> {
    @Query(value = "SELECT * FROM viajes WHERE id_pais = :idc", nativeQuery = true)
    public List<CiudadesEntity> findFilto(@Param("idc") Long idCliente);
}
