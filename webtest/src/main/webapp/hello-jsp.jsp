<%--
  Created by IntelliJ IDEA.
  User: 15614
  Date: 2020/12/7
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
    //这段代码是类级别的
     private int count;
%>
<%
    //这段代码是doet方法的
    count++;
    request.setCharacterEncoding("utf-8");
    String name = request.getParameter("name");G
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>我的主页</title>
    <style>
        h1{
            text-align: center;
            color: yellow;
        }
        body{
            background-image: url("image/profile.jpg");
            color: white;
        }
    </style>
    <!--    <link rel="stylesheet" href="css/style.css">-->
    <!--    <style>-->
    <!--        h1{-->
    <!--            color:blue;-->
    <!--        }-->
    <!--        #hello{-->
    <!--            color:red;-->
    <!--        }-->
    <!--        li.world{-->
    <!--            color:yellow;-->
    <!--            text-align: center;-->
    <!--        }-->
    <!--        li.world:hover {-->
    <!--            /*color: blue;*/-->
    <!--            color:rgba(0,0,0,0.5);-->
    <!--        }-->
    <!--    </style>-->
</head>
<body>
<div>
    <div><%= count %></div>
    <h1><%= name %></h1>
    <p>学习使我快乐</p>
</div>
<h2>我的爱好</h2>
<div>
    <ul>
        <li id = "hello">写代码</li>
        <li class="world">上课</li>
        <li class="world">看动漫</li>
        <li>打<span>游戏</span></li>
    </ul>
</div>
<h2>我的经历</h2>
<div>
    <ol>
        <li>百度</li>
        <li><a href="https://www.qq.com" target = "_blank">腾讯</a></li>
        <li>京东</li>
    </ol>
</div>
<!--    <img src="image/profile.jpg"  alt = "喜欢的头像"width="300" height = "200">-->
</body>
</html>