package web.likelion.practice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.likelion.practice.dto.project.ProjectRequestDTO;
import web.likelion.practice.dto.project.ProjectResponseDTO;
import web.likelion.practice.entity.Project;
import web.likelion.practice.service.ProjectService;

import java.util.List;

@RestController
@RequestMapping("/projects")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService projectService;

    @PostMapping
    public ResponseEntity<?> postProject(
            @RequestBody ProjectRequestDTO projectRequestDTO
            ){
        try{
            Project project = projectService.createProject(projectRequestDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(new ProjectResponseDTO(
                    project.getId(),
                    project.getTitle(),
                    project.getOverview(),
                    project.getProjectType(),
                    project.getDescription(),
                    project.getCoverUrl(),
                    project.getTechStack().getName(),
                    project.getGeneration().getName(),
                    project.getActivityType().getName()));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
    @GetMapping(value = "/get")
    public ResponseEntity<List<Project>> getProject(){
        List<Project> projects = projectService.getProjectList();
    }
}
