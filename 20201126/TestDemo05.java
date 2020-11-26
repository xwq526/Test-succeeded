package test20201126;


import java.util.*;

 class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        } else {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();


    }
}
public class TestDemo05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int n = scan.nextInt();
            int[] array = new int[n];
            for(int i = 0; i < n; i++) {
                array[i] = scan.nextInt();
            }
            System.out.println(func(array,n,40));
        }
    }
    public static int func(int[] array, int n,int weight) {
        if(weight == 0) {
            return 1;
        }
        if(n == 0) {
            return 0;
        }
        return func(array,n-1,weight -array[n-1]) + func(array,n-1,weight);


    }
}
