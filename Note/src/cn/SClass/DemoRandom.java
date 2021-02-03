package cn.SClass;

import java.util.Random;

public class DemoRandom {
    public static void main(String[] args) {
        Random r = new Random();   //获取一个随机数

        int num = r.nextInt();
        System.out.println(num);

        int num1 = r.nextInt(10);
        System.out.println(num1);
    }
}
