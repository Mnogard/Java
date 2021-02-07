# Java

------

## 1  基础

------

### 1.1 前言

+ **JVM（Java Virtual Machine）：**`Java`虚拟机   简称`JVM`，是运行所有`Java`程序的假想计算机，是Java程序的运行环境，是Java 最具吸引力的特性之一，我们编写的`Java`代码，都运行在 `JVM `之上

+ **JRE (Java Runtime Environment) ：**是`Java`程序的运行时环境，包含 `JVM `和运行时所需要的 核心类库

+ **JDK (Java Development Kit)：**是`Java`程序开发工具包，包含`JRE` 和开发人员使用的工具

------

### 1.2 名称命名规范

+ **包名:** 多单词组成时所有字母都小写: **`xxxyyyzzz`**

+ **类名、接口名:** 多单词组成时，所有单词的首字母大写: **`XxxYyyZzz`**

+ **变量名、方法名:** 多单词组成时，第一个单词首字母小写，第二个单词开始每个 单词首字母大写: **`xxxYyyZzz`**

+ **常量名:** 所有字母都大写。多单词时每个单词用下划线连接: **`XXX_YYY_ZZZ`**

------

### 1.3 数据类型

|数据类型|关键字|内存占用|
|:----:|:----:|:----:|
|字节型|byte|1|
|短整型|short|2|
|整型|int|4|
|长整型|long|8|
|单精度浮点数|float|4|
|双精度浮点数|double|8|
|字符型|char|2|
|布尔型|boolean|1|


- **boolean** 类型数据只允许取值 **`true`** 和 **`false`**，无 **`null`**（不可以使用 `0` 或`非 0` 的整数替代 `false` 和 `true`，这点和C语言不同）

- **Java** 的浮点型常量默认为 **`double`** 型，声明**`float`** 型常量，须后加 ‘**f**’或 ‘**F**’

- 变量只能小的赋给大的，大给小会放不下（不同于C++）

将 **1.5** 赋值到 **`int`** 类型变量会发生编译失败，无法赋值

```java
int i = 1.5;   // 错误
i = i + 1.5;   // 错误
i += 1.5;      // 正确 相当于 i = (double)(i + 1);
```
**`+=`**有强转类型功能

------

### 1.4 方法

+ **方法：**就是将一个**功能**抽取出来，把代码单独定义在一个大括号内，形成一个单独的功能（类似于C++类中的函数）

```java
public class Java{
    public static void main(String[] args) {
    		//调用定义的方法method
    		method();
		}
		//定义方法，被main方法调用
		public static void method() {
				System.out.println("自己定义的方法，需要被main调用运行");
		}
}
```

------

### 1.5 IDEA快捷键

|          快捷键          |         功能         |
| :----------------------: | :------------------: |
|      `Alt + Enter`       | 导入包，自动修正代码 |
|        `Ctrl + Y`        |    删除光标所在行    |
|     `Ctrl + Alt + L`     |      格式化代码      |
| `Alt + Shift + 上下箭头` |    移动当前代码行    |

------

### 1.6 Java虚拟机的内存划分

| 五大区                           | 介绍                                                         |
| -------------------------------- | ------------------------------------------------------------ |
| 栈（Stack）                      | 存放方法中的局部变量（方法的参数、方法内部的变量、方法的运行），一旦超出作用域，立刻从栈中消失 |
| 堆（Heap）                       | new出的对象，都有地址值和默认值                              |
| 方法区（Method Area)             | 存储class相关信息                                            |
| 本地方法栈（Native Method Stack) | JVM在使用操作系统功能的时候使用，和我们开发无关              |
| 寄存器(Pc Register)              | 给CPU使用，和我们开发无关                                    |

## 2 数组

------

### 2.1 定义

+ 格式1：

  ```java
  数据类型[] 数组名字 = new 数据类型[长度];
  int[] arr = new int[3];
  ```

+ 格式2：

  ```java
  数据类型[] 数组名 = new 数据类型[]{元素1,元素2,元素3...};
  int[] arr = new int[]{1,2,3,4,5};
  ```

+ 格式3：

  ```java
  数据类型[] 数组名 = {元素1,元素2,元素3...};
  int[] arr = {1,2,3,4,5};
  ```

### 2.2 数组的访问

+ 数组默认值

```java
整型：默认 0
浮点型：默认 0.0
字符型：默认 ‘\u0000’
布尔型：默认 false
引用型：默认 null
```

+ `数组名.length`

```java
public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5};
		//打印数组的属性，输出结果是5
		System.out.println(arr.length);
}
```

### 2.3 数组最大值

```java
public static void main(String[] args) {
    int[] arr = {5, 15, 2000, 10000, 100, 4000};
    //定义变量，保存数组中0索引的元素
    int max = arr[0];
    //遍历数组，取出每个元素
    for (int i = 0; i < arr.length; i++) {
    	//遍历到的元素和变量max比较
    	//如果数组元素大于max
    	if (arr[i] > max) {
				//max记录住大值
				max = arr[i];
    	}
  	}
  System.out.println("数组最大值是： " + max);
}
```

