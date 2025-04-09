package web.likelion.practice.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = true)
    private Project project;

    @ManyToOne
    @JoinColumn(name = "blog_id", nullable = true)
    private Blog blog;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Like(Integer id, Project project, Blog blog, User user) {
        this.id = id;
        this.project = project;
        this.blog = blog;
        this.user = user;
    }

    public Like() {

    }

    public void update(Integer id, Project project, Blog blog, User user) {
        this.id = id;
        this.project = project;
        this.blog = blog;
        this.user = user;
    }
}
