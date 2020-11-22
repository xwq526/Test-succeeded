package test20201121.lambdademo;
//函数式接口
@FunctionalInterface
interface NoParameterNoReturn {
    //注意：只能有一个方法
    void test();
}
//无返回值一个参数
@FunctionalInterface
interface OneParameterNoReturn {
    void test(int a);
}
//无返回值多个参数
@FunctionalInterface
interface MoreParameterNoReturn {
    void test(int a,int b);
}

//有返回值无参数
@FunctionalInterface
interface NoParameterReturn {
    int test();
}

//有返回值一个参数
@FunctionalInterface
interface OneParameterReturn {
    int test(int a);
}
//有返回值多参数
@FunctionalInterface
interface MoreParameterReturn {
    int test(int a,int b);
}
public class TestDemo {
    public static void main(String[] args) {
        NoParameterNoReturn noParameterNoReturn = ()->{
            System.out.println("hello");
        };
        noParameterNoReturn.test();

        OneParameterNoReturn op = a -> System.out.println(a);
        op.test(10);

        MoreParameterNoReturn mp = (int a, int b) -> {
            System.out.println(a+b);
        };
        mp.test(10,30);

    }
    public static void main1(String[] args) {
       /* NoParameterReturn np = () ->{ return 10;};
        NoParameterReturn np2 = () -> 10;
        System.out.println(np.test());
        System.out.println(np2.test());*/

        /*OneParameterReturn op = (a) ->{return a;};
        OneParameterReturn op2 = a -> a;
        System.out.println(op.test(10));
        System.out.println(op2.test(20));*/

        MoreParameterReturn mp = (a,b) ->{return a+b;};
        MoreParameterReturn mp1 = (a,b) -> a+b;
        MoreParameterReturn mp2 = (int a,int b) ->{return a+b;};
        System.out.println(mp.test(10,20));
        System.out.println(mp1.test(10,20));
        System.out.println(mp2.test(10,20));
    }
}
