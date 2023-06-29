package com.example.sparta.test0629.dto;
import com.example.sparta.test0629.entity.Member;
import lombok.Getter;

@Getter
public class MemberResponseDto {

    private Long id;
    private String name;
    private String email;
    private String pw;

//    public Long getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getPw() {
//        return pw;
//    }

    public MemberResponseDto(Member member) {
        this.id = member.getId();
        this.name = member.getName();
        this.email = member.getEmail();
        this.pw = member.getPw();
    }
}