package com.class17.web.controller;

import com.class17.domain.User;
import com.class17.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
//返回值转为json格式
@ResponseBody
public class UserController {
    @Autowired
    public IUserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll()
    {
        return userService.findAll();
    }

    @RequestMapping("/findById")
    public User findById(int id)
    {
        return userService.findById(id);
    }

    @RequestMapping("/updateUser")
    public void updateUser(@RequestBody User user)
    {
        System.out.println(user);
        userService.updateUser(user);
    }
}
