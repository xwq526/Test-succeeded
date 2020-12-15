package com.xwq;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-15
 * Time: 10:07:58
 */
@WebServlet("/set-cookie")
public class SetCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setHeader("set-Cookie","k1=v1");//这个是最本质的方法，但不好用
        Cookie cookie = new Cookie("k2","v2");
        cookie.setDomain("xwq.com");
        cookie.setMaxAge(300);//时间为持久的

        Cookie cookie1 = new Cookie("k3","v3");//默认时间是会话

        resp.addCookie(cookie);
        resp.addCookie(cookie1);
    }

}
