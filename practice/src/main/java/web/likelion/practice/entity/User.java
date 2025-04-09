package web.likelion.practice.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;
    private String part;
    private String position;
    private String githubUrl;
    private String instagramUrl;
    @ManyToOne
    @JoinColumn(name = "generaion_id")
    private Generation generation;

    public User(Integer id, String username, String part, String position, String githubUrl, String instagramUrl, Generation generation) {
        this.id = id;
        this.username = username;
        this.part = part;
        this.position = position;
        this.githubUrl = githubUrl;
        this.instagramUrl = instagramUrl;
        this.generation = generation;
    }

    public User() {

    }

    public void update(Integer id, String username, String part, String position, String githubUrl, String instagramUrl, Generation generation) {
        this.id = id;
        this.username = username;
        this.part = part;
        this.position = position;
        this.githubUrl = githubUrl;
        this.instagramUrl = instagramUrl;
        this.generation = generation;
    }
}
