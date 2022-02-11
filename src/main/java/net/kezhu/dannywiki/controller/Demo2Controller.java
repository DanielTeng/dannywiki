package net.kezhu.dannywiki.controller;

import net.kezhu.dannywiki.domain.Demo2;
import net.kezhu.dannywiki.service.Demo2Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/demo2")
public class Demo2Controller {

    @Resource
    private Demo2Service demo2Service;

    @GetMapping("/list2")
    public List<Demo2> list2(){
        return demo2Service.list();
    }
}
