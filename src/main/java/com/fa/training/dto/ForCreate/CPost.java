package com.fa.training.dto.ForCreate;

import lombok.*;

import java.time.LocalDateTime;


@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
public class CPost {
    private Long id;
    private String title;
    private String content;
    private String tags;
    private String status;
    private LocalDateTime createDate;

}
