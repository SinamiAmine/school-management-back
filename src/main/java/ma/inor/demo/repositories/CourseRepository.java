package ma.inor.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.inor.demo.entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
