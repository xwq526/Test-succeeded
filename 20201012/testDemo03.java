package com.company.Preview.day3.Test20201012;
//打印 1 - 100 之间所有的素数
public class testDemo03 {
    public static void main(String[] args) {
        for (int j = 1; j<=100; j++) {
            int n=j;
            if(n<=0){
                System.out.println(n+"不是素数");
                return;
            }
            int i=2;
            for (; i <=Math.sqrt(n); i++) {
                if (n%i==0){
                    System.out.println(n+"不是素数");
                    break;
                }
            }
            if (i>Math.sqrt(n)){
                System.out.println(n+"是素数");
            }

        }
    }
    public static void main0(String[] args) {
        int num=1;
        while (num<=100){
            boolean flag =true;
            if (num<2){
                flag=false;
            }else {
                for (int i = 2; i <num; i++) {
                    if (num%i==0){
                        flag=false;
                    }
                }
            }
            if (flag){
                System.out.println(num);
            }
            num++;
        }

    }
}


