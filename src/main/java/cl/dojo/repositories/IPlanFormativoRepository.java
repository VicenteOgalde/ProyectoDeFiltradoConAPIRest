package cl.dojo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.dojo.models.PlanFormativo;

@Repository
public interface IPlanFormativoRepository extends JpaRepository<PlanFormativo, String> {

}
