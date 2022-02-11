package net.kezhu.dannywiki.controller;

import net.kezhu.dannywiki.domain.Demo;
import net.kezhu.dannywiki.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
//    @Value("${test.hello}")
//    private String testHello;
    @Resource
    private DemoService demoService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello Post!" + name;
    }

    @GetMapping("/demo/list")
    public List<Demo> list(){
        return demoService.list();
    }

}
