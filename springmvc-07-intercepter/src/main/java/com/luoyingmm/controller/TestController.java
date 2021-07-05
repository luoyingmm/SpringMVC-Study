package com.luoyingmm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Controller
public class TestController {

    @RequestMapping("t2")
    public String test2(){

        return "first";
    }

    @RequestMapping("t3")
    public String test3(){

        return "login";
    }


    @RequestMapping("t1")
    public String test(HttpSession session,String username,String password){
        session.setAttribute("username",username);

        return "first";
    }
}
