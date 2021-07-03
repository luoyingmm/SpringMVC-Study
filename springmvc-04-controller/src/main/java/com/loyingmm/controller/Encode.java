package com.loyingmm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Encode {
    @PostMapping("/code/t1")
    public String postMap(String user,Model model){
        System.out.println(user);
        model.addAttribute("msg",user);
        return "test";
    }
}
