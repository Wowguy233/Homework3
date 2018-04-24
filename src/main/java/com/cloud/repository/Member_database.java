package com.cloud.repository;


import com.cloud.model.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface Member_database extends CrudRepository<Member, Integer>
{

}
