package test20201231.单例模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2021-01-02
 * Time: 19:40:12
 */
//线程安全了
    //性能不高
public class LazyVersion2 {
    private static volatile LazyVersion2 instance = null;

    public static LazyVersion2 getInstance() {
        synchronized (LazyVersion2.class) {
            if(instance == null) {
                instance = new LazyVersion2();
            }
        }
        return instance;
    }
}
