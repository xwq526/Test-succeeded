package test20201029;

import com.sun.javafx.binding.StringFormatter;

import java.util.Arrays;

public class TestDemo02 {
    public static void main(String[] args) {
       /* //字符与字符串
        String str = "hello";
        //字符串变成字符数组
        char[] chstr = str.toCharArray();
        System.out.println(Arrays.toString(chstr));

        //字符数组变成字符串
        char[] ch = {'h','e','l','l','0'};
        String str1 = new String(ch);
        System.out.println(str);

        //字节与字符串
        String strr = "hello";
        //字符串转字节数组
        byte[] array = strr.getBytes();
        System.out.println(Arrays.toString(array));
        //字节数组转字符串
        System.out.println(new String(array));

        //字符串比较
        String str01 = "hello";
        String str02 = "Hello";
        System.out.println(str01.equals(str02));
        System.out.println(str01.equalsIgnoreCase(str02));

        System.out.println("A".compareTo("a")); // -32
        System.out.println("a".compareTo("A")); // 32
        System.out.println("A".compareTo("A")); // 0
        System.out.println("AB".compareTo("AC")); // -1
        System.out.println("刘".compareTo("杨"));*/

       /* //字符串查找
        String str = "helloworld";
        System.out.println(str.contains("world"));//true
        System.out.println(str.indexOf("w"));
        System.out.println(str.indexOf("t"));//找不到就返回-1
        //使用indexOf()需要注意的是，如果内容重复，它只能返回查找的第一个位置
        System.out.println(str.indexOf("l"));
        System.out.println(str.indexOf("l",5));
        System.out.println(str.lastIndexOf("l",7));

        System.out.println(str.charAt(1));//查看哪个下标的元素

        //判断开头还是结尾
        System.out.println(str.startsWith("hell"));//true
        System.out.println(str.startsWith("ow",4));//true
        System.out.println(str.endsWith("ld"));*/
/*
        //字符串替换
        String str = "helloworld";
        System.out.println(str.replace("l","xxxx"));
        System.out.println(str.replaceAll("l","xxxx"));
        //这两个没有什么区别

        System.out.println(str.replaceFirst("l","xxxxx"));
        //替换首个内容
        //由于字符串是不可变对象, 替换不是修改当前字符串, 而是产生一个新的字符串.*/



//        //字符串的拆分
//        String str = "hello world hello bit" ;
//        String[] result = str.split(" ");
//        for (String s:result) {
//            System.out.println(s);
//        }
//
//        //字符串的部分拆分
//        String[] result1 = str.split(" ",2);
//        for (String s:result1) {
//            System.out.println(s);
//        }

      /*  //有些特殊字符作为分割符可能无法正确切分, 需要加上转义.
        String str1 = "192.168.1.1";
        String[] result2 = str1.split("\\.");
        for (String s:result2) {
            System.out.println(s);
        }
        String str = "java30-s-plit#b-it";
//        String[] ret = str.split(" |-|#");
        String[] ret = str.split("[\\-#]");//notice
        for (String s :ret) {
            System.out.println(s);
        }*/

       /* //字符串的截取
        String str5 = "helloworld";
        System.out.println(str5.substring(4));//从指定索引截取到结尾
        System.out.println(str5.substring(4,7));//顾头不顾尾（即前闭后开）
*/

        //其他一些方法
        String str6 = "  heMMlo world  ";
        System.out.println(str6.trim());
        System.out.println(str6.toUpperCase());
        System.out.println(str6.toLowerCase());
        System.out.println(str6.length());
        System.out.println(str6.isEmpty());

        System.out.println("A".compareTo("a"));










    }
}
