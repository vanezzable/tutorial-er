package id.objectmethod.relazioni.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.objectmethod.relazioni.domain.Padre;

@Repository
public interface PadreRepository extends JpaRepository<Padre, Long>{
	
//	@Query("select p from Padre p join Figlio f on p.id = f.padre.id where f.id = ?1")
//	public Padre getPadreByIdFiglio(Long idFiglio);
	
}
