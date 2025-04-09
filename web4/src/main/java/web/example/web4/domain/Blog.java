package web.example.web4.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String subhead;
    private String text;
    private String coverUrl;
    private LocalDate createdDate;
    private boolean monthlyBest;
    private String blogUrl;
    private String author;
    private String generation;
    private String techStack;
    private String activityType;
    private int likes;

    public void update(int id, String title, String subhead, String text, String coverUrl, LocalDate createdDate, boolean monthlyBest, String blogUrl, String author, String generation, String techStack, String activityType, int likes) {
        this.id = id;
        this.title = title;
        this.subhead = subhead;
        this.text = text;
        this.coverUrl = coverUrl;
        this.createdDate = createdDate;
        this.monthlyBest = monthlyBest;
        this.blogUrl = blogUrl;
        this.author = author;
        this.generation = generation;
        this.techStack = techStack;
        this.activityType = activityType;
        this.likes = likes;
    }
}
