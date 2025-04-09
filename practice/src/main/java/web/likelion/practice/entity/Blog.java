package web.likelion.practice.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String subhead;
    private String text;
    private String coverUrl;
    private LocalDate createdDate;
    private boolean monthlyBest;
    private String blogUrl;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

    @ManyToOne
    @JoinColumn(name = "generation_id")
    private Generation generation;

    @ManyToOne
    @JoinColumn(name = "tech_stack_id")
    private TechStack techStack;

    @ManyToOne
    @JoinColumn(name = "activity_type_id")
    private ActivityType activityType;

    @OneToMany(mappedBy = "blog")
    private List<Like> likes;

    public Blog(Integer id, String title, String subhead, String text, String coverUrl, LocalDate createdDate, boolean monthlyBest, String blogUrl, User author, Generation generation, TechStack techStack, ActivityType activityType, List<Like> likes) {
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

    public Blog() {

    }

    public void update(Integer id, String title, String subhead, String text, String coverUrl, LocalDate createdDate, boolean monthlyBest, String blogUrl, User author, Generation generation, TechStack techStack, ActivityType activityType, List<Like> likes) {
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
