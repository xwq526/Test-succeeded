package test20201127;
class Base{
    public Base(String s){
        System.out.print("B");
    }
}
public class TestDemo03 extends Base{
    public TestDemo03 (String s) {
        super("d");// 特别要注意，有参数的要显示调用
        System.out.print("D");
    }
    public static void main(String[] args){
        new TestDemo03("C");
    }
}
/*
public class TestDemo03 {
    public static void main(String[] args) {

    }
}
*/
