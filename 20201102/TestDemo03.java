package test20201102;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
//Collextion 示例
public class TestDemo03 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add("我");
        list.add("最");
        list.add("帅");
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));
        for (String s:list) {
            System.out.println(s);
        }
        list.remove("最");
        for (String s: list) {
            System.out.println(s);
        }
        list.clear();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
