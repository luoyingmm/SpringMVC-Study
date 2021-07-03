package com.loyingmm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestFulController {
    @RequestMapping("/r1")
    public String rest(Model model){
        return "forward:index.jsp";
    }


}
