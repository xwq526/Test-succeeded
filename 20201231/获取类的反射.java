package test20201231;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2021-01-02
 * Time: 13:12:01
 */
public class 获取类的反射 {
    static class Person{}

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        //通过对象的引用获取类的反射类对象引用
        Class<? extends Person> c1 = p1.getClass();
        Class<? extends Person> c2 = p2.getClass();

        //通过类名获取反射类对象引用
        Class<Person> c3 = Person.class;

        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
        System.out.println(c2 == c3);
    }
}
