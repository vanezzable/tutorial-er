package id.objectmethod.relazioni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.objectmethod.relazioni.domain.Figlio;
import id.objectmethod.relazioni.domain.Padre;
import id.objectmethod.relazioni.repo.PadreRepository;

@Service
public class PadreService {

	@Autowired
	private PadreRepository pRepo;

	public Padre findById(Long id) {
		Padre p = pRepo.findById(id).get();

		List<Figlio> figli = p.getFigli();
		System.out.println("Ha " + figli.size() + " figli");

		return p;
	}

	public List<Padre> findBirichini() {
		List<Padre> p = pRepo.findWithAmanteOverEighty();
		return p;
	}

	public Padre savePadre(Padre padre) {
		for (Figlio f : padre.getFigli()) {
			f.setPadre(padre);
		}
		Padre p = pRepo.save(padre);
		return p;
	}

}
