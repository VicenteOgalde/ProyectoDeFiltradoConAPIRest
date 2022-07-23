package cl.dojo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.dojo.models.Estudiante;

@Repository
public interface IEstudianteRepository extends JpaRepository<Estudiante, Integer>{

}
