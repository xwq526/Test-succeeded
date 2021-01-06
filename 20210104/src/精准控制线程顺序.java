import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class 精准控制线程顺序 {
    private static Lock lock = new ReentrantLock();
    private static String signal;

    static class ARunner extends Thread {
        @Override
        public void run() {
            while (true) {
                //申请锁
                lock.lock();
                while (!signal.equals("A")) {
                    //释放掉
                    lock.unlock();
                    //可能其他线程也会申请到锁，进而改变了signal的值
                    Thread.yield();//可以不要，加上更好
                    lock.lock();
                }

                //这里持有锁
                System.out.println("A线程在运行");
                signal = "C";
                //释放锁
                lock.unlock();
            }
        }
    }
    static class BRunner extends Thread {
        @Override
        public void run() {
            while (true) {
                //申请锁
                lock.lock();
                while (!signal.equals("B")) {
                    //释放掉
                    lock.unlock();
                    //可能其他线程也会申请到锁，进而改变了signal的值
                    Thread.yield();//可以不要，加上更好
                    lock.lock();
                }

                //这里持有锁
                System.out.println("B线程在运行");
                signal = "A";
                //释放锁
                lock.unlock();
            }
        }
    }
    static class CRunner extends Thread {
        @Override
        public void run() {
            while (true) {
                //申请锁
                lock.lock();
                while (!signal.equals("C")) {
                    //释放掉
                    lock.unlock();
                    //可能其他线程也会申请到锁，进而改变了signal的值
                    Thread.yield();//可以不要，加上更好
                    lock.lock();
                }

                //这里持有锁
                System.out.println("C线程在运行");
                signal = "B";
                //释放锁
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        Thread a = new ARunner();
        Thread b = new BRunner();
        Thread c = new CRunner();

        signal = "C";
        a.start();
        b.start();
        c.start();

    }
}
