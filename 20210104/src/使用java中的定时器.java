import java.util.Timer;
import java.util.TimerTask;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2021-01-07
 * Time: 00:48:28
 */
public class 使用java中的定时器 {
    public static void main(String[] args) throws InterruptedException {
//        TimerTask; //让定时器去运行任务
//        Timer;  //定时器
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("时间到了，该起床了");
            }
        };
        Timer timer = new Timer();
        //5
//        timer.schedule(task,5000);

        //5,8,11,14

        timer.scheduleAtFixedRate(task,5000,3000);

        while (true) {
            System.out.println("我是主线程，我在睡觉");
            Thread.sleep(500);
        }

    }
}
