package com.data.dao;

import com.data.pojo.Dateinfo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DateinfoMapper {


    int updateByPrimaryKeySelective(Dateinfo record);

    int updateByPrimaryKey(Dateinfo record);

    List<Dateinfo> getAllDate();
}