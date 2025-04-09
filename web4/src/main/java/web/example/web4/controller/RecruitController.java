package web.example.web4.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.example.web4.dto.recruit.RecruitRequestDTO;
import web.example.web4.dto.recruit.RecruitResponseDTO;
import web.example.web4.service.RecruitService;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/recruit")
public class RecruitController {
    private final RecruitService recruitService;
    @PostMapping(value = "/post")
    public ResponseEntity<RecruitResponseDTO> create(@RequestBody RecruitRequestDTO dto) {
        return ResponseEntity.ok(recruitService.createRecruit(dto));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<RecruitResponseDTO> getById(@PathVariable int id) {
        return ResponseEntity.ok(recruitService.searchRecruit(id));
    }

    @PatchMapping(value = "/{id}")
    public ResponseEntity<RecruitResponseDTO> update(@PathVariable int id, @RequestBody RecruitRequestDTO dto) {
        return ResponseEntity.ok(recruitService.updateRecruit(id, dto));
    }
}
