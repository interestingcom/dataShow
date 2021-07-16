package com.data.pojo;

public class Statusinfo {
    private Integer statusid;

    private String satusinfo;

    private String statusname;

    public Integer getStatusid() {
        return statusid;
    }

    public void setStatusid(Integer statusid) {
        this.statusid = statusid;
    }

    public String getSatusinfo() {
        return satusinfo;
    }

    public void setSatusinfo(String satusinfo) {
        this.satusinfo = satusinfo == null ? null : satusinfo.trim();
    }

    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname == null ? null : statusname.trim();
    }
}