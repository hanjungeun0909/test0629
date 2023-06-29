package com.example.sparta.test0629.controller;

import com.example.sparta.test0629.dto.MemberRequestDto;
import com.example.sparta.test0629.dto.MemberResponseDto;
import com.example.sparta.test0629.service.MemberService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    /**
     * 한 회원의 userId가 주었을때 회원 정보를 조회하는 API
     * @param id
     */
    @GetMapping("/member/{id}")
    public MemberResponseDto getMemberInfo(@PathVariable Long id) {
        return memberService.findMember(id);
    }

    /**
     * 회원의 전체 목록을 조회하는 API
     */
    @GetMapping("/member")
    public List<MemberResponseDto> getMemberList() {
		return memberService.findAllMember();
    }

//    http://localhost:8080/member
//{
//    "id": 1234,
//        "name": "1235",
//        "email": "1236",
//        "pw": "1237"
//}
    //     test
    @Transactional
    @PostMapping("/member")
    public MemberResponseDto saveMember(@RequestBody MemberRequestDto memberRequestDto){
        return memberService.saveMember(memberRequestDto);
    }
}