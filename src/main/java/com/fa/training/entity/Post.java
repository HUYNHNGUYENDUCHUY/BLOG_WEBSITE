package com.fa.training.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Set;

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private Long id ;

    @Column
    private  String title;

    @Column
    private String content;

    @Column
    private String tags;

    @Column
    private String status;

    @Column
    private LocalDateTime createTime;

    @Column
    private LocalDateTime updateTime;

    @OneToMany(mappedBy = "post")
    private Set<Comment> comment;

    @ManyToOne
    @JoinColumn(name="author_id")
    private User user;


    @Transient
    public String getFormatCreateTime(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy HH:mm:ss a", Locale.ENGLISH);
        return getCreateTime().format(formatter);
    }
    @Transient
    public String getFormatUpdateTime(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy HH:mm:ss a", Locale.ENGLISH);
        return getUpdateTime().format(formatter);
    }


    public Post(Long id, String title, String content, String tags, String status, LocalDateTime createTime, LocalDateTime updateTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.tags = tags;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
