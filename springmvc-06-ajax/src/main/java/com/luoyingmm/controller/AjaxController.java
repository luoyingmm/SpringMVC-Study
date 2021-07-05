package com.luoyingmm.controller;

import com.luoyingmm.pojo.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {

    @RequestMapping("/t1")
    public String test(){
        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println(name);
        if (name.equals("kuangsheng")){
            response.getWriter().write("true");
        }else {
            response.getWriter().write("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2(){
        List<User> users = new ArrayList<>();
        users.add(new User("落樱",17,"男"));
        users.add(new User("Esurey",17,"男"));
        users.add(new User("log",17,"男"));

        return users;
    }

    @RequestMapping("/a3")
    public String a3(String name, String pwd, HttpServletResponse response, HttpServletRequest request) throws UnsupportedEncodingException {
        String msg="";
        if (name != null) {
            if ("admin".equals(name)){
                msg = "OK";
            }else {
                msg = "NO";
            }
        }

        if (pwd != null) {
            if ("123456".equals(pwd)){
                msg = "OK";
            }else {
                msg = "No";
            }
        }
        return msg;
    }
}
