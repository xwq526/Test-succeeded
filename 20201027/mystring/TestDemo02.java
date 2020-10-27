package test20201027.mystring;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class TestDemo02 {
    public static void main(String[] args) {

        String str1 = "name=zhangsan&age=18";
        String[] ret1 = str1.split("&");
        for (String s1:ret1) {
            String[] ret2 = s1.split("=");
            for (String s2:ret2) {
                System.out.println(s2);
            }

        }
        System.out.println("=======================");
//        for (String s1 : ret1) {
//            String[] ret2 = s1.split("=");
//            System.out.println(s1);
//            System.out.println("===========");
//            for (String s2 :ret2) {
//                System.out.println(s2);
//            }
//        }



//        String str = "hello world hello bit" ;
//        String[] result = str.split(" ") ; // 按照空格拆分
//        for(String s: result) {
//            System.out.println(s);
//        }


//        String str = "hello\\bit\\java";
//        String[] ret = str.split("\\\\");
//        for (String s :ret) {
//            System.out.println(s);
//        }



        String str = "java30-s-plit#b-it";
//        String[] ret = str.split(" |-|#");
        String[] ret = str.split("[\\-#]");
        for (String s :ret) {
            System.out.println(s);
        }
    }



    public static void main4(String[] args) {
        String str = "hellobitbitabcd";
       //System.out.println(str.replace("it","xx"));//字符串替换

//        System.out.println(str.lastIndexOf("bit",7));//从后往前找
//        System.out.println(str.contains("bit"));
        System.out.println(str.indexOf("bit",6));
        System.out.println(str.startsWith("bi"));//判断是不是以当前字符串开头
        System.out.println(str.startsWith("bi",8));//从当前位置开始判断是不是以当前字符串开头
        System.out.println(str.endsWith("cd"));//判断是不是以指定字符串结尾
    }

    public static void main3(String[] args) {
//        String str = "abCde";
//        String str2 = "abcde";
//        System.out.println(str.equals(str2));
//        System.out.println(str.equalsIgnoreCase(str2));//忽略大小写进行比较
        String str = "abCdef";
        String str2 = "abcde";
        //str 和 str2 比较    notice：这里要了解compareTo的源码！！！
        int ret = str.compareTo(str2);
        System.out.println(ret);
    }



//    给定字符串一个字符串, 判断其是否全部由数字所组成.
    public static boolean isNumberChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    public static void main2(String[] args) throws UnsupportedEncodingException {
//        String str = "12a456";
//        System.out.println(isNumberChar(str));
        /*byte[] bytes = {97,98,99,100};
        String str = new String(bytes);
        String str1 = new String(bytes,0,3);
        System.out.println(str);
        System.out.println(str1);*/


        String str2 = "小青";
        //byte[] bytes1 = str2.getBytes("UTF8");//[-27, -80, -113, -23, -99, -110]
        byte[] bytes1 = str2.getBytes("GBK");//[-48, -95, -57, -32]
        //其中的getByutes方法可能出现异常，所以在上面必须抛出异常。不然编译就出错了。
        System.out.println(Arrays.toString(bytes1));

    }




    public static void main1(String[] args) {
        //字符串内部包含一个字符数组，String 可以和 char[] 相互转换.
        char[] array = {'a','b','c','d'};
        String str = new String(array);
        String str1 = new String(array,0,4);
        System.out.println(str);
        System.out.println(str1);

        String str2 = "abcdef";
        char ch = str2.charAt(2);
        System.out.println(ch);
        System.out.println(str2.length());

        char [] array1 = str2.toCharArray();
        System.out.println(Arrays.toString(array1));
    }
}
