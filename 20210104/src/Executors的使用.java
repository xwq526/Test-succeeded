import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2021-01-06
 * Time: 20:36:26
 */
public class Executors的使用 {
    public static void main(String[] args) {
        ExecutorService t1 = Executors.newCachedThreadPool();
        ExecutorService t2 = Executors.newFixedThreadPool(10);
        ExecutorService t3 = Executors.newSingleThreadExecutor();
    }
}
