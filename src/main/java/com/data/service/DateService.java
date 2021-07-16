package com.data.service;

import com.data.dao.DateinfoMapper;
import com.data.pojo.Dateinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class DateService {
    @Autowired
    private DateinfoMapper dateMapper;



    public List<Dateinfo> getAllDate(){
        SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd" );
        List<Dateinfo> dateList = dateMapper.getAllDate();
//        List<String> strList=new LinkedList<>();
//        for (Date date :
//                dateList) {
//            String str = sdf.format(date.getDate());
//            strList.add(str);
//        }
        return dateList;
    }
}
