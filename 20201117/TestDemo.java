package test20201117;
import java.util.*;
public class TestDemo {


    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("abcd");
        set.add("abcde");
        set.add("abcd");
        System.out.println(set);
        Iterator<String> it = set.iterator();//迭代器
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(set.size());//2
        it.remove();
        System.out.println(set.size());//1
    }


    public static void main1(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("及时雨","宋江");
        map.put("及雨","宋");
//        System.out.println(map.get("及时雨"));
        for(Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("=======");
            entry.setValue("hahah");
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

        }
    }
}