### 2.4 数组反转

```java
public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
    for (int min = 0, max = arr.length - 1; min < max; min++, max--) {
       //利用第三方变量完成数组中的元素交换
			 int temp = arr[min];
       arr[min] = arr[max];
       arr[max] = temp;
     }
     // 反转后，遍历数组
     for (int i = 0; i < arr.length; i++) {
       System.out.println(arr[i]);
     }
}
```

### 2.5 数组作为方法返回值

+ 数组作为方法的返回值，返回的是数组的内存地址

```java
public static void main(String[] args) {
    int[] arr = getArray();
    for (int i = 0; i < arr.length; i++) {
       System.out.println(arr[i]);
    }
}
public static int[] getArray() {
    int[] arr = {1, 3, 5, 7, 9};
    return arr;
}
```

+ C++实现

```C++
//方法一
int *getArray(){
    int *arr = new int[5] {1, 3, 5, 7, 9};
    return arr;
}
//方法二
int *getArray()
{
    static int arr[] = {1,3,5,7,9};
    return arr;
}
int main(){
    int *arr1 = getArray();
    for(int i = 0; i < 5; i++){
        cout << arr1[i] << endl;
    }
    return 0;
}
```

## 3 类和对象

------

### 3.1 对象的调用

```java
public class Student {
    String name;
    int age;

    public void eat(){
        System.out.println("吃饭饭");
    }

    public void sleep(){
        System.out.println("睡觉觉");
    }

    public void study(){
        System.out.println("学习");
    }
}
--------------------------------------------------
/*
导包：
import 包名称.类名称;
如果属于同一个包，可省略不写

创建：
类名称 对象名 = new 类名称();
*/

public class DemoStudent {
    public static void main(String[] args) {
        Student stu = new Student();

        //使用成员变量
        stu.name = "帆仔";
        stu.age = 18;
        System.out.println(stu.name);
        System.out.println(stu.age);

        //使用成员方法
        stu.eat();
        stu.sleep();
        stu.study();
    }
}
```

有一个对象作为参数，传递到方法当中时，实际上传递进去的是对象的 **`地址值`**

------

### 3.2 局部变量 & 成员变量

|   变量   |  初始值  | 内存位置 |               生命周期               |
| :------: | :------: | :------: | :----------------------------------: |
| 成员变量 | 有默认值 |  堆内存  |   随着对象的创建而存在，消失而消失   |
| 局部变量 | 无默认值 |  栈内存  | 随着方法的调用而存在，方法调用完消失 |

+ 访问成员变量的两种方式
  + 直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找
  + 间接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上找
+ 访问成员方法
  + new的是谁，就优先用谁，没有则向上找

------

### 3.3 标准代码 -- Java Bean

`Java Bean` 是 `Java`语言编写类的一种标准规范。符合 `Java Bean` 的类，要求类必须是具体的和公共的，并且具有无参数的构造方法，提供用来操作成员变量的 `set` 和 `get` 方法

```java
public class ClassName{
//成员变量
//构造方法
//无参构造方法【必须】
//有参构造方法【建议】
//成员方法
//getXxx()
//setXxx()
//isXxx()  boolean获取用is
}
```

----

### 3.4 static 关键字

关于 static 关键字的使用，它可以用来修饰的成员变量和成员方法，被修饰的成员是属于类的，而不是单单是属于某个对象的。也就是说，既然属于类，就可以不靠创建对象来调用了。

+ 类变量

当 `static` 修饰成员变量时，该变量称为类变量。该类的每个对象都共享同一个类变量的值。任何对象都可以更改该类变量的值，但也可以在不创建该类的对象的情况下对类变量进行操作。

```java
//Student.java
public class Student {
    private String name;
    private int age;

    static String room;  //所在教室

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
//---------------------------------------------------------
//Demojava.java
public class DemoStatic {
    public static void main(String[] args) {
        Student s1 = new Student("帆仔", 20);
        s1.room = "101教室";
        Student s2 = new Student("呆呆", 18);

        System.out.println(s1.getName() + " " + s1.getAge() + " " + s1.room);   // 帆仔 20 101教室
        System.out.println(s2.getName() + " " + s2.getAge() + " " + s2.room);  // 呆呆 18 101教室
      	System.out.println(s2.getName() + " " + s2.getAge() + " " + Student.room);  // 呆呆 18 101教室（建议：类名.类变量名；）
    }
}

```

+ 静态方法

当 `static` 修饰成员方法时，该方法称为**静态方法** ，属于类，而不是对象。静态方法在声明中有 `static` ，建议使用类名来调用，而不需要创建类的对象。调用方式非常简单。

```java
// 访问类变量
类名.类变量名；

// 调用静态方法(建议)
类名.静态方法名(参数)；
// 对于本类中的静态方法，可以省略类名称
静态方法名(参数)； 
```

**注意：**静态不能访问非静态（在内存中先有静态内容，后有非静态内容--先人不知道后人，同时静态不能使用`this`指针）

