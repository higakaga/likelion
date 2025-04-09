package web.example.web4.dto.member;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MemberRequestDTO {
    private String username;
    private String part;
    private String position;
    private String githubUrl;
    private String instagramUrl;
    private String generation;
}
