package org.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


//定义当前类为Servlet（服务端java代码提供的http服务）
//服务路径必须以/开头，否则tomcat启动就会报错
@WebServlet("/login301")
public class Login301Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");//响应头Content-type,告诉对端响应体的解析方式

        //getParameter可以获取url中的queryString请求数据，及请求表单数据类型格式的请求数据
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.printf("username=%s,password=%s%n",username,password);
        //这是io流
        PrintWriter pw = resp.getWriter();

        if ("abc".equals(username) && "123".equals(password)) {
            //servlet中，跳转某个页面，使用1.重定向，2.转发
            resp.sendRedirect("home.html");//重定向

        } else {
            //转发
            req.getRequestDispatcher("login_error.html").forward(req, resp);

        }

//        pw.println("登录成功");
        pw.flush();
        pw.close();

    }
}
