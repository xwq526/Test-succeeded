package test20201221;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-21
 * Time: 19:56:20
 */
//通过Runnable启动线程
public class TestDemo01 {
    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            while (true){
                System.out.println("我是子线程");
            }
        }
    }
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        while (true){
            System.out.println("我是父线程");
        }

    }
}
