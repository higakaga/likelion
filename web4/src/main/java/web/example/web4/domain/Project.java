package web.example.web4.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String overview;
    private String projectType;
    private String description;
    private String coverUrl;
    private String techStack;
    private String activityType;
    private int likes;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void update(int id, String title, String overview, String projectType, String description, String coverUrl, String techStack, String activityType, int likes) {
        this.id = id;
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
