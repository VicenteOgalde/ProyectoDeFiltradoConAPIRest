package cl.dojo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cl.dojo.dto.EstudianteCursoDTO;
import cl.dojo.services.EstudianteCursoServiceImpl;

@RestController
public class ApiRestController {

	

	
	@Autowired
	EstudianteCursoServiceImpl estudianteCursoServiceImpl;
	//Busca toda la lista
	@GetMapping("/api/v1/estudiantes")
	public List<EstudianteCursoDTO> allEstudianteCursoDTO(){
		return estudianteCursoServiceImpl.findAll();
	}
	//Busca por id de region
	@GetMapping("/api/v1/estudiantes/region={region}")
	public List<EstudianteCursoDTO> findByRegion(@PathVariable("region")int regionId){
		return estudianteCursoServiceImpl.findByRegionAndCurso(regionId, "");
	}
	//Busca por codigo de curso
	@GetMapping("/api/v1/estudiantes/curso={curso}")
	public List<EstudianteCursoDTO> findByCurso(@PathVariable("curso")String cursoId){
		return estudianteCursoServiceImpl.findByRegionAndCurso(0, cursoId);
	}
	//Busca por id de region y codigo de curso
	@GetMapping("/api/v1/estudiantes/region={region}/curso={curso}")
	public List<EstudianteCursoDTO> findByRegionAndCurso(@PathVariable("region")int regionId,
			@PathVariable("curso")String cursoId){
		return estudianteCursoServiceImpl.findByRegionAndCurso(regionId, cursoId);
	}
	
}
