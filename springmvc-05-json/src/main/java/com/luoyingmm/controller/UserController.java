package com.luoyingmm.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.luoyingmm.pojo.User;
import com.luoyingmm.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Controller
@RestController
public class UserController {
    @RequestMapping("/t1")
    public String json1() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        User user = new User(10, "落樱", 17);
        String s = mapper.writeValueAsString(user);
        return s;
    }

    @RequestMapping("/t2")
    public String json2() throws JsonProcessingException {
        List<User> users = new ArrayList<>();
        User user1 = new User(10, "落樱1", 16);
        User user2 = new User(10,"落樱2",16);
        User user3 = new User(10,"落樱3",16);
        User user4 = new User(10,"落樱4",16);
        User user5 =  new User(10,"落樱1",16);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        return new ObjectMapper().writeValueAsString(users);
    }


    @RequestMapping("/t3")
    public String json3() throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(new Date());
    }

    @RequestMapping("/t4")
    public String json4() throws JsonProcessingException {

        return new ObjectMapper().writeValueAsString(new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss").format(new Date()));
    }

    @RequestMapping("/t5")
    public String json5() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        mapper.setDateFormat(simpleDateFormat);

        String s = mapper.writeValueAsString(new Date());

        return s;
    }

    @RequestMapping("/t6")
    public String json6() throws JsonProcessingException {

        return JsonUtils.getJSON(new Date());
    }

    @RequestMapping("/t7")
    public String json7() throws JsonProcessingException {

        return JSON.toJSONString(new User(10,"落樱1",16));
    }
}
