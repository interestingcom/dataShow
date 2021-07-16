package com.data.pojo;

import java.util.Date;

public class Videoinfo {
    private Integer videoid;

    private String videoname;

    private Date videostarttime;

    private Date videodate;

    private Date videoendtime;

    public Integer getVideoid() {
        return videoid;
    }

    public void setVideoid(Integer videoid) {
        this.videoid = videoid;
    }

    public String getVideoname() {
        return videoname;
    }

    public void setVideoname(String videoname) {
        this.videoname = videoname == null ? null : videoname.trim();
    }

    public Date getVideostarttime() {
        return videostarttime;
    }

    public void setVideostarttime(Date videostarttime) {
        this.videostarttime = videostarttime;
    }

    public Date getVideodate() {
        return videodate;
    }

    public void setVideodate(Date videodate) {
        this.videodate = videodate;
    }

    public Date getVideoendtime() {
        return videoendtime;
    }

    public void setVideoendtime(Date videoendtime) {
        this.videoendtime = videoendtime;
    }
}