package web.likelion.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.likelion.practice.entity.TechStack;

import java.util.Optional;

public interface TechStackRepository extends JpaRepository<TechStack, Integer> {
    Optional<TechStack> findById(Integer id);
}
