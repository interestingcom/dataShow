package com.data.pojo;

public class Eeginfo {
    private Integer eegid;

    private String eegname;

    private String eeginfo;

    public Integer getEegid() {
        return eegid;
    }

    public void setEegid(Integer eegid) {
        this.eegid = eegid;
    }

    public String getEegname() {
        return eegname;
    }

    public void setEegname(String eegname) {
        this.eegname = eegname == null ? null : eegname.trim();
    }

    public String getEeginfo() {
        return eeginfo;
    }

    public void setEeginfo(String eeginfo) {
        this.eeginfo = eeginfo == null ? null : eeginfo.trim();
    }
}