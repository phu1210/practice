package com.example.practice.testservice;

import com.example.practice.persistance.UserVO;
import com.example.practice.testdao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    TestServiceMapper testServiceMapper;

    public UserVO hello(String id, String pw) {

        UserVO userVO = new UserVO();
        userVO.setUserId(id);
        userVO.setUserPw(pw);

        UserVO resultUserVO = testServiceMapper.getId(userVO);

        return resultUserVO;
    }

    public void world(String id, String pw) {

        UserVO userVO = new UserVO();
        userVO.setUserId(id);
        userVO.setUserPw(pw);

        testServiceMapper.insertId(userVO);
    }

    public String helloWorld(){

        return "서비스의 헬로월드얌";
    }

}