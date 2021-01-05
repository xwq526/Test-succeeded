package com.xwq;

import java.util.concurrent.*;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2021-01-05
 * Time: 20:52:41
 */
public class 线程池演示 {
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 1000000; i++) {
                System.out.println("hello");
            }
        }
    }

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                10,
                10,
                10,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(10),
                new ThreadFactory() {
                    @Override
                    public Thread newThread(Runnable r) {
                        return new Thread(r,"Hello");
                    }
                });
        ExecutorService executorService = threadPoolExecutor;
        Executor executor = threadPoolExecutor;

        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        });
      /*  executor.execute(new MyRunnable());

        for (int i = 0; i < 1000000; i++) {
            System.out.println("world");
        }*/

        executorService.shutdown();
    }
}
