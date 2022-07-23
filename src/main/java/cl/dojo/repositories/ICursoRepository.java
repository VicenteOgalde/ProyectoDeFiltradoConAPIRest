package cl.dojo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.dojo.models.Curso;

@Repository
public interface ICursoRepository extends JpaRepository<Curso, String> {

	Curso findByCursoId(String cursoId);
}