```java
public class Static {
    int num;
    static int numStatic;
    
    public void method() {
        System.out.println(num);  //正确
        System.out.println(numStatic);  //正确
    }
    
    public static void methodStatic(String[] args) {
        System.out.println(num);  //错误--静态不能访问非静态
        System.out.println(numStatic);  //正确
    }
}
```

+ 静态代码块

```java
public class ClassName{
	static {
	// 执行语句
	}
}
```

​	作用：给类变量进行初始化赋值。用法演示，代码如下：

```java
public class Game {
	public static int number;
	public static ArrayList<String> list;
  
	static {
		// 给类变量赋值
		number = 2;
		list = new ArrayList<String>();
		// 添加元素到集合中
		list.add("张三");
		list.add("李四");
		}
}
```
>特点：当第一次用到本类时，静态代码块执行唯一一次。静态内容优先非静态，因此静态代码块比构造方法先执行（每次new都会执行构造，但静态代码块只运行一次）
>
>用途：用来一次性的对静态成员变量进行赋值
---

### 3.5 final 关键字

**final**： 不可改变，可以用于修饰类、方法和变量

+ **类：**被修饰的类，不能被继承

```java
//类：被修饰的类，不能被继承
public final class 类名 {
  
}
```

+ **方法：**被修饰的方法，不能被重写

```java
修饰符 final 返回值类型 方法名(参数列表) {
  //方法体
}
```

> 对于方法，`abstract`和`final`关键字不能同时使用，因为矛盾

+ **变量：**被修饰的变量，不能被重新赋值

1. 局部变量——基本类型

```java
public class FinalDemo1 {
	public static void main(String[] args) {
		// 声明变量，使用final修饰
		final int a;
		// 第一次赋值
		a = 10;
		// 第二次赋值
		a = 20; // 报错,不可重新赋值
    
		// 声明变量，直接赋值，使用final修饰
		final int b = 10;
		// 第二次赋值
		b = 20; // 报错,不可重新赋值
	}
}
```
2. 局部变量——引用类型

```java
public class FinalDemo2 {
	public static void main(String[] args) {
		// 创建 User 对象
		final User u = new User();
		// 创建 另一个 User对象
		u = new User(); // 报错，指向了新的对象，地址值改变。
		// 调用setName方法
		u.setName("张三"); // 可以修改
	}
}
```
> 引用类型的局部变量，被`final`修饰后，只能指向一个对象，地址不能再更改，但是不影响对象内部的成员变量值的修改

3. 成员变量

```java
//显示初始化；
public class User {
	final String USERNAME = "张三";
	private int age;
}

//构造方法初始化。
public class User {
	final String USERNAME ;
	private int age;
	public User(String username, int age) {
		this.USERNAME = username;
		this.age = age;
	}
}
```

> 由于成员变量具有默认值，因此用`final`修饰后，必须手动赋值
>
> 被`final`修饰的常量名称，一般都有书写规范，所有**字母都大写**

---

### 3.6 权限修饰符

四种修饰符：public  >  protected  >  （ default ） >  private

> `default`系统默认状态下的修饰符，不写
>
> 不加权限修饰符，其访问能力与`default`修饰符相同

|                          | public | protected | default | private |
| :----------------------: | :----: | :-------: | :-----: | :-----: |
|         同一类中         |   √    |     √     |    √    |    √    |
| 同一包中（子类与无关类） |   √    |     √     |    √    |         |
|       不同包的子类       |   √    |     √     |         |         |
|     不同包中的无关类     |   √    |           |         |         |

编写代码时，如果没有特殊的考虑，建议这样使用权限：

1. 成员变量使用 `private` ，隐藏细节。
2. 构造方法使用 `public` ，方便创建对象。
3. 成员方法使用 `public` ，方便调用方法。

>内部类的权限修饰符
>
>外部类：public /  ( default )
>成员内部类：public / protected /  ( default )  / private
>局部内部类：什么都不能写

---

### 3.7 内部类

将一个类**A**定义在另一个类**B**里面，里面的那个类**A**就称为**内部类**，**B**则称为**外部类**

+ 成员内部类

```java
修饰符 class 外部类 {
	修饰符 class 内部类 {
	}
}
```

> 内用外，随意访问；外用内，需要内部类对象

​	访问：

```java
间接访问：
  在外部类的方法中，使用内部类，然后main调用外部类的方法
直接访问：
  外部类名.内部类名 对象名 = new 外部类型().new 内部类型()；
```

```java
//Body.java
public class Body {  //外部类
  public class Heart {  //内部类
    //内部类方法
    public void beat () {
      System.out.println("心脏跳动：蹦蹦蹦！");
      Syetem.out.println("我叫：" + name);   //内用外
    }
  }
  
  //外部类的成员变量
  private String name;
  //外部类的方法（间接访问）
  public void methodBody() {
    System.out.println("外部类的方法！");
    new Heart().beat();
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name
  }
}

//DemoInnerClass.java
public class DemoInnerClass {
  public static void main(String[] args) {
    //间接访问
    Body body = new Body();  //外部类的对象
    body.methodBody();
    System.out.println("------------------------");
    
    //直接访问
    Body.Heart heart = new Body().new Heart();
    heart.beat();
  }
}

输出结果:
心脏跳动：蹦蹦蹦！
我叫：null
------------------------
心脏跳动：蹦蹦蹦！
我叫：null
```

