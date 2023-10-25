package com.fa.training.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private Long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String salt;

    @Column
    private String email;

    @Column
    private String profile;

    @OneToMany(mappedBy = "user")
    private Set<Post> post;

    @ManyToMany
    private Set<Role> roles;

//    public User(CUser CUser){
//        this.username = CUser.getUsername();
//        this.password = CUser.getPassword();
//    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }


}
