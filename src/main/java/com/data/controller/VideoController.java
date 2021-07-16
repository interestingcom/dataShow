package com.data.controller;

import com.data.pojo.Videoinfo;
import com.data.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class VideoController {

    @Autowired
    private VideoService videoService;

    @RequestMapping("video")
    public String getVideo(){
        return "static/video/test1.mp4";
    }

    @RequestMapping("videos/{videoStamp}")
    public List<Videoinfo> getVideosByDate(@PathVariable("videoStamp") Long  videoStamp){

        Date date = new Date(videoStamp);
        return videoService.getVideosByDate(date);
    }

    @RequestMapping("videos/{videoDate}/{videoName}")
    public String getVideosByDate(@PathVariable("videoDate")String videoDate,
                                  @PathVariable("videoName")String videoName){

        String baseRoot="http://localhost:8099/data/"+videoDate+"/"+videoName+".mp4";
        return baseRoot;
    }
}
