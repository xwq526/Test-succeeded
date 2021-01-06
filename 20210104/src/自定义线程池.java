import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2021-01-06
 * Time: 20:44:49
 */
public class 自定义线程池 {
    //员工花名册
    private final Thread[] threads;

    //存在”待完成“任务的队列
    private final BlockingQueue<Runnable> taskQueue;


    //nThreads 线程池内的线程个数
    public 自定义线程池(int nThreads) {
        //构造花名册
        threads = new Thread[nThreads];
        //构造任务队列
        taskQueue = new LinkedBlockingQueue<>();
        //体现创建 nThreads个工作线程
        //雇佣工人
        for(int i = 0; i < nThreads; i++) {
            //雇佣：Worker 类的run是工人的工作手册
            Thread worker = new Worker(taskQueue);
            //让工人进入岗位
            worker.start();
            //把工人记录在册
            threads[i] = worker;
        }
    }

    private static class Worker extends Thread {
        //存在”待完成“任务的队列，大家共享一个队列
        private static BlockingQueue<Runnable> taskQueue;

        Worker(BlockingQueue<Runnable> taskQueue) {
            this.taskQueue = taskQueue;
        }

        @Override
        public void run() {
            try {
                // 只要没人让我停下来
                while (!Thread.interrupted()) {
                    // 领取任务
                    Runnable task = taskQueue.take();
                    // 完成任务
                    task.run();
                }
            } catch (InterruptedException e) {
                // 有人让我停下来
            }
        }
    }

    public void execute(Runnable task) throws InterruptedException {
        taskQueue.put(task);
    }

    public void shutdown() throws InterruptedException {
        for(Thread thread : threads) {
            thread.interrupt();
        }

        for(Thread thread : threads) {
            thread.join();
        }
    }
}
