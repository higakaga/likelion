package web.example.web4.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.example.web4.dto.member.MemberRequestDTO;
import web.example.web4.dto.member.MemberResponseDTO;
import web.example.web4.service.MemberService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/members")
public class MemberController {
    private final MemberService memberService;

    @PostMapping(value = "/post")
    public ResponseEntity<MemberResponseDTO> create(@RequestBody MemberRequestDTO dto) {
        return ResponseEntity.ok(memberService.createMember(dto));
    }

    @GetMapping
    public ResponseEntity<List<MemberResponseDTO>> readAll() {
        return ResponseEntity.ok(memberService.readMember());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<MemberResponseDTO> readOne(@PathVariable int id) {
        return ResponseEntity.ok(memberService.searchMember(id));
    }

    @PatchMapping(value = "/{id}")
    public ResponseEntity<MemberResponseDTO> update(@PathVariable int id, @RequestBody MemberRequestDTO dto) {
        return ResponseEntity.ok(memberService.updateMember(id, dto));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        memberService.deleteMember(id);
        return ResponseEntity.ok("Member 삭제.");
    }
}
