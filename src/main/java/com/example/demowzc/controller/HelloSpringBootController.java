package com.example.demowzc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloSpringBootController {
    @RequestMapping("/hello")
    public String helloSpringBoot(){
        return "你好SringpBoot";
    }
}
