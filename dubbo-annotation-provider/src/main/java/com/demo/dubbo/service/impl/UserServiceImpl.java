package com.demo.dubbo.service.impl;


import com.demo.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class UserServiceImpl implements UserService {
    @Override
    public String getUserName() {
        return "zhangsan";
    }
}
