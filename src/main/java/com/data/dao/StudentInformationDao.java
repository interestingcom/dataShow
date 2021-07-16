package com.data.dao;

import com.data.pojo.StudentInformation;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentInformationDao {

    List<StudentInformation> selectAll();

}