package com.example.sparta.test0629.service;

import com.example.sparta.test0629.dto.MemberRequestDto;
import com.example.sparta.test0629.dto.MemberResponseDto;
import com.example.sparta.test0629.entity.Member;
import com.example.sparta.test0629.repository.MemberRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    public MemberResponseDto findMember(Long id) {
        Member member = memberRepository.findById(id).orElseThrow(
                () -> new NullPointerException("멤버를 찾을 수 없음.")
        );
        return new MemberResponseDto(member);
    }

    public List<MemberResponseDto> findAllMember() {
        List<Member> memberList = memberRepository.findAll();
        return memberList.stream().map(MemberResponseDto::new).toList();
    }

    //test
    @Transactional
    public MemberResponseDto saveMember(MemberRequestDto memberRequestDto) {
        Member member = new Member(memberRequestDto);
        memberRepository.save(member);
        return new MemberResponseDto(member);
    }
}