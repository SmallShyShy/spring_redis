package com.weguard.controller;

import com.weguard.entity.User;
import com.weguard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;
    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(int id){
        return service.getUserById(id);
    }

    @RequestMapping("/addUser")
    @ResponseBody
    public boolean addUser(){
       return  service.addUser();
    }
    @RequestMapping("/updateUser")
    @ResponseBody
    public boolean updateUser(int id){
        User u=new User();
        u.setUserId(id);
        u.setDepartmentId(1);
        u.setUserName("test");
        return service.updateUser(u);
    }
}
