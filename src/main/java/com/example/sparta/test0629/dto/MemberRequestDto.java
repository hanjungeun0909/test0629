package com.example.sparta.test0629.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MemberRequestDto {
    private String name;
    private String email;
    private String pw;
}
