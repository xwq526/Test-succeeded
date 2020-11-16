package test20201116;


import java.util.Arrays;

/**
 * 泛型的意义：
 * 1.自动进行类型的检查
 * 2.自动进行类型的转换
 * 泛型的一些重点：
 * 1.泛型是怎么编译的？  擦除机制 -》Object
 * 2.泛型的类型    不参与类型的组成
 * 3.泛型的参数  不能是简单类型
 * @param <T>
 */
class MyArrayList<T> {
    public T[] elem;
    public int usedSize;

    public MyArrayList() {
        this.elem = (T[])new Object[10];
    }
    public void push(T val) {  //放进去元素
        this.elem[usedSize++] = val;
    }
    //得到
    public T get() {
        return this.elem[0];
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "elem=" + Arrays.toString(elem) +
                ", usedSize=" + usedSize +
                '}';
    }
}
public class TestDemo04 {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.push(1);
        myArrayList.push(21);
        System.out.println(myArrayList.get());
        MyArrayList<String> myArrayList1 = new MyArrayList<>();
        System.out.println(myArrayList);
        System.out.println(myArrayList1);

    }
}
