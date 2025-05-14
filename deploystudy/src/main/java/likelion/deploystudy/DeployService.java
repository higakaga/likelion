package likelion.deploystudy;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeployService {
    private final DeployRepository deployRepository;

    public void post(String name) {
        DeployEntity deployEntity = new DeployEntity(name);
        deployRepository.save(deployEntity);
    }
}
