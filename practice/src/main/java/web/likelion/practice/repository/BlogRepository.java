package web.likelion.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.likelion.practice.entity.Blog;
import web.likelion.practice.entity.User;

import java.util.Optional;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
    Optional<Blog> findById(Integer id);
    Optional<Blog> findByAuthor(User author);
}
