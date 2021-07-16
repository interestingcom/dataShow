package com.data.controller;


import com.data.pojo.Statusinfo;
import com.data.service.StatusService;
import com.data.util.ReadTxt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class StatusController {

    @Autowired
    private StatusService statusService;

    @RequestMapping("status")
    @ResponseBody
    public List<Statusinfo> getStatus(){
        return statusService.getStatus();
    }


    @RequestMapping("StatusInfo/{date}/{students}/{statusTypes}")
    @ResponseBody
    public Map<String, Map<String,List>> getEEGData(@PathVariable("date") String date,
                                                    @PathVariable("students") String students,
                                                    @PathVariable("statusTypes") String eegTypes) throws Exception {
        return ReadTxt.readByTypeStatus(date,students,eegTypes);
    }
}
