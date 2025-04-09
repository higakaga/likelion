package web.likelion.practice.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class ProjectImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    public ProjectImage(Integer id, String imageUrl, Project project) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.project = project;
    }

    public ProjectImage() {

    }

    public void update(Integer id, String imageUrl, Project project) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.project = project;
    }
}
