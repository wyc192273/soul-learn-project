package com.soul.learn.controller;

import org.dromara.soul.client.springmvc.annotation.SoulSpringMvcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.soul.learn.bean.User;

/**
 * @author yuchen.wu
 * @date 2021-01-17
 */
@RestController
@RequestMapping("/user")
@SoulSpringMvcClient(path = "/user")
public class UserSubController {

    @GetMapping("save_user")
    @SoulSpringMvcClient(path = "/save_user")
    public Object findById(@RequestParam("id") int id, @RequestParam("name") String name) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        return user;
    }

}
