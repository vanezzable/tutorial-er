package id.objectmethod.relazioni.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.objectmethod.relazioni.domain.Figlio;
import id.objectmethod.relazioni.repo.FiglioRepository;

@RestController
@RequestMapping("/api/figlio")
public class FiglioController {

	@Autowired
	private FiglioRepository fRepo;

	@GetMapping("/{id}/find")
	public Figlio findById(@PathVariable("id") Long id) {
		Figlio p = fRepo.findById(id).get();
		return p;
	}

}