+ 局部内部类

局部内部类：定义在一个方法内部的类（只有当前所属的方法可以使用，出了方法不可用）

```java
//Outer.java
public class Outer {
  public void mdthodOuter() {
    
    class Inner {  //局部内部类
      int num = 10;
      public void methodInner() {
        System.out.println(num);  // 10
      }
    }
    Inner inner = new Inner();
    inner.methodInner();
    
  }
}

//DemoMain.java
public class DemoMain {
  public static void main(String[] args) {
    Outer obj = new Outer();
    obj.methodOuter();
  }
}

运行结果：
10
```


> 
>如果访问所在方法的局部变量，那么这个局部变量必须是「`有效final的`」
> ```java
> //只要局部变量不改变，final关键字可以省略
> public class Outer {
>   	public void mdthodOuter() {
>     
>     		class Inner { 
>       		int num = 10;  //不可改变
>          //final int num = 10;
>       		public void methodInner() {
>        		System.out.println(num);  
>    			}
>    		}
>    	}
>     }
>   ```
> 
> new出来的对象在堆内存中，局部变量在栈内存中跟着方法走，方法运行结束后，立刻出栈，局部变量会立刻消失，但是new出来的对象会在堆内存中持续存在，直到回收

+ 匿名内部类

匿名内部类 ：是内部类的简化写法。它的本质是一个 `带具体实现的` `父类或者父接口的` `匿名的` 子类对象
前提：匿名内部类必须继承一个父类或者实现一个父接口

使用场景：接口的实现类（或者是父类的子类）只需使用唯一的一次

```java
父类名或接口名 对象名 = new 父类名或者接口名() {
	@Override  // 方法重写
	public void method() {
		// 执行语句
	}
};
```
> 在创建对象的时候，只能使用唯一一次
>
> 匿名内部类省略「实现类/子类名称」，匿名对象省略「对象名称」

+ 内部类的同名变量访问

```java
//外部类.this.外部类成员变量名
public class Outer {
  int num = 10;  //外部类成员变量
  
  public class Inner {
    int num = 20;  //内部类成员变量
    
    public void methodInner() {
      int num = 30;  /内部类局部变量
      System.out.println(num);  // 30
      System.out.println(this.num);  // 20
      System.out.println(Outer.this.num);  // 10
    }
  }
}
```







## 4 封装、继承、多态

---

### 4.1 封装

+ **this使用：**区分重名`（通过谁调用的方法，谁就是this）`

```java
public class Person {
    private String name;
    private boolean male;  //性别

    public void setMale(boolean male) {   //设置用set
        this.male = male;
    }

    public boolean isMale() {   //性别的获取用is，其他用get
        return male;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

+ **构造方法**（相当于C++构造函数：不写void、不可返回值）

```java
修饰符 构造方法名(参数列表) {
// 方法体
}
```

```java
public class Student {
    private String name;
    private int age;
    // 无参数构造方法（new对象调用 Person p = new Person();）
    public Student() {}
    // 有参数构造方法
    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }
}
```

**例子：**

```java
//person.java
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

```

```java
//DemoPerson.java
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
```

运行结果：

```java
调用无参构造！
调用全参构造！
姓名: 帆仔
年龄: 18
是不是男孩纸: true
Process finished with exit code 0
```

---

### 4.2 继承

+ 通过 `extends` 关键字，可以声明一个子类继承另外一个父类

```java
class 父类 {
	...
}
class 子类 extends 父类 {
	...
}
```

>**重名问题：**
>
>子父类中出现了同名的成员变量时，在子类中需要访问父类中非私有成员变量时，需要使用 `super` 关键字，修饰父类成员变量，类似于之前学过的 `this`

+ 通过`@Override`可以检测是否是重写

```java
public class Employee {
    public void method() {
        System.out.println("父类方法执行！");
    }
}
//----------------------------------------------
public class Teacher extends Employee {
    @Override   //建议写上，防止出错
    public void method() {
        System.out.println("子类方法执行");
    }
}
```

>**方法重写问题：**
>
>子类方法的返回值必须**小于等于**父类方法的返回值范围
>
>子类方法的权限必须**大于等于**父类方法的权限修饰符（
>
>父：private 子：public   正确
>
>父：public  子：private  错误

+ 构造方法

  + 构造方法的名字是与类名一致的，所以子类是无法继承父类构造方法的
  + 构造方法的作用是初始化成员变量的。所以子类的初始化过程中，必须先执行父类的初始化动作。子类的构造方法中默认有一个 `super()` ，表示调用父类的构造方法，父类成员变量初始化后，才可以给子类使用

```java
class Fu {
	private int n;
	public Fu(){
		System.out.println("Fu()");
	}
}

class Zi extends Fu {
	public Zi(){
		//super();   默认调用父类构造
    //super（20）  子类可以通过super调用父类重载构造
		System.out.println("Zi()");
	}
}

