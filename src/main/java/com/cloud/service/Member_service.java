package com.cloud.service;

import com.cloud.model.Member;
import com.cloud.repository.Member_database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
public class Member_service {
    @Autowired
    Member_database memberDatabse;

    public Member addMember(Member member) {
        memberDatabse.save(member);
        return member;
    }

    public Iterable<Member> getMember(){
        return memberDatabse.findAll();
    }

}
