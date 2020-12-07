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
 * Time: 17:34:51
 */
@WebServlet("/old-template")
public class HomeServlet extends HttpServlet {
    //TODO  需要修复线程安全问题
//    private static int count;  //肯定可以
    private int count;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        count++;
        req.setCharacterEncoding("utf-8");
        String name = req.getParameter("name");
        resp.setContentType("text/html; charset=utf-8");
        PrintWriter writer = resp.getWriter();
        String template="<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>我的主页</title>\n" +
                "    <style>\n" +
                "        h1{\n" +
                "            text-align: center;\n" +
                "            color: yellow;\n" +
                "        }\n" +
                "        body{\n" +
                "            background-image: url(\"image/profile.jpg\");\n" +
                "            color: white;\n" +
                "        }\n" +
                "    </style>\n" +
                "<!--    <link rel=\"stylesheet\" href=\"css/style.css\">-->\n" +
                "<!--    <style>-->\n" +
                "<!--        h1{-->\n" +
                "<!--            color:blue;-->\n" +
                "<!--        }-->\n" +
                "<!--        #hello{-->\n" +
                "<!--            color:red;-->\n" +
                "<!--        }-->\n" +
                "<!--        li.world{-->\n" +
                "<!--            color:yellow;-->\n" +
                "<!--            text-align: center;-->\n" +
                "<!--        }-->\n" +
                "<!--        li.world:hover {-->\n" +
                "<!--            /*color: blue;*/-->\n" +
                "<!--            color:rgba(0,0,0,0.5);-->\n" +
                "<!--        }-->\n" +
                "<!--    </style>-->\n" +
                "</head>\n" +
                "<body>\n" +
                "     <div>访问次数: :count:</div>\n"+
                "    <div>\n" +
                "        <h1>:name:</h1>\n" +
                "        <p>学习使我快乐</p>\n" +
                "    </div>\n" +
                "    <h2>我的爱好</h2>\n" +
                "    <div>\n" +
                "        <ul>\n" +
                "            <li id = \"hello\">写代码</li>\n" +
                "            <li class=\"world\">上课</li>\n" +
                "            <li class=\"world\">看动漫</li>\n" +
                "            <li>打<span>游戏</span></li>\n" +
                "        </ul>\n" +
                "    </div>\n" +
                "    <h2>我的经历</h2>\n" +
                "    <div>\n" +
                "        <ol>\n" +
                "            <li>百度</li>\n" +
                "            <li><a href=\"https://www.qq.com\" target = \"_blank\">腾讯</a></li>\n" +
                "            <li>京东</li>\n" +
                "        </ol>\n" +
                "    </div>\n" +
                "<!--    <img src=\"image/profile.jpg\"  alt = \"喜欢的头像\"width=\"300\" height = \"200\">-->\n" +
                "</body>\n" +
                "</html>";
        String content = template.replace(":name:",name).replace(":count:",String.valueOf(count));
        writer.println(content);
    }
}
