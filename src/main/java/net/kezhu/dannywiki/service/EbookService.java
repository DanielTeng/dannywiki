package net.kezhu.dannywiki.service;

import net.kezhu.dannywiki.domain.Ebook;
import net.kezhu.dannywiki.domain.EbookExample;
import net.kezhu.dannywiki.mapper.EbookMapper;
import net.kezhu.dannywiki.req.EbookReq;
import net.kezhu.dannywiki.resp.EbookResp;
import net.kezhu.dannywiki.util.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list (EbookReq req) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
//        List<EbookResp> respList = new ArrayList<>();
//        for (Ebook ebook : ebookList) {
//            EbookResp ebookResp = new EbookResp();
////            ebookResp.setId(ebook.getId());
//            BeanUtils.copyProperties(ebook, ebookResp);
//            respList.add(ebookResp);
//        }
        List<EbookResp> respList = CopyUtil.copyList(ebookList, EbookResp.class);
        return respList;
    }
}
