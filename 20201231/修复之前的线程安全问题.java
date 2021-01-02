package test20201231;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2021-01-02
 * Time: 13:47:52
 */
public class 修复之前的线程安全问题 {
    private static final int COUNT = 100_0000;
    private static int n = 0;
    private static Object lock = new Object();

    static class Adder extends Thread{
        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < COUNT; i++) {
                    n++;
                }
            }
        }
    }

    static class Suber extends Thread{
        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < COUNT; i++) {
                    n--;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Adder();
        Thread t2 = new Suber();
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(n);
    }
}
