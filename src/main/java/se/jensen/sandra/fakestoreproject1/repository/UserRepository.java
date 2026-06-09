package se.jensen.sandra.fakestoreproject1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.jensen.sandra.fakestoreproject1.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}