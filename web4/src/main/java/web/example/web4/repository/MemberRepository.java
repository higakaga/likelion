package web.example.web4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.example.web4.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {
}
