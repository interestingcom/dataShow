package com.data.dao;

import com.data.pojo.Videoinfo;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideoinfoMapper {


    int insert(Videoinfo record);

    int insertSelective(Videoinfo record);


    int updateByPrimaryKeySelective(Videoinfo record);

    int updateByPrimaryKey(Videoinfo record);

    List<Videoinfo> getVideosByDate(Date videoDate);
}