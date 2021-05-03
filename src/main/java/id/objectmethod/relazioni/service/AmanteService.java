package id.objectmethod.relazioni.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.objectmethod.relazioni.domain.Amante;
import id.objectmethod.relazioni.repo.AmanteRepository;

@Service
public class AmanteService {

	@Autowired
	private AmanteRepository aRepo;

	public Amante findById(Long id) {
		Amante p = aRepo.findById(id).get();
		return p;
	}

}
