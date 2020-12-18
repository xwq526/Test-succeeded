package org.example.controller;

import org.example.model.User;
import org.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-18
 * Time: 14:33:21
 */
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;


 /*   //伪代码
//    @RequestMapping("/服务路径")
    public String login(String username,String password){
        //请求数据校验
        loginService.login(username,password);
        return "前端页面路径";
    }*/

    @Bean
    public User user1(){
        User user = new User();
        user.setUsername("苟和章");
        user.setPassword("123");
        return user;
    }
    @Bean
    public User user2(){
        User user = new User();
        user.setUsername("哪吒");
        user.setPassword("123");
        return user;
    }
}
