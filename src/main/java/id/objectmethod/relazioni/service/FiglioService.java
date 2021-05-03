package id.objectmethod.relazioni.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.objectmethod.relazioni.domain.Figlio;
import id.objectmethod.relazioni.repo.FiglioRepository;

@Service
public class FiglioService {

	@Autowired
	private FiglioRepository fRepo;

	public Figlio findById(Long id) {
		Figlio p = fRepo.findById(id).get();
		return p;
	}

}
