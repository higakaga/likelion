package web.likelion.practice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import web.likelion.practice.dto.project.ProjectRequestDTO;

import java.time.LocalDate;
import java.util.List;

@Getter
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String overview;
    private String projectType;
    private String description;
    private String coverUrl;

    @ManyToOne
    @JoinColumn(name = "tech_stack_id")
    private TechStack techStack;

    @ManyToOne
    @JoinColumn(name = "generation_id")
    private Generation generation;

    @ManyToOne
    @JoinColumn(name = "activity_type_id")
    private ActivityType activityType;

    private LocalDate startDate;
    private LocalDate endDate;

    @OneToMany(mappedBy = "project")
    private List<TeamMember> teamMembers;

    @OneToMany(mappedBy = "project")
    private List<ProjectImage> images;

    @OneToMany(mappedBy = "project")
    private List<Like> likes;

    public Project(Integer id, String title, String overview, String projectType, String description, String coverUrl, TechStack techStack, Generation generation, ActivityType activityType, LocalDate startDate, LocalDate endDate, List<TeamMember> teamMembers, List<ProjectImage> images, List<Like> likes) {
        this.id = id;
        this.title = title;
        this.overview = overview;
        this.projectType = projectType;
        this.description = description;
        this.coverUrl = coverUrl;
        this.techStack = techStack;
        this.generation = generation;
        this.activityType = activityType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.teamMembers = teamMembers;
        this.images = images;
        this.likes = likes;
    }

    public Project() {

    }

    public void update(Integer id, String title, String overview, String projectType, String description, String coverUrl, TechStack techStack, Generation generation, ActivityType activityType, LocalDate startDate, LocalDate endDate, List<TeamMember> teamMembers, List<ProjectImage> images, List<Like> likes) {
        this.id = id;
        this.title = title;
        this.overview = overview;
        this.projectType = projectType;
        this.description = description;
        this.coverUrl = coverUrl;
        this.techStack = techStack;
        this.generation = generation;
        this.activityType = activityType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.teamMembers = teamMembers;
        this.images = images;
        this.likes = likes;
    }

}
