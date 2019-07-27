package com.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Syen
 * @date 2019/7/27 0027-下午 23:35
 */
/*不需要继承任何的类或者实现任何的接口*/
@Controller
@RequestMapping("/bye")
public class ByeController {

    //ModelAndView Model+View
    @RequestMapping("/bye")
public String bye(Model model){
        model.addAttribute("model","modeller");
    /*这里return的就是我们的那个viewName*/
        /*此时去的是/jsp/bye.jsp页面*/
    return "bye";
}
@RequestMapping("/goodBye")
public String goodBye(Model model){
       model.addAttribute("boy","心机boy");
        return "bye";

}

}
