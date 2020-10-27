package test20201027.exception;

import java.util.Scanner;

public class TestDemo01 {

    public static void main(String[] args) {
        System.out.println(func2());
    }
    public static int func2() {
        try {
            return 10;
        } finally {
            return 20;
        }
    }

    public static void func() throws ArithmeticException,NullPointerException{

        int[] array1 = {1, 2, 3};
        System.out.println(array1[100]);
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(10 / a);
    }

    public static void main5(String[] args) {
        try {
            func();
        } catch (ArithmeticException | NullPointerException e) {
            e.printStackTrace();
            System.out.println("有问题哦");
        }
        System.out.println("hello");
    }

    public static void main4(String[] args) {
        try {
            System.out.println(divide(10, 0));
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("有异常出现了哦");
        }
        System.out.println("over");

    }
    //throws 声明一个异常
    public static int divide(int x , int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("抛出算数异常");
        }
        return x / y;
    }

    public static void main3(String[] args) {
        try {
            System.out.println(10/0);
            int[] array = null;
            System.out.println(array.length);
        } catch ( NullPointerException e) {
            e.printStackTrace();
            System.out.println("空指针异常");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("算数异常");
        }
        finally {
            System.out.println("这里是finally");
        }
    }

    public static void main2(String[] args) {
        try {
            System.out.println(10/4);
            int[] array = null;
            System.out.println(array.length);
        } catch (ArithmeticException | NullPointerException e) {
            e.printStackTrace();
            System.out.println("有点东西");
        } finally {
            System.out.println("这里是finally");
        }
    }

    public static void main1(String[] args) {
        try {
            System.out.println(10/10);
            System.out.println("first hello");
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }
}
