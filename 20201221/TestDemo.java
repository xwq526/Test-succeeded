package test20201221;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-21
 * Time: 19:53:44
 */


//为线程指定要运行的指令
public class TestDemo {
    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("我是子线程");
            while (true){
//                System.out.println("我是子线程");
            }
        }
    }
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        System.out.println("我是父线程");
        while (true){
//            System.out.println("我是父进程");
        }
    }
}
