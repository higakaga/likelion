package web.example.web4.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import web.example.web4.domain.Recruit;
import web.example.web4.dto.recruit.RecruitRequestDTO;
import web.example.web4.dto.recruit.RecruitResponseDTO;
import web.example.web4.repository.RecruitRepository;

@Service
@RequiredArgsConstructor
public class RecruitService {
    private final RecruitRepository recruitRepository;

    private RecruitResponseDTO toResponseDTO(Recruit recruit) {
        return new RecruitResponseDTO(recruit.getId(), recruit.getLink());
    }

    public RecruitResponseDTO createRecruit(RecruitRequestDTO dto) {
        Recruit recruit = new Recruit();
        recruit.update(0, dto.getLink());  // ID는 자동 생성되므로 0 또는 무시 가능
        Recruit saved = recruitRepository.save(recruit);
        return toResponseDTO(saved);
    }

    public RecruitResponseDTO searchRecruit(int id) {
        Recruit recruit = recruitRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Recruit not found"));
        return toResponseDTO(recruit);
    }

    public RecruitResponseDTO updateRecruit(int id, RecruitRequestDTO dto) {
        Recruit recruit = recruitRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Recruit not found"));
        recruit.update(id, dto.getLink());
        return toResponseDTO(recruitRepository.save(recruit));
    }
}
