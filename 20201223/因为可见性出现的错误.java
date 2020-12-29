package test20201223;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-29
 * Time: 23:11:26
 */
public class 因为可见性出现的错误 {
    private static  boolean status = true;
//    private static  volatile boolean status = true;

    private static class SubThread extends Thread{
        @Override
        public void run() {
            while (status);
        }
    }

    public static void main(String[] args) {
        Thread thread = new SubThread();
        thread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        status = false;
    }
}
