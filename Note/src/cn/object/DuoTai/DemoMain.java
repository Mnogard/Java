package cn.object.DuoTai;

public class DemoMain {
    public static void main(String[] args) {

        //对象的向上转型--父类引用指向子类对象
        Animal animal = new Cat();
        animal.eat();
        //animal.catchMouse();  错误：对象向上转型为父类，无法调用子类特有的方法

        //对象的向下转型--还原动作
        Cat cat = (Cat) animal;
        cat.catchMouse();

        Cat c = new Cat();
        showAnimalEat(c);
    }

    public static void showAnimalEat(Animal a) {
        a.eat();
    }
}
