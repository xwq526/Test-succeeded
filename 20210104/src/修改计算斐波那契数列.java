import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2021-01-06
 * Time: 20:39:20
 */
public class 修改计算斐波那契数列 {
    private static long fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
    static class CalcTask implements Runnable {
        private final int n;
        CalcTask(int n) {
            this.n = n;
        }

        @Override
        public void run() {
            long fib = fib(n);
            System.out.printf("fib(%d) = %d\n",n,fib);
        }

        public static void main(String[] args) {
            ExecutorService threadPool = Executors.newCachedThreadPool();
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                int n = scanner.nextInt();

                Runnable task = new CalcTask(n);
                threadPool.execute(task);
            }
            threadPool.shutdown();
        }
    }
}
