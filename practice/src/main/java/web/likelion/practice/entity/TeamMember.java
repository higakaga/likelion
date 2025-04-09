package web.likelion.practice.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class TeamMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String role;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    public TeamMember(Integer id, String name, String role, Project project) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.project = project;
    }

    public TeamMember() {

    }

    public void update(Integer id, String name, String role, Project project) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.project = project;
    }
}
