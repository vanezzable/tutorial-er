package id.objectmethod.relazioni.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.objectmethod.relazioni.domain.Amante;
import id.objectmethod.relazioni.repo.AmanteRepository;

@RestController
@RequestMapping("/api/amanti")
public class AmanteController {

	@Autowired
	private AmanteRepository aRepo;

	@GetMapping("/{id}/find")
	public Amante findById(@PathVariable("id") Long id) {
		Amante p = aRepo.findById(id).get();
		return p;
	}

}
