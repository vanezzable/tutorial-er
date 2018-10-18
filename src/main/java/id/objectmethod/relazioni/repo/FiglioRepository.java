package id.objectmethod.relazioni.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.objectmethod.relazioni.domain.Figlio;

@Repository
public interface FiglioRepository extends JpaRepository<Figlio, Long>{

}
