package test20201221;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-21
 * Time: 19:51:54
 */

//第一个我们自己创建的线程
public class FirstThread {
    public static void main(String[] args) {
        Thread thread = new Thread();//新建状态
        thread.start();//让新建的线程（子线程)的状态变成就绪状态
    }
}
