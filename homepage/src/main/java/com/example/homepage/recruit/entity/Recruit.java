package com.example.homepage.recruit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Entity
public class Recruit {
    // 아이디
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    // 구글폼 URL
    private String url;
    // 서류 모집
    private LocalDate documentDate;
    // 합격자 발표
    private LocalDate candidateDate;
    // 면접 날짜
    private LocalDate interviewDate;
    // 최종 합격
    private LocalDate acceptDate;
    // OT 날짜
    private LocalDate otDate;
    // 취소 여부
    private Integer isDeleted;
}
