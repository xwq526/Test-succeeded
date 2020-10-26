package test20201026.demo5;


/**
 * Cloneable 为什么是一个空接口，他的作用是什么？
 *空接口也叫标记接口：  标记当前类是可以克隆的
 * 加一个money类，说明了深浅拷贝的区别
 */



class Money implements Cloneable{
    public double money = 12.5;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}





class Person implements  Cloneable{
    public String name = "小青";
    public Money m = new Money();
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        person.m = (Money)this.m.clone();//这两句先克隆persion，再克隆money，两个一起克隆，就成了深拷贝了
        return person;
//        return super.clone();
    }
}

public class TestDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        Person person2 = (Person)person.clone();//因为返回值类型是Object，向下转型，所以要强制转换
        System.out.println(person.m.money);
        System.out.println(person2.m.money);
        System.out.println("================");
        person2.m.money = 45.2;
        System.out.println(person.m.money);
        System.out.println(person2.m.money);
    }
    public static void main1(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        Person person2 = (Person)person.clone();//因为返回值类型是Object，向下转型，所以要强制转换
        System.out.println(person.name);
        System.out.println(person2.name);
        System.out.println("================");
        person2.name = "hello";
        System.out.println(person.name);
        System.out.println(person2.name);
    }
}
