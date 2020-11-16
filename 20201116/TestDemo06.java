package test20201116;

/**
 * 内部类：
 * 1.实例内部类
 * 2.静态内部类
 * 3.匿名内部类
 * 4.本地内部类
 *
 */


/*class OuterClass {
    public int data1 = 99;
    private int data2 = 98;
    public static int data3;

    *//**
     * 1.拿到实例内部类对象的方式
     *  OuterClass out = new OuterClass();
     *         OuterClass.InnerClass innerClass = out.new InnerClass();
     * 2.不能在实例内部类当中，定义一个静态的变量
     *    非要定义呢？ 在编译时期能够确定的值    例如：public static final int data5 = 5;
     * 3.面试问题：实例内部类是否有额外的开销 ？   有
     * OutClass.this
     * 4. this -->   静态的    OuterCLass.this
     * 5.注意 ： 内部类  产生的字节码文件  外部类名$内部类名.class
     *//*
    class InnerClass {
        public int data1 = 100;
        public int data4 = 4;
        public static final int data5 = 5;
        public void test() {
            System.out.println(data1);//100
            System.out.println(this.data1);//100
            System.out.println(OuterClass.this.data1);//99

            System.out.println(data2);
            System.out.println(data3);
            System.out.println(data4);
            System.out.println(data5);
        }
    }
}*/


/*class OuterClass1 {
    public int data1 = 1;
    private int data2 = 2;
    public static int data3 = 3;


    *//**
     * 1.如何拿到静态内部类的实例对象？
     * 2.静态内部类当中，是不可以访问外部类的非静态数据成员的
     * 如果非要访问呢？   可以通过构造方法（下面有）
     *//*
    static class InnerClass1 {
        public int data4 = 4;
        public int data5 = 5;
        public static final int data6 = 6;

        public OuterClass1 outerClass1;
        public InnerClass1(OuterClass1 out) {
            this.outerClass1 = out;

        }



        public void test() {
            System.out.println(data4);
            System.out.println(data5);
            System.out.println(data6);
            System.out.println(outerClass1.data1);
        }
    }
}*/

class OuterClass2 {
    public void test() {
        System.out.println("test()");
    }

}


public class TestDemo06 {
    public void func() {
        class A {
            //本地内部类
        }
    }
    public static void main(String[] args) {
        //匿名内部类
        new OuterClass2(){
            @Override
            public void test() {
                System.out.println("hahahhahaa");
            }
        }.test();
    }


    /*public static void main1(String[] args) {
        OuterClass1 outerClass1 = new OuterClass1();
        OuterClass1.InnerClass1 innerClass1 = new OuterClass1.InnerClass1(outerClass1);
        innerClass1.test();

    }*/


   /* public static void main0(String[] args) {
        OuterClass out = new OuterClass();
        OuterClass.InnerClass innerClass = out.new InnerClass();
        innerClass.test();

    }*/
}
