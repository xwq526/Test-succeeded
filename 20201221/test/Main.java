package test20201221.test;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-21
 * Time: 20:05:05
 */

//利用多线程算fib数列
public class Main {
    private static long fib(int n){
        if (n < 2){
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
    private static class MyThread extends Thread{
        private final int n;
        MyThread(int n){
            this.n = n;
        }

        @Override
        public void run() {
            System.out.println(fib(n));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int n = scanner.nextInt();
            Thread thread = new MyThread(n);
            thread.start();
        }
    }
}
