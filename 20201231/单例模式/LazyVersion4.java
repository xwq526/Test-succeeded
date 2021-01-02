package test20201231.单例模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2021-01-02
 * Time: 19:48:11
 */
//1.为什么要二次判断
//2.性能是怎么提高的
//3.instance = new LazyVersion3（）  可能会被重排序为1-3-2
public class LazyVersion4 {
    private static volatile LazyVersion4 instance = null;
    // volatile 的目的：
    // 保护 instance = new LazyVersion4(); 一定是 1 -> 2 -> 3 的顺序
    // 而不至于出现，其他线程看到 instance != null，但执行的是一个没有被初始化完的对象。
    public static LazyVersion4 getInstance() {
        if (instance == null) {
            //100年的1秒
            synchronized (LazyVersion3.class) {
                //能保证instance还是null
                if(instance == null){
                    instance = new LazyVersion4();
                }
            }
        }
        return instance;
    }
}