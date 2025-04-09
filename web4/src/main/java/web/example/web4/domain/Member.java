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
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String part;
    private String position;
    private String githubUrl;
    private String instagramUrl;
    private String generation;

    public void update(int id, String username, String part, String position, String githubUrl, String instagramUrl, String generation) {
        this.id = id;
        this.username = username;
        this.part = part;
        this.position = position;
        this.githubUrl = githubUrl;
        this.instagramUrl = instagramUrl;
        this.generation = generation;
    }
}
