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

    private String fileName;
    private String fileOriName;
    private String fileurl;

    @Autowired
    PostsRepository filepository;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author, String fileName, String fileOriName, String fileurl) {
        this.title = title;
        this.content = content;
        this.author = author;

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
                .build();
    }
}