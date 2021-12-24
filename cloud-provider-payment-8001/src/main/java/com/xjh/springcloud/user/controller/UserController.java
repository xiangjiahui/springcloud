package com.xjh.springcloud.user.controller;

import com.xjh.springcloud.domains.CommonResult;
import com.xjh.springcloud.domains.User;
import com.xjh.springcloud.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author xjh
 * @date 2021/12/23 16:39
 */
@Controller
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Resource(name = "userService")
    private UserService userService;


    @GetMapping("/getAllUser")
    @ResponseBody
    public CommonResult list() {
        List<User> users = userService.getAllUser();
        if (users != null && users.size() != 0) {
            return new CommonResult(200, "查询所有用户成功", users);
        } else {
            return new CommonResult(400, "查询所有用户失败", null);
        }
    }


    @PostMapping("/create")
    @ResponseBody
    public CommonResult<User> create(@RequestBody User user) {
        int result = userService.create(user);
        log.info("插入结果:" + result);
        if (result > 0) {
            return new CommonResult<>(200, "插入用户数据成功", user);
        } else {
            return new CommonResult<>(400, "插入用户数据失败", null);
        }
    }

    @GetMapping("/getUser/{id}")
    @ResponseBody
    public CommonResult<User> getUserById(@PathVariable(name = "id") Integer id) {
        User user = userService.getUserById(id);
        if (user != null) {
            return new CommonResult<>(200, "查询Id为:" + id + "的用户数据成功", user);
        } else {
            return new CommonResult<>(400, "系统没有Id为:" + id + "的用户", null);
        }
    }

}
