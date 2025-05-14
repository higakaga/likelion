package likelion.deploystudy;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DeployController {
    private final DeployService deployService;

    @GetMapping("/test")
    public String getTest() {
        return "get-test 성공입니다!";
    }

    @PostMapping("/test")
    public String postTest(@RequestParam String name) {
        deployService.post(name);
        return "post-test 성공입니다!";
    }
}
