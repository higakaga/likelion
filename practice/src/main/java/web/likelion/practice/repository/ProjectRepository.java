package web.likelion.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.likelion.practice.entity.ActivityType;
import web.likelion.practice.entity.Generation;
import web.likelion.practice.entity.Project;

import java.util.Optional;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
    Optional<Project> findById(Integer id);
    Optional<Project> findByGenerationId(Generation generation);
    Optional<Project> findByActivityTypeId(ActivityType activityType);
}
