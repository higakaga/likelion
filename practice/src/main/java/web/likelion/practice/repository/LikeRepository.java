package web.likelion.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.likelion.practice.entity.Blog;
import web.likelion.practice.entity.Like;
import web.likelion.practice.entity.Project;
import web.likelion.practice.entity.User;

import java.util.Optional;

public interface LikeRepository extends JpaRepository<Like, Integer> {
    Optional<Like> findById(Integer id);
    Optional<Like> findByProjectId(Project project);
    Optional<Like> findByBlogId(Blog blog);
    Optional<Like> findByUserId(User user);
}
