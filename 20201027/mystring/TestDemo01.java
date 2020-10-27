package test20201027.mystring;

import java.lang.reflect.Field;

public class TestDemo01 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //通过反射修改为private的成员变量
        //notice
        //notice
        //notice
        //notice
        //notice
        //notice  这个比较重要
        String str = "hello";
        Class<String> cl = String.class;
         //获取 String 类中的 value 字段. 这个 value 和 String 源码中的 value 是匹配的
        Field field = cl.getDeclaredField("value");
        //将这个字段的访问属性设为 true
        field.setAccessible(true);
        //把 str 中的 value 属性获取到
        char[] value = (char[]) field.get(str);//这里发生了向下转型
        //修改 value 的值
        value[0] = 'H';
        System.out.println(str);
    }

    public static void main4(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello").intern();
        //intern 方法来手动把 String 对象加入到字符串常量池中
        System.out.println(str1 == str2);//true
    }

    public static void main3(String[] args) {
        String str1 = "hello";
        String str2 = str1;
        System.out.println(str1);//hello
        System.out.println(str2);//hello
        System.out.println("===============");
        str1 = "小青";
        System.out.println(str1);//小青
        System.out.println(str2);//hello
    }

    public static void main2(String[] args) {
        String str1 = "hello";

        String str2 = new String("hello");
        System.out.println(str1 == str2);//==在这里比较的是引用是地址  false
        System.out.println(str1.equals(str2));//equals在这里比较的是值  true

        String str3 = "he" + "llo" ;//常量   在编译的时候已经变成了hello
        System.out.println(str1 == str3);   //true

        String str4 = "he";
        String str5 = str4 + "llo";//str4是变量，运行时才知道是什么
        System.out.println(str1 == str5); // flase

        String str6 = new String("he") + "llo";
        System.out.println(str1 == str2); //flase

    }

    public static void main1(String[] args) {
        String str1 = "hello";

        String str2 = new String("hello");

        char[] array = {'h','e','l','l','o'};
        String str3 = new String(array);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
