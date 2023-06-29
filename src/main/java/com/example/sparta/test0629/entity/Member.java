package com.example.sparta.test0629.entity;

import com.example.sparta.test0629.dto.MemberRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String pw;

    public Member(String name, String email, String pw) {
        this.name = name;
        this.email = email;
        this.pw = pw;
    }
    public Member(MemberRequestDto memberRequestDto){
        this.name=memberRequestDto.getName();
        this.email=memberRequestDto.getEmail();
        this.pw=memberRequestDto.getPw();
    }

}
