package com.luoyingmm.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

public class JsonUtils {

    public static String getJSON(Object object) throws JsonProcessingException {
        return getJSON(object,"yyyy年MM月 HH:mm:ss");
    }

    public static String getJSON(Object object,String msg) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        SimpleDateFormat dateFormat = new SimpleDateFormat(msg);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        mapper.setDateFormat(dateFormat);
        String s = mapper.writeValueAsString(object);
        return s;
    }
}
