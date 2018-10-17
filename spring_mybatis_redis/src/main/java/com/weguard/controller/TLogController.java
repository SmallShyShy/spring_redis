package com.weguard.controller;


import com.weguard.service.TLogService;
import com.weguard.service.impl.TLogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * (TLog)表控制层
 *
 * @author makejava
 * @since 2018-08-15 17:12:45
 */
@Controller
@RequestMapping("/test")
public class TLogController {
    @Autowired
    private TLogService impl;

    @RequestMapping("/t")
    @ResponseBody
    public String test(@RequestParam("xx")int x, int y){
        System.out.println(x+","+y);
        return x+y+"";
    }
}