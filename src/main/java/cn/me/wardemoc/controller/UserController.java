package cn.me.wardemoc.controller;

import cn.me.wardemoc.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2021/7/15 10:44
 * @Created by yuhousheng
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/showName")
    public String showName() {
        return userService.findName();
    }
}
