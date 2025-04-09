package web.likelion.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.likelion.practice.entity.Generation;

import java.util.Optional;

public interface GenerationRepository extends JpaRepository<Generation, Integer> {
    Optional<Generation> findByName(String name);
}
