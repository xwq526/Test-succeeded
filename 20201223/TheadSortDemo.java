package test20201223;

import java.util.Arrays;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-28
 * Time: 19:10:51
 */
public class TheadSortDemo {
    private static void bubbleSort(long[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j+1]) {
                    long t = array[j];
                    array[j] =array[j+1];
                    array[j+1] = t;
                }
            }
        }
    }

    private static final Random random = new Random(20201213);

    private static long[] createRandomArray(int n) {
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(2*n);
        }
        return array;
    }

    private static class SortThread extends Thread {
        //因为属性是线程之间共享的
        private final long[] array; //通过主线程把数据保存到属性

        public SortThread(long[] array) {
            this.array = array;  //main 线程
        }

        @Override
        public void run() {
            bubbleSort(array); //子线程，通过自子线程获取属性的值ss
       }
    }

    private static void 多线程排序() throws InterruptedException {
        long[] a1 = createRandomArray(4_0000);
        long[] a2 = createRandomArray(4_0000);
        long[] a3 = createRandomArray(4_0000);
        long[] a4 = createRandomArray(4_0000);
        long[] a5 = createRandomArray(4_0000);
        System.out.println("开始排序");
        long start = System.currentTimeMillis();
        Thread t1 = new SortThread(a1);
        Thread t2 = new SortThread(a2);
        Thread t3 = new SortThread(a3);
        Thread t4 = new SortThread(a4);
        bubbleSort(a5);
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        long end = System.currentTimeMillis();
        double sec = (end - start) /1000.0;
        System.out.printf("单线程：一共耗时%f 秒\n",sec);
    }

    private static void 单线程排序() {
        long[] a1 = createRandomArray(4_0000);
        long[] a2 = createRandomArray(4_0000);
        long[] a3 = createRandomArray(4_0000);
        long[] a4 = createRandomArray(4_0000);
        long[] a5 = createRandomArray(4_0000);
        System.out.println("开始排序");
        long start = System.currentTimeMillis();
        bubbleSort(a1);
        bubbleSort(a2);
        bubbleSort(a3);
        bubbleSort(a4);
        bubbleSort(a5);
        long end = System.currentTimeMillis();
        double sec = (end - start) /1000.0;
        System.out.printf("单线程：一共耗时%f 秒\n",sec);
    }

    public static void main(String[] args) throws InterruptedException {
        多线程排序();
    }


}
