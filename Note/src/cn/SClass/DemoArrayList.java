package cn.SClass;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);  //如果list内容为空，直接打印得到的不是地址值，而是[]

        //添加元素
        list.add("呆呆");
        list.add("帆仔");

        System.out.println(list);

        //public E get(int index):返回指定索引处的元素
        System.out.println("get: "+list.get(0));
        System.out.println("get: "+list.get(1));

        //public int size():返回集合中的元素的个数
        System.out.println("size: "+list.size());

        //public E remove(int index):删除指定索引处的元素，返回被删除的元素
        System.out.println("remove: "+list.remove(0));

        //遍历输出
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
