package test20201024;//包名小写
import java.util.Arrays;




class  Shape {
    public void draw() {

    }
}
class Cycle extends Shape{
    @Override
    public void draw() {
        System.out.println("⚪");
    }
}
class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("四边形");
    }
}
class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("鲜花");
    }
}

public class TestDemo01 {
    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        Rect rect = new Rect();
        Flower flower = new Flower();
        Shape[] shapes = {cycle,rect,flower};
        for (Shape sh : shapes) {
            sh.draw();
        }

    }





























    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));
    }
}
