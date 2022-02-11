package net.kezhu.dannywiki.service;

import net.kezhu.dannywiki.domain.Ebook;
import net.kezhu.dannywiki.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> list () {
        return ebookMapper.selectByExample(null);
    }
}
