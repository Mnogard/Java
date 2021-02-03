package cn.object.FengZhuang;

public class Person {
    private String name;
    private int age;
    private boolean male;  //性别

    // 无参数构造方法
    public Person() {
        System.out.println("调用无参构造！");
    }
    // 有参数构造方法
    public Person(String name,int age,boolean male) {
        System.out.println("调用全参构造！");
        this.name = name;
        this.age = age;
        this.male = male;
    }

    //如果需要修改对象中成员变量的数据内容，仍需要set
    public void setMale(boolean male) {
        this.male = male;
    }

    public boolean isMale() {
        return male;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

