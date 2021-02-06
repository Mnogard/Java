package cn.object.DuoTai;

/*
格式：
父类名 对象名 = new 子类名();
接口名 对象名 = new 实现类名();
*/

public class DemoMulti {
    public static void main(String[] args) {
        //多态写法
        Fu obj = new Zi();
        obj.method();
        obj.methodFu();
    }
}
