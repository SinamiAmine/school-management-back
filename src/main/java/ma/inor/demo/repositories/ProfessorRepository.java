package ma.inor.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.inor.demo.entities.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer> {

}