public class DemoExtends{
	public static void main (String args[]){
	Zi zi = new Zi();
	}
}

输出结果：
Fu（）
Zi（）
```

>**super 关键字用法：**
>
>1. 在子类的成员方法中，访问父类的成员变量
>2. 在子类的成员方法中，访问父类的成员方法
>3. 在子类的构造方法中，访问父类的构造方法

> `this`: 代表当前对象的引用，访问本类的内容（谁调用代表谁）
> `super`: 代表父类的存储空间标识，访问父类的内容（父亲的引用）
>
> ```java
> this.成员变量   // 本类的
> super.成员变量   // 父类的
>   
> this.成员方法名()  // 本类的
> super.成员方法名()  // 父类的
> ```

+ **抽象类**

父类中的方法，被它的子类们重写，子类各自的实现都不尽相同。那么父类的方法声明和方法主体，只有声明还有意义，而方法主体则没有存在的意义了。我们把没有方法主体的方法称为抽象方法。Java语法规定，包含抽象方法的类就是抽象类。

使用 `abstract` 关键字修饰方法，该方法就成了抽象方法，抽象方法只包含一个方法名，而没有方法体，如果一个类包含抽象方法，那么该类必须是抽象类

```java
修饰符 abstract class 类名字 {
  修饰符 abstract 返回值类型 方法名 (参数列表)；
}
  
public abstract class 类名字 {
  public abstract void run()；
}
```

> 不能直接new抽象类对象
>
> > 理解：假设创建了抽象类的对象，调用抽象的方法，而抽象方法没有具体的方法体，没有意义

> 抽象类的子类，必须重写抽象父类中所有的抽象方法，否则，编译无法通过而报错。除非该子类也是抽象类

　📎 [内存分析](#继承内存分析)

---

### 4.3 接口

接口的定义，它与定义类方式相似，但是使用 `interface` 关键字。它也会被编译成`.class`文件，但一定要明确它并不是类，而是另外一种引用数据类型。

接口的使用，它不能创建对象，但是可以被实现（ `implements` ，类似于被继承）。一个实现接口的类（可以看做是接口的子类），需要实现接口中所有的抽象方法，创建该类对象，就可以调用方法了，否则它必须是一个抽象类。

> Java 7
> 1. 常量
> 2. 抽象方法
>
> Java 8
> 3. 默认方法
> 4. 静态方法
>
> Java 9 
>
> 5. 私有方法

```java
public interface 接口名称 {
// 抽象方法
// 默认方法
// 静态方法
// 私有方法
}
//--------------------------------------------------------------------------
//接口当中的抽象方法，修饰符必须是固定的关键字：public abstract （可选择性省略）
public interface MyInterfaceAbstract {

    //抽象方法
		//[public] [abstract] 返回值类型 方法名称（参数列表); 
    public abstract void methods1();
    abstract void methods2();
    public void methods3();
    void methods4();
  
  	//默认方法
		//[public] [default] 返回值类型 方法名称（参数列表）{方法体}
  	public default void fly(){
			System.out.println("天上飞");
      
    //静态方法
		//[public] static 返回值类型 方法名称（参数列表）{方法体}
		}
}
```

> 默认方法：接口类中增加默认方法（接口升级），实现类中无需重写便可调用（抽象方法需重写），也可以重写覆盖
>
> **注意：**不能通过接口实现类的对象来调用接口当中的**静态方法**
>
> ```java
> 正确用法：通过接口名称直接调用静态方法
> 接口名称.静态方法名(参数);
> ```

+ 私有方法

如果一个接口中有多个默认方法，并且方法中有重复的内容，那么可以抽取出来，封装到私有方法中，供默认方法
去调用

**私有方法：**解决多个默认方法之间重复代码问题（只有默认方法可以调用）
**私有静态方法：**解决多个静态方法之间重复代码问题（默认方法和静态方法可以调用）

```java
//私有方法：
//private 返回值类型 方法名（参数列表）{方法体}

//静态私有方法：
//private static 返回值类型 方法名（参数列表）{方法体}

public interface MyInterfacePrivate {
  public default void mdthodDefault1() {
    System.out.println("默认方法1");
    methodCommon();
  }
  
  public default void mdthodDefault2() {
    System.out.println("默认方法2");
    methodCommon();
  }
  
  private void mdthodDefault1() {
    System.out.println("AAA");
    System.out.println("BBB");
    System.out.println("CCC");
  }
}
```

+ 接口使用：

```java
public class 实现类名 implements 接口名 {
	// 重写接口中抽象方法【必须】
	// 重写接口中默认方法【可选】
}

//------------------------------------------------------------------
public class DemoInterface {
    public static void main(String[] args) {
        //MyInterfaceAbstract inter = new MyInterfaceAbstract();  错误，不能直接new接口
        //创建实现类
        MyInterfaceAbstractImpl inter = new MyInterfaceAbstractImpl();
        inter.methods();
    }
}
//------------------------------------------------------------------
public interface MyInterfaceAbstract {
    //抽象方法
    public abstract void methods();
}
//------------------------------------------------------------------
public class MyInterfaceAbstractImpl implements MyInterfaceAbstract {
    @Override
    public void methods() {
        System.out.println("方法");
    }
}

