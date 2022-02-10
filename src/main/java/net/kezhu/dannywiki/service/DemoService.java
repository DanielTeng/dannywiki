package net.kezhu.dannywiki.service;

import net.kezhu.dannywiki.domain.Demo;
import net.kezhu.dannywiki.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoService {
    @Resource
//    @Autowired
    private DemoMapper demoMapper;

    public List<Demo> list () {
        return demoMapper.list();
    }
}
