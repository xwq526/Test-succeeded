package test20201102;


//请编写代码使用 A 这个泛型类
class A<T> {
    T value;

    A(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}
public class TestDemo09 {
    public static void main(String[] args) {
        A<Integer> myA = new A<>(5);
        System.out.println(myA.value);
        System.out.println(myA.get());


    }
}
