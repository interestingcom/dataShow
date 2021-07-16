package com.data.dao;

import com.data.pojo.Statusinfo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatusinfoMapper {
    List<Statusinfo> getStatus();
}