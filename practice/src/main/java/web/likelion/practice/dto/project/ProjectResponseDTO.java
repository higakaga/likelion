package web.likelion.practice.dto.project;

import lombok.AllArgsConstructor;
import lombok.Getter;
import web.likelion.practice.entity.Project;

@Getter
@AllArgsConstructor
public class ProjectResponseDTO {

    private Integer id;
    private String title;
    private String overview;
    private String projectType;
    private String description;
    private String coverUrl;

    private String techStackName;
    private String generationName;
    private String activityTypeName;

    public void updateProjectResponseDTO(Integer id, String title, String overview, String projectType, String description, String coverUrl, String techStackName, String generationName, String activityTypeName) {
        this.id = id;
        this.title = title;
        this.overview = overview;
        this.projectType = projectType;
        this.description = description;
        this.coverUrl = coverUrl;
        this.techStackName = techStackName;
        this.generationName = generationName;
        this.activityTypeName = activityTypeName;
    }

}
