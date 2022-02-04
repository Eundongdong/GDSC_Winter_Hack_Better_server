package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.domain.posts.Posts;
import com.jojoldu.book.springboot.domain.posts.PostsRepository;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.nio.file.Files;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    private Integer check1;
    private Integer check2;
    private Integer check3;
    private Integer check4;
    private Integer check5;

    private String fileName;
    private String fileOriName;
    private String fileurl;

    @Autowired
    PostsRepository filepository;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author, String fileName, String fileOriName, String fileurl, Integer check1,Integer check2,Integer check3,Integer check4,Integer check5) {
        this.title = title;
        this.content = content;
        this.author = author;

        this.check1=check1;
        this.check2=check2;
        this.check3=check3;
        this.check4=check4;
        this.check5=check5;


        this.fileName = fileName;
        this.fileOriName = fileOriName;
        this.fileurl = fileurl;

    }

    public Posts toEntity() {
        return Posts.builder()
                .title("제목-")
                .content(content)
                .author("작성자-")
                .fileName(fileName)
                .fileOriName(fileOriName)
                .fileurl(fileurl)
                .check1(check1)
                .check2(check2)
                .check3(check3)
                .check4(check4)
                .check5(check5)
                .build();
    }
}