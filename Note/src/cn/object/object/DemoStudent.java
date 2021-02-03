package cn.object.object;
/*

导包：
import 包名称.类名称;
如果属于同一个包，可省略不写

创建：
类名称 对象名 = new 类名称();

*/

public class DemoStudent {
    public static void main(String[] args) {
        Student stu = new Student();

        //使用成员变量
        stu.name = "帆仔";
        stu.age = 18;
        System.out.println(stu.name);
        System.out.println(stu.age);

        //使用成员方法
        stu.eat();
        stu.sleep();
        stu.study();
    }
}
