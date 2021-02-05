package cn.SClass;

import java.util.Arrays;

public class DemoArrays {
    public static void main(String[] args) {
        // 定义int 数组
        int[] arr = {2,34,35,4,657,8,69,9};

        // 打印数组,输出地址值
        System.out.println(arr); // [I@2ac1fdc4

        // 数组内容转为字符串
        String s = Arrays.toString(arr);

        // 打印字符串,输出内容
        System.out.println(s); // [2, 34, 35, 4, 657, 8, 69, 9]

        // 定义int 数组
        int[] arr1 = {24, 7, 5, 48, 4, 46, 35, 11, 6, 2};
        System.out.println("排序前:"+ Arrays.toString(arr1)); // 排序前:[24, 7, 5, 48, 4, 46, 35, 11, 6, 2]
        // 升序排序
        Arrays.sort(arr1);
        System.out.println("排序后:"+ Arrays.toString(arr1));// 排序后:[2, 4, 5, 6, 7, 11, 24, 35, 46, 48]
    }
}
