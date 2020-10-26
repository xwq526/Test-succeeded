package test20201026.demo2;
/**
 * 接口
 * 1.接口当中的方法，一定是不能够有具体的实现的
 * 2.接口中default中修饰的方法才能够有具体的实现
 * 3.接口中的成员变量都是public static final的
 * 4.接口中的方法都是public abstract
 * 5.如果不写，都是默认
 * 6.接口和抽象类一样不能够进行实例化
 * 7.接口也可以发生向上转型和运行时绑定
 */
interface Shape{
    void draw();
//    default public void func() {
//
//    }
}
class Cycle implements Shape {
    @Override
    public void draw() {
        System.out.println("圆圆");
    }
}
class Flower implements Shape {
    @Override
    public void draw() {
        System.out.println("花花");
    }
}

public class TestDemo {
    public static void drawMap(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
        Shape shape = new Flower();
        shape.draw();
       Shape shape1 = new Cycle();
        shape1.draw();
       Flower flower = new Flower();
        drawMap(flower);


    }
}
