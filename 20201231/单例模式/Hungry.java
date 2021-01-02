package test20201231.单例模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2021-01-02
 * Time: 19:32:05
 */

//线程安全 + 简单
    //构造的早，如果不用就浪费空间了
public class Hungry {
    private Hungry() {}

    private static Hungry instance = new Hungry(); //只会有这么一个对象

    public static Hungry getInstance(){
        return instance;
    }
}
