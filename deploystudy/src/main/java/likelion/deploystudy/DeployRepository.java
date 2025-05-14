package likelion.deploystudy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeployRepository extends JpaRepository<DeployEntity, Long> {
}
