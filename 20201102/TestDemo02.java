package test20201102;


import java.util.ArrayList;

import java.util.List;

public class TestDemo02 {
    /*public static List<Character> question2(String str1,String str2) {
        List<Character> list = new ArrayList<>();

        for (char c:str1.toCharArray()) {
            if (str2.contains(c + "" )) {
                continue;
            }
            list.add(c);
        }
        return list;
    }*/
    public static List<String> func(String str1 , String str2) {
        //写题目是要注意判断传进来的是否为空         ------notice notice notice
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            char tmp = str1.charAt(i);
            if (!str2.contains(tmp+"")) {
                list.add(tmp+"");
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String str = "welcome to bit";
        String str2 = "come";
        //输出为wel t bit;
        List<String> ret = func(str,str2);
        System.out.println(ret);
        for (String s:ret) {
            System.out.print(s);
        }



















        /*String str = "java30-s-plit#b-it";
        String[] ret = str.split(" |-|#");
//        String[] ret = str.split("[\\-#]");//notice
        for (String s :ret) {
            System.out.println(s);
        }*/
    }
}
