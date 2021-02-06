package cn.object.JiCheng;

public class Teacher extends Employee {
    public Teacher() {
        System.out.println("子类构造方法");
    }

    @Override
    public void method() {
        System.out.println("子类方法执行");
    }
}
