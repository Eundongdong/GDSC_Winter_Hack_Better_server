package com.jojoldu.book.springboot.web.dto;


import com.jojoldu.book.springboot.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {
    private Long id;
    private String content;
    private LocalDateTime modifiedDate;
    private Integer check1;
    private Integer check2;
    private Integer check3;
    private Integer check4;
    private Integer check5;

    public PostsListResponseDto(Posts entity){
        this.id = entity.getId();
        this.content = entity.getContent();
        this.modifiedDate = entity.getModifiedDate();
        this.check1 = entity.getCheck1();
        this.check2 = entity.getCheck2();
        this.check3 = entity.getCheck3();
        this.check4 = entity.getCheck4();
        this.check5 = entity.getCheck5();
    }
}
