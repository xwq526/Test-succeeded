package test20201112;

import java.util.Arrays;

//堆排序
public class TestDemo04 {
    public static void main(String[] args) {
        int[] array = {10,7,3,6,8};
        System.out.println(Arrays.toString(array));
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }



    public static void adjustDown(int[] array ,int parent,int len) {//向小调整
        int child = 2*parent + 1;
        while (child < len) {
            if (child + 1 < len && array[child] < array[child+1]) {
                child++;
            }
            if (array[child] > array[parent]) {
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
                parent = child;
                child = 2*parent + 1;
            } else {
                break;
            }
        }
    }
    public static void createHeap (int[] array) {//建堆 （建堆是向下调整）
        for (int i = (array.length-1-1) / 2; i >= 0; i--) {//注意这里是i--
            adjustDown(array,i,array.length);
        }
    }

    /**
     * 时间复杂度：O（n*logn）
     * 空间复杂度：O（1）
     * 稳定性:不稳定的排序
     * @param array
     */
    public static void heapSort(int[] array) {//堆排序之前要建一个堆，如果从小到大排序，那么就建一个大堆，如果从大到小排序，那么就建一个小堆。
        createHeap(array);//堆排序之前要建一个堆
        int end = array.length - 1;
        while (end > 0) {
            //建立的是一个大堆，所以最后一个和第一个换 然后再像下调整，
            int tmp = array[0];
            array[0] = array[end];
            array[end] = tmp;
            adjustDown(array,0,end);
            end--;
        }
    }
}

