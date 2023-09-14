package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor     // 롬복 : 생성자 생략
@ToString               // 롬복 : toString 생략
public class ArticleForm {

    private String title;
    private String content;





    public Article toEntity() {
        return new Article(null, title, content);
    }



}
