package web.example.web4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.example.web4.domain.Project;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

    List<Project> findByGeneration(String generation);
    List<Project> findByActivityType(String activityType);
    List<Project> findByGenerationAndActivityType(String generation, String activityType);
}
