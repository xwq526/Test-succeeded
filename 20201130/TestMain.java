package test20201130;
//小明家有一些彩球，一段时间后小明玩耍时将它们无序的散落在家中，
//        一天，小明想对其进行整理，规则为一个篮子中只放一种颜色彩球，
//        可有多个篮子放同一颜色的球，每个篮子里的球不少于2个。
//        假设小明整理好后，能使各篮子中彩球数量是相同的，则认为小明整理好了。
//        用一个数字表示一种颜色彩球，一组数表示小明已经找到了的彩球，
//        问小明用找到的全部彩球能按规则整理好么？
//        如果可以，输出需要的最少的篮子个数
//        如果不可以，则输出0
/*
输入说明：
        第一行是彩球的个数n
        第二行是n个整数 用空格分割表示每个球的颜色保证这n个数字不完全一样。
*/
/*      输入样例：
        6
        1 1 2 2 2 2
        输出样例：
        3*/
import java.util.*;
//基本思路：利用map对数组分类整理，然后求这些个数的最大公约数，如果最大公约数为1则说明不能整理，否则输出n/最大公约数
public class TestMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < n;i++){
            int temp = sc.nextInt();
            int count = 1;
            if(map.get(temp)!= null){
                count = map.get(temp)+1;
            }else{
                count = 1;
            }
            map.put(temp,count);
        }
        if(map.size()==1){
            System.out.println(1);
        }else{
            List<Integer> list = new ArrayList<>();
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                list.add(entry.getValue());//这是个数
            }
            int num = fun(list);
            if(num == 1){
                System.out.println(0);
            }else{
                System.out.println(n/num);
            }
        }
    }

    private static int fun(List<Integer> list) {
        int[] arr = new int[list.size()];
        for(int i = 0;i <list.size();i++){
            arr[i] = list.get(i);
        }
        int ret = fun2(arr[0],arr[1]);
        for(int i = 0;i < arr.length;i++){
            ret = fun2(ret,arr[i]);
            if(ret == 1){
                return 1;
            }
        }
        return ret;
    }
    private static int fun2(int x, int y) {
        int m = x, n = y;
        int t = m % n;
        while(t != 0){
            m = n;
            n = t;
            t = m % n;
        }
        return n;
    }
}