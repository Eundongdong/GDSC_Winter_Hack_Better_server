package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String content;

    @Builder
    public PostsSaveRequestDto(String content) {
        this.content = content;
    }

    public Posts toEntity() {
        return Posts.builder()
                .content(content)
                .build();
    }
}