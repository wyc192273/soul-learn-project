package com.soul.learn.service;

import java.util.List;

import learn.bean.User;
import learn.service.UserService;

import org.springframework.stereotype.Service;

/**
 * @author yuchen.wu
 * @date 2021-01-18
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getUser(Integer id) {
        return "user_" + id;
    }

    @Override
    public Object saveUser(User user) {
        return user;
    }

    @Override
    public Object saveUserByIdAndName(Integer id, String name) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        return user;
    }

    @Override
    public Object findByIds(List<Integer> ids) {
        User user = new User();
        user.setId(0);
        user.setName(ids.toString());
        return user;
    }

    @Override
    public Object replaceUser(int id, String name, User user) {
        System.out.println(user);
        user.setId(id);
        user.setName(name);
        return user;
    }

}
