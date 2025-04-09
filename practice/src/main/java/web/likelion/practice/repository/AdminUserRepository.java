package web.likelion.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.likelion.practice.entity.AdminUser;

import java.util.Optional;

public interface AdminUserRepository extends JpaRepository<AdminUser, Integer> {
    Optional<AdminUser> findById(Integer id);
}
