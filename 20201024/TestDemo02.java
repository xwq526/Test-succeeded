package test20201024;



class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(this.name + "eat()");
    }
}
class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    @Override
    public void eat() {
        System.out.println(this.name + "cat:eat()");
    }
    public void func() {
        System.out.println("Cat:func()");
    }

}
class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }
    public void wangwang() {
        System.out.println(this.name+"wangwang");
    }
}


public class TestDemo02 {
    public static void main(String[] args) {
        Animal animal1 = new Cat("mimi");
        animal1.eat();
    }
}
