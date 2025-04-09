package web.example.web4.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import web.example.web4.domain.Member;
import web.example.web4.dto.member.MemberRequestDTO;
import web.example.web4.dto.member.MemberResponseDTO;
import web.example.web4.repository.MemberRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    private void setEntityFromDTO(Member member, MemberRequestDTO dto) {
        member.update(member.getId(), dto.getUsername(), dto.getPart(), dto.getPosition(),
                dto.getGithubUrl(), dto.getInstagramUrl(), dto.getGeneration());
    }

    private MemberResponseDTO toResponseDTO(Member member) {
        return new MemberResponseDTO(
                member.getId(), member.getUsername(), member.getPart(), member.getPosition(),
                member.getGithubUrl(), member.getInstagramUrl(), member.getGeneration()
        );
    }

    public MemberResponseDTO createMember(MemberRequestDTO dto) {
        Member member = new Member();
        setEntityFromDTO(member, dto);
        Member saved = memberRepository.save(member);
        return toResponseDTO(saved);
    }

    public List<MemberResponseDTO> readMember() {
        return memberRepository.findAll().stream()
                .map(this::toResponseDTO)
                .collect(Collectors.toList());
    }

    public MemberResponseDTO searchMember(int id) {
        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Member not found"));
        return toResponseDTO(member);
    }

    public MemberResponseDTO updateMember(int id, MemberRequestDTO dto) {
        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Member not found"));
        setEntityFromDTO(member, dto);
        return toResponseDTO(memberRepository.save(member));
    }

    public void deleteMember(int id) {
        if (!memberRepository.existsById(id)) {
            throw new RuntimeException("Member not found");
        }
        memberRepository.deleteById(id);
    }


}
