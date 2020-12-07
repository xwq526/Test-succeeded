package org.example.profile;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-07
 * Time: 15:59:23
 */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String actor = req.getParameter("actor");
        if (actor == null) {
            actor = "jia";
        }
//        PrintWriter writer = resp.getWriter();如果在这里那么utf8就不生效了。
//        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/plain; charset = utf-8");
        PrintWriter writer = resp.getWriter();

        writer.println("actor = " + actor);
    }
}
