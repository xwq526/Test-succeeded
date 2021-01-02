package test20201231.单例模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2021-01-02
 * Time: 19:44:44
 */
//1.为什么要二次判断
    //2.性能是怎么提高的
    //3.instance = new LazyVersion3（）  可能会被重排序为1-3-2
public class LazyVersion3 {
    private static LazyVersion3 instance = null;

    public static LazyVersion3 getInstance() {
        if (instance == null) {
            //100年的1秒
            synchronized (LazyVersion3.class) {
                //能保证instance还是null
                if(instance == null){
                    instance = new LazyVersion3();
                }
            }
        }
        return instance;
    }
}
