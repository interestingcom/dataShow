package com.data.service;


import com.data.dao.StatusinfoMapper;
import com.data.pojo.Statusinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusService {

    @Autowired
    private StatusinfoMapper statusinfoMapper;

    public List<Statusinfo> getStatus() {
        return statusinfoMapper.getStatus();
    }
}
