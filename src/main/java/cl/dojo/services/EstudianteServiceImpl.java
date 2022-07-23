package cl.dojo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.dojo.models.Estudiante;
import cl.dojo.repositories.IEstudianteRepository;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

	@Autowired
	IEstudianteRepository estudianteRepository;
	
	@Override
	public List<Estudiante> findAll() {
		return estudianteRepository.findAll();
	}

}
