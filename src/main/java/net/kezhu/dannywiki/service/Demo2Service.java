package net.kezhu.dannywiki.service;

import net.kezhu.dannywiki.domain.Demo2;
import net.kezhu.dannywiki.mapper.Demo2Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Demo2Service {
    @Resource
//    @Autowired
    private Demo2Mapper demo2Mapper;

    public List<Demo2> list () {
        return demo2Mapper.selectByExample(null);
    }
}
