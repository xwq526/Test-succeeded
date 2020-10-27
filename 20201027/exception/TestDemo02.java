package test20201027.exception;

class  MyExeption extends RuntimeException {
    public MyExeption() {

    }

    public MyExeption(String message) {
        super(message);
    }
}
public class TestDemo02 {

    public static void main(String[] args) {
//        func2(10,8);
        try {
            func2(10);
        } catch (MyExeption e) {
            e.printStackTrace();
        }

    }
    public static void func2 (int x) throws MyExeption {
        if (x == 10) {
            throw new MyExeption("x==10");
        }
    }


    public static  double func(int x , int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("你除了一个0");
        }
        return x * 1.0 / y;
    }
    public static void main1(String[] args) {
        try {
            System.out.println(func(10, 0));
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("算数异常了哦");
        }
    }
}
