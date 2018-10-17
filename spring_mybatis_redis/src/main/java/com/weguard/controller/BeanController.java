package com.weguard.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BeanController implements Controller {


    @Override
    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        // TODO Auto-generated method stub
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "HelloWorld");
        mv.setViewName("hello");
        return mv;
    }
    @ResponseBody
    @RequestMapping("go")
    public String test(){
        return  "go";
    }
}
