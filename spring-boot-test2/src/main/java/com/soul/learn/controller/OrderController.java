package com.soul.learn.controller;

import org.dromara.soul.client.springmvc.annotation.SoulSpringMvcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.soul.learn.bean.Order;

/**
 * @author yuchen.wu
 * @date 2021-01-17
 */
@RestController
@RequestMapping("order")
@SoulSpringMvcClient(path = "/order/*")
public class OrderController {

    @GetMapping("find_by_id")
    public Object findById(@RequestParam("id") int id) {
        Order order = new Order();
        order.setId(id);
        order.setUserId(id);
        return order;
    }

}
