package com.cn.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Syen
 * @date 2019/7/27 0027-下午 22:00
 */
/*实现一个Controller接口的方式*/
public class HelloController implements Controller {


    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("girl","Amada");

        modelAndView.setViewName("girl");

        return modelAndView;
    }
}
