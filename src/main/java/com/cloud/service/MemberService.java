package com.cloud.service;

import com.cloud.model.Member;
import com.cloud.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public Member addMember(Member member) {
        memberRepository.save(member);
        return member;
    }

    public Iterable<Member> getMember() {
        return memberRepository.findAll();

    }
}
