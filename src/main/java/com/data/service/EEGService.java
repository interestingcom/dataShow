package com.data.service;

import com.data.dao.EeginfoMapper;
import com.data.pojo.Eeginfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EEGService {

    @Autowired
    private  EeginfoMapper eeginfoMapper;

    public  List<Eeginfo> getEEGs() {
        return eeginfoMapper.getEEGs();
    }
}
