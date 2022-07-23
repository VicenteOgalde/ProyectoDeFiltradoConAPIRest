package cl.dojo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.dojo.models.Region;

@Repository
public interface IRegionRepository extends JpaRepository<Region, Integer> {

}
