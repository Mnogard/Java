package cn.SClass;

import java.util.Scanner;

//导包（只有java.lang包下的内容不需要导包）

public class DemoScanner {
    public static void main(String[] args) {

        //System.in代表从键盘进行输入
        Scanner sc = new Scanner(System.in);

        //获取键盘输入的一个int数字
        int num = sc.nextInt();
        System.out.println("输入的Int数字是：" + num);

        //获取键盘输入的一个字符串
        String str = sc.next();
        System.out.println("输入的字符串是：" + str);
    }
}
