package id.objectmethod.relazioni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.objectmethod.relazioni.domain.Padre;
import id.objectmethod.relazioni.service.PadreService;

@RestController
@RequestMapping("/api/padre")
public class PadreController {

	@Autowired
	private PadreService padreService;

	@GetMapping("/{id}/find")
	public Padre findById(@PathVariable("id") Long id) {
		Padre p = padreService.findById(id);
		return p;
	}

	@GetMapping("/birichini")
	public List<Padre> findBirichini() {
		List<Padre> p = padreService.findBirichini();
		return p;
	}

	@PostMapping("/save")
	public Padre savePadre(@RequestBody Padre padre) {
		Padre p = padreService.savePadre(padre);
		return p;
	}

}
