package com.pcrain.receivejson.controller;

import com.pcrain.receivejson.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("receive")
public class JsonController {
    @RequestMapping(value = "json",method = RequestMethod.POST)//接受JSON数据需要使用post方法,使用get无法接受数据
    public String json(@RequestBody User user){
        System.out.println(user);
        return "test";
    }
}
