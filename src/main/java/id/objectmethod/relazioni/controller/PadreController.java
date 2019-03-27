package id.objectmethod.relazioni.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.objectmethod.relazioni.domain.Figlio;
import id.objectmethod.relazioni.domain.Padre;
import id.objectmethod.relazioni.repo.FiglioRepository;
import id.objectmethod.relazioni.repo.PadreRepository;

@RestController
@RequestMapping("/api/padre")
public class PadreController {

	@Autowired
	private PadreRepository pRepo;
	
	@Autowired
	private FiglioRepository fRepo;
	
	
	@GetMapping("/{id}/find")
	public Padre findById(@PathVariable("id") Long id) {
		Padre p = pRepo.findOne(id);
		return p;
	}
	
	@PostMapping("/save")
	public Padre savePadre(@RequestBody Padre padre) {
		for(Figlio f: padre.getFigli()) {
			f.setPadre(padre);
		}
		Padre p = pRepo.save(padre);
		return p;
	}
	
}