```

+ 接口的常量

接口中可以定义“成员变量”，但必须使用public static final关键字进行修饰（可以省略关键字）

```java
//格式：[public] [static] [final] 数据类型 常量名 = 数据值;

public interface MyInterfaceConst {
    //这其实就是一个常量，一旦赋值，不可修改
    public static final int NUM = 10;  //final不可变
    //可以省略关键字
}
```

> 接口中的常量必须进行赋值（要是默认值设置，不能修改，那毫无意义）
>
> 接口中的常量需要大写，用下划线分隔

> **接口备注：**
>
> 接口没有静态代码块和构造方法

+ 接口的多实现

一个类的直接父类是唯一的，但是一个类可以同时实现多个接口

```java
public class 类名 [extends 父类名] implements 接口名1,接口名2,接口名3... {
// 重写接口中抽象方法【必须】
// 重写接口中默认方法【不重名时可选】
}
```

> 抽象方法：
>
> > 接口中，有多个抽象方法时，实现类必须重写所有抽象方法（如果抽象方法有重名的，只需要重写一次）
> >
> > 如果实现类没有覆盖重写所有接口当中的抽象方法，那么实现类必须写成抽象类`public abstract` class`

> 默认方法：
>
> > 接口中，有多个默认方法时，实现类都可继承使用（如果默认方法有重名的，必须重写一次）
> >
> > 如果父类中的方法和接口中的默认方法产生了冲突，优先使用父类中的方法

> 静态方法：
>
> > 接口中，存在同名的静态方法并不会冲突，原因是只能通过各自接口名访问静态方法

+ 接口的多继承

一个接口能继承另一个或者多个接口，这和类之间的继承比较相似。接口的继承使用 `extends` 关键字，子接口继承父接口的方法。如果父接口中的默认方法有重名的，那么子接口需要重写一次（抽象方法重复，没关系，因为没有方法体，没有具体的实现）

```java
//定义父类接口
public interface A {
	public default void method(){
	System.out.println("AAAAAAAAAAAAAAAAAAA");
	}
}

public interface B {
	public default void method(){
	System.out.println("BBBBBBBBBBBBBBBBBBB");
	}
}

//定义子类接口
public interface D extends A,B{
	@Override
	public default void method() {
	System.out.println("DDDDDDDDDDDDDD");
	}
}
```

>⚠️
> **子接口**重写默认方法时，default关键字需要保留。
> **子类**重写默认方法时，default关键字不可以保留。

### 4.4 多态

多态： 是指同一行为，具有多个不同表现形式。

```java
父类类型 变量名 = new 子类对象；
变量名.方法名();
```

> 当使用多态方式调用方法时，首先检查父类中是否有该方法，如果没有，则编译错误；如果有，执行的是子类重写后方法

```java
public class DemoMain {
    public static void main(String[] args) {
        Cat c = new Cat();
        showAnimalEat(c);
    }

    public static void showAnimalEat(Animal a) {
        a.eat();
    }
}
```

+ *对象的向上向下转型**

```java
//Animal.java
public abstract class Animal {
    public abstract void eat();
}

//Cat.java
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼！");
    }

    //子类特有方法
    public void catchMouse() {
        System.out.println("猫抓老鼠！");
    }
}

//DemoMain.java
public class DemoMain {
    public static void main(String[] args) {

        //对象的向上转型--父类引用指向子类对象
        Animal animal = new Cat();
        animal.eat();
        //animal.catchMouse();  错误：对象向上转型为父类，无法调用子类特有的方法

        //对象的向下转型--还原动作
        Cat cat = (Cat) animal;
        cat.catchMouse();
    }
}
```

+ **Interfaceof 关键字**

```java
//DemoInterfaceof.java
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
```



## 5 常用类

------

### 5.1 Scanner 类

使用Scanner类，完成接收键盘录入数据的操作，代码如下：

```java
import java.util.Scanner;    //导包（只有java.lang包下的内容不需要导包）

public class DemoScanner {
    public static void main(String[] args) {

        //System.in代表从键盘进行输入
        Scanner sc = new Scanner(System.in);

        //获取键盘输入的一个int数字
        int num = sc.nextInt();
        System.out.println("输入的Int数字是：" + num);

        //获取键盘输入的一个字符串
        String str = sc.next();
        System.out.println("输入的字符串是：" + str);
    }
}
```

---

### 5.2 Random 类

此类的实例用于生成伪随机数

```java
import java.util.Random;

public class DemoRandom {
    public static void main(String[] args) {
        Random r = new Random();   //获取一个随机数

        int num = r.nextInt();
        System.out.println(num);

        int num1 = r.nextInt(10);  //获取一个 [0,10) 的随机数
        System.out.println(num1);
    }
}
```

---

### 5.3 ArrayList 类

ArrayList 是大小可变的数组的实现（数组必须定义大小，一旦定义不可变化）

