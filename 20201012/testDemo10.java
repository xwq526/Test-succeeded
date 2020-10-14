package com.company.Preview.day3.Test20201012;

import java.util.Scanner;
//
// 10. 编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输入，最多输入三次。三次均错，则提示退出程序
public class testDemo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 3;
        while(count!=0){
            System.out.println("请输入密码：");
            String password = scanner.nextLine();
            if (password.equals("123456")){
                System.out.println("密码正确");
                break;
            }else{
                System.out.println("密码错误");
                count--;
                System.out.println("你还有"+count+"次机会");
            }

        }
        scanner.close();
    }
    public static void main0(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        int passsword=123;
        while (i<3){
            System.out.println("请输入密码：");
            int b=sc.nextInt();
            if (b==passsword){
                System.out.println("登录成功");
                break;
            }else{
                System.out.println("密码错误");
            }
            i++;
        }
        sc.close();
    }
}
