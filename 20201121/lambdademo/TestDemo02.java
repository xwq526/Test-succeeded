package test20201121.lambdademo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

class Test {
    public void func(){}
}
@FunctionalInterface   //要注意函数式接口  一个接口有且只有一个抽象方法
interface NoParameterNoReturn2{
    void test();
    default void tset2(){
        System.out.println("JDK1.8新特性，default默认方法可以有具体的实现");
    };
}

public class TestDemo02 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "hello");
        map.put(2, "bit");
        map.put(3, "hello");
        map.put(4, "lambda");
     /*   map.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                System.out.println("key:" + integer + " vlaue:" + s);
            }
        });*/
       /* map.forEach((key,value) ->{
            System.out.println("key:" + key + " vlaue:" + value);
        });*/
        map.forEach((key,value) ->System.out.println
                ("key:" + key + " vlaue:" + value));

    }
    public static void main4(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("cello");
        list.add("bit");
        list.add("dello");
        list.add("aambda");
        /*list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });*/
        list.sort(((o1, o2) -> o1.compareTo(o2)));
        list.forEach(s -> System.out.println(s));
    }
    public static void main3(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("bit");
        list.add("hello");
        list.add("lambda");
        list.forEach((s -> System.out.println(s)));
     /*   list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
    }
    public static void main2(String[] args) {
        final int b = 909090;
        int a = 99;
//        a = 89;
        NoParameterNoReturn2 np = () -> {
//            从lambda 表达式引用的本地变量必须是最终变量或实际上的最终变量
            System.out.println(a);
            System.out.println(b);
        };
        np.test();
    }
    /**
     * 匿名内部类当中，捕获的变量一定是常量或者没有发生过改变的量
     * @param args
     */
    public static void main1(String[] args) {
        final int b = 900000;
        int a= 99;
//        a = 100;
        new Test(){
            @Override
            public void func() {
                System.out.println(a);
                System.out.println(b);
            }
        }.func();
    }

}
