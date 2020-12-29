package test20201223;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-29
 * Time: 16:21:13
 */
public class 观察线程的名称 {
    private static class MyThread extends Thread{
        MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(100_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new MyThread("张三");
        Thread t2 = new MyThread("李四");
        Thread t3 = new MyThread("王五");

        t1.start();
        t2.start();
        t3.start();
    }
}
