package test20201223;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-29
 * Time: 23:15:14
 */
public class 观察奇怪现象之线程安全问题 {
    private static final int COUNT = 100000;

    private static int n = 0;

    private static class Adder extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < COUNT; i++) {
                n++;
            }
        }
    }

    private static class Suber extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < COUNT; i++) {
                n--;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread adder = new Adder();
        Thread suber = new Suber();

        adder.start();
        suber.start();

        adder.join();
        suber.join();

        System.out.println(n);
    }

}
