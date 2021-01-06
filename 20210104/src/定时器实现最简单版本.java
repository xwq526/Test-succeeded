/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2021-01-07
 * Time: 00:54:13
 */
public class 定时器实现最简单版本 {
    static abstract class TimerTask{
        protected abstract void run();
    }
    static class Timer {
        public void schedule(TimerTask task, long delay) {
            Thread thread = new Thread() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(delay);
                        task.run();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            thread.start();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            protected void run() {
                System.out.println("时间到了，该起来了");
            }
        },5000);

        while (true) {
            System.out.println("我是主线程，我在睡觉");
            Thread.sleep(500);
        }
    }
}
