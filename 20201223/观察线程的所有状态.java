package test20201223;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-29
 * Time: 16:47:28
 */
public class 观察线程的所有状态 {
    public static void main(String[] args) {
        Thread.State[] values = Thread.State.values();
        for (Thread.State state : values) {
            System.out.println(state);
        }
    }
}
