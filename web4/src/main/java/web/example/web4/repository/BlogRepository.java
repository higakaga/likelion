package web.example.web4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.example.web4.domain.Blog;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
    List<Blog> findByTechStack(String techStack);

    List<Blog> findByActivityType(String activityType);

    List<Blog> findByTechStackAndActivityType(String techStack, String activityType);
}
