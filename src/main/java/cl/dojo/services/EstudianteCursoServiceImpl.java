package cl.dojo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.dojo.dto.EstudianteCursoDTO;
import cl.dojo.models.Estudiante;
import cl.dojo.repositories.ICursoRepository;
import cl.dojo.repositories.IEstudianteRepository;


@Service
public class EstudianteCursoServiceImpl implements IEstudianteCursoService {

	@Autowired
	IEstudianteRepository estudianteRepository;

	@Autowired
	ICursoRepository cursoRepository;

	@Override
	public List<EstudianteCursoDTO> findAll() {
		List<EstudianteCursoDTO> estudiantesCursos = new ArrayList<EstudianteCursoDTO>();
		List<Estudiante> estudiantes = estudianteRepository.findAll();
		for (Estudiante estudiante : estudiantes) {
			EstudianteCursoDTO ECDTO = new EstudianteCursoDTO(estudiante.getRut(), estudiante.getNombre(),
					estudiante.getApellidoPaterno(), estudiante.getApellidoMaterno(), estudiante.getCursoId(),
					cursoRepository.findByCursoId(estudiante.getCursoId()).getPlanFormativo().getDescripcion());
			estudiantesCursos.add(ECDTO);
		}

		return estudiantesCursos;
	}

	@Override
	public List<EstudianteCursoDTO> findByRegionAndCurso(int regionId, String cursoId) {
		List<EstudianteCursoDTO> estudiantesCursos = new ArrayList<EstudianteCursoDTO>();
		List<Estudiante> estudiantes = estudianteRepository.findAll();
		if (regionId == 0 && cursoId.isBlank()) {
			return findAll();
		} else if (regionId > 0 && cursoId.isBlank()) {
			for (Estudiante estudiante : estudiantes) {
				if (estudiante.getComuna().getRegion().getRegionId() == regionId) {
					EstudianteCursoDTO ECDTO = new EstudianteCursoDTO(estudiante.getRut(), estudiante.getNombre(),
							estudiante.getApellidoPaterno(), estudiante.getApellidoMaterno(), estudiante.getCursoId(),
							cursoRepository.findByCursoId(estudiante.getCursoId()).getPlanFormativo().getDescripcion());
					estudiantesCursos.add(ECDTO);
				}
			}
			return estudiantesCursos;
		} else if (regionId == 0 && (!cursoId.isBlank())) {
			for (Estudiante estudiante : estudiantes) {
				if (estudiante.getCursoId().equals(cursoId)) {
					EstudianteCursoDTO ECDTO = new EstudianteCursoDTO(estudiante.getRut(), estudiante.getNombre(),
							estudiante.getApellidoPaterno(), estudiante.getApellidoMaterno(), estudiante.getCursoId(),
							cursoRepository.findByCursoId(estudiante.getCursoId()).getPlanFormativo().getDescripcion());
					estudiantesCursos.add(ECDTO);
				}
			}
			return estudiantesCursos;
		} else {
			for (Estudiante estudiante : estudiantes) {
				if (estudiante.getCursoId().equals(cursoId)
						&& estudiante.getComuna().getRegion().getRegionId() == regionId) {
					EstudianteCursoDTO ECDTO = new EstudianteCursoDTO(estudiante.getRut(), estudiante.getNombre(),
							estudiante.getApellidoPaterno(), estudiante.getApellidoMaterno(), estudiante.getCursoId(),
							cursoRepository.findByCursoId(estudiante.getCursoId()).getPlanFormativo().getDescripcion());
					estudiantesCursos.add(ECDTO);
				}

			}
			return estudiantesCursos;

		}

	}
}
