package com.xwq.servlet;

import com.xwq.util.DBUtility;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.util.Locale.CHINA;

@WebServlet("/post-message.api")
public class PostMessageServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        String who = req.getParameter("who");
        String what = req.getParameter("what");
        // TODO: 没有做任何错误处理：没有填写信息就提交，就会 500

        insertIntoMessage(who, what);

        // 执行跳转
        resp.sendRedirect("message-list.html");
    }

    private void insertIntoMessage(String who, String what) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", CHINA);
        Date now = new Date();
        String nowStr = dateFormat.format(now);
        System.out.println(nowStr);

        try (Connection connection = DBUtility.getConnection()) {
            String sql = "INSERT INTO message (who, `when`, what) VALUES (?, ?, ?)";
            try (PreparedStatement s = connection.prepareStatement(sql)) {
                s.setString(1, who);
                s.setString(2, nowStr);
                s.setString(3, what);

                s.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
