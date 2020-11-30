package test20201128;

public class TestDemo01 {
    public static void add1(Byte b) {
        b = b++;
    }
    public static void add2(Byte b) {
       ++b;
    }
    public static void main1(String[] args) {
        byte b = 127;
        byte b1 = 127;
        add1(b);
        System.out.println(b);
        System.out.println(++b1);

    }

    public static void main(String[] args) {


    }
//    给定两个数A、B（0，100000），求 A^B 中最后三位数是多少。请简要描述你的思路。
//    答：思路就是一直模上1000

}
