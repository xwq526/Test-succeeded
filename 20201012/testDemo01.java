package com.company.Preview.day3.Test20201012;
import java.util.Scanner;
//1. 根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
public class testDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age<=18&&age>=0){
            System.out.println("当前年龄的人是少年");
        }else if(age>=19&&age<=28){
            System.out.println("当前年龄的人是青年");
        }else if (age>=29&&age<=55){
            System.out.println("当前年龄的人是中年");
        }else{
            System.out.println("当前年龄的人是老年");
        }
        sc.close();
    }
}
