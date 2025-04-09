package web.example.web4.dto.blog;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class BlogRequestDTO {
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

    public void set(String title, String subhead, String text, String coverUrl, LocalDate createdDate, boolean monthlyBest, String blogUrl, String author, String generation, String techStack, String activityType, int likes) {
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
