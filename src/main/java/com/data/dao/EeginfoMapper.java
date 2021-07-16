package com.data.dao;

import com.data.pojo.Eeginfo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EeginfoMapper {

    List<Eeginfo> getEEGs();
}