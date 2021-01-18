package com.soul.learn.service;

import java.util.List;

import org.apache.dubbo.config.annotation.DubboService;
import org.dromara.soul.client.dubbo.common.annotation.SoulDubboClient;

import com.soul.learn.bean.User;

/**
 * @author yuchen.wu
 * @date 2021-01-18
 */
@DubboService(group = "user", version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    @SoulDubboClient(path = "/getUser")
    public String getUser(Integer id) {
        return "user_" + id;
    }

    @Override
    @SoulDubboClient(path = "/saveUser")
    public Object saveUser(User user) {
        return user;
    }

    @Override
    @SoulDubboClient(path = "/saveUserByIdAndName")
    public Object saveUserByIdAndName(Integer id, String name) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        return user;
    }

    @Override
    @SoulDubboClient(path = "/findByIds")
    public Object findByIds(List<Integer> ids) {
        User user = new User();
        user.setId(0);
        user.setName(ids.toString());
        return user;
    }

    @Override
    @SoulDubboClient(path = "/replaceUser")
    public Object replaceUser(int id, String name, User user) {
        System.out.println(user);
        user.setId(id);
        user.setName(name);
        return user;
    }

}
