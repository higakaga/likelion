package web.likelion.practice.dto.project;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ProjectRequestDTO {

    private String title;
    private String overview;
    private String projectType;
    private String description;
    private String coverUrl;

    private Integer techStackId;
    private Integer generationId;
    private Integer activityTypeId;

    private S

    public void updateProjectRequestDTO(String title, String overview, String projectType, String description, String coverUrl, Integer techStackId, Integer generationId, Integer activityTypeId) {
        this.title = title;
        this.overview = overview;
        this.projectType = projectType;
        this.description = description;
        this.coverUrl = coverUrl;
        this.techStackId = techStackId;
        this.generationId = generationId;
        this.activityTypeId = activityTypeId;
    }
}
