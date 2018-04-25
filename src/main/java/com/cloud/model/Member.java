package com.cloud.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="member", schema = "public")
public class Member {
    @Id
    String member_email;
    String member_firstName;
    String member_ID;
    public String getEmail() {
            return member_email;
    }
    public void setEmail(String member_email) {
        this.member_email = member_email;
    }
    public String getMember_firstName() {
        return member_email;
    }
    public void setMember_firstName(String member_firstName) {
        this.member_firstName = member_firstName;
    }
    public String getMember_ID() {
        return member_ID;
    }
    public void setMember_ID(String member_ID) {
        this.member_ID = member_ID;
    }
}

