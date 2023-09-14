package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@ToString
public class Article {

    @Id     // pk
    @GeneratedValue     // 자동생성 어노테이션
    private Long id;

    @Column
    private String title;

    @Column
    private String content;


    // 깡통생성자 없으면 빨간줄 뜸 -> 왜?
    public Article() {

    }
}
