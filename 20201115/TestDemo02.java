package test20201115;



//75. 颜色分类  力扣


import java.util.Arrays;

public class TestDemo02 {
    public static void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        for (int i = 0; i <= right; i++) {
            //这两个判断的位置不能换，换了就错了
            while (nums[i] == 2 && i <= right) {//这个比较特殊，要小心
                int tmp = nums[right];
                nums[right]= nums[i];
                nums[i] = tmp;
                right--;
            }
            if (nums[i] == 0) {
                int tmp = nums[left];
                nums[left]= nums[i];
                nums[i] = tmp;
                left++;
            }



        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,0};
        System.out.println(Arrays.toString(array));
        sortColors(array);
        System.out.println(Arrays.toString(array));


    }
}
