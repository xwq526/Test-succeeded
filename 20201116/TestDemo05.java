package test20201116;

import java.util.ArrayList;

/**
 * 泛型的上界  extends
 *       T  extends  x
 *       T 是实现了x这个接口  或者是x的子类或者x自己本身
 * @param <T>
 */
class GenericAlg<T extends Comparable<T>> {//泛型类
    //非静态
    public T maxValue(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
}
class GenericAlg1 {
    //静态
    //泛型方法
    public static <T extends Comparable<T>> T maxValue(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
}


/**
 * 通配符：源码当中
 * 泛型的区别：
 * 1、通配符一般用于读取
 * 2、通配符不仅有上界，还有下界
 * @param <T>
 */
class Myprint<T> {
    public void printf1 (ArrayList<T> list) {
        for (T val: list) {
            System.out.println(val);
        }
    }
    public void printf (ArrayList<?> list) {
        for (Object val: list) {
            System.out.println(val);
        }
    }
}




public class TestDemo05 {
    public static void main(String[] args) {
        Myprint<Integer> myprint = new Myprint<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        myprint.printf(arrayList);
    }
    public static void main1(String[] args) {
        Integer[] array = {1,5,2,18,10,7};
        GenericAlg<Integer> genericAlg = new GenericAlg<Integer>();
        System.out.println(genericAlg.maxValue(array));



        //这两句是一样的
        System.out.println(GenericAlg1.<Integer>maxValue(array));
        //下面这句代码并没有给定类型，会根据实参的类型知道T的类型
        System.out.println(GenericAlg1.maxValue(array));
    }
}
