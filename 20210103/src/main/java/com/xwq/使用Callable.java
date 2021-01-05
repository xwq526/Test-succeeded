package com.xwq;

import java.util.concurrent.*;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2021-01-05
 * Time: 21:03:58
 */
public class 使用Callable {
    static class MyCallable implements Callable<Integer> {
        private final int a;
        private final int b;

        MyCallable(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public Integer call() throws Exception {
            Thread.sleep(10_000);
            return a + b;
        }

        public static void main(String[] args) throws ExecutionException, InterruptedException {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                    10,
                    10,
                    10,
                    TimeUnit.SECONDS,
                    new ArrayBlockingQueue<Runnable>(10)
            );
            ExecutorService executorService = threadPoolExecutor;
            Executor executor = threadPoolExecutor;

            Future<Integer> future = executorService.submit(new MyCallable(10, 20));

            System.out.println("hello");
            Integer r = future.get();
            System.out.println("world");
            System.out.println(r);


        }
    }
}
