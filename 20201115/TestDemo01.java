package test20201115;


import java.util.Arrays;
import java.util.Comparator;
//853. 车队 力扣
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Car[] cars = new Car[n];
        for (int i = 0; i < n; i++) {
            cars[i] = new Car(position[i],(double)(target - position[i]) / speed[i]);
        }
        Arrays.sort(cars, new Comparator<Car>() {//根据position 从小到大排序
            @Override
            public int compare(Car o1, Car o2) {
                return o1.position - o2.position;
            }
        });
        //这里的cars已经根据position从小到大排好序了
        int ans = 0;
        int t = n - 1;
        while (t > 0) {
            if (cars[t].time < cars[t-1].time) {
                ans++;
            } else {
                cars[t-1] = cars[t];
            }
            t--;
        }
        if (t < 0) return ans;//如果数组为空的时候返回0
//        if(t < 0) return 0;跟上面这一句是一样的
        return ans + 1;
    }
}
//定义一个类来存车的信息，方便使用比较器来比较排序
class Car {
    public int position;
    public double time;

    public Car(int position, double time) {
        this.position = position;
        this.time = time;
    }
}

public class TestDemo01 {
    public static void main(String[] args) {

    }
}
