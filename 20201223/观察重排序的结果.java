package test20201223;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-29
 * Time: 23:19:59
 */
public class 观察重排序的结果 {//未能看见想要的结果  ，后续再实现出来
    static int a1;
    static int a2;
    static int a3;
    static int a4;
    static int a5;
    static int a6;
    static int a7;
    static int a8;
    static int a9;
    static int a10;
    static int a11;
    static int a12;
    static int a13;
    static int a14;
    static int a15;
    static int a16;
    static int a17;
    static int a18;
    static int a19;
    static int a20;
    static int a21;

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(a1);
                System.out.println(a2);
                System.out.println(a3);
                System.out.println(a4);
                System.out.println(a5);
                System.out.println(a6);
                System.out.println(a7);
                System.out.println(a8);
                System.out.println(a9);
                System.out.println(a10);
                System.out.println(a11);
                System.out.println(a12);
                System.out.println(a13);
                System.out.println(a14);
                System.out.println(a15);
                System.out.println(a16);
                System.out.println(a17);
                System.out.println(a18);
                System.out.println(a19);
                System.out.println(a20);
                System.out.println(a21);
            }
        }).start();

        a1 = 1;
        a2 = 2;
        a3 = 3;
        a4 = 4;
        a5 = 5;
        a6 = 6;
        a7 = 7;
        a8 = 8;
        a9 = 9;
        a10 = 10;
        a11 = 11;
        a12 = 12;
        a13 = 13;
        a14 = 14;
        a15 = 15;
        a16 = 16;
        a17 = 17;
        a18 = 18;
        a19 = 19;
        a20 = 20;
        a21 = 21;

    }
}
