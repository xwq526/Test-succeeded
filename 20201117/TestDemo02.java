package test20201117;

import java.util.*;

public class TestDemo02 {
    public static void main1(String[] args) {
        //List当中存放的数据为10万个，找到第一个重复的是数据
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10_0000; i++) {
            int a =random.nextInt(100000);
//            if (list.contains(a)) {
//                System.out.println(a);
//                break;
//            }
            list.add(a);
        }
        System.out.println(list.size());
        //List当中有10万个数据，把重复的数字全部去重
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }
        System.out.println(set.size());
    }

    //将10万个数据，统计重复数字及出现的次数
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10_0000; i++) {
            int a =random.nextInt(100000);
            list.add(a);
        }
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i),map.getOrDefault(list.get(i),0) + 1);
        }
//        for(Integer key : list) {
//            if (map.get(key) == null) {
//                map.put(key,1);
//            }else {
//                int val = map.get(key);
//                map.put(key,val+1);
//            }
//        }
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("重复出现的数字:" + entry.getKey()
                        + "重复出现的次数：" + entry.getValue());
            }

        }
    }
}

