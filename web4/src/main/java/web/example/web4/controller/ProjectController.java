package web.example.web4.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.example.web4.domain.Project;
import web.example.web4.dto.project.ProjectRequestDTO;
import web.example.web4.dto.project.ProjectResponseDTO;
import web.example.web4.service.ProjectService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/projects")
public class ProjectController {
    private final ProjectService projectService;

    @PostMapping(value = "/post")
    public ResponseEntity<ProjectResponseDTO> createProject(@RequestBody ProjectRequestDTO projectRequestDTO) {
        ProjectResponseDTO created = projectService.createProject(projectRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @GetMapping
    public ResponseEntity<List<ProjectResponseDTO>> getAllProjects() {
        List<ProjectResponseDTO> projects = projectService.readProject();
        return ResponseEntity.ok(projects);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProjectResponseDTO> getProjectById(@PathVariable int id) {
        ProjectResponseDTO project = projectService.searchProject(id);
        return ResponseEntity.ok(project);
    }

    @PatchMapping(value = "/{id}")
    public ResponseEntity<ProjectResponseDTO> updateProject(
            @PathVariable int id,
            @RequestBody ProjectRequestDTO projectRequestDTO
    ) {
        ProjectResponseDTO updated = projectService.updateProject(id, projectRequestDTO);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> deleteProject(@PathVariable int id) {
        projectService.deleteProject(id);
        return ResponseEntity.ok("Project 삭제.");
    }
}
