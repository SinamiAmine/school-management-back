package ma.inor.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.inor.demo.entities.Matiere;

@Repository
public interface MatiereRepository  extends JpaRepository<Matiere, Integer>{

}
