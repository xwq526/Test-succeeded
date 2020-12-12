package com.xwq.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-12
 * Time: 21:36:06
 */
@MultipartConfig
@WebServlet("/post-file.api")
public class PostFileServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
       /* Part usernamePart = req.getPart("username");
        InputStream usernameIS = usernamePart.getInputStream();
        Scanner s = new Scanner(usernameIS,"utf-8");
        String next = s.next();
        System.out.println(next);*/
        
       /* Reader usernameReader = new InputStreamReader(usernameIS,"utf-8");
        char[] buf = new char[(int)usernamePart.getSize()];
        int n = usernameReader.read(buf);
        String s = new String(buf,0,n);
        System.out.println(s);*/
//        Part passwordPart = req.getPart("password");
        Part imagePart = req.getPart("image");
        InputStream inputStream = imagePart.getInputStream();
//        OutputStream outputStream = new FileOutputStream("F:\\javaWeb\\新建文件夹\\output.txt");
        OutputStream outputStream = new FileOutputStream("C:\\Users\\15614\\IdeaProjects\\li9\\target\\li9-1.0-SNAPSHOT\\dest.png");
        byte[] buffer = new byte[1024];
        while (true){
            int n = inputStream.read(buffer);
            if(n == -1){
                break;
            }
            //buffer[0,n)
            outputStream.write(buffer,0,n);
        }
        outputStream.close();




    }
}
