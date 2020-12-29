package test20201223;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-29
 * Time: 13:54:49
 */
public class 通知线程停止 {

    private static class MyThread extends Thread{
        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(10*1000);
                } catch (InterruptedException e) {
//                    System.out.println("我收到异常了");
                    break;
                }
                System.out.println("hello world");
                boolean 有人赐白绫 = Thread.interrupted();
                if (有人赐白绫) {
                    break;
                }
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread();
        t.start();

        Thread.sleep(2000);

        t.interrupt(); //赐给他白绫
        System.out.println("给t赐白绫了");
    }
}
