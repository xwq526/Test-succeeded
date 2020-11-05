package test20201102;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestDemo04 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.get("作者"));
        System.out.println(map.getOrDefault("作者","小青"));
        System.out.println(map.containsKey("作者"));
        System.out.println(map.containsValue("小青"));
        System.out.println("=============================");
        map.put("作者","小青");
        map.put("标题","狂人日记");
        map.put("发表时间","1998年");
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.get("作者"));
        System.out.println(map.getOrDefault("作者","垃圾"));
        System.out.println(map.getOrDefault("服务","垃圾"));
        System.out.println(map.containsKey("作者"));
        System.out.println(map.containsValue("小青"));
        Set<Map.Entry<String, String>> entrySet = map.entrySet() ;
        for (Map.Entry<String, String> s:entrySet) {
            System.out.println(s);
            System.out.println(s.getKey());
            System.out.println(s.getValue());
        }


    }
}
