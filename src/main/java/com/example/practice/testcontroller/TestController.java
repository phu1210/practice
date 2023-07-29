package com.example.practice.testcontroller;

import com.example.practice.persistance.UserVO;
import com.example.practice.testdao.TestDao;
import com.example.practice.testservice.TestService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/hello")
    public UserVO hello(HttpServletRequest req){

        String id = req.getParameter("id");
        String pw = req.getParameter("pw");

        return testService.hello(id, pw);
    }

    @RequestMapping("/world")
    public void world(HttpServletRequest req){

        String id = req.getParameter("id");
        String pw = req.getParameter("pw");

        testService.world(id, pw);
    }

    @RequestMapping("/helloWorld")
    public String helloWorld(){

        return "helloWorld";
    }

}
