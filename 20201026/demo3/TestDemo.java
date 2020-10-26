package test20201026.demo3;

import javax.swing.text.StyledEditorKit;

/**
 * 接口：
 * 两个意义
 * 1.实现多继承
 * 2.可扩展性非常强
 * 接口实际上是对某一种功能或者行为的抽象
 * 注意：
 * 1.类和接口之间的关系？  implements
 * 抽象类是否可以实现接口？   可以
 * 接口和接口之间的关系   extends（扩展）
 */

interface  IA {
    void func();
}
abstract class A implements IA {
//    public void func() {
//        System.out.println("sdklakf");
//    }
}
class B extends A {
    @Override
    public void func() {
        System.out.println("dlkfajldf");
    }
}

interface IB extends IA {
    void func2();
}
class C implements IB {
    @Override
    public void func() {

    }

    @Override
    public void func2() {

    }
}
interface ID {
    void func3();
}
interface IC extends IB,ID {

}
class IE implements IC{
    @Override
    public void func() {

    }

    @Override
    public void func2() {

    }

    @Override
    public void func3() {

    }
}

class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
}
interface IFlying {
    void fly();
}
interface IRunning {
    void run ();
}
interface ISwimming {
    void swim();
}
class Cat extends Animal implements IRunning {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在跑");
    }
}
class Fish extends Animal implements ISwimming {
    public Fish(String name) {
        super(name);
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在游");
    }
}
class  Frog extends Animal implements ISwimming,IRunning {
    public Frog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在跑");
    }

    @Override
    public void swim() {
        System.out.println(this.name + "正在游");
    }
}
class Duck extends Animal implements IRunning,ISwimming,IFlying {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.name + "正在飞哦");
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在跑");
    }

    @Override
    public void swim() {
        System.out.println(this.name + "正在游");
    }
}

class Robot implements IRunning {
    @Override
    public void run() {
        System.out.println("机器人在跑");
    }
}







public class TestDemo {
    public static void function1(IRunning iRunning) {
        iRunning.run();
    }

    public static void function2(IFlying iFlying) {
        iFlying.fly();
    }
    public static void function3(ISwimming iSwimming) {
        iSwimming.swim();
    }

    public static void main(String[] args) {
        function1(new Duck("哈哈哈哈"));
        function1(new Frog("fsdfa"));
        function1(new Robot());
    }
    public static void main1(String[] args) {
        Animal animal = new Animal("h1");
        IRunning iRunning = new Duck("dksal");
        ISwimming iSwimming = new Duck("dksal");
    }
}
