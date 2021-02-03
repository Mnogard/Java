package cn.object.FengZhuang;

public class DemoPerson {
    public static void main(String[] args) {
        Person p = new Person();   //调用无餐构造
        Person p1 = new Person("呆呆",19,false);  //调用全参构造

        p.setName("帆仔");
        p.setAge(18);
        p.setMale(true);

        System.out.println("姓名: " + p.getName());
        System.out.println("年龄: " + p.getAge());
        System.out.println("是不是男孩纸: " + p.isMale());
    }
}
