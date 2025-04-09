package web.example.web4.dto.project;

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
    private String techStack;
    private String activityType;
    private int likes;

    public void set(String title, String overview, String projectType, String description, String coverUrl, String techStack, String activityType, int likes) {
        this.title = title;
        this.overview = overview;
        this.projectType = projectType;
        this.description = description;
        this.coverUrl = coverUrl;
        this.techStack = techStack;
        this.activityType = activityType;
        this.likes = likes;
    }
}
