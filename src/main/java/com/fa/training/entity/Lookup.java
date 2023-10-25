package com.fa.training.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Lookup {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private Long id ;

    @Column
    private String name ;

    @Column
    private String code;

    @Column
    private String type;

    @Column
    private String position;


}
