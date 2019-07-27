package com.cn.controller;

import com.cn.pojo.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Syen
 * @date 2019/7/28 0028-上午 0:01
 */
@Controller
@RequestMapping("/orders")

public class OrdersController {

    @RequestMapping("/addOrder")

    /*返回值类型为String，String就是逻辑的视图名称*/
public String  addOrder(Model model){

        List<Order> list=new ArrayList<>();
        Order o=new Order();
        o.setId("1");
        o.setName("卫龙辣条");
        o.setTotel(30.2);

        List<Order> list1=new ArrayList<>();
        Order o1=new Order();
        o1.setId("2");
        o1.setName("瞎扯淡");
        o1.setTotel(35.2);
        list.add(o);
        list.add(o1);

        model.addAttribute("orders",list);
        //不需要想HelloController那样setName(),return modelAndView
    return "orders";
}
}
