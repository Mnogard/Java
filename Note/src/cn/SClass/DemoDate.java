package cn.SClass;

import java.util.Date;

public class DemoDate {
    public static void main(String[] args) {
        // 创建日期对象，把当前的时间
        System.out.println(new Date()); // Tue Jan 16 14:37:35 CST 2018
        // 创建日期对象，把当前的毫秒值转成日期对象
        System.out.println(new Date(142634524355L)); // Thu Jan 01 08:00:00 CST 1970
        System.out.println(new Date().getTime());
    }
}
