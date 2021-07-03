package com.loyingmm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControllerTest3 {
//    @RequestMapping(name="/t3/{a}/{b}",method = RequestMethod.DELETE)
    @GetMapping("t3/{a}/{b}")
    public String test3(@PathVariable int a,@PathVariable String b, Model model){
        String c = a + b;
        model.addAttribute("msg",c + "   1");
        return "test";
    }

    @PostMapping("t3/{a}/{b}")
    public String test4(@PathVariable int a,@PathVariable String b, Model model){
        String c = a + b;
        model.addAttribute("msg",c + "    2");
        return "test";
    }
}
