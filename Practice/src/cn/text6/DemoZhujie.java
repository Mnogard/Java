package cn.text6;

public class DemoZhujie {
    public static void main(String[] args) {
        int a = 10;
        method();
    }

    @Deprecated
    public void method() {
        System.out.println("过时");
    }
}
