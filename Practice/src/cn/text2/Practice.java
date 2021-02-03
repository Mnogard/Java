package cn.text2;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

//        Student one = new Student("呆呆  ",18);
//        Student two = new Student("帆仔  ",19);
//
//        list.add(one);
//        list.add(two);


        list.add(new Student("呆呆  ",18));
        list.add(new Student("帆仔  ",19));


        for(int i = 0; i < list.size(); i++) {
//            Student stu = list.get(i);
//            System.out.println(stu.getName() + stu.getAge());
            System.out.println(list.get(i).getName() + list.get(i).getAge());
        }
    }
}
