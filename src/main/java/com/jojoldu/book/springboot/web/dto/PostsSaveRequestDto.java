package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
<<<<<<< Updated upstream
    private String author;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
=======
    private Integer check1;
    private Integer check2;
    private Integer check3;
    private Integer check4;
    private Integer check5;

    @Builder
    public PostsSaveRequestDto(String content, Integer check1, Integer check2, Integer check3, Integer check4, Integer check5) {

        this.content = content;
        this.check1 = check1;
        this.check2 = check2;
        this.check3 = check3;
        this.check4 = check4;
        this.check5 = check5;

>>>>>>> Stashed changes
    }

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
<<<<<<< Updated upstream
                .author(author)
=======
                .check1(check1)
                .check2(check2)
                .check3(check3)
                .check4(check4)
                .check5(check5)
>>>>>>> Stashed changes
                .build();
    }
}