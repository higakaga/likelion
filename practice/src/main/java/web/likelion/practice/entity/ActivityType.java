package web.likelion.practice.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
public class ActivityType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "activityType")
    private List<Project> projects;

    @OneToMany(mappedBy = "activityType")
    private List<Blog> blogs;

    public ActivityType(Integer id, String name, List<Project> projects, List<Blog> blogs) {
        this.id = id;
        this.name = name;
        this.projects = projects;
        this.blogs = blogs;
    }

    public ActivityType() {

    }

    public void update(Integer id, String name, List<Project> projects, List<Blog> blogs) {
        this.id = id;
        this.name = name;
        this.projects = projects;
        this.blogs = blogs;
    }
}
