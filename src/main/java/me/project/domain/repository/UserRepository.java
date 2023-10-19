package me.project.domain.repository;

import me.project.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

 boolean existsByAccountNumber(String accountNumber);

}
