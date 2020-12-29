package test20201223;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-29
 * Time: 16:55:54
 */
public class 观察一些线程的状态转移过程 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());  //RUNNABLE OR TIMED_WAITING
        Thread.sleep(1);
        System.out.println(t.getState()); //RUNNABLE OR TIMED_WAITING
        t.join();
        System.out.println(t.getState());
    }
}
