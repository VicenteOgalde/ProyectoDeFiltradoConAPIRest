package cl.dojo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.dojo.models.PlanFormativo;
import cl.dojo.repositories.IPlanFormativoRepository;
@Service
public class PlanFormativoServiceImpl implements IPlanFormativoService{

	@Autowired
	IPlanFormativoRepository planFormativoRepository;
	
	@Override
	public List<PlanFormativo> findAll() {
		return planFormativoRepository.findAll();
	}

}
