package com.xjh.springcloud.user.controller;

import com.xjh.springcloud.user.domain.User;
import com.xjh.springcloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


/**
 * @author xjh
 * @date 2021/12/23 16:39
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource(name = "userService")
    private UserService service;


    @GetMapping("/getUser")
    @ResponseBody
    public User get(){
        return service.getUser();
    }

}
