package id.objectmethod.relazioni.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import id.objectmethod.relazioni.domain.Padre;

@Repository
public interface PadreRepository extends JpaRepository<Padre, Long> {

	@Query("SELECT p FROM Padre p JOIN FETCH p.amanti a WHERE a.eta < 80 ")
	public List<Padre> findWithAmanteOverEighty();
}
