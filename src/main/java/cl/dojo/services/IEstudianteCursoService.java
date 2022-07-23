package cl.dojo.services;

import java.util.List;

import cl.dojo.dto.EstudianteCursoDTO;

public interface IEstudianteCursoService {

	List<EstudianteCursoDTO> findAll();
	List<EstudianteCursoDTO> findByRegionAndCurso(int regionId,String cursoId);
}
