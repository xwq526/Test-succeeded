package test20201030;
//给出两个有序的整数数组 A和B，请将数组B合并到数组A中，变成一个有序的数组
//注意：可以假设A数组有足够的空间存放B数组的元素，A和B中初始的元素数目分别为m和n
public class TestDemo04 {
    public void merge(int A[], int m, int B[], int n) {
        //从后往前处理，
        int indexA = m - 1;
        int indexB = n - 1;
        int index = m + n -1;
        while(indexA >= 0 && indexB >= 0) {
            A[index--] = A[indexA] > B[indexB] ? A[indexA--] : B[indexB--];
        }
        while (indexB >= 0) {
            A[index--] = B[indexB--];
        }                              //notice:要注意判断条件，不要总是  !=   (特别要注意）
    }
}