> `public boolean add(E e)` ：将指定的元素添加到此集合的尾部。
> `public E remove(int index)` ：移除此集合中指定位置上的元素，返回被删除的元素。
> `public E get(int index)` ：返回此集合中指定位置上的元素，返回获取的元素。
> `public int size()` ：返回此集合中的元素数。遍历集合时，可以控制索引范围，防止越界。

```java
import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);  //如果list内容为空，直接打印得到的不是地址值，而是[]

        //添加元素
        list.add("呆呆");
        list.add("帆仔");
        System.out.println(list);

        //public E get(int index):返回指定索引处的元素
        System.out.println("get: "+list.get(0));
        System.out.println("get: "+list.get(1));

        //public int size():返回集合中的元素的个数
        System.out.println("size: "+list.size());

        //public E remove(int index):删除指定索引处的元素，返回被删除的元素
        System.out.println("remove: "+list.remove(0));

        //遍历输出
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
```

运行结果：

```java
[]
[呆呆, 帆仔]
get: 呆呆
get: 帆仔
size: 2
remove: 呆呆
帆仔
Process finished with exit code 0
```

+ 其他数据类型的ArrayList

ArrayList对象不能存储基本类型，只能存储引用类型的数据。类似 `<int>` 不能写，但是存储基本数据类型对应的包装类型是可以的。所以，想要存储基本类型数据， `<>` 中的数据类型，必须转换后才能编写，转换写法如下：

| 基本类型 | 包装类型  |
| :------: | :-------: |
|   byte   |   Byte    |
|  short   |   Short   |
|   int    |  Integer  |
|   long   |   Long    |
|  double  |  Double   |
|   char   | Character |
| boolean  |  Boolean  |

---

### 5.4 String 类

+ 字符串的内容永不可改变，因此可以共享使用


+ **构造方法：**
> `public String()` ：初始化新创建的 String对象，以使其表示空字符序列
> `public String(char[] value)` ：通过当前参数中的字符数组来构造新的String
> `public String(byte[] bytes)` ：通过使用平台的默认字符集解码当前参数中的字节数组来构造新的String

```java
public class DemoString {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println("第一种：" + str1);  //第一种：

        char[] charArray = {'A', 'B' ,'C'};
        String str2 = new String(charArray);
        System.out.println("第二种：" + str2);  //第二种：ABC

        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println("第三种：" + str3);  //第三种：abc

        //直接创建
        String str4 = "Hello!";
        System.out.println("直接创建：" + str4);  //直接创建：Hello!
    }
}
```

+ **常量池：**

  对于基本类型来说，== 是进行数值的比较

  对于引用类型来说，== 是进行**地址值**的比较

```java
public class DemoString {
  public static void main(String[] args) {
    String str1 = "abc";
    String str2 = "abc";
    
    char[] charArray = {'a', 'b', 'c'};
    String str3 = new String(charArray);
    
    System.out.println(str1 == str2);   //true
    System.out.println(str1 == str3);   //false
    System.out.println(str2 == str3);   //false
  }
}
```

双引号直接写的字符串在常量池中，new的不在池中

+ **判断功能的方法：**

> `public boolean equals (Object anObject)` ：将此字符串与指定对象进行比较
> `public boolean equalsIgnoreCase (String anotherString)` ：将此字符串与指定对象进行比较，忽略大小写

​       如果比较一个常量和一个变量，推荐把常量字符串写在前面

```java
public class DemoString {
	public static void main(String[] args) {
		// 创建字符串对象
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "HELLO";
    
		// boolean equals(Object obj): 比较字符串的内容是否相同
		System.out.println(s1.equals(s2));   // true
		System.out.println(s1.equals(s3));   // false
		System.out.println("‐‐‐‐‐‐‐‐‐‐‐");

    //boolean equalsIgnoreCase(String str): 比较字符串的内容是否相同,忽略大小写
		System.out.println(s1.equalsIgnoreCase(s2));   // true
		System.out.println(s1.equalsIgnoreCase(s3));   // true
		System.out.println("‐‐‐‐‐‐‐‐‐‐‐");
	}
}
```

+ **获取功能的方法：**
> `public int length ()` ：返回此字符串的长度
> `public String concat (String str)` ：将当前的字符串连接到该字符串的末尾
> `public char charAt (int index)` ：返回指定索引处的 char值
> `public int indexOf (String str)` ：返回指定子字符串第一次出现在该字符串内的索引，没有返回-1
> `public String substring (int beginIndex)` ：返回一个子字符串，从beginIndex开始截取字符串到字符
    串结尾
> `public String substring (int beginIndex, int endIndex)` ：返回一个子字符串，从`beginIndex`到`endIndex`截取字符串。含`beginIndex`，不含`endIndex`

