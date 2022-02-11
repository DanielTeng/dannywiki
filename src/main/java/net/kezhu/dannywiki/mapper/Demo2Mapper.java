package net.kezhu.dannywiki.mapper;

import java.util.List;
import net.kezhu.dannywiki.domain.Demo2;
import net.kezhu.dannywiki.domain.Demo2Example;
import org.apache.ibatis.annotations.Param;

public interface Demo2Mapper {
    long countByExample(Demo2Example example);

    int deleteByExample(Demo2Example example);

    int deleteByPrimaryKey(Long id);

    int insert(Demo2 record);

    int insertSelective(Demo2 record);

    List<Demo2> selectByExample(Demo2Example example);

    Demo2 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Demo2 record, @Param("example") Demo2Example example);

    int updateByExample(@Param("record") Demo2 record, @Param("example") Demo2Example example);

    int updateByPrimaryKeySelective(Demo2 record);

    int updateByPrimaryKey(Demo2 record);
}