package test20201231;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2021-01-02
 * Time: 13:16:49
 */
public class Synchronized的语法使用示例 {

    //同步方法
    synchronized int add(int a, int b) {
        return 0;
    }

    synchronized static void sayHello() {

    }

    //同步代码块 ——能出现语句的地方
    static void someMethod() {
        Object object = new Object();
        synchronized (object){
            
        }
    }
}
