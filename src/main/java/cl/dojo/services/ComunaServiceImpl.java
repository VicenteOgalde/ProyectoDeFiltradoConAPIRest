package cl.dojo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.dojo.models.Comuna;
import cl.dojo.repositories.IComunaRepository;
@Service
public class ComunaServiceImpl implements IComunaService {

	@Autowired
	IComunaRepository comunaRepository;
	
	@Override
	public List<Comuna> findAll() {
		return comunaRepository.findAll();
	}

}
