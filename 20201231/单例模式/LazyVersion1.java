package test20201231.单例模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2021-01-02
 * Time: 19:37:17
 */
//不是线程安全的
public class LazyVersion1 {
    private static LazyVersion1 intstance = null;
    public static LazyVersion1 getInstance() {
        //有人要用到对象了
        if (intstance == null) {
            //第一次的时候，进行实例化，以后不再进行
            intstance = new LazyVersion1();
        }

        return intstance;
    }
}