```java
public class DemoString {
	public static void main(String[] args) {
		//创建字符串对象
		String s = "helloworld";
    
		// int length():获取字符串的长度，其实也就是字符个数
		System.out.println(s.length());  //10

		// String concat (String str):将将指定的字符串连接到该字符串的末尾.
		String s2 = s.concat("**hello itheima");
		System.out.println(s2);  // helloworld**hello itheima
    
		// char charAt(int index):获取指定索引处的字符
		System.out.println(s.charAt(0));  //h
		System.out.println(s.charAt(1));  //e

		// int indexOf(String str):获取str在字符串对象中第一次出现的索引,没有返回‐1
		System.out.println(s.indexOf("l"));  //2

		// String substring(int start):从start开始截取字符串到字符串结尾
		System.out.println(s.substring(2));  /lloworld

		// String substring(int start,int end):从start到end截取字符串。含start，不含end。
		System.out.println(s.substring(0, s.length()));  //helloworld
		System.out.println(s.substring(3,8));  //lowor
	}
}
```

+ **转换功能的方法：**
> `public char[] toCharArray ()` ：将当前字符串拆分为字符数组作为返回值
> `public byte[] getBytes ()` ：使用平台的默认字符集将该 String编码转换为新的字节数组
> `public String replace (CharSequence target, CharSequence replacement)` ：将与`target`匹配的字符串使用`replacement`字符串替换（`CharSequence`：可以接受字符串类型）

```java
public class DemoString {
	public static void main(String[] args) {
		//创建字符串对象
		String s = "abcde";
		
    // char[] toCharArray():把字符串转换为字符数组
		char[] chs = s.toCharArray();
		for(int i = 0; i < chs.length; i++) {
			System.out.println(chs[i]);  //a b c d e
		}
		
		// byte[] getBytes ():把字符串转换为字节数组
		byte[] bytes = s.getBytes();
		for(int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);  //97 98 99 100 101
		}

		// 替换字母it为大写IT
    String str = "itcast itheima";
		String replace = str.replace("it", "IT");
		System.out.println(replace);  // ITcast ITheima
  }
}
```

+ **分割功能的方法：**
> `public String[] split(String regex)` ：将此字符串按照给定的`regex`（规则）拆分为字符串数组

```java
public class DemoString {
	public static void main(String[] args) {
		//创建字符串对象
		String s = "aa|bb|cc";
		String[] strArray = s.split("|");  // ["aa", "bb", "cc"]
		for(int x = 0; x < strArray.length; x++) {
			System.out.println(strArray[x]);  // aa bb cc
		}
	}
}
```
不能用`.`分割，因为不是正则表达式，可以用 `\\.`

---

### 5.5 Arrays 类

`java.util.Arrays` 此类包含用来操作数组的各种方法，比如排序和搜索等。其所有方法均为静态方法，调用起来非常简单。

> `public static String toString(int[] a)` ：返回指定数组内容的字符串表示形式（按照默认格式：[][][元素1，元素2...] )

```java
import java.util.Arrays;
public static void main(String[] args) {
	// 定义int 数组
	int[] arr = {2,34,35,4,657,8,69,9};
  
	// 打印数组,输出地址值
	System.out.println(arr); // [I@2ac1fdc4
  
	// 数组内容转为字符串
		String s = Arrays.toString(arr);
  
	// 打印字符串,输出内容
	System.out.println(s); // [2, 34, 35, 4, 657, 8, 69, 9]
}
```

> `public static void sort(int[] a)` ：对指定的 int 型数组按数字升序进行排序

```java
public static void main(String[] args) {
	// 定义int 数组
	int[] arr = {24, 7, 5, 48, 4, 46, 35, 11, 6, 2};
	System.out.println("排序前:"+ Arrays.toString(arr)); 
  // 排序前:[24, 7, 5, 48, 4, 46, 35, 11, 6, 2]
  
	// 升序排序
	Arrays.sort(arr);
	System.out.println("排序后:"+ Arrays.toString(arr));
  // 排序后:[2, 4, 5, 6, 7, 11, 24, 35, 46, 48]
}
```

---

### 5.6 Math 类

`java.lang.Math` 类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。类似这样的工具类，其所有方法均为静态方法，并且不会创建对象，调用起来非常简单

> `public static double abs(double a)` ：返回 double 值的绝对值
>  `public static double ceil(double a)` ：返回大于等于参数的最小的整数
> `public static double floor(double a)` ：返回小于等于参数最大的整数
> `public static long round(double a)` ：返回最接近参数的 long (相当于四舍五入方法)

```java
double d1 = Math.abs(‐5);  //d1的值为5
double d2 = Math.abs(5);  //d2的值为5

double d1 = Math.ceil(3.3);  //d1的值为 4.0
double d2 = Math.ceil(‐3.3);  //d2的值为 ‐3.0
double d3 = Math.ceil(5.1);  //d3的值为 6.0

double d1 = Math.floor(3.3);  //d1的值为3.0
double d2 = Math.floor(‐3.3);  //d2的值为‐4.0
double d3 = Math.floor(5.1);  //d3的值为 5.0

long d1 = Math.round(5.5);  //d1的值为6.0
long d2 = Math.round(5.4);  //d2的值为5.0
```

## 附录

![](jpg/IMG_6183.jpg)

![](jpg/IMG_6187.jpg)

![](jpg/IMG_6188.jpg)

 <a name="继承内存分析">继承内存分析</a>

![](jpg/IMG_6191.jpg)

