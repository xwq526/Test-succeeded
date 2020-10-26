package test20201026.demo1;

import sun.security.provider.SHA;

//抽象类天生就是为了被继承的。
abstract class Shape {
    int a = 10;
    void func() {

    }
    abstract void draw();//抽象方法不能是private
}
class Cycle extends Shape {
    //    一个普通类继承了这个抽象类之后，一定要重写，抽象类的抽象方法
    @Override
    void draw() {
    }
}
class  Flower extends Shape {
    @Override
    void draw() {

    }
}
public class TestDemo {
    public static void  drawMap(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
//        Shape shape = new Shape();//抽象类不能实例化
        drawMap(new Cycle());
        drawMap(new Flower());
    }
}
