package cn.object.DuoTai;

public class DemoInstanceof {
    public static void main(String[] args) {

        //对象的向上转型--父类引用指向子类对象
        Animal animal = new Cat();
        animal.eat();

        //对象名 instanceof 类名
        //返回boolean结果，判断前面的对象能不能当作后面类型的实例（判断animal是不是Cat）
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }

    }
}
