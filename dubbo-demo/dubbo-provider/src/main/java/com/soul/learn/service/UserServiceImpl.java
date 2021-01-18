package com.soul.learn.service;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author yuchen.wu
 * @date 2021-01-18
 */
@DubboService(group = "user", version = "1.0.0")
public class UserServiceImpl implements UserService {

    public String getUser(int id) {
        return "user_" + id;
    }
}
