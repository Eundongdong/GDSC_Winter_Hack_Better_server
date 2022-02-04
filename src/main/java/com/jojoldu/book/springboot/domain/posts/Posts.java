package com.jojoldu.book.springboot.domain.posts;

import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;
    
    //사진 저장
    private String fileName;
    private String fileOriName;
    private String fileurl;


    @Column(columnDefinition = "integer default 0", nullable = true)
    private Integer check1;
    private Integer check2;
    private Integer check3;
    private Integer check4;
    private Integer check5;

    @Builder
    public Posts(String title,String content,String author, String fileName, String fileOriName, String fileurl){
        this.title = title;
        this.content = content;
        this.author = author;
        this.fileName = fileName;
        this.fileOriName = fileOriName;
        this.fileurl = fileurl;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}
