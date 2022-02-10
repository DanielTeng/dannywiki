package net.kezhu.dannywiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
//    @Value("${test.hello}")
//    private String testHello;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello Post!" + name;
    }
}
