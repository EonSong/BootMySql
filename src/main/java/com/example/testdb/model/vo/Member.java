package com.example.testdb.model.vo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Member {
    private String no;
    private String team;
    private String position;
    private String name;
    private String email;
    private String phone;
}
