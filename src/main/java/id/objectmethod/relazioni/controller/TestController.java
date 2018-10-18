package id.objectmethod.relazioni.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import id.objectmethod.relazioni.domain.Figlio;
import id.objectmethod.relazioni.domain.Padre;
import id.objectmethod.relazioni.repo.FiglioRepository;
import id.objectmethod.relazioni.repo.PadreRepository;

@Controller
public class TestController {

	@Autowired
	private PadreRepository pRepo;
	
	@Autowired
	private FiglioRepository fRepo;
	
	
	@GetMapping("/insert")
	public void insertData() {
		Padre p = pRepo.findOne(2L);
		System.out.println("PADRE: "+p.getNome());
	}
	
}
