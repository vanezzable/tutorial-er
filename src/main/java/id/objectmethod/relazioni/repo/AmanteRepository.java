package id.objectmethod.relazioni.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.objectmethod.relazioni.domain.Amante;

@Repository
public interface AmanteRepository extends JpaRepository<Amante, Long> {

}
