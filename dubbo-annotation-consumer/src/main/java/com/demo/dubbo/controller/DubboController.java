package com.demo.dubbo.controller;

import com.demo.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DubboController {

    @DubboReference
    UserService userService;

    @ResponseBody
    @RequestMapping("/getName")
    public String doAction() {
        return userService.getUserName();
    }
}
