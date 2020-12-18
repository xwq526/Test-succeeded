package org.example;

import org.example.config.AppConfig;
import org.example.controller.LoginController;
import org.example.dao.LoginDAO;
import org.example.model.User;
import org.example.service.LoginService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        //根据Spring配置文件路径创建容器：应用上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");


        User user1 = (User) context.getBean("user1");
        User user2 = (User) context.getBean("user2");
        System.out.println(user1);
        System.out.println(user2);

        //获取注册的bean对象：根据名称获取，或根据类型
        LoginController loginController = (LoginController) context
                .getBean("loginController");
        LoginController loginController2 = (LoginController) context
                .getBean(LoginController.class);

        //获取Service，DAO的对象
        //通过名称获取
        LoginService loginService = (LoginService) context
                .getBean("loginService");
        LoginDAO loginDAO = (LoginDAO) context.getBean("loginDAO");

        /*//通过类型获取
        LoginService loginService = (LoginService) context
                .getBean(LoginService.class);
        LoginDAO loginDAO = (LoginDAO) context.getBean(LoginDAO.class);*/

        //打印看看
        System.out.println(loginController);
        System.out.println(loginService);
        System.out.println(loginDAO);

        //看使用类型和名称获取的是不是一样   答案是true
        System.out.println(loginController == loginController2);

       /* //配置类的使用练习
        AppConfig appConfig = (AppConfig) context.getBean(AppConfig.class);
        System.out.println(appConfig);*/

        //user3是通过FactoryBean来实现的，其实是注册getObject（）方法的返回值对象到容器中
        User user3 = (User) context.getBean("userFactory");
        System.out.println(user3);
        //关闭容器
        ((ClassPathXmlApplicationContext) context).close();
    }
}