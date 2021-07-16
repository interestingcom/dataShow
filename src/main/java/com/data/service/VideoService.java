package com.data.service;

import com.data.dao.VideoinfoMapper;
import com.data.pojo.Videoinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class VideoService {

    @Autowired
    private VideoinfoMapper videoinfoMapper;

    public List<Videoinfo> getVideosByDate(Date videoDate) {
        return videoinfoMapper.getVideosByDate(videoDate);
    }
}
