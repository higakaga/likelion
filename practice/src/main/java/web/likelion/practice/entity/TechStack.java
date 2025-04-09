package web.likelion.practice.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
public class TechStack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "techStack")
    private List<Project> projects;

    @OneToMany(mappedBy = "techStack")
    private List<Blog> blogs;

    public TechStack(Integer id, String name, List<Project> projects, List<Blog> blogs) {
        this.id = id;
        this.name = name;
        this.projects = projects;
        this.blogs = blogs;
    }

    public TechStack() {

    }

    public void update(Integer id, String name, List<Project> projects, List<Blog> blogs) {
        this.id = id;
        this.name = name;
        this.projects = projects;
        this.blogs = blogs;
    }
}
