package cn.object.Static;

public class DemoStatic {
    public static void main(String[] args) {
        Student s1 = new Student("帆仔", 20);
        s1.room = "101教室";
        Student s2 = new Student("呆呆", 18);

        System.out.println(s1.getName() + " " + s1.getAge() + " " + s1.room);
        System.out.println(s2.getName() + " " + s2.getAge() + " " + Student.room);
    }
}