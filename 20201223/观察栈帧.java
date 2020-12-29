package test20201223;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-28
 * Time: 21:25:01
 */
public class 观察栈帧 {
    private static void a() {
    }

    private static void b() {
        a();
    }
    private static void c() {
        b();
    }
    private static void d() {
        c();
    }
    private static void e() {
        d();
    }
    private static class MyThread extends Thread{
        @Override
        public void run() {
            h();
        }
    }
    private static void h() {
        i();
    }
    private static void i() {

    }
    public static void main(String[] args) {
        new MyThread().start();
        e();
    }
}
