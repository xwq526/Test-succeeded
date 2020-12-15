package com.xwq;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-15
 * Time: 17:10:29
 */
@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if(session == null){
            System.out.println("应该让重新登录");
            return;
        }
        String 姓名 = (String)session.getAttribute("姓名");
        int 年龄 = (Integer)session.getAttribute("年龄");
        System.out.println(姓名);
        System.out.println(年龄);
    }
}
