package com.soul.learn.controller;

import org.dromara.soul.client.springmvc.annotation.SoulSpringMvcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.soul.learn.bean.User;

/**
 * @author yuchen.wu
 * @date 2021-01-15
 */
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("find_by_id")
    @SoulSpringMvcClient(path = "/user/find_by_id")
    public Object findById(@RequestParam("id") int id) {
        User user = new User();
        user.setId(id);
        user.setName("name_" + id);
        return user;
    }

}
