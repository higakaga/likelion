package web.example.web4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.example.web4.domain.Recruit;

public interface RecruitRepository extends JpaRepository<Recruit, Integer> {
}
