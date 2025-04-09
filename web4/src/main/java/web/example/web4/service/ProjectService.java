package web.example.web4.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import web.example.web4.domain.Project;
import web.example.web4.dto.project.ProjectRequestDTO;
import web.example.web4.dto.project.ProjectResponseDTO;
import web.example.web4.repository.ProjectRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository projectRepository;

    private void setEntityFromDTO(Project project, ProjectRequestDTO dto) {
        project.setTitle(dto.getTitle());
        project.setOverview(dto.getOverview());
        project.setProjectType(dto.getProjectType());
        project.setDescription(dto.getDescription());
        project.setCoverUrl(dto.getCoverUrl());
        project.setTechStack(dto.getTechStack());
        project.setActivityType(dto.getActivityType());
        project.setLikes(dto.getLikes());
    }

    private ProjectResponseDTO toResponseDTO(Project project) {
        return new ProjectResponseDTO(
                project.getId(),
                project.getTitle(),
                project.getOverview(),
                project.getProjectType(),
                project.getDescription(),
                project.getCoverUrl(),
                project.getTechStack(),
                project.getActivityType(),
                project.getLikes()
        );
    }

    public ProjectResponseDTO createProject(ProjectRequestDTO projectRequestDTO) {
        Project project = new Project();
        setEntityFromDTO(project, projectRequestDTO);
        Project saved = projectRepository.save(project);
        return toResponseDTO(saved);
    }

    public List<ProjectResponseDTO> readProject() {
        return projectRepository.findAll()
                .stream()
                .map(this::toResponseDTO)
                .collect(Collectors.toList());
    }

    public ProjectResponseDTO searchProject(int id) {
        Project project = projectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Project not found"));
        return toResponseDTO(project);
    }

    public ProjectResponseDTO updateProject(int id, ProjectRequestDTO dto) {
        Project project = projectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Project not found"));
        setEntityFromDTO(project, dto);
        Project updated = projectRepository.save(project);
        return toResponseDTO(updated);
    }

    public void deleteProject(int id) {
        if (!projectRepository.existsById(id)) {
            throw new RuntimeException("Project not found");
        }
        projectRepository.deleteById(id);
    }
}
