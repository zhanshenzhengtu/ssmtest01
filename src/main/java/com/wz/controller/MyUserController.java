package com.wz.controller;

import com.wz.pojo.MyUser;
import com.wz.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyUserController {
    @Autowired
    private MyUserService myUserService;
    @RequestMapping("/selectbyname")
    public String selectbyname(MyUser myUser, Model model){
        List<MyUser> list = myUserService.selectUserByName(myUser);
        model.addAttribute("users", list);
        return "userList";
    }
}
