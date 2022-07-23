package cl.dojo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.dojo.models.Curso;
import cl.dojo.repositories.ICursoRepository;

@Service
public class CursoServiceImpl implements ICursoService {

	@Autowired
	ICursoRepository cursoRepository;
	
	
	@Override
	public List<Curso> findAll() {
		return cursoRepository.findAll();
	}

	
}
