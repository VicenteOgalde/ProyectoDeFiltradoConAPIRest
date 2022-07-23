package cl.dojo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.dojo.models.Comuna;

@Repository
public interface IComunaRepository extends JpaRepository<Comuna, Integer> {

}
