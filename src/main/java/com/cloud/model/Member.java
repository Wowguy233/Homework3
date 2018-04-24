package com.cloud.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="member", schema = "public")
public class Member {
    @Id
    String member_email;
    //remeber to add the first name and student id
    public String getEmail() {
            return member_email;
    }
    public void setEmail(String member_email) {
        this.member_email = member_email;
    }
}

