package cl.dojo.services;

import java.util.List;

import cl.dojo.models.Estudiante;

public interface IEstudianteService {

	List<Estudiante> findAll();
}
