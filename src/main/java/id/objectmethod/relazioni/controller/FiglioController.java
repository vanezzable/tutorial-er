package id.objectmethod.relazioni.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.objectmethod.relazioni.domain.Figlio;
import id.objectmethod.relazioni.service.FiglioService;

@RestController
@RequestMapping("/api/figlio")
public class FiglioController {

	@Autowired
	private FiglioService figlioService;

	@GetMapping("/{id}/find")
	public Figlio findById(@PathVariable("id") Long id) {
		Figlio p = figlioService.findById(id);
		return p;
	}

}
