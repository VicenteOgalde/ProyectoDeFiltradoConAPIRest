package cl.dojo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.dojo.models.Region;
import cl.dojo.repositories.IRegionRepository;
@Service
public class RegionServiceImpl implements IRegionService{

	@Autowired
	IRegionRepository regionRepository;
	
	@Override
	public List<Region> findAll() {
		return regionRepository.findAll();
	}

}
