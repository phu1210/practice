package com.example.practice.testservice;

import com.example.practice.persistance.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TestServiceMapper {

    UserVO getId(UserVO user);

    UserVO insertId(UserVO user);
}
