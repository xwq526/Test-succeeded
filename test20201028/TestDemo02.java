package test20201028;

import com.sun.javafx.binding.StringFormatter;

//块注释的快捷键   ctrl + shift + /
public class TestDemo02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("12");

        StringBuffer sb2 = new StringBuffer();
        sb2.append("1234");


        System.out.println(sb);
        System.out.println(sb2);



        //简单说一下 String    StringBuilder    StringBuffer  的区别等

        //String 和 StringBuilder 适用于单线程的情况
        //StringBuffer 适用于多线程的情况



        /*String str = "ab";
        for (int i = 0; i < 10; i++) {
            str += i;
        }
        System.out.println(str);*/
        //这这种方法会消耗大量的内存

       /* String str = "ab";//上面的底层的实现
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < 10; i++) {
            str = sb.append(i).toString();
        }
        System.out.println(str);*/



       /* String str = "abcd";
        String str2 = str + "ef";
        System.out.println(str2);*/

      /*  StringBuilder sb = new StringBuilder();//上面的底层的实现
        sb.append("abcd").append("ef");
        String str2 = sb.toString();
        System.out.println(str2);
*/




    }
}
