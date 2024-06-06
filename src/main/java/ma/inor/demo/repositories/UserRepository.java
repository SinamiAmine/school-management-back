package ma.inor.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.inor.demo.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
