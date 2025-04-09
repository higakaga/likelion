package web.likelion.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.likelion.practice.entity.ProjectImage;

import java.util.Optional;

public interface ProjectImageRepository extends JpaRepository<ProjectImage, Integer> {
    Optional<ProjectImage> findById(Integer id);
}
