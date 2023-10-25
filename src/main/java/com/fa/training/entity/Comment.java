package com.fa.training.entity;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Comment {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private Long id;

    @Column
    private String content;

    @Column
    private String status;

    @Column
    private LocalDateTime createTime;

    @Column
    private String author;

    @Column
    private String email;

    @Column
    private String url;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;


}
