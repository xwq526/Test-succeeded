package test20201221;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-21
 * Time: 20:01:29
 */
//把Thread当Runnable使用   //Thread是实现了Runnable接口的
public class TestDemo02 {
    static class MyThread extends Thread{
        @Override
        public void run() {
            method("子线程");
        }
    }
    public static void main(String[] args) {
        Thread runnable = new MyThread();
        Thread thread = new Thread(runnable);
        thread.start();
        method("主线程");
    }
    private static void method(String name){
        while (true) {
            System.out.println("我是" + name);
        }
    }
}
