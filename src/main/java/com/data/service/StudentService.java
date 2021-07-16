package com.data.service;


import com.data.dao.StudentInformationDao;
import com.data.pojo.StudentInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentInformationDao studentInformationDao;

    public List<StudentInformation> getAll(){
        return studentInformationDao.selectAll();
    }
}
