package com.xwq.servlet;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.xwq.model.Message;
import com.xwq.util.DBUtility;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-09
 * Time: 09:35:53
 */
@WebServlet("/message-list.json")
public class MessageListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Message> messageList = getMessageList();

        String jsonMessage = buildJSON(messageList);

        resp.setContentType("application/json");
        resp.setCharacterEncoding("utf-8");
        PrintWriter writer = resp.getWriter();
        writer.println(jsonMessage);
    }
    private String buildJSON(List<Message> messageList){
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(messageList);
        } catch (JsonProcessingException e) {
            e.printStackTrace();//不要随便吞异常
            return "";
        }
    }

    private List<Message> getMessageList() {
        List<Message> messageList = new ArrayList<Message>();
        try (Connection connection = DBUtility.getConnection()){
            String sql = "select id,who,`when`,what from message order by id";
            try (PreparedStatement s = connection.prepareStatement(sql)){
                try(ResultSet rs = s.executeQuery()) {
                    while (rs.next()){
                        Message message = new Message();
                        message.id = rs.getInt("id");
                        message.who = rs.getString("who");
                        message.when = rs.getString("when");
                        message.what = rs.getString("what");

                        messageList.add(message);
                    }
                    return messageList;
                }

            }
        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }



    /*private List<Message> getMessageList(){
        List<Message> messageList = new ArrayList<Message>();
        Message m1 = new Message();
        m1.id = 1;
        m1.who = "达摩老组";
        m1.what ="我在吃饭";
        m1.when="2020-12-09";
        messageList.add(m1);
        Message m2 = new Message();
        m2.id = 2;
        m2.who = "达摩老组2";
        m2.what ="我在吃饭2";
        m2.when="2020-12-09";
        messageList.add(m2);
        return messageList;
    }*/
}
