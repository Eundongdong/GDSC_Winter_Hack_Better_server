package com.jojoldu.book.springboot.domain.posts;

import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;



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

        this.content = content;
        this.check1 = check1;
        this.check2 =check2;
        this.check3 =check3;
        this.check4 =check4;
        this.check5 =check5;
    }
}
