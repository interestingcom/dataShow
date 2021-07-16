package com.data.controller;

import com.data.pojo.Dateinfo;
import com.data.service.DateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DateController {

    @Autowired
    private DateService dateService;

    @RequestMapping("date")
    @ResponseBody
    public List<Dateinfo> getAll(){
        return dateService.getAllDate();
    }

}
