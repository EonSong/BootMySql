package com.example.testdb.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class MemberInfo {
    private String no;
    private String team;
    private String position;
    private String name;
    private String email;
    private String phone;
}
