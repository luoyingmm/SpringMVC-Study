package com.loyingmm.controller;

import com.loyingmm.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/t1")
    public String userSend(@RequestParam("username") String username, Model model){
        System.out.println("username: " + username);
        return "test";
    }
    @GetMapping("/t2")
    public String userSend2(User user){
        System.out.println(user.toString());
        return "test";
    }
}
