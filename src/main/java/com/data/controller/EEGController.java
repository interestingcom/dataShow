package com.data.controller;

import com.data.pojo.Eeginfo;
import com.data.service.EEGService;
import com.data.util.ReadTxt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class EEGController {

    @Autowired
    private EEGService eegService;

    @RequestMapping("EEGInfo/{date}/{students}/{eegTypes}")
    @ResponseBody
    public Map<String,Map<String,List>> getEEGData(@PathVariable("date") String date,
                                                   @PathVariable("students") String students,
                                                   @PathVariable("eegTypes") String eegTypes) throws Exception {
        return ReadTxt.readByTypeEEG(date,students,eegTypes);
    }

    @RequestMapping("EEGs")
    @ResponseBody
    public List<Eeginfo> getEEGs(){
        return eegService.getEEGs();
    }
}