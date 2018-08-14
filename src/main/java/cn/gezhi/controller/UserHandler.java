package cn.gezhi.controller;

import cn.gezhi.po.User;
import cn.gezhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserHandler {
    @Autowired
    private UserService userService;
    @RequestMapping("/show")
    public String show(){
        User user = userService.getUserById(2);
        System.out.println(user);
        return "show";
    }
}
