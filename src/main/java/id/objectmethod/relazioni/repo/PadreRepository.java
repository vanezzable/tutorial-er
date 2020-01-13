package id.objectmethod.relazioni.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.objectmethod.relazioni.domain.Padre;

@Repository
public interface PadreRepository extends JpaRepository<Padre, Long>{
	
}
