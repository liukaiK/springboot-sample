package com.springboot.sample.web;

import cn.hutool.core.util.RandomUtil;
import com.springboot.sample.entity.User;
import com.springboot.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/hello")
    public String hello() {
        User user = new User();
        user.setUsername(RandomUtil.randomString(3));
        userService.save(user);
        return "hello";
    }

}
