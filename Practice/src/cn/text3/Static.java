package cn.text3;

public class Static {
    int num;
    static int numStatic;

    public void method() {
        System.out.println(num);  //正确
        System.out.println(numStatic);  //正确
    }

    public static void methodStatic(String[] args) {
        //System.out.println(num);  //错误
        System.out.println(numStatic);  //正确
    }
}
