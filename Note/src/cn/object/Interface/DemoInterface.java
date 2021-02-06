package cn.object.Interface;

public class DemoInterface {

    public static void main(String[] args) {
        //MyInterfaceAbstract inter = new MyInterfaceAbstract();  错误，不能直接new接口

        //创建实现类
        MyInterfaceAbstractImpl inter = new MyInterfaceAbstractImpl();
        inter.methods1();
        inter.methods2();
        inter.methods3();
        inter.methods4();
    }
}
