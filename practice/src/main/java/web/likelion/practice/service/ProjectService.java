package web.likelion.practice.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import web.likelion.practice.dto.project.ProjectRequestDTO;
import web.likelion.practice.entity.Project;
import web.likelion.practice.repository.ProjectRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectService {
    private final ProjectRepository projectRepository;

    @Getter
    List<Project> projectList = new ArrayList<>();

    // CREATE
    public Project createProject(ProjectRequestDTO projectRequestDTO) {
        Project project = new Project(projectRequestDTO, projectRequestDTO.getTechStackId(), projectRequestDTO.getGenerationId(), projectRequestDTO.getActivityTypeId());
        return projectRepository.save(project);
    }
    // READ

    // UPDATE
    public Project update(Project project) {
        Project pj =
        return projectRepository.save(project);
    }

    // DELETE
}
