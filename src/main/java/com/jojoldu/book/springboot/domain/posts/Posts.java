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

<<<<<<< Updated upstream
    private String author;

    @Builder
    public Posts(String title,String content,String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content){
        this.title = title;
=======
    @Column(columnDefinition = "integer default 0")
    private Integer check1;
    private Integer check2;
    private Integer check3;
    private Integer check4;
    private Integer check5;

    @Builder
    public Posts(String content, Integer check1, Integer check2, Integer check3, Integer check4,Integer check5){
        this.content = content;
        this.check1 =check1;
        this.check2 =check2;
        this.check3 =check3;
        this.check4 =check4;
        this.check5 =check5;
    }

    public void update(String content, Integer check1, Integer check2, Integer check3, Integer check4,Integer check5){
>>>>>>> Stashed changes
        this.content = content;
        this.check1 = check1;
        this.check2 =check2;
        this.check3 =check3;
        this.check4 =check4;
        this.check5 =check5;
    }
}
