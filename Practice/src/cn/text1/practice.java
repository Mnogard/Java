package cn.text1;

public class practice {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
/*
循环中定义变量min=0最小索引
max=arr.length‐1最大索引
min++,max‐‐
*/
        for (int min = 0, max = arr.length - 1; min <= max; min++, max--) {
//利用第三方变量完成数组中的元素交换
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }
// 反转后，遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
