package proyecto.vaigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface CiudadesRepository  extends JpaRepository<CiudadesEntity, Integer> {
    /*
    @Query(value = "SELECT * FROM ciudades WHERE id_pais = :idc", nativeQuery = true)
    public List<CiudadesEntity> findAllByPais(@Param("idc") Long idCliente);

     */
}
