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

---

### 5.7 Object 类

`java.lang.Object` 类是Java语言中的根类，即所有类的父类。它中描述的所有方法子类都可以使用。在对象实例化的时候，最终找的父类就是`Object`。

如果一个类没有特别指定父类， 那么默认则继承自`Object`类。

```java
public class MyClass /*extends Object*/ {
		// ...
}
```

> `public String toString()` ：返回该对象的字符串表示。
> `public boolean equals(Object obj)` ：指示其他某个对象是否与此对象“相等”

+ **toString 方法**

> `public String toString()` ：返回该对象的字符串表示。

`toString`方法返回该对象的字符串表示，其实该字符串内容就是`对象的类型+@+内存地址值`。
由于`toString`方法返回的结果是内存地址，而在开发中，经常需要按照对象的属性得到相应的字符串表现形式，因此也需要重写它。

**覆盖重写**

```java
public class Person {
		private String name;
		private int age;
  
		@Override
		public String toString() {
				return "Person{" + "name='" + name + '\'' + ", age=" + age +'}';
		}
		// 省略构造器与Getter Setter
}
```

> 如果重写，`println`输出的对象将不是地址值，而是内容

+ **equals 方法**

> `public boolean equals(Object obj)` ：指示其他某个对象是否与此对象“相等”

**默认地址比较**

如果没有覆盖重写`equals`方法，那么`Object`类中默认进行 `==` 运算符的对象地址比较，只要不是同一个对象，结果必然为`false`。

**对象内容比较**

如果希望进行对象的内容比较，即所有或指定的部分成员变量相同就判定两个对象相同，则可以覆盖重写`equals`方法。

```java
import java.util.Objects;

public class Person {
		private String name;
		private int age;
  
		@Override
		public boolean equals(Object o) {
				// 如果对象地址一样，则认为相同
				if (this == o)
						return true;
				// 如果参数为空，或者类型信息不一样，则认为不同
      	//getClass() 使用反射技术，判断是否Person类，等效于o instance of Person
				if (o == null || getClass() != o.getClass())
						return false;
				// 转换为当前类型（否则父类无法访问子类特有的内容）
				Person person = (Person) o;
				// 要求基本类型相等，并且将引用类型交给java.util.Objects类的equals静态方法取用结果
				return age == person.age && Objects.equals(name,person.name);
		}
}
```

在比较两个对象的时候，`Object`的`equals`方法容易抛出**空指针异常**，而`Objects`类中的`equals`方法就优化了这个问题。

> `public static boolean equals(Object a, Object b)` : 判断两个对象是否相等

```java
public static boolean equals(Object a, Object b) {
		return (a == b) || (a != null && a.equals(b));
}
```

---

### 5.8 日期时间类

#### Date 类

> `public Date()` ：分配`Date`对象并初始化此对象，以表示分配它的时间（精确到毫秒）
>
> `public Date(long date)` ：分配Date对象并初始化此对象，以表示自从标准基准时间（称为“历元（epoch）”，即1970年1月1日00:00:00 GMT）以来的指定毫秒数
>
> `public long getTime()`:   把日期对象转换成对应的时间毫秒值

简单来说：使用无参构造，可以自动设置当前系统时间的毫秒时刻；指定long类型的构造参数，可以自定义毫秒时刻。例如：

```java
import java.util.Date;

public class Demo01Date {
		public static void main(String[] args) {
				// 创建日期对象，把当前的时间
				System.out.println(new Date()); 
				// 创建日期对象，把当前的毫秒值转成日期对象
				System.out.println(new Date(0L)); 
     	  //把日期对象转换成对应的时间毫秒值
      	System.out.println(new Date().getTime());
		}
}

运行结果：
Tue Feb 09 10:51:17 CST 2021
Thu Jan 01 08:00:00 CST 1970
1612839838125
```

> tips:在使用println方法时，会自动调用Date类中的toString方法。Date类对Object类中的toString方法进行了覆盖重写，所以结果为指定格式的字符串。
>
> 时间原点：Thu Jan 01 08:00:00 CST 1970

---

#### DateFormat 类

`java.text.DateFormat` 是日期/时间格式化子类的抽象类，我们通过这个类可以帮我们完成日期和文本之间的转换,也就是可以在`Date`对象与`String`对象之间进行来回转换。

+ 格式化：按照指定的格式，从`Date`日期转换为`String`字符串。
+ 解析：按照指定的格式，从`String`字符串转换为`Date`日期。

**构造方法**

由于`DateFormat`为抽象类，不能直接使用，所以需要常用的子类`java.text.SimpleDateFormat` 。这个类需要一个模式（格式）来指定格式化或解析的标准。构造方法为：

> `public SimpleDateFormat(String pattern)` ：用给定的模式和默认语言环境的日期格式符号构造`SimpleDateFormat`

```java
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Demo02SimpleDateFormat {
		public static void main(String[] args) {
				// 对应的日期格式如：2018‐01‐16 15:06:38
				DateFormat format = new SimpleDateFormat("yyyy‐MM‐dd HH:mm:ss");
		}
}
```

> `public String format(Date date)` ：将Date对象格式化为字符串
>
> `public Date parse(String source)` ：将字符串解析为Date对象

**format 方法**

```java
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
把Date对象转换成String
*/
public class Demo03DateFormatMethod {
		public static void main(String[] args) {
				Date date = new Date();
				// 创建日期格式化对象,在获取格式化对象时可以指定风格
				DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
				String str = df.format(date);
				System.out.println(str); 
		}
}

运行结果：
2021年02月09日
```

**parse 方法**

```java
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
把String转换成Date对象
*/
public class Demo04DateFormatMethod {
		public static void main(String[] args) throws ParseException {
				DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
				String str = "2018年12月11日";
				Date date = df.parse(str);
				System.out.println(date); 
		}
}

运行结果：
Tue Dec 11 00:00:00 CST 2018
```

---

#### Calendar 类

`java.util.Calendar` 是日历类，在`Date`后出现，替换掉了许多`Date`的方法。该类将所有可能用到的时间信息封装为静态成员变量，方便获取。日历类就是方便获取各个时间属性的

**获取方式**

Calendar为抽象类，由于语言敏感性，Calendar类在创建对象时并非直接创建，而是通过静态方法创建，返回子类对象，如下：

> `public static Calendar getInstance()` ：使用默认时区和语言环境获得一个日历

```java
import java.util.Calendar;
public class Demo06CalendarInit {
		public static void main(String[] args) {
				Calendar cal = Calendar.getInstance();
		}
}
```

**常用方法**

> `public int get(int field)` ：返回给定日历字段的值。
> `public void set(int field, int value)` ：将给定的日历字段设置为给定值。
> `public abstract void add(int field, int amount)` ：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
> `public Date getTime()` ：返回一个表示此`Calendar`时间值（从历元到现在的毫秒偏移量）的`Date`对象。

| 字段值       | 含义                                  |
| ------------ | ------------------------------------- |
| YEAR         | 年                                    |
| MONTH        | 月（从0开始，可以+1使用）             |
| DAY_OF_MONTH | 月中的天（几号）                      |
| HOUR         | 时（12小时制）                        |
| HOUR_OF_DAY  | 时（24小时制）                        |
| MINUTE       | 分                                    |
| SECOND       | 秒                                    |
| DAY_OF_WEEK  | 周中的天（周几，周日为1，可以-1使用） |

**get  /set 方法**

get方法用来获取指定字段的值，set方法用来设置指定字段的值，代码使用演示：

```java
import java.util.Calendar;

public class CalendarUtil {
    public static void main(String[] args) {
        // 创建Calendar对象
        Calendar cal = Calendar.getInstance();
        // 设置年 
        int year = cal.get(Calendar.YEAR);
        // 设置月
        int month = cal.get(Calendar.MONTH) + 1;
        // 设置日
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        System.out.print(year + "年" + month + "月" + dayOfMonth + "日");
    }    
}

运行结果：
2021年2月9日
```

```java
import java.util.Calendar;

public class Demo07CalendarMethod {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);      
     		// 设置年 
        int year = cal.get(Calendar.YEAR);
        // 设置月
        int month = cal.get(Calendar.MONTH) + 1;
        // 设置日
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        System.out.print(year + "年" + month + "月" + dayOfMonth + "日"); // 2020年1月17日
    }
}

运行结果：
2020年2月9日
```

**add 方法**

add方法可以对指定日历字段的值进行加减操作，如果第二个参数为正数则加上偏移量，如果为负数则减去偏移量。代码如：

```java
import java.util.Calendar;

public class Demo08CalendarMethod {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.print(year + "年" + month + "月" + dayOfMonth + "日"); // 2018年1月17日
        // 使用add方法
        cal.add(Calendar.DAY_OF_MONTH, 2); // 加2天
        cal.add(Calendar.YEAR, -3); // 减3年
        System.out.print(year + "年" + month + "月" + dayOfMonth + "日"); // 2015年1月18日; 
    }
}
```

**getTime 方法**

Calendar中的getTime方法并不是获取毫秒时刻，而是拿到对应的Date对象。

```java
import java.util.Calendar;
import java.util.Date;

public class Demo09CalendarMethod {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        System.out.println(date); // Tue Jan 16 16:03:09 CST 2018
    }
}
```

> 小贴士：
>
>   西方星期的开始为周日，中国为周一。
>
>   在Calendar类中，月份的表示是以0-11代表1-12月。
>
>   日期是有大小关系的，时间靠后，时间越大。
>

---

### 5.9 System 类

`java.lang.System`类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作，在System类的API文档中，常用的方法有：

> `public static long currentTimeMillis()`：返回以毫秒为单位的当前时间。
> `public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)`：将数组中指定的数据拷贝到另一个数组中。

**currentTimeMillis 方法**

实际上，currentTimeMillis方法就是 获取当前系统时间与1970年01月01日00:00点之间的毫秒差值

```java
import java.util.Date;

public class SystemDemo {
    public static void main(String[] args) {
       	//获取当前时间毫秒值
        System.out.println(System.currentTimeMillis()); // 1516090531144
    }
}
```

验证for循环打印数字1-9999所需要使用的时间（毫秒）

~~~java
public class SystemTest1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时毫秒：" + (end - start));
    }
}
~~~

**arraycopy 方法**

> `public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)`：将数组中指定的数据拷贝到另一个数组中。

数组的拷贝动作是系统级的，性能很高。System.arraycopy方法具有5个参数，含义分别为：

| 参数序号 | 参数名称 | 参数类型 | 参数含义             |
| -------- | -------- | -------- | -------------------- |
| 1        | src      | Object   | 源数组               |
| 2        | srcPos   | int      | 源数组索引起始位置   |
| 3        | dest     | Object   | 目标数组             |
| 4        | destPos  | int      | 目标数组索引起始位置 |
| 5        | length   | int      | 复制元素个数         |

```java
import java.util.Arrays;

public class Demo11SystemArrayCopy {
    public static void main(String[] args) {
        int[] src = new int[]{1,2,3,4,5};
        int[] dest = new int[]{6,7,8,9,10};
        System.arraycopy( src, 0, dest, 0, 3);
        /*代码运行后：两个数组中的元素发生了变化
         src数组元素[1,2,3,4,5]
         dest数组元素[1,2,3,9,10]
        */
    }
}
```

### 5.10 StringBuilder 类

由于String类的对象内容不可改变，所以每当进行字符串拼接时，总是会在内存中创建一个新的对象。例如：

~~~java
public class StringDemo {
    public static void main(String[] args) {
        String s = "Hello";
        s += "World";
        System.out.println(s);
    }
}
~~~

在API中对String类有这样的描述：字符串是常量，它们的值在创建后不能被更改。

根据这句话分析我们的代码，其实总共产生了三个字符串，即`"Hello"`、`"World"`和`"HelloWorld"`。引用变量s首先指向`Hello`对象，最终指向拼接出来的新字符串对象，即`HelloWord` 。

由此可知，如果对字符串进行拼接操作，每次拼接，都会构建一个新的String对象，既耗时，又浪费空间。为了解决这一问题，可以使用`java.lang.StringBuilder`类。

**概述**

查阅`java.lang.StringBuilder`的API，StringBuilder又称为可变字符序列，它是一个类似于 String 的字符串缓冲区，通过某些方法调用可以改变该序列的长度和内容。

原来StringBuilder是个字符串的缓冲区，即它是一个容器，容器中可以装很多字符串。并且能够对其中的字符串进行各种操作。

它的内部拥有一个数组用来存放字符串内容，进行字符串拼接时，直接在数组中加入新内容。StringBuilder会自动维护数组的扩容。

**构造方法**

> `public StringBuilder()`：构造一个空的StringBuilder容器。
> `public StringBuilder(String str)`：构造一个StringBuilder容器，并将字符串添加进去。

```java
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1); // (空白)
        // 使用带参构造
        StringBuilder sb2 = new StringBuilder("itcast");
        System.out.println(sb2); // itcast
    }
}
```

**append 方法**

> `public StringBuilder append(...)`：添加任意类型数据的字符串形式，并返回当前对象自身。

append方法具有多种重载形式，可以接收任意类型的参数。任何数据作为参数都会将对应的字符串内容添加到StringBuilder中。例如：

```java
public class Demo02StringBuilder {
	public static void main(String[] args) {
		//创建对象
		StringBuilder builder = new StringBuilder();
		//public StringBuilder append(任意类型)
    //这里并没有new新对象，因此地址一样
		StringBuilder builder2 = builder.append("hello");
		//对比一下
		System.out.println("builder:"+builder);
		System.out.println("builder2:"+builder2);
		System.out.println(builder == builder2); //true
	    // 可以添加 任何类型
		builder.append("hello");
		builder.append("world");
		builder.append(true);
		builder.append(100);
		// 在我们开发中，会遇到调用一个方法后，返回一个对象的情况。然后使用返回的对象继续调用方法。
        // 这种时候，我们就可以把代码现在一起，如append方法一样，代码如下
		//链式编程
		builder.append("hello").append("world").append(true).append(100);
		System.out.println("builder:"+builder);
	}
}
```

> 备注：StringBuilder已经覆盖重写了Object当中的toString方法。

**toString 方法**

> `public String toString()`：将当前StringBuilder对象转换为String对象。

通过toString方法，StringBuilder对象将会转换为不可变的String对象。如：

```java
public class Demo16StringBuilder {
    public static void main(String[] args) {
        // 链式创建
        StringBuilder sb = new StringBuilder("Hello").append("World").append("Java");
        // 调用方法
        String str = sb.toString();
        System.out.println(str); // HelloWorldJava
    }
}
```

---

### 5.11 包装类

Java提供了两个类型系统，基本类型与引用类型，使用基本类型在于效率，然而很多情况，会创建对象使用，因为对象可以做更多的功能，如果想要我们的基本类型像对象一样操作，就可以使用基本类型对应的包装类，如下：

| 基本类型 | 对应的包装类（位于java.lang包中） |
| :------: | :-------------------------------: |
|   byte   |               Byte                |
|  short   |               Short               |
|   int    |            **Integer**            |
|   long   |               Long                |
|  float   |               Float               |
|  double  |              Double               |
|   char   |           **Character**           |
| boolean  |              Boolean              |

**装箱与拆箱**

基本类型与对应的包装类对象之间，来回转换的过程称为”装箱“与”拆箱“：

* **装箱**：从基本类型转换为对应的包装类对象。

* **拆箱**：从包装类对象转换为对应的基本类型。

用Integer与 int为例：（看懂代码即可）

基本数值---->包装对象

~~~java
Integer i = new Integer(4);//使用构造函数函数
Integer iii = Integer.valueOf(4);//使用包装类中的valueOf方法
~~~

包装对象---->基本数值

~~~java
int num = i.intValue();
~~~

**自动装箱与自动拆箱**

由于我们经常要做基本类型与包装类之间的转换，从Java 5（JDK 1.5）开始，基本类型与包装类的装箱、拆箱动作可以自动完成。例如：

```java
Integer i = 4;//自动装箱。相当于Integer i = Integer.valueOf(4);
i = i + 5;//等号右边：将i对象转成基本数值(自动拆箱) i.intValue() + 5;
//加法运算完成后，再次装箱，把基本数值转成对象。
```

**基本类型转换为 String**

~~~
基本类型直接与””相连接即可；如：34+""
~~~

+ `public static byte parseByte(String s)`：将字符串参数转换为对应的byte基本类型。

- `public static short parseShort(String s)`：将字符串参数转换为对应的short基本类型。
- `public static int parseInt(String s)`：将字符串参数转换为对应的int基本类型。
- `public static long parseLong(String s)`：将字符串参数转换为对应的long基本类型。
- `public static float parseFloat(String s)`：将字符串参数转换为对应的float基本类型。
- `public static double parseDouble(String s)`：将字符串参数转换为对应的double基本类型。
- `public static boolean parseBoolean(String s)`：将字符串参数转换为对应的boolean基本类型。

代码使用（仅以Integer类的静态方法parseXxx为例）如：

```java
public class Demo18WrapperParse {
    public static void main(String[] args) {
        int num = Integer.parseInt("100");
    }
}
```

> 注意:如果字符串参数的内容无法正确转换为对应的基本类型，则会抛出`java.lang.NumberFormatException`异常。
>

---

## 6 Collection、Map 集合

### 6.1 Collection集合

**概述**

在前面基础班我们已经学习过并使用过集合ArrayList<E> ,那么集合到底是什么呢?

* **集合**：集合是java中提供的一种容器，可以用来存储多个数据。

集合和数组既然都是容器，它们有啥区别呢？

* 数组的长度是固定的。集合的长度是可变的。
* 数组中存储的是同一类型的元素，可以存储基本数据类型值。集合存储的都是对象。而且对象的类型可以不一致。在开发中一般当对象多的时候，使用集合进行存储。

**集合框架**

JAVASE提供了满足各种需求的API，在使用这些API前，先了解其继承与接口操作架构，才能了解何时采用哪个类，以及类之间如何彼此合作，从而达到灵活应用。

集合按照其存储结构可以分为两大类，分别是单列集合`java.util.Collection`和双列集合`java.util.Map`

* **Collection**：单列集合类的根接口，用于存储一系列符合某种规则的元素，它有两个重要的子接口，分别是`java.util.List`和`java.util.Set`。其中，`List`的特点是元素有序、元素可重复。`Set`的特点是元素无序，而且不可重复。`List`接口的主要实现类有`java.util.ArrayList`和`java.util.LinkedList`，`Set`接口的主要实现类有`java.util.HashSet`和`java.util.TreeSet`。

**常用功能**

Collection是所有单列集合的父接口，因此在Collection中定义了单列集合(List和Set)通用的一些方法，这些方法可用于操作所有的单列集合。方法如下：

* `public boolean add(E e)`：  把给定的对象添加到当前集合中 。
* `public void clear()` :清空集合中所有的元素。
* `public boolean remove(E e)`: 把给定的对象在当前集合中删除。
* `public boolean contains(E e)`: 判断当前集合中是否包含给定的对象。
* `public boolean isEmpty()`: 判断当前集合是否为空。
* `public int size()`: 返回集合中元素的个数。
* `public Object[] toArray()`: 把集合中的元素，存储到数组中。

方法演示：

~~~java
import java.util.ArrayList;
import java.util.Collection;

public class Demo1Collection {
    public static void main(String[] args) {
		// 创建集合对象 
    	// 使用多态形式
    	Collection<String> coll = new ArrayList<String>();
    	// 使用方法
    	// 添加功能  boolean  add(String s)
    	coll.add("小李广");
    	coll.add("扫地僧");
    	coll.add("石破天");
    	System.out.println(coll);

    	// boolean contains(E e) 判断o是否在集合中存在
    	System.out.println("判断  扫地僧 是否在集合中"+coll.contains("扫地僧"));

    	//boolean remove(E e) 删除在集合中的o元素
    	System.out.println("删除石破天："+coll.remove("石破天"));
    	System.out.println("操作之后集合中元素:"+coll);
    	
    	// size() 集合中有几个元素
		System.out.println("集合中有"+coll.size()+"个元素");

		// Object[] toArray()转换成一个Object数组
    	Object[] objects = coll.toArray();
    	// 遍历数组
    	for (int i = 0; i < objects.length; i++) {
			System.out.println(objects[i]);
		}

		// void  clear() 清空集合
		coll.clear();
		System.out.println("集合中内容为："+coll);
		// boolean  isEmpty()  判断是否为空
		System.out.println(coll.isEmpty());  	
	}
}

运行结果:
[小李广, 扫地僧, 石破天]
判断  扫地僧 是否在集合中true
删除石破天：true
操作之后集合中元素:[小李广, 扫地僧]
集合中有2个元素
小李广
扫地僧
集合中内容为：[]
true
~~~

> tips: 有关Collection中的方法可不止上面这些，其他方法可以自行查看API学习。

---

### 6.2 Iterator迭代器

**Iterator接口**

在程序开发中，经常需要遍历集合中的所有元素。针对这种需求，JDK专门提供了一个接口`java.util.Iterator`。`Iterator`接口也是Java集合中的一员，但它与`Collection`、`Map`接口有所不同，`Collection`接口与`Map`接口主要用于存储元素，而`Iterator`主要用于迭代访问（即遍历）`Collection`中的元素，因此`Iterator`对象也被称为迭代器。

想要遍历Collection集合，那么就要获取该集合迭代器完成迭代操作，下面介绍一下获取迭代器的方法：

* `public Iterator iterator()`: 获取集合对应的迭代器，用来遍历集合中的元素的。

下面介绍一下迭代的概念：

* **迭代**：即Collection集合元素的通用获取方式。在取元素之前先要判断集合中有没有元素，如果有，就把这个元素取出来，继续在判断，如果还有就再取出出来。一直把集合中的所有元素全部取出。这种取出方式专业术语称为迭代。

Iterator接口的常用方法如下：

* `public E next()`:返回迭代的下一个元素。
* `public boolean hasNext()`:如果仍有元素可以迭代，则返回 true。

接下来我们通过案例学习如何使用Iterator迭代集合中元素：

~~~java
public class IteratorDemo {
  	public static void main(String[] args) {
        // 使用多态方式 创建对象
        Collection<String> coll = new ArrayList<String>();

        // 添加元素到集合
        coll.add("串串星人");
        coll.add("吐槽星人");
        coll.add("汪星人");
        //遍历
        //使用迭代器 遍历   每个集合对象都有自己的迭代器
        Iterator<String> it = coll.iterator();
        //  泛型指的是 迭代出 元素的数据类型
        while(it.hasNext()){ //判断是否有迭代元素
            String s = it.next();//获取迭代出的元素
            System.out.println(s);
        }
  	}
}

运行结果：
串串星人
吐槽星人
汪星人
~~~

> tips:：在进行集合元素取出时，如果集合中已经没有元素了，还继续使用迭代器的next方法，将会发生java.util.NoSuchElementException没有集合元素的错误。
>
> `coll.iterator();`获取迭代器的实现类对象，并把指针指向集合的-1位置

**增强for**

增强for循环(也称for each循环)是**JDK1.5**以后出来的一个高级for循环，专门用来遍历数组和集合的。它的内部原理其实是个Iterator迭代器，所以在遍历的过程中，不能对集合中的元素进行增删操作。

格式：

~~~java
for(元素的数据类型  变量 : Collection集合or数组){ 
  	//写操作代码
}
~~~

它用于遍历Collection和数组。通常只进行遍历元素，不要在遍历的过程中对集合元素进行增删操作。

```java
public class NBFor {
    public static void main(String[] args) {        
    	Collection<String> coll = new ArrayList<String>();
    	coll.add("小河神");
    	coll.add("老河神");
    	coll.add("神婆");
    	//使用增强for遍历
    	for(String s :coll){//接收变量s代表 代表被遍历到的集合元素
    		System.out.println(s);
    	}
	}
}
```

> tips: 新for循环必须有被遍历的目标。目标只能是Collection或者是数组。新式for仅仅作为遍历操作出现。

---

### 6.3 泛型

在前面学习集合时，我们都知道集合中是可以存放任意对象的，只要把对象存储集合后，那么这时他们都会被提升成Object类型。当我们在取出每一个对象，并且进行相应的操作，这时必须采用类型转换。

+ **泛型**：可以在类或方法中预支地使用未知的类型。

> tips:一般在创建对象时，将未知的类型确定具体的类型。当没有指定泛型时，默认类型为Object类型。

**定义与使用**

泛型，用来灵活地将数据类型应用到不同的类、方法、接口当中。将数据类型作为参数进行传递。

定义格式：

~~~
修饰符 class 类名<代表泛型的变量> {  }
~~~

例如，API中的ArrayList集合：

~~~java
class ArrayList<E>{ 
    public boolean add(E e){ }

    public E get(int index){ }
   	....
}
~~~

使用泛型： 即什么时候确定泛型。

**在创建对象的时候确定泛型**

 例如，`ArrayList<String> list = new ArrayList<String>();`

此时，变量E的值就是String类型,那么我们的类型就可以理解为：

~~~java 
class ArrayList<String>{ 
     public boolean add(String e){ }

     public String get(int index){  }
     ...
}
~~~

**含有泛型的方法**

定义格式：

~~~
修饰符 <代表泛型的变量> 返回值类型 方法名(参数){  }
~~~

**含有泛型的接口**

定义格式：

~~~
修饰符 interface接口名<代表泛型的变量> {  }
~~~

+ **泛型通配符**

当使用泛型类或者接口时，传递的数据中，泛型类型不确定，可以通过通配符<?>表示。但是一旦使用泛型的通配符后，只能使用Object类中的共性方法，集合中元素自身方法无法使用。

**通配符基本使用**

泛型的通配符:**不知道使用什么类型来接收的时候,此时可以使用?,?表示未知通配符。**

此时只能接受数据,不能往该集合中存储数据。

~~~java
public static void main(String[] args) {
    Collection<Intger> list1 = new ArrayList<Integer>();
    getElement(list1);
    Collection<String> list2 = new ArrayList<String>();
    getElement(list2);
}
public static void getElement(Collection<?> coll){}
//？代表可以接收任意类型
~~~

> tips:泛型不存在继承关系 Collection<Object> list = new ArrayList<String>();这种是错误的。

**通配符高级使用----受限泛型**

之前设置泛型的时候，实际上是可以任意设置的，只要是类就可以设置。但是在JAVA的泛型中可以指定一个泛型的**上限**和**下限**。

**泛型的上限**：

* **格式**： `类型名称 <? extends 类 > 对象名称`
* **意义**： `只能接收该类型及其子类`

**泛型的下限**：

- **格式**： `类型名称 <? super 类 > 对象名称`
- **意义**： `只能接收该类型及其父类型`

比如：现已知Object类，String 类，Number类，Integer类，其中Number是Integer的父类

~~~java
public static void main(String[] args) {
    Collection<Integer> list1 = new ArrayList<Integer>();
    Collection<String> list2 = new ArrayList<String>();
    Collection<Number> list3 = new ArrayList<Number>();
    Collection<Object> list4 = new ArrayList<Object>();
    
    getElement(list1);
    getElement(list2);//报错
    getElement(list3);
    getElement(list4);//报错
  
    getElement2(list1);//报错
    getElement2(list2);//报错
    getElement2(list3);
    getElement2(list4);
  
}
// 泛型的上限：此时的泛型?，必须是Number类型或者Number类型的子类
public static void getElement1(Collection<? extends Number> coll){}
// 泛型的下限：此时的泛型?，必须是Number类型或者Number类型的父类
public static void getElement2(Collection<? super Number> coll){}
~~~

---

+ **集合综合案例**

**案例介绍**

按照斗地主的规则，完成洗牌发牌的动作。
具体规则：

使用54张牌打乱顺序,三个玩家参与游戏，三人交替摸牌，每人17张牌，最后三张留作底牌。

**案例分析**

* 准备牌：

  牌可以设计为一个ArrayList<String>,每个字符串为一张牌。
  每张牌由花色数字两部分组成，我们可以使用花色集合与数字集合嵌套迭代完成每张牌的组装。
  牌由Collections类的shuffle方法进行随机排序。

* 发牌

  将每个人以及底牌设计为ArrayList<String>,将最后3张牌直接存放于底牌，剩余牌通过对3取模依次发牌。


* 看牌

  直接打印每个集合。

**代码实现**

~~~java
import java.util.ArrayList;
import java.util.Collections;

public class Poker {
    public static void main(String[] args) {
        /*
        * 1: 准备牌操作
        */
        //1.1 创建牌盒 将来存储牌面的 
        ArrayList<String> pokerBox = new ArrayList<String>();
        //1.2 创建花色集合
        ArrayList<String> colors = new ArrayList<String>();

        //1.3 创建数字集合
        ArrayList<String> numbers = new ArrayList<String>();

        //1.4 分别给花色 以及 数字集合添加元素
        colors.add("♥");
        colors.add("♦");
        colors.add("♠");
        colors.add("♣");

        for(int i = 2;i<=10;i++){
            numbers.add(i+"");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");
        //1.5 创造牌  拼接牌操作
        // 拿出每一个花色  然后跟每一个数字 进行结合  存储到牌盒中
        for (String color : colors) {
            //color每一个花色 
            //遍历数字集合
            for(String number : numbers){
                //结合
                String card = color+number;
                //存储到牌盒中
                pokerBox.add(card);
            }
        }
        //1.6大王小王
        pokerBox.add("小☺");
        pokerBox.add("大☠");	  
        // System.out.println(pokerBox);
        //洗牌 是不是就是将  牌盒中 牌的索引打乱 
        // Collections类  工具类  都是 静态方法
        // shuffer方法   
        /*
         * static void shuffle(List<?> list) 
         *     使用默认随机源对指定列表进行置换。 
         */
        //2:洗牌
        Collections.shuffle(pokerBox);
        //3 发牌
        //3.1 创建 三个 玩家集合  创建一个底牌集合
        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();
        ArrayList<String> dipai = new ArrayList<String>();	  

        //遍历 牌盒  必须知道索引   
        for(int i = 0;i<pokerBox.size();i++){
            //获取 牌面
            String card = pokerBox.get(i);
            //留出三张底牌 存到 底牌集合中
            if(i>=51){//存到底牌集合中
                dipai.add(card);
            } else {
                //玩家1   %3  ==0
                if(i%3==0){
                  	player1.add(card);
                }else if(i%3==1){//玩家2
                  	player2.add(card);
                }else{//玩家3
                  	player3.add(card);
                }
            }
        }
        //看看
        System.out.println("令狐冲："+player1);
        System.out.println("田伯光："+player2);
        System.out.println("绿竹翁："+player3);
        System.out.println("底牌："+dipai);  
	}
}

运行结果：
令狐冲：[♠8, ♣6, ♣A, ♥3, ♣7, ♠9, 大☠, ♥K, ♠J, ♥Q, ♣9, ♠K, ♠6, ♦5, ♣4, ♥A, ♠10]
田伯光：[♣2, ♦4, ♦A, ♥7, ♣Q, ♦8, ♥8, ♦9, ♣5, ♥J, ♠Q, ♥6, ♠3, ♥10, ♣J, ♠4, ♦2]
绿竹翁：[♠7, ♠2, ♥9, ♠A, ♥2, ♥4, ♣K, ♣8, ♥5, 小☺, ♦6, ♣10, ♦3, ♦K, ♠5, ♣3, ♦J]
底牌：[♦10, ♦Q, ♦7]
~~~

---

### 6.4 List 集合

#### List

`java.util.List`接口继承自`Collection`接口，是单列集合的一个重要分支，习惯性地会将实现了`List`接口的对象称为List集合。在List集合中允许出现重复的元素，所有的元素是以一种线性方式进行存储的，在程序中可以通过索引来访问集合中的指定元素。另外，List集合还有一个特点就是元素有序，即元素的存入顺序和取出顺序一致。

> tips:我们在基础班的时候已经学习过List接口的子类java.util.ArrayList类，该类中的方法都是来自List中定义。

**常用方法**

List作为Collection集合的子接口，不但继承了Collection接口中的全部方法，而且还增加了一些根据元素索引来操作集合的特有方法，如下：

- `public void add(int index, E element)`: 将指定的元素，添加到该集合中的指定位置上。
- `public E get(int index)`:返回集合中指定位置的元素。
- `public E remove(int index)`: 移除列表中指定位置的元素, 返回的是被移除的元素。
- `public E set(int index, E element)`:用指定元素替换集合中指定位置的元素,返回值的更新前的元素。

List集合特有的方法都是跟索引相关

```java
public class ListDemo {
    public static void main(String[] args) {
		// 创建List集合对象
    	List<String> list = new ArrayList<String>();
    	
    	// 往 尾部添加 指定元素
    	list.add("图图");
    	list.add("小美");
    	list.add("不高兴");
    	
    	System.out.println(list);
    	// add(int index,String s) 往指定位置添加
    	list.add(1,"没头脑");
    	
    	System.out.println(list);
    	// String remove(int index) 删除指定位置元素  返回被删除元素
    	// 删除索引位置为2的元素 
    	System.out.println("删除索引位置为2的元素");
    	System.out.println(list.remove(2));
    	
    	System.out.println(list);
    	
    	// String set(int index,String s)
    	// 在指定位置 进行 元素替代（改） 
    	// 修改指定位置元素
    	list.set(0, "三毛");
    	System.out.println(list);
    	
    	// String get(int index)  获取指定位置元素
    	
    	// 跟size() 方法一起用  来 遍历的 
    	for(int i = 0;i<list.size();i++){
    		System.out.println(list.get(i));
    	}
    	//还可以使用增强for
    	for (String string : list) {
			System.out.println(string);
		}  	
	}
}

运行结果：
[图图, 小美, 不高兴]
[图图, 没头脑, 小美, 不高兴]
删除索引位置为2的元素
小美
[图图, 没头脑, 不高兴]
[三毛, 没头脑, 不高兴]
三毛
没头脑
不高兴
三毛
没头脑
不高兴
```

---

**（ List子类 ）**

#### ArrayList集合

`java.util.ArrayList`集合数据存储的结构是**数组结构**。元素增删慢，查找快，由于日常开发中使用最多的功能为查询数据、遍历数据，所以`ArrayList`是最常用的集合。

---

#### LinkedList集合

`java.util.LinkedList`集合数据存储的结构是**链表结构**。方便元素添加、删除的集合。

>  LinkedList是一个双向链表

实际开发中对一个集合元素的添加与删除经常涉及到首尾操作，而LinkedList提供了大量首尾操作的方法。这些方法我们作为了解即可：

* `public void addFirst(E e)`:将指定元素插入此列表的开头。
* `public void addLast(E e)`:将指定元素添加到此列表的结尾。
* `public E getFirst()`:返回此列表的第一个元素。
* `public E getLast()`:返回此列表的最后一个元素。
* `public E removeFirst()`:移除并返回此列表的第一个元素。
* `public E removeLast()`:移除并返回此列表的最后一个元素。
* `public E pop()`:从此列表所表示的堆栈处弹出一个元素。
* `public void push(E e)`:将元素推入此列表所表示的堆栈。
* `public boolean isEmpty()`：如果列表不包含元素，则返回true。

LinkedList是List的子类，List中的方法LinkedList都是可以使用，这里就不做详细介绍，我们只需要了解LinkedList的特有方法即可。在开发时，LinkedList集合也可以作为堆栈，队列的结构使用。（了解即可）

方法演示：

~~~java
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<String>();
        //添加元素
        link.addFirst("abc1");
        link.addFirst("abc2");
        link.addFirst("abc3");
        System.out.println(link);
        // 获取元素
        System.out.println(link.getFirst());
        System.out.println(link.getLast());
        // 删除元素
        System.out.println(link.removeFirst());
        System.out.println(link.removeLast());

        while (!link.isEmpty()) { //判断集合是否为空
            System.out.println(link.pop()); //弹出集合中的栈顶元素
        }

        System.out.println(link);
    }
}

运行结果：
[abc3, abc2, abc1]
abc3
abc1
abc3
abc1
abc2
[]
~~~

---

### 6.5 set 集合

`java.util.Set`接口和`java.util.List`接口一样，同样继承自`Collection`接口，它与`Collection`接口中的方法基本一致，并没有对`Collection`接口进行功能上的扩充，只是比`Collection`接口更加严格了。与`List`接口不同的是，`Set`接口中元素**无序**，并且都会以某种规则保证存入的元素**不出现重复**。

`Set`集合有多个子类，这里我们介绍其中的`java.util.HashSet`、`java.util.LinkedHashSet`这两个集合。

> tips:Set集合取出元素的方式可以采用：迭代器、增强for。

---

#### HashSet

**介绍**

哈希值：是JDK根据对象的地址或者字符串或者数字算出来的int类型的数值

`java.util.HashSet`是`Set`接口的一个实现类，它所存储的元素是不可重复的，并且元素都是无序的(即存取顺序不一致)。`java.util.HashSet`底层的实现其实是一个`java.util.HashMap`支持

`HashSet`是根据对象的哈希值来确定元素在集合中的存储位置，因此具有良好的存取和查找性能。保证元素唯一性的方式依赖于：`hashCode`与`equals`方法。

**结构**

什么是哈希表呢？

在**JDK1.8**之前，哈希表底层采用数组+链表实现，即使用链表处理冲突，同一hash值的链表都存储在一个链表里。但是当位于一个桶中的元素较多，即hash值相等的元素较多时，通过key值依次查找的效率较低。而JDK1.8中，哈希表存储采用数组+链表+红黑树实现，当链表长度超过阈值（8）时，将链表转换为红黑树，这样大大减少了查找时间。

**判断标准**

存入的元素和以前的哈希值比较，如果哈希值不同，会继续向下执行，把元素添加到集合，如果哈希值相同，则调用equals()方法比较，如果返回false，则继续向下执行把元素添加到集合，如果返回true，说明元素重复，不存储。

**存储自定义类型元素**

给HashSet中存放**自定义类型**元素时，由于系统无法自己比较自定义类型是否相同，因此**需要重写**对象中的hashCode和equals方法，建立自己的比较方式，才能保证HashSet集合中的对象唯一

创建自定义Student类

~~~java
public class Student {
    private String name;
    private int age;

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

  	@Override  //使输出为内容而非地址
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
  
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return age == student.age &&
               Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
~~~

~~~java
public class HashSetDemo2 {
    public static void main(String[] args) {
        //创建集合对象   该集合中存储 Student类型对象
        HashSet<Student> stuSet = new HashSet<Student>();
        //存储 
        Student stu = new Student("于谦", 43);
        stuSet.add(stu);
        stuSet.add(new Student("郭德纲", 44));
        stuSet.add(new Student("于谦", 43));
        stuSet.add(new Student("郭麒麟", 23));
        stuSet.add(stu);

        for (Student stu2 : stuSet) {
            System.out.println(stu2);
        }
    }
}
执行结果：
Student [name=郭德纲, age=44]
Student [name=于谦, age=43]
Student [name=郭麒麟, age=23]
~~~

#### LinkedHashSet

>  在HashSet基础上有序排列，同样不能有重复元素

在HashSet下面有一个子类`java.util.LinkedHashSet`，它是链表和哈希表组合的一个数据存储结构。

演示代码如下:

~~~java
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		set.add("bbb");
		set.add("aaa");
		set.add("abc");
		set.add("bbb");
        Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
结果：
  bbb
  aaa
  abc
~~~

---

### 6.6 Collections

`java.utils.Collections`是集合工具类，用来对集合进行操作。部分方法如下：

**常用功能 (静态方法，直接使用，无需对象)**

- `public static <T> boolean addAll(Collection<T> c, T... elements)  `:往集合中添加一些元素。
- `public static void shuffle(List<?> list) 打乱顺序`:打乱集合顺序。
- `public static <T> void sort(List<T> list)`:将集合中元素按照默认规则排序。
- `public static <T> void sort(List<T> list，Comparator<? super T> )`:将集合中元素按照指定规则排序。

代码演示：

```java
public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //原来写法
        //list.add(12);
        //list.add(14);
        //list.add(15);
        //list.add(1000);
        //采用工具类 完成 往集合中添加元素  
        Collections.addAll(list, 5, 222, 1，2);
        System.out.println(list);
        //排序方法 
        Collections.sort(list);
        System.out.println(list);
    }
}
结果：
[5, 222, 1, 2]
[1, 2, 5, 222]
```

 **Comparator比较器**

> `public static <T> void sort(List<T> list)`:将集合中元素按照默认规则排序

> ` public int compare(String o1, String o2)`：比较其两个参数的顺序。
>
> 两个对象比较的结果有三种：大于，等于，小于。
>
> 如果要按照升序排序，
> 则o1 小于o2，返回（负数），相等返回0，01大于02返回（正数）
> 如果要按照降序排序
> 则o1 小于o2，返回（正数），相等返回0，01大于02返回（负数）

```java
public class CollectionsDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("cba");
        list.add("aba");
        list.add("sba");
        list.add("nba");
        //排序方法  按照第一个单词的降序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.charAt(0) - o1.charAt(0);
            }
        });
        System.out.println(list);
    }
}
```

**练习**

Student 初始类

~~~java
public class Student implements Comparable<Student>{
    private String name;
    private int age;

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

    @Override
    public String toString() {
        return "Student{" +
               "name='" + name + '\'' +
               ", age=" + age +
               '}';
    }
  
    @Override
    public int compareTo(Student o) {
        return this.age-o.age;//升序
    }
}
~~~

测试类：

~~~java
public class Demo {

    public static void main(String[] args) {
        // 创建四个学生对象 存储到集合中
        ArrayList<Student> list = new ArrayList<Student>();

        list.add(new Student("rose",18));
        list.add(new Student("jack",16));
        list.add(new Student("abc",16));
        list.add(new Student("ace",17));
        list.add(new Student("mark",16));
    
        Collections.sort(list);

        for (Student student : list) {
            System.out.println(student);
        }
    }
}
~~~

~~~java
Student{name='jack', age=16}
Student{name='abc', age=16}
Student{name='mark', age=16}
Student{name='ace', age=17}
Student{name='rose', age=18}
~~~

> ⚠️  形参在前的顺序排

**扩展：**如果想要规则更多一些，可以参考下面代码：

~~~java
Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 年龄降序
                int result = o2.getAge()-o1.getAge();//年龄降序

                if(result==0){//第一个规则判断完了 下一个规则 姓名的首字母 升序
                    result = o1.getName().charAt(0)-o2.getName().charAt(0);
                }

                return result;
            }
        });
~~~

> **两种自定义规则：**
>
> 在定义类中需要继承`implements Comparable<Student>`，然后重写`public int compareTo`
>
> 在本类中可以用
>
> ```java
> Collections.sort(list, new Comparator<String>() {
>             @Override
>             public int compare(String o1, String o2) {
>                 return o2.charAt(0) - o1.charAt(0);
>             }
>         });
> ```

---

### 6.7 Map 集合

#### Map

现实生活中，我们常会看到这样的一种集合：IP地址与主机名，身份证号与个人，系统用户名与系统用户对象等，这种一一对应的关系，就叫做映射。Java提供了专门的集合类用来存放这种对象关系的对象，即`java.util.Map`接口。

> `Collection<E>` 接口定义了单列集合规范
>
> `Map<K, V>` 接口定义了双集合规范，K代表键的类型，V代表值的类型

⚠️  需要注意的是，`Map`中的集合不能包含重复的键，值可以重复；每个键只能对应一个值

---

**Map常用子类**

#### HashMap

> **HashMap<K,V>**：存储数据采用的哈希表结构，元素的存取顺序(元素输入顺序）不能保证一致，key值顺序排列。由于要保证键的唯一、不重复，需要重写键的hashCode()方法、equals()方法（自定义数据类型）
>
> K实际上是一个set集合(不能是其子类)
>
> **输入无序，key值排列**

**常用方法**

* `public V put(K key, V value)`:  把指定的键与指定的值添加到Map集合中。
* `public V remove(Object key)`: 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
* `public V get(Object key)` 根据指定的键，在Map集合中获取对应的值。
* `boolean containsKey(Object key)  ` 判断集合中是否包含指定的键。
* `public Set<K> keySet()`: 获取Map集合中所有的键，存储到Set集合中。
* `public Set<Map.Entry<K,V>> entrySet()`: 获取到Map集合中所有的键值对对象的集合(Set集合)。

~~~java
public class MapDemo {
    public static void main(String[] args) {
        //创建 map对象
        HashMap<String, String>  map = new HashMap<String, String>();

        //添加元素到集合
        map.put("黄晓明", "杨颖");
        map.put("文章", "马伊琍");
        map.put("邓超", "孙俪");
        System.out.println(map);

        //String remove(String key)
        System.out.println(map.remove("邓超"));
        System.out.println(map);

        // 想要查看 黄晓明的媳妇 是谁
        System.out.println(map.get("黄晓明"));
        System.out.println(map.get("邓超"));    
    }
}

运行结果：
{邓超=孙俪, 文章=马伊琍, 黄晓明=杨颖}
孙俪
{文章=马伊琍, 黄晓明=杨颖}
杨颖
null
~~~

> tips:
>
> 使用put方法时，若指定的键(key)在集合中没有，则没有这个键对应的值，返回null，并把指定的键值添加到集合中； 
>
> 若指定的键(key)在集合中存在，则返回值为集合中键对应的值（该值为替换前的值），并把指定键所对应的值，替换成指定的新值。 

**遍历键找值方式**

+ `public Set<K> keySet()`: 获取Map集合中所有的键，存储到Set集合中。

分析步骤：

1. 获取Map中所有的键，由于键是唯一的，所以返回一个Set集合存储所有的键。方法提示:`keyset()`
2. 遍历键的Set集合，得到每一个键。
3. 根据键，获取键所对应的值。方法提示:`get(K key)`

```java
public class MapDemo01 {
    public static void main(String[] args) {
        //创建Map集合对象 
        HashMap<String, String> map = new HashMap<String,String>();
        //添加元素到集合 
        map.put("胡歌", "霍建华");
        map.put("郭德纲", "于谦");
        map.put("薛之谦", "大张伟");

        //获取所有的键  获取键集
        Set<String> keys = map.keySet();
        // 遍历键集 得到 每一个键
        for (String key : keys) {
          	//key  就是键
            //获取对应值
            String value = map.get(key);
            System.out.println(key+"的CP是："+value);
        }  
    }
}
```

**Entry键值对对象**

我们已经知道，`Map`中存放的是两种对象，一种称为**key**(键)，一种称为**value**(值)，它们在在`Map`中是一一对应关系，这一对对象又称做`Map`中的一个`Entry(项)`。`Entry`将键值对的对应关系封装成了对象。即键值对对象，这样我们在遍历`Map`集合时，就可以从每一个键值对（`Entry`）对象中获取对应的键与对应的值。

 既然Entry表示了一对键和值，那么也同样提供了获取对应键和对应值得方法：

* `public K getKey()`：获取Entry对象中的键。
* `public V getValue()`：获取Entry对象中的值。

在Map集合中也提供了获取所有Entry对象的方法：

* `public Set<Map.Entry<K,V>> entrySet()`: 获取到Map集合中所有的键值对对象的集合(Set集合)----将Entry封装的类当成元素放到set集合中进行遍历

**遍历键值对方式**

键值对方式：即通过集合中每个键值对(Entry)对象，获取键值对(Entry)对象中的键与值。

操作步骤与图解：

1.  获取Map集合中，所有的键值对(Entry)对象，以Set集合形式返回。方法提示:`entrySet()`。

2.  遍历包含键值对(Entry)对象的Set集合，得到每一个键值对(Entry)对象。
3.  通过键值对(Entry)对象，获取Entry对象中的键与值。  方法提示:`getkey() getValue()`     

~~~java
public class MapDemo02 {
    public static void main(String[] args) {
        // 创建Map集合对象 
        HashMap<String, String> map = new HashMap<String,String>();
        // 添加元素到集合 
        map.put("胡歌", "霍建华");
        map.put("郭德纲", "于谦");
        map.put("薛之谦", "大张伟");

        // 获取 所有的 entry对象  entrySet
        Set<Entry<String,String>> entrySet = map.entrySet();

        // 遍历得到每一个entry对象
        for (Entry<String, String> entry : entrySet) {
           	// 解析 
            String key = entry.getKey();
            String value = entry.getValue();  
            System.out.println(key+"的CP是:"+value);
        }
    }
}
~~~

> tips：Map集合不能直接使用迭代器或者foreach进行遍历。但是转成Set之后就可以使用了。

**存储自定义类型键值**

练习：每位学生（姓名，年龄）都有自己的家庭住址。那么，既然有对应关系，则将学生对象和家庭住址存储到map集合中。学生作为键, 家庭住址作为值。

> 注意，学生姓名相同并且年龄相同视为同一名学生。

编写学生类：

~~~java
public class Student {
    private String name;
    private int age;

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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
~~~

编写测试类：

~~~java 
public class HashMapTest {
    public static void main(String[] args) {
        //1,创建Hashmap集合对象。
        Map<Student,String>map = new HashMap<Student,String>();
        //2,添加元素。
        map.put(newStudent("lisi",28), "上海");
        map.put(newStudent("wangwu",22), "北京");
        map.put(newStudent("zhaoliu",24), "成都");
        map.put(newStudent("zhouqi",25), "广州");
        map.put(newStudent("wangwu",22), "南京");
        
        //3,取出元素。键找值方式
        Set<Student>keySet = map.keySet();
        for(Student key: keySet){
            Stringvalue = map.get(key);
            System.out.println(key.toString()+"....."+value);
        }
    }
}
~~~

* 当给HashMap中存放自定义对象时，如果自定义对象作为key存在，这时要保证对象唯一，必须复写对象的hashCode和equals方法(如果忘记，请回顾HashSet存放自定义对象)。
* 如果要保证map中存放的key和取出的顺序一致，可以使用`java.util.LinkedHashMap`集合来存放。

#### LinkedHashMap

> **LinkedHashMap<K,V>**：HashMap下有个子类LinkedHashMap，存储数据采用的哈希表结构+链表结构。通过链表结构可以保证元素的存取顺序（元素输入顺序）一致，不按照key值排序；通过哈希表结构可以保证的键的唯一、不重复，需要重写键的hashCode()方法, equals()方法。
>
> **输入顺序排序，key值不排序**

~~~java
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
        map.put("邓超", "孙俪");
        map.put("李晨", "范冰冰");
        map.put("刘德华", "朱丽倩");
        Set<Entry<String, String>> entrySet = map.entrySet();
        for (Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }
}
~~~

结果:

~~~
邓超  孙俪
李晨  范冰冰
刘德华  朱丽倩
~~~

---

## 7 异常处理

### 7.1 异常

**异常概念**

异常，就是不正常的意思。在生活中:医生说,你的身体某个部位有异常,该部位和正常相比有点不同,该部位的功能将受影响.在程序中的意思就是：

* **异常** ：指的是程序在执行过程中，出现的非正常的情况，最终会导致JVM的非正常停止。

在Java等面向对象的编程语言中，异常本身是一个类，产生异常就是创建异常对象并抛出了一个异常对象。Java处理异常的方式是中断处理。

> 异常指的并不是语法错误,语法错了,编译不通过,不会产生字节码文件,根本不能运行.

---

**异常体系**

异常机制其实是帮助我们**找到**程序中的问题，异常的根类是`java.lang.Throwable`，其下有两个子类：`java.lang.Error`与`java.lang.Exception`，平常所说的异常指`java.lang.Exception`。

**Throwable体系：**

* **Error**: 严重错误Error，无法通过处理的错误，只能事先避免，好比绝症。
* **Exception**: 表示异常，异常产生后程序员可以通过代码的方式纠正，使程序继续运行，是必须要处理的。好比感冒、阑尾炎。

**Throwable中的常用方法：**

* `public void printStackTrace()`: 打印异常的详细信息。

  > 包含了异常的类型，异常的原因，还包括异常出现的位置，在开发和调试阶段，都得使用printStackTrace

* `public String getMessage()`: 获取发生异常的原因。

  > 提示给用户的时候，就提示错误原因

* `public String toString()`: 获取异常的类型和异常描述信息(不用)。

---

**异常分类**

我们平常说的异常就是指Exception，因为这类异常一旦出现，我们就要对代码进行更正，修复程序。

**异常(Exception)的分类**:根据在编译时期还是运行时期去检查异常?

* **编译时期异常**: 必须显示处理，否则程序就会发生错误，无法通过编译
* **运行时期异常**: 无需显示处理，也可以和编译时异常一样处理

[异常产生过程解析](#异常产生过程解析)

---

### 7.2 异常的处理

**抛出异常throw**

在java中，提供了一个**throw**关键字，它用来抛出一个指定的异常对象。

1. 创建一个异常对象。封装一些提示信息(信息可以自己编写)。

2. 需要将这个异常对象告知给调用者。怎么告知呢？怎么将这个异常对象传递到调用者处呢？通过关键字throw就可以完成。throw 异常对象。

   throw**用在方法内**，用来抛出一个异常对象，将这个异常对象传递到调用者处，并结束当前方法的执行。

**使用格式：**

~~~
throw new 异常类名(参数);
~~~

 例如：

~~~java
throw new NullPointerException("要访问的arr数组不存在");

throw new ArrayIndexOutOfBoundsException("该索引在数组中不存在，已超出范围");
~~~

学习完抛出异常的格式后，我们通过下面程序演示下throw的使用。

~~~java
public class ThrowDemo {
    public static void main(String[] args) {
        //创建一个数组 
        int[] arr = {2,4,52,2};
        //根据索引找对应的元素 
        int index = 4;
        int element = getElement(arr, index);

        System.out.println(element);
        System.out.println("over");
    }
    /*
     * 根据 索引找到数组中对应的元素
     */
    public static int getElement(int[] arr,int index){ 
       	//判断  索引是否越界
        if(index<0 || index>arr.length-1){
             /*
             判断条件如果满足，当执行完throw抛出异常对象后，方法已经无法继续运算。
             这时就会结束当前方法的执行，并将异常告知给调用者。这时就需要通过异常来解决。 
              */
             throw new ArrayIndexOutOfBoundsException("哥们，角标越界了~~~");
        }
        int element = arr[index];
        return element;
    }
}
~~~

> 注意：如果产生了问题，我们就会throw将问题描述类即异常进行抛出，也就是将问题返回给该方法的调用者。
>
> 那么对于调用者来说，该怎么处理呢？一种是进行捕获处理，另一种就是继续讲问题声明出去，使用throws声明处理。

---

**声明异常throws**

**声明异常**：将问题标识出来，报告给调用者。如果方法内通过throw抛出了编译时异常，而没有捕获处理（稍后讲解该方式），那么必须通过throws进行声明，让调用者去处理。

关键字**throws**运用于方法声明之上,用于表示当前方法不处理异常,而是提醒该方法的调用者来处理异常(抛出异常).

**声明异常格式：**

~~~
修饰符 返回值类型 方法名(参数) throws 异常类名1,异常类名2…{   }	
~~~

声明异常的代码演示：

~~~java
public class ThrowsDemo {
    public static void main(String[] args) throws FileNotFoundException {
        read("a.txt");
    }

    // 如果定义功能时有问题发生需要报告给调用者。可以通过在方法上使用throws关键字进行声明
    public static void read(String path) throws FileNotFoundException {
        if (!path.equals("a.txt")) {//如果不是 a.txt这个文件 
            // 我假设  如果不是 a.txt 认为 该文件不存在 是一个错误 也就是异常  throw
            throw new FileNotFoundException("文件不存在");
        }
    }
}
~~~

throws用于进行异常类的声明，若该方法可能有多种异常情况产生，那么在throws后面可以写多个异常类，用逗号隔开。

~~~java
public class ThrowsDemo2 {
    public static void main(String[] args) throws IOException {
        read("a.txt");
    }

    public static void read(String path)throws FileNotFoundException, IOException {
        if (!path.equals("a.txt")) {//如果不是 a.txt这个文件 
            // 我假设  如果不是 a.txt 认为 该文件不存在 是一个错误 也就是异常  throw
            throw new FileNotFoundException("文件不存在");
        }
        if (!path.equals("b.txt")) {
            throw new IOException();
        }
    }
}
~~~

> **throws**
>
> 用在方法声明后面，跟的是异常类名
>
> 表示抛出异常，由该方法的调用者来处理
>
> 表示出现异常的一种可能性，并不一定会发生这些异常
>
> **throw**
>
> 用在方法体内，跟的是异常对象名
>
> 表示抛出异常，由方法体内的语句处理
>
> 执行 throw 一定抛出了某种异常

---

**捕获异常try…catch**

如果异常出现的话,会立刻终止程序,所以我们得处理异常

**try-catch**的方式就是捕获异常。

* **捕获异常**：Java中对异常有针对性的语句进行捕获，可以对出现的异常进行指定方式的处理。

捕获异常语法如下：

~~~java
try{
     编写可能会出现异常的代码
}catch(异常类型A  e){ //当try中出现异常类型A，就用该catch来捕获
     处理异常的代码
     //记录日志/打印异常信息/继续抛出异常
}
~~~

**try：**该代码块中编写可能产生异常的代码。

**catch：**用来进行某种异常的捕获，实现对捕获到的异常进行处理。

> 注意:try和catch都不能单独使用,必须连用。

> **执行流程：**
>
> 程序从 try 里面的代码开始执行
>
> 出现异常，会自动生成一个异常类对象，该异常对象将被提交给Java运行时系统
>
> 当Java运行时系统接收到异常对象时，会到catch中去找匹配的异常类，找到后进行异常的处理
>
> 执行完毕之后，程序还可以继续往下执行

演示如下：

~~~java
public class TryCatchDemo {
    public static void main(String[] args) {
        try {// 当产生异常时，必须有处理方式。要么捕获，要么声明。
            read("b.txt");
        } catch (FileNotFoundException e) {// 括号中需要定义什么呢？
          	//try中抛出的是什么异常，在括号中就定义什么异常类型
            System.out.println(e);
        }
        System.out.println("over");
    }
    /*
     *
     * 我们 当前的这个方法中 有异常  有编译期异常
     */
    public static void read(String path) throws FileNotFoundException {
        if (!path.equals("a.txt")) {//如果不是 a.txt这个文件 
            // 我假设  如果不是 a.txt 认为 该文件不存在 是一个错误 也就是异常  throw
            throw new FileNotFoundException("文件不存在");
        }
    }
}
~~~

> **try...catch:** 会处理异常，程序继续执行
>
> **thorws、thorw：**将异常传球，最终JVM找不到处理方式而终止程序

---

**finally 代码块**

**finally**：有一些特定的代码无论异常是否发生，都需要执行。另外，因为异常会引发程序跳转，导致有些语句执行不到。而finally就是解决这个问题的，在finally代码块中存放的代码都是一定会被执行的。

什么时候的代码必须最终执行？

当我们在try语句块中打开了一些物理资源(磁盘文件/网络连接/数据库连接等),我们都得在使用完之后,最终关闭打开的资源。

**finally的语法:**

 `try...catch....finally`: 自身需要处理异常,最终还得关闭资源。

> 注意:finally不能单独使用。

比如在我们之后学习的IO流中，当打开了一个关联文件的资源，最后程序不管结果如何，都需要把这个资源关闭掉。

finally代码参考如下：

~~~java
public class TryCatchDemo4 {
    public static void main(String[] args) {
        try {
            read("a.txt");
        } catch (FileNotFoundException e) {
            //抓取到的是编译期异常  抛出去的是运行期 
            throw new RuntimeException(e);
        } finally {
            System.out.println("不管程序怎样，这里都将会被执行。");
        }
        System.out.println("over");
    }
    /*
     *
     * 我们 当前的这个方法中 有异常  有编译期异常
     */
    public static void read(String path) throws FileNotFoundException {
        if (!path.equals("a.txt")) {//如果不是 a.txt这个文件 
            // 我假设  如果不是 a.txt 认为 该文件不存在 是一个错误 也就是异常  throw
            throw new FileNotFoundException("文件不存在");
        }
    }
}
~~~

> 当只有在try或者catch中调用退出JVM的相关方法,此时finally才不会执行,否则finally永远会执行。

---

**自定义异常**

要求：我们模拟注册操作，如果用户名已存在，则抛出异常并提示：亲，该用户名已经被注册。

首先定义一个登陆异常类RegisterException：

~~~java
// 业务逻辑异常
public class RegisterException extends Exception {
    /**
     * 空参构造
     */
    public RegisterException() {
    }

    /**
     *
     * @param message 表示异常提示
     */
    public RegisterException(String message) {
        super(message);
    }
}
~~~

模拟登陆操作，使用数组模拟数据库中存储的数据，并提供当前注册账号是否存在方法用于判断。

~~~java
public class Demo {
    // 模拟数据库中已存在账号
    private static String[] names = {"bill","hill","jill"};
   
    public static void main(String[] args) {     
        //调用方法
        try{
              // 可能出现异常的代码
            checkUsername("bill");
            System.out.println("注册成功");//如果没有异常就是注册成功
        }catch(RegisterException e){
            //处理异常
            e.printStackTrace();
        }
    }

    //判断当前注册账号是否存在
    //因为是编译期异常，又想调用者去处理 所以声明该异常
    public static boolean checkUsername(String uname) throws RegisterException{
        for (String name : names) {
            if(name.equals(uname)){//如果名字在这里面 就抛出登陆异常
                throw new RegisterException("亲"+name+"已经被注册了！");
            }
        }
        return true;
    }
}

运行结果：
cn.text3.RegisterException: 亲bill已经被注册了！
	at cn.text3.Practice.checkUsername(Practice.java:28)
	at cn.text3.Practice.main(Practice.java:15)
~~~

---

## 8 多线程

### 8.1 线程

**概念**

* **并发**：指两个或多个事件在**同一个时间段内**发生
* **并行**：指两个或多个事件在**同一时刻**发生（同时发生）

* **进程**：是指一个内存中运行的应用程序，每个进程都有一个独立的内存空间，一个应用程序可以同时运行多个进程；进程也是程序的一次执行过程，是系统运行程序的基本单位；系统运行一个程序即是一个进程从创建、运行到消亡的过程。

* **线程**：线程是进程中的一个执行单元，负责当前进程中程序的执行，一个进程中至少有一个线程。一个进程中是可以有多个线程的，这个应用程序也可以称之为多线程程序。 

  简而言之：一个程序运行后至少有一个进程，一个进程中可以包含多个线程 

---

**多线程的创建**

**方式一：Thread 类**

> 1. 定义子类继承Thread类。
>
> 2. 子类中重写Thread类中的run方法。（ run()方法的方法体就代表了线程需要完成的任务,因此把run()方法称为线程执行体 ）
>
> 3. 创建Thread子类对象，即创建了线程对象。
>
> 4. 调用线程对象start方法: 启动线程，调用run方法。

~~~java
public class Demo01 {
	public static void main(String[] args) {
		//创建自定义线程对象
		MyThread mt = new MyThread("新的线程！");
		//开启新线程
		mt.start();
		//在主方法中执行for循环
		for (int i = 0; i < 10; i++) {
			System.out.println("main线程！"+i);
		}
	}
}
~~~

自定义线程类：

~~~java
public class MyThread extends Thread {
	//定义指定线程名称的构造方法
	public MyThread(String name) {
		//调用父类的String参数的构造方法，指定线程的名称
		super(name);
	}
	/**
	 * 重写run方法，完成该线程执行的逻辑
	 */
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName()+"：正在执行！"+i);
		}
	}
}
~~~

**构造方法：**

+ `public Thread()` :分配一个新的线程对象。
+ `public Thread(String name)` :分配一个指定名字的新的线程对象。
+ `public Thread(Runnable target)` :分配一个带有指定目标新的线程对象。
+ `public Thread(Runnable target,String name)` :分配一个带有指定目标新的线程对象并指定名字。

**常用方法：**

+ `public String getName()` :获取当前线程名称。
+ `public void start()` :导致此线程开始执行; Java虚拟机调用此线程的run方法。
+ `public void run()` :此线程要执行的任务在此处定义代码。
+ `public static void sleep(long millis)` :使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行）。
+ `public static Thread currentThread()` :返回对当前正在执行的线程对象的引用

---

**方式二：Runnable 接口**

采用 `java.lang.Runnable` 也是非常常见的一种，我们只需要重写run方法即可。

> 1. 定义Runnable接口的实现类，并重写该接口的run()方法
> 2. 创建Runnable实现类的实例，并以此实例作为Thread的target来创建Thread对象，该Thread对象才是真正的线程对象。
>
> 3. 调用线程对象的start()方法来启动线程。

```java
public class Demo01 {
    public static void main(String[] args) {
//创建自定义类对象 线程任务对象
        MyRunnable mr = new MyRunnable();
//创建线程对象
        Thread t = new Thread(mr,
                "小强");
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("旺财 " + i);
        }
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
```

> **实现`Runnable接口`比继承`Thread类`所具有的优势：**
>
> 1. 适合多个相同的程序代码的线程去共享同一个资源。
> 2. 可以避免java中的单继承的局限性。
> 3. 增加程序的健壮性，实现解耦操作，代码可以被多个线程共享，代码和线程独立。
> 4. 线程池只能放入实现Runable或Callable类线程，不能直接放入继承Thread的类。

---

### 8.2 线程安全

**线程安全问题**

我们通过一个案例，演示线程的安全问题：
电影院要卖票，我们模拟电影院的卖票过程。假设要播放的电影是 “葫芦娃大战奥特曼”，本次电影的座位共100个(本场电影只能卖100张票)。我们来模拟电影院的售票窗口，实现多个窗口同时卖 “葫芦娃大战奥特曼”这场电影票(多个窗口一起卖这100张票)
需要窗口，采用线程对象来模拟；需要票，Runnable接口子类来模拟

```java
//Ticket.java
public class Ticket implements Runnable{
    private int ticket = 30;
    /*
     * 执行卖票操作
     */
    @Override
    public void run() {
        //每个窗口卖票的操作
        //窗口 永远开启
        while (true) {
            if (ticket > 0) {//有票 可以卖
                //出票操作
                //使用sleep模拟一下出票时间
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                // TODO Auto‐generated catch block
                    e.printStackTrace();
                }
                //获取当前线程对象的名字
                String name = Thread.currentThread().getName();
                System.out.println(name + "正在卖:" + ticket--);
            }else{
                break;
            }
        }
    }

}

//Demo.java
public class Demo {
    public static void main(String[] args) {
        //创建线程任务对象
        Ticket ticket = new Ticket();
        //创建三个窗口对象
        Thread t1 = new Thread(ticket,
                "窗口1");
        Thread t2 = new Thread(ticket,
                "窗口2");
        Thread t3 = new Thread(ticket,
                "窗口3");
        //同时卖票
        t1.start();
        t2.start();
        t3.start();
    }
}

运行结果：
窗口1正在卖:30
窗口2正在卖:29
窗口3正在卖:28
窗口2正在卖:26
窗口1正在卖:25
窗口3正在卖:27
窗口1正在卖:24
窗口3正在卖:22
窗口2正在卖:23
窗口1正在卖:21
窗口3正在卖:20
窗口2正在卖:19
窗口3正在卖:18
窗口1正在卖:17
窗口2正在卖:16
窗口1正在卖:14
窗口3正在卖:15
窗口2正在卖:13
窗口1正在卖:12
窗口3正在卖:12
窗口2正在卖:11
窗口1正在卖:10
窗口3正在卖:9
窗口2正在卖:8
窗口1正在卖:7
窗口3正在卖:6
窗口2正在卖:5
窗口3正在卖:4
窗口1正在卖:4
窗口2正在卖:3
窗口1正在卖:2
窗口3正在卖:1
窗口2正在卖:0
窗口1正在卖:-1
```

---

> **线程同步**
>
> 1. 同步代码块
>
> 2. 同步方法
> 3. 锁机制

**1. 同步代码块**

`synchronized` 关键字可以用于方法中的某个区块中，表示只对这个区块的资源实行互斥访问。

```java
synchronized(同步锁){
		需要同步操作的代码
}
```

同步锁:  对象的同步锁只是一个概念,可以想象为在对象上标记了一个锁

> 在任何时候,最多允许一个线程拥有同步锁,谁拿到锁就进入代码块,其他的线程只能在外等着(BLOCKED)

```java
public class Ticket implements Runnable{
    private int ticket = 30;

    Object lock = new Object();
    /*
     * 执行卖票操作
     */
    @Override
    public void run() {
        //每个窗口卖票的操作
        //窗口 永远开启
        while (true) {
            synchronized (lock) {
                if (ticket > 0) {//有票 可以卖
                    //出票操作
                    //使用sleep模拟一下出票时间
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto‐generated catch block
                        e.printStackTrace();
                    }
                    //获取当前线程对象的名字
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "正在卖:" + ticket--);
                }else{
                    break;
                }
            }
        }
    }

}
```

**2. 同步方法**

使用`synchronized`修饰的方法，就叫做同步方法，保证A线程执行该方法的时候，其他线程只能在方法外等着

```java
public synchronized void method(){
		可能会产生线程安全问题的代码
}
```

> 同步锁是谁?
> 对于非static方法,同步锁就是this
> 对于static方法,我们使用当前方法所在类的字节码对象(类名.class)

```java
public class Ticket implements Runnable{
		private int ticket = 100;
		/*
		* 执行卖票操作
		*/
		@Override
		public void run() {
				//每个窗口卖票的操作
				//窗口 永远开启
				while(true){
							sellTicket();
				}
		}
  
		/*
		* 锁对象 是 谁调用这个方法 就是谁
		* 隐含 锁对象 就是 this
		*/
		public synchronized void sellTicket(){
				if(ticket>0){//有票 可以卖
						//出票操作
						//使用sleep模拟一下出票时间
						try {
								Thread.sleep(100);
						} catch (InterruptedException e) {
								// TODO Auto‐generated catch block
								e.printStackTrace();
            }
						//获取当前线程对象的名字
						String name = Thread.currentThread().getName();
						System.out.println(name+"正在卖:"+ticket‐‐);
				}
		}
}
```

**3. Lock 锁**

`java.util.concurrent.locks.Lock` 机制提供了比`synchronized`代码块和`synchronized`方法更广泛的锁定操作,同步代码块/同步方法具有的功能`Lock`都有,除此之外更强大,更体现面向对象。
`Lock锁`也称同步锁，加锁与释放锁方法化了，如下：

+ `public void lock()` :  加同步锁
+ `public void unlock()` :  释放同步锁

```java
public class Ticket implements Runnable{
		private int ticket = 30;
  
		Lock lock = new ReentrantLock();
  	//private ReentrantLock lock = new ReetrantLock();
		/*
		* 执行卖票操作
		*/
		@Override
		public void run() {
				//每个窗口卖票的操作
				//窗口 永远开启
				while(true){
						lock.lock();
						if(ticket>0){//有票 可以卖
								//出票操作
								//使用sleep模拟一下出票时间
								try {
										Thread.sleep(50);
								} catch (InterruptedException e) {
										// TODO Auto‐generated catch block
										e.printStackTrace();
								}
								//获取当前线程对象的名字
								String name = Thread.currentThread().getName();
								System.out.println(name+"正在卖:"+ticket‐‐);
						}
						lock.unlock();
				}
		}
}
```

---

### 8.3 线程状态

定义在`java.lang.Object`类中

> **wait()**:  令当前线程挂起并放弃CPU、同步资源并等待，使别的线程可访问并修改共享资源，而当前线程排队等候其他线程调用`notify()`或`notifyAll()`方法唤醒，唤醒后等待重新获得对监视器的所有 权后才能继续执行。
>
> **notify()**:  唤醒正在排队等待同步资源的线程中优先级最高者结束等待
>
> **notifyAll()**:  唤醒正在排队等待资源的所有线程结束等待.

> ⚠️  **以上必须使用在同步代码块或同步方法中**
>
> ⚠️  **三种方法的调用者必须是同步代码块或同步方法中的同步监视器（锁）**

```java
public class Ticket implements Runnable{
    private int ticket = 30;

  	//Object lock = new Object();
  
    @Override
    public void run() {
        //每个窗口卖票的操作
        //窗口 永远开启
        while (true) {
            synchronized (this) {
            //synchronized (lock) {

                notifyAll();  //相当于this.notifyAll();
								//lock.notifyAll();
              
                if (ticket > 0) {//有票 可以卖
                    //出票操作
                    //使用sleep模拟一下出票时间
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        // TODO Auto‐generated catch block
                        e.printStackTrace();
                    }
                    //获取当前线程对象的名字
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "正在卖:" + ticket--);

                    try {
                        wait();
                      	//lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    break;
                }
            }
        }
    }

}
```

>**sleep() 和 wait() 的区别**
>
>sleep() 在Thread类中，wait() 在Object类中
>
>sleep() 可以在任何地方调用，wait() 必须在同步代码块或同步方法中调用
>
>sleep() 不会释放锁，wait() 会释放锁

---

### 8.4 线程池

**概念**

+ **线程池：**其实就是一个容纳多个线程的容器，其中的线程可以反复使用，省去了频繁创建线程对象的操作，无需反复创建线程而消耗过多资源。

+ **合理利用线程池能够带来三个好处：**

1. 降低资源消耗。减少了创建和销毁线程的次数，每个工作线程都可以被重复利用，可执行多个任务。
2. 提高响应速度。当任务到达时，任务可以不需要的等到线程创建就能立即执行。
3. 提高线程的可管理性。可以根据系统的承受能力，调整线程池中工作线线程的数目，防止因为消耗过多的内存，而把服务器累趴下(每个线程需要大约1MB内存，线程开的越多，消耗的内存也就越大，最后死机)。

**使用**

Java里面线程池的顶级接口是`java.util.concurrent.Executor`，但是严格意义上讲`Executor`并不是一个线程池，而只是一个执行线程的工具。真正的线程池接口是`java.util.concurrent.ExecutorService`。

要配置一个线程池是比较复杂的，尤其是对于线程池的原理不是很清楚的情况下，很有可能配置的线程池不是较优的，因此在`java.util.concurrent.Executors`线程工厂类里面提供了一些静态工厂，生成一些常用的线程池。官方建议使用Executors工程类来创建线程池对象。

Executors类中有个创建线程池的方法如下：

* `public static ExecutorService newFixedThreadPool(int nThreads)`：返回线程池对象。(创建的是有界线程池,也就是池中的线程个数可以指定最大数量)

获取到了一个线程池ExecutorService 对象，那么怎么使用呢，在这里定义了一个使用线程池对象的方法如下：

* `public Future<?> submit(Runnable task)`:获取线程池中的某一个线程对象，并执行

  > Future接口：用来记录线程任务执行完毕后产生的结果。线程池创建与使用。

使用线程池中线程对象的步骤：

1. 创建线程池对象。
2. 创建Runnable接口子类对象。(task)
3. 提交Runnable接口子类对象。(take task)
4. 关闭线程池(一般不做)。

Runnable实现类代码：

~~~java
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("我要一个教练");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("教练来了： " + Thread.currentThread().getName());
        System.out.println("教我游泳,交完后，教练回到了游泳池");
    }
}
~~~

线程池测试类：

~~~java
public class ThreadPoolDemo {
    public static void main(String[] args) {
        // 创建线程池对象
        ExecutorService service = Executors.newFixedThreadPool(2);//包含2个线程对象
        // 创建Runnable实例对象
        MyRunnable r = new MyRunnable();

        //自己创建线程对象的方式
        // Thread t = new Thread(r);
        // t.start(); ---> 调用MyRunnable中的run()

        // 从线程池中获取线程对象,然后调用MyRunnable中的run()
        service.submit(r);
        // 再获取个线程对象，调用MyRunnable中的run()
        service.submit(r);
        service.submit(r);
        // 注意：submit方法调用结束后，程序并不终止，是因为线程池控制了线程的关闭。
        // 将使用完的线程又归还到了线程池中
        // 关闭线程池
        //service.shutdown();
    }
}
~~~

---

### 8.5 Lambda 表达式

面向对象的思想:

​	做一件事情,找一个能解决这个事情的对象,调用对象的方法,完成事情.

函数式编程思想:

​	只要能获取到结果,谁去做的,怎么做的都不重要,重视的是结果,不重视过程

**Lambda表达式的标准格式为：**

```
(参数类型 参数名称) -> { 代码语句 }
```

格式说明：

* 小括号内的语法与传统方法参数列表一致：无参数则留空；多个参数则用逗号分隔。
* `->`是新引入的语法格式，代表指向动作。
* 大括号内的语法与传统方法体要求基本一致。

**使用Lambda标准格式（无参无返回）**

给定一个厨子`Cook`接口，内含唯一的抽象方法`makeFood`，且无参数、无返回值。如下：

```java
public interface Cook {
    void makeFood();
}
```

在下面的代码中，使用Lambda的**标准格式**调用`invokeCook`方法，打印输出“吃饭啦！”字样：

```java
public class Demo05InvokeCook {
    public static void main(String[] args) {
    invokeCook(() -> {
      	System.out.println("吃饭啦！");
    });
}

    private static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}
```

> 备注：小括号代表`Cook`接口`makeFood`抽象方法的参数为空，大括号代表`makeFood`的方法体。

**Lambda的参数和返回值**

```
需求:
    使用数组存储多个Person对象
    对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序
```

下面举例演示`java.util.Comparator<T>`接口的使用场景代码，其中的抽象方法定义为：

* `public abstract int compare(T o1, T o2);`

当需要对一个对象数组进行排序时，`Arrays.sort`方法需要一个`Comparator`接口实例来指定排序的规则。假设有一个`Person`类，含有`String name`和`int age`两个成员变量：

```java
public class Person { 
    private String name;
    private int age;
    
    // 省略构造器、toString方法与Getter Setter 
}
```

**传统写法**

如果使用传统的代码对`Person[]`数组进行排序，写法如下：

```java
import java.util.Arrays;
import java.util.Comparator;

public class Demo06Comparator {
    public static void main(String[] args) {
      	// 本来年龄乱序的对象数组
        Person[] array = {
        	new Person("古力娜扎", 19),
        	new Person("迪丽热巴", 18),
       		new Person("马尔扎哈", 20) };

      	// 匿名内部类
        Comparator<Person> comp = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Arrays.sort(array, comp); // 第二个参数为排序规则，即Comparator接口实例

        for (Person person : array) {
            System.out.println(person);
        }
    }
}
```

这种做法在面向对象的思想中，似乎也是“理所当然”的。其中`Comparator`接口的实例（使用了匿名内部类）代表了“按照年龄从小到大”的排序规则。

**Lambda写法**

```java
import java.util.Arrays;

public class Demo07ComparatorLambda {
    public static void main(String[] args) {
        Person[] array = {
          	new Person("古力娜扎", 19),
          	new Person("迪丽热巴", 18),
          	new Person("马尔扎哈", 20) };

        Arrays.sort(array, (Person a, Person b) -> {
          	return a.getAge() - b.getAge();
        });

        for (Person person : array) {
            System.out.println(person);
        }
    }
}
```

---

## 9 Java I/O

### 9.1 I/O概述

根据数据的流向分为：**输入流**和**输出流**。

* **输入流** ：把数据从`其他设备`上读取到`内存`中的流。 
* **输出流** ：把数据从`内存` 中写出到`其他设备`上的流。

格局数据的类型分为：**字节流**和**字符流**。

* **字节流** ：以字节为单位，读写数据的流。
* **字符流** ：以字符为单位，读写数据的流。

|            |           **输入流**            |              输出流              |
| :--------: | :-----------------------------: | :------------------------------: |
| **字节流** | 字节输入流<br />**InputStream** | 字节输出流<br />**OutputStream** |
| **字符流** |   字符输入流<br />**Reader**    |    字符输出流<br />**Writer**    |

### 9.2 File类

`java.io.File` 类是文件和目录路径名的抽象表示，主要用于文件和目录的创建、查找和删除等操作。

---

**构造方法**

* `public File(String pathname) ` ：通过将给定的**路径名字符串**转换为抽象路径名来创建新的 File实例。  
* `public File(String parent, String child) ` ：从**父路径名字符串和子路径名字符串**创建新的 File实例。
* `public File(File parent, String child)` ：从**父抽象路径名和子路径名字符串**创建新的 File实例。  

构造举例，代码如下：

```java
// 文件路径名
String pathname = "D:\\aaa.txt";
File file1 = new File(pathname); 

// 文件路径名
String pathname2 = "D:\\aaa\\bbb.txt";
File file2 = new File(pathname2); 

// 通过父路径和子路径字符串
 String parent = "d:\\aaa";
 String child = "bbb.txt";
 File file3 = new File(parent, child);

// 通过父级File对象和子路径字符串
File parentDir = new File("d:\\aaa");
String child = "bbb.txt";
File file4 = new File(parentDir, child);
```

> 小贴士：
>
> 1. 一个File对象代表硬盘中实际存在的一个文件或者目录。
> 2. 无论该路径下是否存在文件或者目录，都不影响File对象的创建。

---

**常用方法**

**获取功能的方法**

* `public String getAbsolutePath() ` ：返回此File的绝对路径名字符串。

* ` public String getPath() ` ：将此File转换为路径名字符串。 

* `public String getName()`  ：返回由此File表示的文件或目录的名称。  

* `public long length()`  ：返回由此File表示的文件的长度。 

  方法演示，代码如下：

  ```java
  public class FileGet {
      public static void main(String[] args) {
          File f = new File("d:/aaa/bbb.java");     
          System.out.println("文件绝对路径:"+f.getAbsolutePath());
          System.out.println("文件构造路径:"+f.getPath());
          System.out.println("文件名称:"+f.getName());
          System.out.println("文件长度:"+f.length()+"字节");
  
          File f2 = new File("d:/aaa");     
          System.out.println("目录绝对路径:"+f2.getAbsolutePath());
          System.out.println("目录构造路径:"+f2.getPath());
          System.out.println("目录名称:"+f2.getName());
          System.out.println("目录长度:"+f2.length());
      }
  }
  输出结果：
  文件绝对路径:d:\aaa\bbb.java
  文件构造路径:d:\aaa\bbb.java
  文件名称:bbb.java
  文件长度:636字节
  
  目录绝对路径:d:\aaa
  目录构造路径:d:\aaa
  目录名称:aaa
  目录长度:4096
  ```

> API中说明：length()，表示文件的长度。但是File对象表示目录，则返回值未指定。

**绝对路径和相对路径**

* **绝对路径**：从盘符开始的路径，这是一个完整的路径。
* **相对路径**：相对于项目目录的路径，这是一个便捷的路径，开发中经常使用。

```java
public class FilePath {
    public static void main(String[] args) {
      	// 绝对路径
        File f = new File("Desktop/aaa.txt");
        System.out.println(f.getAbsolutePath());

        // 相对路径
        System.out.println(f.getPath());
    }
}
输出结果：
/Users/momo/IdeaProjects/Java/Desktop/aaa.txt
Desktop/aaa.txt
```

**判断功能的方法**

- `public boolean exists()` ：此File表示的文件或目录是否实际存在。
- `public boolean isDirectory()` ：此File表示的是否为目录。
- `public boolean isFile()` ：此File表示的是否为文件。


方法演示，代码如下：

```java
public class FileIs {
    public static void main(String[] args) {
        File f = new File("d:\\aaa\\bbb.java");
        File f2 = new File("d:\\aaa");
      	// 判断是否存在
        System.out.println("d:\\aaa\\bbb.java 是否存在:"+f.exists());
        System.out.println("d:\\aaa 是否存在:"+f2.exists());
      	// 判断是文件还是目录
        System.out.println("d:\\aaa 文件?:"+f2.isFile());
        System.out.println("d:\\aaa 目录?:"+f2.isDirectory());
    }
}
输出结果：
d:\aaa\bbb.java 是否存在:true
d:\aaa 是否存在:true
d:\aaa 文件?:false
d:\aaa 目录?:true
```

**创建删除功能的方法**

- `public boolean createNewFile()` ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。 
- `public boolean delete()` ：删除由此File表示的文件或目录。  
- `public boolean mkdir()` ：创建由此File表示的目录。
- `public boolean mkdirs()` ：创建由此File表示的目录，包括任何必需但不存在的父目录。

方法演示，代码如下：

```java
public class FileCreateDelete {
    public static void main(String[] args) throws IOException {
        // 文件的创建
        File f = new File("aaa.txt");
        System.out.println("是否存在:"+f.exists()); // false
        System.out.println("是否创建:"+f.createNewFile()); // true
        System.out.println("是否存在:"+f.exists()); // true
		
     	// 目录的创建
      	File f2= new File("newDir");	
        System.out.println("是否存在:"+f2.exists());// false
        System.out.println("是否创建:"+f2.mkdir());	// true
        System.out.println("是否存在:"+f2.exists());// true

		// 创建多级目录
      	File f3= new File("newDira\\newDirb");
        System.out.println(f3.mkdir());// false
        File f4= new File("newDira\\newDirb");
        System.out.println(f4.mkdirs());// true
      
      	// 文件的删除
       	System.out.println(f.delete());// true
      
      	// 目录的删除
        System.out.println(f2.delete());// true
        System.out.println(f4.delete());// false
    }
}
```

> API中说明：delete方法，如果此File表示目录，则目录必须为空才能删除。

---

**目录的遍历**

* `public String[] list()` ：返回一个String数组，表示该File目录中的所有子文件或目录。


* `public File[] listFiles()` ：返回一个File数组，表示该File目录中的所有的子文件或目录。  

```java
public class FileFor {
    public static void main(String[] args) {
        File dir = new File("d:\\java_code");
      
      	//获取当前目录下的文件以及文件夹的名称。
		String[] names = dir.list();
		for(String name : names){
			System.out.println(name);
		}
        //获取当前目录下的文件以及文件夹对象，只要拿到了文件对象，那么就可以获取更多信息
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
```

> 小贴士：
>
> 调用listFiles方法的File对象，表示的必须是实际存在的目录，否则返回null，无法进行遍历。

---

### 9.3 字节流

**一切皆为字节**

一切文件数据(文本、图片、视频等)在存储时，都是以二进制数字的形式保存，都一个一个的字节，那么传输时一样如此。所以，字节流可以传输任意文件数据。在操作流的时候，我们要时刻明确，无论使用什么样的流对象，底层传输的始终为二进制数据。

---

**字节输出流【OutputStream】**

`java.io.OutputStream`抽象类是表示字节输出流的所有类的超类，将指定的字节信息写出到目的地。它定义了字节输出流的基本共性功能方法。

- `public void close()` ：关闭此输出流并释放与此流相关联的任何系统资源。  
- `public void flush()` ：刷新此输出流并强制任何缓冲的输出字节被写出。  
- `public void write(byte[] b)`：将 b.length字节从指定的字节数组写入此输出流。  
- `public void write(byte[] b, int off, int len)` ：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。  
- `public abstract void write(int b)` ：将指定的字节输出流。

> 小贴士：
>
> close方法，当完成流的操作时，必须调用此方法，释放系统资源。

**FileOutputStream类**

`OutputStream`有很多子类，我们从最简单的一个子类开始。

`java.io.FileOutputStream`类是文件输出流，用于将数据写出到文件。

**构造方法**

- `public FileOutputStream(File file)`：创建文件输出流以写入由指定的 File对象表示的文件。 
- `public FileOutputStream(String name)`： 创建文件输出流以指定的名称写入文件。  

当你创建一个流对象时，必须传入一个文件路径。该路径下，如果没有这个文件，会创建该文件。如果有这个文件，会清空这个文件的数据。

- 构造举例，代码如下：

```java
public class FileOutputStreamConstructor throws IOException {
    public static void main(String[] args) {
      // 使用File对象创建流对象
        File file = new File("a.txt");
        FileOutputStream fos = new FileOutputStream(file);
      
        // 使用文件名称创建流对象
        FileOutputStream fos = new FileOutputStream("b.txt");
    }
}
```

**写出字节数据**

**写出字节**：`write(int b)` 方法，每次可以写出一个字节数据，代码使用演示：

```java
public class FOSWrite {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileOutputStream fos = new FileOutputStream("fos.txt");     
        // 写出数据
        fos.write(97); // 写出第1个字节
        fos.write(98); // 写出第2个字节
        fos.write(99); // 写出第3个字节
        // 关闭资源
        fos.close();
    }
}
输出结果：
abc
```

> 小贴士：
>
> 1. 虽然参数为int类型四个字节，但是只会保留一个字节的信息写出。
> 2. 流操作完毕后，必须释放系统资源，调用close方法，千万记得。

**写出字节数组**：`write(byte[] b)`，每次可以写出数组中的数据，代码使用演示：

```java
public class FOSWrite {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileOutputStream fos = new FileOutputStream("fos.txt");     
        // 字符串转换为字节数组
        byte[] b = "黑马程序员".getBytes();
        // 写出字节数组数据
        fos.write(b);
        // 关闭资源
        fos.close();
    }
}
输出结果：
黑马程序员
```

**写出指定长度字节数组**：`write(byte[] b, int off, int len)` ,每次写出从off索引开始，len个字节，代码使用演示：

```java
public class FOSWrite {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileOutputStream fos = new FileOutputStream("fos.txt");     
        // 字符串转换为字节数组
        byte[] b = "abcde".getBytes();
    // 写出从索引2开始，2个字节。索引2是c，两个字节，也就是cd。
        fos.write(b,2,2);
        // 关闭资源
        fos.close();
    }
}
输出结果：
cd
```

**数据追加续写**

经过以上的演示，每次程序运行，创建输出流对象，都会清空目标文件中的数据。如何保留目标文件中数据，还能继续添加新数据呢？

- `public FileOutputStream(File file, boolean append)`： 创建文件输出流以写入由指定的 File对象表示的文件。  
- `public FileOutputStream(String name, boolean append)`： 创建文件输出流以指定的名称写入文件。  

这两个构造方法，参数中都需要传入一个boolean类型的值，`true` 表示追加数据，`false` 表示清空原有数据。这样创建的输出流对象，就可以指定是否追加续写了，代码使用演示：

```java
public class FOSWrite {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileOutputStream fos = new FileOutputStream("fos.txt"，true);     
        // 字符串转换为字节数组
        byte[] b = "abcde".getBytes();
    // 写出从索引2开始，2个字节。索引2是c，两个字节，也就是cd。
        fos.write(b);
        // 关闭资源
        fos.close();
    }
}
文件操作前：cd
文件操作后：cdabcde
```

**写出换行**

Windows系统里，换行符号是`\r\n` 。把以指定是否追加续写了，代码使用演示：

```java
public class FOSWrite {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileOutputStream fos = new FileOutputStream("fos.txt");  
        // 定义字节数组
        byte[] words = {97,98,99,100,101};
        // 遍历数组
        for (int i = 0; i < words.length; i++) {
            // 写出一个字节
            fos.write(words[i]);
            // 写出一个换行, 换行符号转成数组写出
            fos.write("\r\n".getBytes());
        }
        // 关闭资源
        fos.close();
    }
}

输出结果：
a
b
c
d
e
```

> - 回车符`\r`和换行符`\n` ：
>   - 回车符：回到一行的开头（return）。
>   - 换行符：下一行（newline）。
> - 系统中的换行：
>   - Windows系统里，每行结尾是 `回车+换行` ，即`\r\n`；
>   - Unix系统里，每行结尾只有 `换行` ，即`\n`；
>   - Mac系统里，每行结尾是 `回车` ，即`\r`。从 Mac OS X开始与Linux统一。

---

**字节输入流【InputStream】**

`java.io.InputStream`抽象类是表示字节输入流的所有类的超类，可以读取字节信息到内存中。它定义了字节输入流的基本共性功能方法。

- `public void close()` ：关闭此输入流并释放与此流相关联的任何系统资源。    
- `public abstract int read()`： 从输入流读取数据的下一个字节。 
- `public int read(byte[] b)`： 从输入流中读取一些字节数，并将它们存储到字节数组 b中 。

> 小贴士：
>
> close方法，当完成流的操作时，必须调用此方法，释放系统资源。

**FileInputStream类**

`java.io.FileInputStream`类是文件输入流，从文件中读取字节。

**构造方法**

- `FileInputStream(File file)`： 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的 File对象 file命名。 
- `FileInputStream(String name)`： 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的路径名 name命名。  

当你创建一个流对象时，必须传入一个文件路径。该路径下，如果没有该文件,会抛出`FileNotFoundException` 。

- 构造举例，代码如下：

```java
public class FileInputStreamConstructor throws IOException{
    public static void main(String[] args) {
      // 使用File对象创建流对象
        File file = new File("a.txt");
        FileInputStream fos = new FileInputStream(file);
      
        // 使用文件名称创建流对象
        FileInputStream fos = new FileInputStream("b.txt");
    }
}
```

**读取字节数据**

**读取字节**：`read`方法，每次可以读取一个字节的数据，提升为int类型，读取到文件末尾，返回`-1`，代码使用演示：

```java
public class FISRead {
    public static void main(String[] args) throws IOException{
        // 使用文件名称创建流对象
        FileInputStream fis = new FileInputStream("read.txt");
        // 读取数据，返回一个字节
        int read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        // 读取到末尾,返回-1
        read = fis.read();
        System.out.println( read);
    // 关闭资源
        fis.close();
    }
}
输出结果：
a
b
c
d
e
-1
```

循环改进读取方式，代码使用演示：

```java
public class FISRead {
    public static void main(String[] args) throws IOException{
        // 使用文件名称创建流对象
        FileInputStream fis = new FileInputStream("read.txt");
        // 定义变量，保存数据
        int b ；
        // 循环读取
        while ((b = fis.read())!=-1) {
            System.out.println((char)b);
        }
    // 关闭资源
        fis.close();
    }
}
输出结果：
a
b
c
d
e
```

> 小贴士：
>
> 1. 虽然读取了一个字节，但是会自动提升为int类型。
> 2. 流操作完毕后，必须释放系统资源，调用close方法，千万记得。

**使用字节数组读取**：`read(byte[] b)`，每次读取b的长度个字节到数组中，返回读取到的有效字节个数，读取到末尾时，返回`-1` ，代码使用演示：

```java
public class FISRead {
    public static void main(String[] args) throws IOException{
        // 使用文件名称创建流对象.
        FileInputStream fis = new FileInputStream("read.txt"); // 文件中为abcde
        // 定义变量，作为有效个数
        int len ；
        // 定义字节数组，作为装字节数据的容器   
        byte[] b = new byte[2];
        // 循环读取
        while (( len= fis.read(b))!=-1) {
            // 每次读取后,把数组变成字符串打印
            System.out.println(new String(b));
        }
    // 关闭资源
        fis.close();
    }
}

输出结果：
ab
cd
ed
```

错误数据`d`，是由于最后一次读取时，只读取一个字节`e`，数组中，上次读取的数据没有被完全替换，所以要通过`len` ，获取有效的字节，代码使用演示：

```java
public class FISRead {
    public static void main(String[] args) throws IOException{
        // 使用文件名称创建流对象.
        FileInputStream fis = new FileInputStream("read.txt"); // 文件中为abcde
        // 定义变量，作为有效个数
        int len ；
        // 定义字节数组，作为装字节数据的容器   
        byte[] b = new byte[2];
        // 循环读取
        while (( len= fis.read(b))!=-1) {
            // 每次读取后,把数组的有效字节部分，变成字符串打印
            System.out.println(new String(b，0，len));//  len 每次读取的有效字节个数
        }
    // 关闭资源
        fis.close();
    }
}

输出结果：
ab
cd
e
```

> 小贴士：
>
> 使用数组读取，每次读取多个字节，减少了系统间的IO操作次数，从而提高了读写的效率，建议开发中使用。

---

**字节流练习：图片复制**

复制图片文件，代码使用演示：

```java
public class Copy {
    public static void main(String[] args) throws IOException {
        // 1.创建流对象
        // 1.1 指定数据源
        FileInputStream fis = new FileInputStream("D:\\test.jpg");
        // 1.2 指定目的地
        FileOutputStream fos = new FileOutputStream("test_copy.jpg");

        // 2.读写数据
        // 2.1 定义数组
        byte[] b = new byte[1024];
        // 2.2 定义长度
        int len;
        // 2.3 循环读取
        while ((len = fis.read(b))!=-1) {
            // 2.4 写出数据
            fos.write(b, 0 , len);
        }

        // 3.关闭资源
        fos.close();
        fis.close();
    }
}
```

> 小贴士：
>
> 流的关闭原则：先开后关，后开先关。

---

### 9.4 字符流

当使用字节流读取文本文件时，可能会有一个小问题。就是遇到中文字符时，可能不会显示完整的字符，那是因为一个中文字符可能占用多个字节存储。所以Java提供一些字符流类，以字符为单位读写数据，专门用于处理文本文件。

---

**字符输入流【Reader】**

`java.io.Reader`抽象类是表示用于读取字符流的所有类的超类，可以读取字符信息到内存中。它定义了字符输入流的基本共性功能方法。

- `public void close()` ：关闭此流并释放与此流相关联的任何系统资源。    
- `public int read()`： 从输入流读取一个字符。 
- `public int read(char[] cbuf)`： 从输入流中读取一些字符，并将它们存储到字符数组 cbuf中 。

**FileReader类**  

`java.io.FileReader`类是读取字符文件的便利类。构造时使用系统默认的字符编码和默认字节缓冲区。

> 小贴士：
>
> 1. 字符编码：字节与字符的对应规则。Windows系统的中文编码默认是GBK编码表。
>
>    idea中UTF-8
>
> 2. 字节缓冲区：一个字节数组，用来临时存储字节数据。

**构造方法**

- `FileReader(File file)`： 创建一个新的 FileReader ，给定要读取的File对象。   
- `FileReader(String fileName)`： 创建一个新的 FileReader ，给定要读取的文件的名称。  

当你创建一个流对象时，必须传入一个文件路径。类似于FileInputStream 。

- 构造举例，代码如下：

```java
public class FileReaderConstructor throws IOException{
    public static void main(String[] args) {
      // 使用File对象创建流对象
        File file = new File("a.txt");
        FileReader fr = new FileReader(file);
      
        // 使用文件名称创建流对象
        FileReader fr = new FileReader("b.txt");
    }
}
```

**读取字符数据**

**读取字符**：`read`方法，每次可以读取一个字符的数据，提升为int类型，读取到文件末尾，返回`-1`，循环读取，代码使用演示：

```java
public class FRRead {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileReader fr = new FileReader("read.txt");
        // 定义变量，保存数据
        int b ；
        // 循环读取
        while ((b = fr.read())!=-1) {
            System.out.println((char)b);
        }
    // 关闭资源
        fr.close();
    }
}
输出结果：
黑
马
程
序
员
```

> 小贴士：虽然读取了一个字符，但是会自动提升为int类型。

**使用字符数组读取**：`read(char[] cbuf)`，每次读取b的长度个字符到数组中，返回读取到的有效字符个数，读取到末尾时，返回`-1` ，代码使用演示：

```java
public class FRRead {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileReader fr = new FileReader("read.txt");
        // 定义变量，保存有效字符个数
        int len ；
        // 定义字符数组，作为装字符数据的容器
         char[] cbuf = new char[2];
        // 循环读取
        while ((len = fr.read(cbuf))!=-1) {
            System.out.println(new String(cbuf));
        }
    // 关闭资源
        fr.close();
    }
}
输出结果：
黑马
程序
员序
```

获取有效的字符改进，代码使用演示：

```java
public class FISRead {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileReader fr = new FileReader("read.txt");
        // 定义变量，保存有效字符个数
        int len ；
        // 定义字符数组，作为装字符数据的容器
        char[] cbuf = new char[2];
        // 循环读取
        while ((len = fr.read(cbuf))!=-1) {
            System.out.println(new String(cbuf,0,len));
        }
      // 关闭资源
        fr.close();
    }
}

输出结果：
黑马
程序
员
```

---

**字符输出流【Writer】**

`java.io.Writer`抽象类是表示用于写出字符流的所有类的超类，将指定的字符信息写出到目的地。它定义了字节输出流的基本共性功能方法。

- `void write(int c)` 写入单个字符。
- `void write(char[] cbuf)`写入字符数组。 
- `abstract  void write(char[] cbuf, int off, int len)`写入字符数组的某一部分,off数组的开始索引,len写的字符个数。 
- `void write(String str)`写入字符串。 
- `void write(String str, int off, int len)` 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
- `void flush()`刷新该流的缓冲。  
- `void close()` 关闭此流，但要先刷新它。 

**FileWriter类**

`java.io.FileWriter`类是写出字符到文件的便利类。构造时使用系统默认的字符编码和默认字节缓冲区。

**构造方法**

- `FileWriter(File file)`： 创建一个新的 FileWriter，给定要读取的File对象。   
- `FileWriter(String fileName)`： 创建一个新的 FileWriter，给定要读取的文件的名称。  

当你创建一个流对象时，必须传入一个文件路径，类似于FileOutputStream。

- 构造举例，代码如下：

```java
public class FileWriterConstructor {
    public static void main(String[] args) throws IOException {
      // 使用File对象创建流对象
        File file = new File("a.txt");
        FileWriter fw = new FileWriter(file);
      
        // 使用文件名称创建流对象
        FileWriter fw = new FileWriter("b.txt");
    }
}
```

**基本写出数据**

**写出字符**：`write(int b)` 方法，每次可以写出一个字符数据，代码使用演示：

```java
public class FWWrite {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileWriter fw = new FileWriter("fw.txt");     
        // 写出数据
        fw.write(97); // 写出第1个字符
        fw.write('b'); // 写出第2个字符
        fw.write('C'); // 写出第3个字符
        fw.write(30000); // 写出第4个字符，中文编码表中30000对应一个汉字。
      
        /*
        【注意】关闭资源时,与FileOutputStream不同。
         如果不关闭,数据只是保存到缓冲区，并未保存到文件。
        */
        // fw.close();
    }
}
输出结果：
abC田
```

> 小贴士：
>
> 1. 虽然参数为int类型四个字节，但是只会保留一个字符的信息写出。
> 2. 未调用close方法，数据只是保存到了缓冲区，并未写出到文件中。

**关闭和刷新**

因为内置缓冲区的原因，如果不关闭输出流，无法写出字符到文件中。但是关闭的流对象，是无法继续写出数据的。如果我们既想写出数据，又想继续使用流，就需要`flush` 方法了。

- `flush` ：刷新缓冲区，流对象可以继续使用。
- `close`:先刷新缓冲区，然后通知系统释放资源。流对象不可以再被使用了。

代码使用演示：

```java
public class FWWrite {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileWriter fw = new FileWriter("fw.txt");
        // 写出数据，通过flush
        fw.write('刷'); // 写出第1个字符
        fw.flush();
        fw.write('新'); // 继续写出第2个字符，写出成功
        fw.flush();
      
        // 写出数据，通过close
        fw.write('关'); // 写出第1个字符
        fw.close();
        fw.write('闭'); // 继续写出第2个字符,【报错】java.io.IOException: Stream closed
        fw.close();
    }
}
```

> 小贴士：即便是flush方法写出了数据，操作的最后还是要调用close方法，释放系统资源。

---

**写出其他数据**

**写出字符数组** ：`write(char[] cbuf)` 和 `write(char[] cbuf, int off, int len)` ，每次可以写出字符数组中的数据，用法类似FileOutputStream，代码使用演示：

```java
public class FWWrite {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileWriter fw = new FileWriter("fw.txt");     
        // 字符串转换为字节数组
        char[] chars = "黑马程序员".toCharArray();
      
        // 写出字符数组
        fw.write(chars); // 黑马程序员
        
    // 写出从索引2开始，2个字节。索引2是'程'，两个字节，也就是'程序'。
        fw.write(b,2,2); // 程序
      
        // 关闭资源
        fos.close();
    }
}
```

**写出字符串**：`write(String str)` 和 `write(String str, int off, int len)` ，每次可以写出字符串中的数据，更为方便，代码使用演示：

```java
public class FWWrite {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileWriter fw = new FileWriter("fw.txt");     
        // 字符串
        String msg = "黑马程序员";
      
        // 写出字符数组
        fw.write(msg); //黑马程序员
      
    // 写出从索引2开始，2个字节。索引2是'程'，两个字节，也就是'程序'。
        fw.write(msg,2,2);  // 程序
        
        // 关闭资源
        fos.close();
    }
}
```

**续写和换行**：操作类似于FileOutputStream。

```java
public class FWWrite {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象，可以续写数据
        FileWriter fw = new FileWriter("fw.txt"，true);     
        // 写出字符串
        fw.write("黑马");
        // 写出换行
        fw.write("\r\n");
        // 写出字符串
      fw.write("程序员");
        // 关闭资源
        fw.close();
    }
}
输出结果:
黑马
程序员
```

> 小贴士：字符流，只能操作文本文件，不能操作图片，视频等非文本文件。
>
> 当我们单纯读或者写文本文件时  使用字符流 其他情况使用字节流

---

### 9.5 IO异常处理

**JDK7前处理**

之前的入门练习，我们一直把异常抛出，而实际开发中并不能这样处理，建议使用`try...catch...finally` 代码块，处理异常部分，代码使用演示：

```java  
public class HandleException1 {
    public static void main(String[] args) {
      	// 声明变量
        FileWriter fw = null;
        try {
            //创建流对象
            fw = new FileWriter("fw.txt");
            // 写出数据
            fw.write("黑马程序员"); //黑马程序员
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
```

**JDK7的处理(扩展知识点了解内容)**

还可以使用JDK7优化后的`try-with-resource` 语句，该语句确保了每个资源在语句结束时关闭。所谓的资源（resource）是指在程序完成后，必须关闭的对象。

格式：

```java
try (创建流对象语句，如果多个,使用';'隔开) {
	// 读写数据
} catch (IOException e) {
	e.printStackTrace();
}
```

代码使用演示：

```java
public class HandleException2 {
    public static void main(String[] args) {
      	// 创建流对象
        try ( FileWriter fw = new FileWriter("fw.txt"); ) {
            // 写出数据
            fw.write("黑马程序员"); //黑马程序员
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

**JDK9的改进(扩展知识点了解内容)**

JDK9中`try-with-resource` 的改进，对于**引入对象**的方式，支持的更加简洁。被引入的对象，同样可以自动关闭，无需手动close，我们来了解一下格式。

改进前格式：

```java
// 被final修饰的对象
final Resource resource1 = new Resource("resource1");
// 普通对象
Resource resource2 = new Resource("resource2");
// 引入方式：创建新的变量保存
try (Resource r1 = resource1;
     Resource r2 = resource2) {
     // 使用对象
}
```

改进后格式：

```java
// 被final修饰的对象
final Resource resource1 = new Resource("resource1");
// 普通对象
Resource resource2 = new Resource("resource2");

// 引入方式：直接引入
try (resource1; resource2) {
     // 使用对象
}
```

改进后，代码使用演示：

```java
public class TryDemo {
    public static void main(String[] args) throws IOException {
       	// 创建流对象
        final  FileReader fr  = new FileReader("in.txt");
        FileWriter fw = new FileWriter("out.txt");
       	// 引入到try中
        try (fr; fw) {
          	// 定义变量
            int b;
          	// 读取数据
          	while ((b = fr.read())!=-1) {
            	// 写出数据
            	fw.write(b);
          	}
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### 9.6 属性集

**概述**

`java.util.Properties ` 继承于` Hashtable` ，来表示一个持久的属性集。它使用键值结构存储数据，每个键及其对应值都是一个字符串。该类也被许多Java类使用，比如获取系统属性时，`System.getProperties` 方法就是返回一个`Properties`对象。

**Properties类**

**构造方法**

- `public Properties()` :创建一个空的属性列表。

**基本的存储方法**

- `public Object setProperty(String key, String value)` ： 保存一对属性。  
- `public String getProperty(String key) ` ：使用此属性列表中指定的键搜索属性值。
- `public Set<String> stringPropertyNames() ` ：所有键的名称的集合。

```java
public class ProDemo {
    public static void main(String[] args) throws FileNotFoundException {
        // 创建属性集对象
        Properties properties = new Properties();
        // 添加键值对元素
        properties.setProperty("filename", "a.txt");
        properties.setProperty("length", "209385038");
        properties.setProperty("location", "D:\\a.txt");
        // 打印属性集对象
        System.out.println(properties);
        // 通过键,获取属性值
        System.out.println(properties.getProperty("filename"));
        System.out.println(properties.getProperty("length"));
        System.out.println(properties.getProperty("location"));

        // 遍历属性集,获取所有键的集合
        Set<String> strings = properties.stringPropertyNames();
        // 打印键值对
        for (String key : strings ) {
          	System.out.println(key+" -- "+properties.getProperty(key));
        }
    }
}
输出结果：
{filename=a.txt, length=209385038, location=D:\a.txt}
a.txt
209385038
D:\a.txt
filename -- a.txt
length -- 209385038
location -- D:\a.txt
```

**与流相关的方法**

- `public void load(InputStream inStream)`： 从字节输入流中读取键值对。 

参数中使用了字节输入流，通过流对象，可以关联到某文件上，这样就能够加载文本中的数据了。文本数据格式:

```
filename=a.txt
length=209385038
location=D:\a.txt
```

加载代码演示：

```java
public class ProDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        // 创建属性集对象
        Properties pro = new Properties();
        // 加载文本中信息到属性集
        pro.load(new FileInputStream("read.txt"));
        // 遍历集合并打印
        Set<String> strings = pro.stringPropertyNames();
        for (String key : strings ) {
          	System.out.println(key+" -- "+pro.getProperty(key));
        }
     }
}
输出结果：
filename -- a.txt
length -- 209385038
location -- D:\a.txt
```

> 小贴士：文本中的数据，必须是键值对形式，可以使用空格、等号、冒号等符号分隔。

---

### 9.7 缓冲流

昨天学习了基本的一些流，作为IO流的入门，今天我们要见识一些更强大的流。比如能够高效读写的缓冲流，能够转换编码的转换流，能够持久化存储对象的序列化流等等。这些功能更为强大的流，都是在基本的流对象基础之上创建而来的，就像穿上铠甲的武士一样，相当于是对基本流对象的一种增强。

**概述**

缓冲流,也叫高效流，是对4个基本的`FileXxx` 流的增强，所以也是4个流，按照数据类型分类：

* **字节缓冲流**：`BufferedInputStream`，`BufferedOutputStream` 
* **字符缓冲流**：`BufferedReader`，`BufferedWriter`

缓冲流的基本原理，是在创建流对象时，会创建一个内置的默认大小的缓冲区数组，通过缓冲区读写，减少系统IO次数，从而提高读写的效率。

---

**字节缓冲流**

**构造方法**

* `public BufferedInputStream(InputStream in)` ：创建一个 新的缓冲输入流。 
* `public BufferedOutputStream(OutputStream out)`： 创建一个新的缓冲输出流。

构造举例，代码如下：

```java
// 创建字节缓冲输入流
BufferedInputStream bis = new BufferedInputStream(new FileInputStream("bis.txt"));
// 创建字节缓冲输出流
BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("bos.txt"));
```

**效率测试**

查询API，缓冲流读写方法与基本的流是一致的，我们通过复制大文件（375MB），测试它的效率。

1. 基本流，代码如下：

```java
public class BufferedDemo {
    public static void main(String[] args) throws FileNotFoundException {
        // 记录开始时间
      	long start = System.currentTimeMillis();
		// 创建流对象
        try (
        	FileInputStream fis = new FileInputStream("jdk9.exe");
        	FileOutputStream fos = new FileOutputStream("copy.exe")
        ){
        	// 读写数据
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		// 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("普通流复制时间:"+(end - start)+" 毫秒");
    }
}

十几分钟过去了...
```

2. 缓冲流，代码如下：

```java
public class BufferedDemo {
    public static void main(String[] args) throws FileNotFoundException {
        // 记录开始时间
      	long start = System.currentTimeMillis();
		// 创建流对象
        try (
        	BufferedInputStream bis = new BufferedInputStream(new FileInputStream("jdk9.exe"));
	     BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.exe"));
        ){
        // 读写数据
            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		// 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("缓冲流复制时间:"+(end - start)+" 毫秒");
    }
}

缓冲流复制时间:8016 毫秒
```

如何更快呢？

使用数组的方式，代码如下：

```java
public class BufferedDemo {
    public static void main(String[] args) throws FileNotFoundException {
      	// 记录开始时间
        long start = System.currentTimeMillis();
		// 创建流对象
        try (
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("jdk9.exe"));
		 BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.exe"));
        ){
          	// 读写数据
            int len;
            byte[] bytes = new byte[8*1024];
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0 , len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		// 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("缓冲流使用数组复制时间:"+(end - start)+" 毫秒");
    }
}
缓冲流使用数组复制时间:666 毫秒
```

---

**字符缓冲流**

**构造方法**

* `public BufferedReader(Reader in)` ：创建一个 新的缓冲输入流。 
* `public BufferedWriter(Writer out)`： 创建一个新的缓冲输出流。

构造举例，代码如下：

```java
// 创建字符缓冲输入流
BufferedReader br = new BufferedReader(new FileReader("br.txt"));
// 创建字符缓冲输出流
BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
```

**特有方法**

字符缓冲流的基本方法与普通字符流调用方式一致，不再阐述，我们来看它们具备的特有方法。

* BufferedReader：`public String readLine()`: 读一行文字。 
* BufferedWriter：`public void newLine()`: 写一行行分隔符,由系统属性定义符号【相当于换行】

`readLine`方法演示，代码如下：

```java
public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
      	 // 创建流对象
        BufferedReader br = new BufferedReader(new FileReader("in.txt"));
		// 定义字符串,保存读取的一行文字
        String line  = null;
      	// 循环读取,读取到最后返回null
        while ((line = br.readLine())!=null) {
            System.out.print(line);
            System.out.println("------");
        }
		// 释放资源
        br.close();
    }
}
```

`newLine`方法演示，代码如下：

  ```java
public class BufferedWriterDemo throws IOException {
    public static void main(String[] args) throws IOException  {
      	// 创建流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
      	// 写出数据
        bw.write("黑马");
      	// 写出换行
        bw.newLine();
        bw.write("程序");
        bw.newLine();
        bw.write("员");
        bw.newLine();
		// 释放资源
        bw.close();
    }
}
输出效果:
黑马
程序
员
  ```

**练习:  文本排序**

请将文本信息恢复顺序。

```
3.侍中、侍郎郭攸之、费祎、董允等，此皆良实，志虑忠纯，是以先帝简拔以遗陛下。愚以为宫中之事，事无大小，悉以咨之，然后施行，必得裨补阙漏，有所广益。
8.愿陛下托臣以讨贼兴复之效，不效，则治臣之罪，以告先帝之灵。若无兴德之言，则责攸之、祎、允等之慢，以彰其咎；陛下亦宜自谋，以咨诹善道，察纳雅言，深追先帝遗诏，臣不胜受恩感激。
4.将军向宠，性行淑均，晓畅军事，试用之于昔日，先帝称之曰能，是以众议举宠为督。愚以为营中之事，悉以咨之，必能使行阵和睦，优劣得所。
2.宫中府中，俱为一体，陟罚臧否，不宜异同。若有作奸犯科及为忠善者，宜付有司论其刑赏，以昭陛下平明之理，不宜偏私，使内外异法也。
1.先帝创业未半而中道崩殂，今天下三分，益州疲弊，此诚危急存亡之秋也。然侍卫之臣不懈于内，忠志之士忘身于外者，盖追先帝之殊遇，欲报之于陛下也。诚宜开张圣听，以光先帝遗德，恢弘志士之气，不宜妄自菲薄，引喻失义，以塞忠谏之路也。
9.今当远离，临表涕零，不知所言。
6.臣本布衣，躬耕于南阳，苟全性命于乱世，不求闻达于诸侯。先帝不以臣卑鄙，猥自枉屈，三顾臣于草庐之中，咨臣以当世之事，由是感激，遂许先帝以驱驰。后值倾覆，受任于败军之际，奉命于危难之间，尔来二十有一年矣。
7.先帝知臣谨慎，故临崩寄臣以大事也。受命以来，夙夜忧叹，恐付托不效，以伤先帝之明，故五月渡泸，深入不毛。今南方已定，兵甲已足，当奖率三军，北定中原，庶竭驽钝，攘除奸凶，兴复汉室，还于旧都。此臣所以报先帝而忠陛下之职分也。至于斟酌损益，进尽忠言，则攸之、祎、允之任也。
5.亲贤臣，远小人，此先汉所以兴隆也；亲小人，远贤臣，此后汉所以倾颓也。先帝在时，每与臣论此事，未尝不叹息痛恨于桓、灵也。侍中、尚书、长史、参军，此悉贞良死节之臣，愿陛下亲之信之，则汉室之隆，可计日而待也。
```

**案例分析**

1. 逐行读取文本信息。
2. 解析文本信息到集合中。
3. 遍历集合，按顺序，写出文本信息。

**案例实现**

```java
public class BufferedTest {
    public static void main(String[] args) throws IOException {
        // 创建map集合,保存文本数据,键为序号,值为文字
        HashMap<String, String> lineMap = new HashMap<>();

        // 创建流对象
        BufferedReader br = new BufferedReader(new FileReader("in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));

        // 读取数据
        String line  = null;
        while ((line = br.readLine())!=null) {
            // 解析文本
            String[] split = line.split("\\.");
            // 保存到集合
            lineMap.put(split[0],split[1]);
        }
        // 释放资源
        br.close();

        // 遍历map集合
        for (int i = 1; i <= lineMap.size(); i++) {
            String key = String.valueOf(i);
            // 获取map中文本
            String value = lineMap.get(key);
          	// 写出拼接文本
            bw.write(key+"."+value);
          	// 写出换行
            bw.newLine();
        }
		// 释放资源
        bw.close();
    }
}
```

---

### 9.8 转换流

**字符编码和字符集**

**字符编码**

计算机中储存的信息都是用二进制数表示的，而我们在屏幕上看到的数字、英文、标点符号、汉字等字符是二进制数转换之后的结果。按照某种规则，将字符存储到计算机中，称为**编码** 。反之，将存储在计算机中的二进制数按照某种规则解析显示出来，称为**解码** 。比如说，按照A规则存储，同样按照A规则解析，那么就能显示正确的文本符号。反之，按照A规则存储，再按照B规则解析，就会导致乱码现象。

编码:字符(能看懂的)--字节(看不懂的)

解码:字节(看不懂的)-->字符(能看懂的)

* **字符编码`Character Encoding`** : 就是一套自然语言的字符与二进制数之间的对应规则。

  编码表:生活中文字和计算机中二进制的对应规则

**字符集**

* **字符集 `Charset`**：也叫编码表。是一个系统支持的所有字符的集合，包括各国家文字、标点符号、图形符号、数字等。

计算机要准确的存储和识别各种字符集符号，需要进行字符编码，一套字符集必然至少有一套字符编码。常见字符集有ASCII字符集、GBK字符集、Unicode字符集等。![](/Users/momo/Desktop/讲义资料/02.java语言进阶/day10_缓冲流、转换流、序列化流、Files/img/1_charset.jpg)

可见，当指定了**编码**，它所对应的**字符集**自然就指定了，所以**编码**才是我们最终要关心的。

* **ASCII字符集** ：
  * ASCII（American Standard Code for Information Interchange，美国信息交换标准代码）是基于拉丁字母的一套电脑编码系统，用于显示现代英语，主要包括控制字符（回车键、退格、换行键等）和可显示字符（英文大小写字符、阿拉伯数字和西文符号）。
  * 基本的ASCII字符集，使用7位（bits）表示一个字符，共128字符。ASCII的扩展字符集使用8位（bits）表示一个字符，共256字符，方便支持欧洲常用字符。
* **ISO-8859-1字符集**：
  * 拉丁码表，别名Latin-1，用于显示欧洲使用的语言，包括荷兰、丹麦、德语、意大利语、西班牙语等。
  * ISO-8859-1使用单字节编码，兼容ASCII编码。
* **GBxxx字符集**：
  * GB就是国标的意思，是为了显示中文而设计的一套字符集。
  * **GB2312**：简体中文码表。一个小于127的字符的意义与原来相同。但两个大于127的字符连在一起时，就表示一个汉字，这样大约可以组合了包含7000多个简体汉字，此外数学符号、罗马希腊的字母、日文的假名们都编进去了，连在ASCII里本来就有的数字、标点、字母都统统重新编了两个字节长的编码，这就是常说的"全角"字符，而原来在127号以下的那些就叫"半角"字符了。
  * **GBK**：最常用的中文码表。是在GB2312标准基础上的扩展规范，使用了双字节编码方案，共收录了21003个汉字，完全兼容GB2312标准，同时支持繁体汉字以及日韩汉字等。
  * **GB18030**：最新的中文码表。收录汉字70244个，采用多字节编码，每个字可以由1个、2个或4个字节组成。支持中国国内少数民族的文字，同时支持繁体汉字以及日韩汉字等。
* **Unicode字符集** ：
  * Unicode编码系统为表达任意语言的任意字符而设计，是业界的一种标准，也称为统一码、标准万国码。
  * 它最多使用4个字节的数字来表达每个字母、符号，或者文字。有三种编码方案，UTF-8、UTF-16和UTF-32。最为常用的UTF-8编码。
  * UTF-8编码，可以用来表示Unicode标准中任何字符，它是电子邮件、网页及其他存储或传送文字的应用中，优先采用的编码。互联网工程工作小组（IETF）要求所有互联网协议都必须支持UTF-8编码。所以，我们开发Web应用，也要使用UTF-8编码。它使用一至四个字节为每个字符编码，编码规则：
    1. 128个US-ASCII字符，只需一个字节编码。
    2. 拉丁文等字符，需要二个字节编码。 
    3. 大部分常用字（含中文），使用三个字节编码。
    4. 其他极少使用的Unicode辅助字符，使用四字节编码。

---

**编码引出的问题**

在IDEA中，使用`FileReader` 读取项目中的文本文件。由于IDEA的设置，都是默认的`UTF-8`编码，所以没有任何问题。但是，当读取Windows系统中创建的文本文件时，由于Windows系统的默认是GBK编码，就会出现乱码。

```java
public class ReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("E:\\File_GBK.txt");
        int read;
        while ((read = fileReader.read()) != -1) {
            System.out.print((char)read);
        }
        fileReader.close();
    }
}
输出结果：
���
```

> **那么如何读取GBK编码的文件呢？** 

---

**InputStreamReader类**  

转换流`java.io.InputStreamReader`，是Reader的子类，是从字节流到字符流的桥梁。它读取字节，并使用指定的字符集将其解码为字符。它的字符集可以由名称指定，也可以接受平台的默认字符集。 

**构造方法**

* `InputStreamReader(InputStream in)`: 创建一个使用默认字符集的字符流。 
* `InputStreamReader(InputStream in, String charsetName)`: 创建一个指定字符集的字符流。

构造举例，代码如下： 

```java
InputStreamReader isr = new InputStreamReader(new FileInputStream("in.txt"));
InputStreamReader isr2 = new InputStreamReader(new FileInputStream("in.txt") , "GBK");
```

**指定编码读取**

```java
public class ReaderDemo2 {
    public static void main(String[] args) throws IOException {
      	// 定义文件路径,文件为gbk编码
        String FileName = "E:\\file_gbk.txt";
      	// 创建流对象,默认UTF8编码
        InputStreamReader isr = new InputStreamReader(new FileInputStream(FileName));
      	// 创建流对象,指定GBK编码
        InputStreamReader isr2 = new InputStreamReader(new FileInputStream(FileName) , "GBK");
		// 定义变量,保存字符
        int read;
      	// 使用默认编码字符流读取,乱码
        while ((read = isr.read()) != -1) {
            System.out.print((char)read); // ��Һ�
        }
        isr.close();
      
      	// 使用指定编码字符流读取,正常解析
        while ((read = isr2.read()) != -1) {
            System.out.print((char)read);// 大家好
        }
        isr2.close();
    }
}
```

---

**OutputStreamWriter类**

转换流`java.io.OutputStreamWriter` ，是Writer的子类，是从字符流到字节流的桥梁。使用指定的字符集将字符编码为字节。它的字符集可以由名称指定，也可以接受平台的默认字符集。 

**构造方法**

- `OutputStreamWriter(OutputStream in)`: 创建一个使用默认字符集的字符流。 
- `OutputStreamWriter(OutputStream in, String charsetName)`: 创建一个指定字符集的字符流。

构造举例，代码如下： 

```java
OutputStreamWriter isr = new OutputStreamWriter(new FileOutputStream("out.txt"));
OutputStreamWriter isr2 = new OutputStreamWriter(new FileOutputStream("out.txt") , "GBK");
```

**指定编码写出**

```java
public class OutputDemo {
    public static void main(String[] args) throws IOException {
      	// 定义文件路径
        String FileName = "E:\\out.txt";
      	// 创建流对象,默认UTF8编码
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(FileName));
        // 写出数据
      	osw.write("你好"); // 保存为6个字节
        osw.close();
      	
		// 定义文件路径
		String FileName2 = "E:\\out2.txt";
     	// 创建流对象,指定GBK编码
        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream(FileName2),"GBK");
        // 写出数据
      	osw2.write("你好");// 保存为4个字节
        osw2.close();
    }
}
```

---

**练习：转换文件编码**

将GBK编码的文本文件，转换为UTF-8编码的文本文件。

**案例分析**

1. 指定GBK编码的转换流，读取文本文件。
2. 使用UTF-8编码的转换流，写出文本文件。

**案例实现**

```java
public class TransDemo {
   public static void main(String[] args) {      
    	// 1.定义文件路径
     	String srcFile = "file_gbk.txt";
        String destFile = "file_utf8.txt";
		// 2.创建流对象
    	// 2.1 转换输入流,指定GBK编码
        InputStreamReader isr = new InputStreamReader(new FileInputStream(srcFile) , "GBK");
    	// 2.2 转换输出流,默认utf8编码
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(destFile));
		// 3.读写数据
    	// 3.1 定义数组
        char[] cbuf = new char[1024];
    	// 3.2 定义长度
        int len;
    	// 3.3 循环读取
        while ((len = isr.read(cbuf))!=-1) {
            // 循环写出
          	osw.write(cbuf,0,len);
        }
    	// 4.释放资源
        osw.close();
        isr.close();
  	}
}
```

---

### 9.9 序列化

**概述**

Java 提供了一种对象**序列化**的机制。用一个字节序列可以表示一个对象，该字节序列包含该`对象的数据`、`对象的类型`和`对象中存储的属性`等信息。字节序列写出到文件之后，相当于文件中**持久保存**了一个对象的信息。 

反之，该字节序列还可以从文件中读取回来，重构对象，对它进行**反序列化**。`对象的数据`、`对象的类型`和`对象中存储的数据`信息，都可以用来在内存中创建对象。

---

**ObjectOutputStream类**

`java.io.ObjectOutputStream ` 类，将Java对象的原始数据类型写出到文件,实现对象的持久存储。

**构造方法**

* `public ObjectOutputStream(OutputStream out) `： 创建一个指定OutputStream的ObjectOutputStream。

构造举例，代码如下：  

```java
FileOutputStream fileOut = new FileOutputStream("employee.txt");
ObjectOutputStream out = new ObjectOutputStream(fileOut);
```

**序列化操作**

1. 一个对象要想序列化，必须满足两个条件:

* 该类必须实现`java.io.Serializable ` 接口，`Serializable` 是一个标记接口，不实现此接口的类将不会使任何状态序列化或反序列化，会抛出`NotSerializableException` 。
* 该类的所有属性必须是可序列化的。如果有一个属性不需要可序列化的，则该属性必须注明是瞬态的，使用`transient` 关键字修饰。

```java
public class Employee implements Serializable {
    public String name;
    public String address;
    public transient int age; // transient瞬态修饰成员,不会被序列化
    public void addressCheck() {
      	System.out.println("Address  check : " + name + " -- " + address);
    }
}
```

2.写出对象方法

* `public final void writeObject (Object obj)` : 将指定的对象写出。

```java
public class SerializeDemo{
   	public static void main(String [] args)   {
    	Employee e = new Employee();
    	e.name = "zhangsan";
    	e.address = "beiqinglu";
    	e.age = 20; 
    	try {
      		// 创建序列化流对象
          ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.txt"));
        	// 写出对象
        	out.writeObject(e);
        	// 释放资源
        	out.close();
        	fileOut.close();
        	System.out.println("Serialized data is saved"); // 姓名，地址被序列化，年龄没有被序列化。
        } catch(IOException i)   {
            i.printStackTrace();
        }
   	}
}
输出结果：
Serialized data is saved
```

---

**ObjectInputStream类**

ObjectInputStream反序列化流，将之前使用ObjectOutputStream序列化的原始数据恢复为对象。 

**构造方法**

* `public ObjectInputStream(InputStream in) `： 创建一个指定InputStream的ObjectInputStream。

**反序列化操作1**

如果能找到一个对象的class文件，我们可以进行反序列化操作，调用`ObjectInputStream`读取对象的方法：

- `public final Object readObject ()` : 读取一个对象。

```java
public class DeserializeDemo {
   public static void main(String [] args)   {
        Employee e = null;
        try {		
             // 创建反序列化流
             FileInputStream fileIn = new FileInputStream("employee.txt");
             ObjectInputStream in = new ObjectInputStream(fileIn);
             // 读取一个对象
             e = (Employee) in.readObject();
             // 释放资源
             in.close();
             fileIn.close();
        }catch(IOException i) {
             // 捕获其他异常
             i.printStackTrace();
             return;
        }catch(ClassNotFoundException c)  {
        	// 捕获类找不到异常
             System.out.println("Employee class not found");
             c.printStackTrace();
             return;
        }
        // 无异常,直接打印输出
        System.out.println("Name: " + e.name);	// zhangsan
        System.out.println("Address: " + e.address); // beiqinglu
        System.out.println("age: " + e.age); // 0
    }
}
```

**对于JVM可以反序列化对象，它必须是能够找到class文件的类。如果找不到该类的class文件，则抛出一个 `ClassNotFoundException` 异常。**  

**反序列化操作2**

**另外，当JVM反序列化对象时，能找到class文件，但是class文件在序列化对象之后发生了修改，那么反序列化操作也会失败，抛出一个`InvalidClassException`异常。**发生这个异常的原因如下：

* 该类的序列版本号与从流中读取的类描述符的版本号不匹配 
* 该类包含未知数据类型 
* 该类没有可访问的无参数构造方法 

`Serializable` 接口给需要序列化的类，提供了一个序列版本号。`serialVersionUID` 该版本号的目的在于验证序列化的对象和对应类是否版本匹配。

```java
public class Employee implements java.io.Serializable {
     // 加入序列版本号
     private static final long serialVersionUID = 1L;
     public String name;
     public String address;
     // 添加新的属性 ,重新编译, 可以反序列化,该属性赋为默认值.
     public int eid; 

     public void addressCheck() {
         System.out.println("Address  check : " + name + " -- " + address);
     }
}
```

---

**练习：序列化集合**

1. 将存有多个自定义对象的集合序列化操作，保存到`list.txt`文件中。
2. 反序列化`list.txt` ，并遍历集合，打印对象信息。

**案例分析**

1. 把若干学生对象 ，保存到集合中。
2. 把集合序列化。
3. 反序列化读取时，只需要读取一次，转换为集合类型。
4. 遍历集合，可以打印所有的学生信息

**案例实现**

```java
public class SerTest {
	public static void main(String[] args) throws Exception {
		// 创建 学生对象
		Student student = new Student("老王", "laow");
		Student student2 = new Student("老张", "laoz");
		Student student3 = new Student("老李", "laol");

		ArrayList<Student> arrayList = new ArrayList<>();
		arrayList.add(student);
		arrayList.add(student2);
		arrayList.add(student3);
		// 序列化操作
		// serializ(arrayList);
		
		// 反序列化  
		ObjectInputStream ois  = new ObjectInputStream(new FileInputStream("list.txt"));
		// 读取对象,强转为ArrayList类型
		ArrayList<Student> list  = (ArrayList<Student>)ois.readObject();
		
      	for (int i = 0; i < list.size(); i++ ){
          	Student s = list.get(i);
        	System.out.println(s.getName()+"--"+ s.getPwd());
      	}
	}

	private static void serializ(ArrayList<Student> arrayList) throws Exception {
		// 创建 序列化流 
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("list.txt"));
		// 写出对象
		oos.writeObject(arrayList);
		// 释放资源
		oos.close();
	}
}
```

---

### 9.10 打印流

**概述**

平时我们在控制台打印输出，是调用`print`方法和`println`方法完成的，这两个方法都来自于`java.io.PrintStream`类，该类能够方便地打印各种数据类型的值，是一种便捷的输出方式。

**PrintStream类**

**构造方法**

* `public PrintStream(String fileName)  `： 使用指定的文件名创建一个新的打印流。

构造举例，代码如下：  

```java
PrintStream ps = new PrintStream("ps.txt")；
```

**改变打印流向**

`System.out`就是`PrintStream`类型的，只不过它的流向是系统规定的，打印在控制台上。不过，既然是流对象，我们就可以玩一个"小把戏"，改变它的流向。

```java
public class PrintDemo {
    public static void main(String[] args) throws IOException {
		// 调用系统的打印流,控制台直接输出97
        System.out.println(97);
      
		// 创建打印流,指定文件的名称
        PrintStream ps = new PrintStream("ps.txt");
      	
      	// 设置系统的打印流流向,输出到ps.txt
        System.setOut(ps);
      	// 调用系统的打印流,ps.txt中输出97
        System.out.println(97);
    }
}
```

---

## 10 网络编程

### 10.1 网络编程入门

**软件结构**

- **C/S结构** ：全称为Client/Server结构，是指客户端和服务器结构。常见程序有ＱＱ、迅雷等软件。

+ **B/S结构** ：全称为Browser/Server结构，是指浏览器和服务器结构。常见浏览器有谷歌、火狐等。

两种架构各有优势，但是无论哪种架构，都离不开网络的支持。**网络编程**，就是在一定的协议下，实现两台计算机的通信的程序。

---

**网络通信协议**

* **网络通信协议：**通过计算机网络可以使多台计算机实现连接，位于同一个网络中的计算机在进行连接和通信时需要遵守一定的规则，这就好比在道路中行驶的汽车一定要遵守交通规则一样。在计算机网络中，这些连接和通信的规则被称为网络通信协议，它对数据的传输格式、传输速率、传输步骤等做了统一规定，通信双方必须同时遵守才能完成数据交换。


* **TCP/IP协议：** 传输控制协议/因特网互联协议( Transmission Control Protocol/Internet Protocol)，是Internet最基本、最广泛的协议。它定义了计算机如何连入因特网，以及数据如何在它们之间传输的标准。它的内部包含一系列的用于处理数据通信的协议，并采用了4层的分层模型，每一层都呼叫它的下一层所提供的协议来完成自己的需求。

---

**协议分类**

通信的协议还是比较复杂的，`java.net` 包中包含的类和接口，它们提供低层次的通信细节。我们可以直接使用这些类和接口，来专注于网络程序开发，而不用考虑通信的细节。

`java.net` 包中提供了两种常见的网络协议的支持：

- **UDP**：用户数据报协议(User Datagram Protocol)。UDP是无连接通信协议，即在数据传输时，数据的发送端和接收端不建立逻辑连接。简单来说，当一台计算机向另外一台计算机发送数据时，发送端不会确认接收端是否存在，就会发出数据，同样接收端在收到数据时，也不会向发送端反馈是否收到数据。

  由于使用UDP协议消耗资源小，通信效率高，所以通常都会用于音频、视频和普通数据的传输例如视频会议都使用UDP协议，因为这种情况即使偶尔丢失一两个数据包，也不会对接收结果产生太大影响。

  但是在使用UDP协议传送数据时，由于UDP的面向无连接性，不能保证数据的完整性，因此在传输重要数据时不建议使用UDP协议。UDP的交换过程如下图所示。

特点:数据被限制在64kb以内，超出这个范围就不能发送了。

数据报(Datagram): 网络传输的基本单位 

- **TCP**：传输控制协议 (Transmission Control Protocol)。TCP协议是**面向连接**的通信协议，即传输数据之前，在发送端和接收端建立逻辑连接，然后再传输数据，它提供了两台计算机之间可靠无差错的数据传输。

  在TCP连接中必须要明确客户端与服务器端，由客户端向服务端发出连接请求，每次连接的创建都需要经过“三次握手”。

  - 三次握手：TCP协议中，在发送数据的准备阶段，客户端与服务器之间的三次交互，以保证连接的可靠。
    - 第一次握手，客户端向服务器端发出连接请求，等待服务器确认。
    - 第二次握手，服务器端向客户端回送一个响应，通知客户端收到了连接请求。
    - 第三次握手，客户端再次向服务器端发送确认信息，确认连接。整个交互过程如下图所示。

​    完成三次握手，连接建立后，客户端和服务器就可以开始进行数据传输了。由于这种面向连接的特性，TCP协议可以保证传输数据的安全，所以应用十分广泛，例如下载文件、浏览网页等。

---

**网络编程三要素**

**协议**

* **协议：**计算机网络通信必须遵守的规则，已经介绍过了，不再赘述。

**IP地址**

* **IP地址：指互联网协议地址（Internet Protocol Address）**，俗称IP。IP地址用来给一个网络中的计算机设备做唯一的编号。假如我们把“个人电脑”比作“一台电话”的话，那么“IP地址”就相当于“电话号码”。

**IP地址分类**

* IPv4：是一个32位的二进制数，通常被分为4个字节，表示成`a.b.c.d` 的形式，例如`192.168.65.100` 。其中a、b、c、d都是0~255之间的十进制整数，那么最多可以表示42亿个。

* IPv6：由于互联网的蓬勃发展，IP地址的需求量愈来愈大，但是网络地址资源有限，使得IP的分配越发紧张。

  为了扩大地址空间，拟通过IPv6重新定义地址空间，采用128位地址长度，每16个字节一组，分成8组十六进制数，表示成`ABCD:EF01:2345:6789:ABCD:EF01:2345:6789`，号称可以为全世界的每一粒沙子编上一个网址，这样就解决了网络地址资源数量不够的问题。

---

**常用命令**

* 查看本机IP地址，在控制台输入：

```java
ipconfig
```

* 检查网络是否连通，在控制台输入：

```java
ping 空格 IP地址
ping 220.181.57.216
```

**特殊的IP地址**

* 本机IP地址：`127.0.0.1`、`localhost` 。

---

**端口号**

网络的通信，本质上是两个进程（应用程序）的通信。每台计算机都有很多的进程，那么在网络通信时，如何区分这些进程呢？

如果说**IP地址**可以唯一标识网络中的设备，那么**端口号**就可以唯一标识设备中的进程（应用程序）了。

* **端口号：用两个字节表示的整数，它的取值范围是0~65535**。其中，0~1023之间的端口号用于一些知名的网络服务和应用，普通的应用程序需要使用1024以上的端口号。如果端口号被另外一个服务或应用所占用，会导致当前程序启动失败。

利用`协议`+`IP地址`+`端口号` 三元组合，就可以标识网络中的进程了，那么进程间的通信就可以利用这个标识与其它进程进行交互。

---

### 10.2 TCP通信程序

**概述**

TCP通信能实现两台计算机之间的数据交互，通信的两端，要严格区分为客户端（Client）与服务端（Server）。

**两端通信时步骤：**

1. 服务端程序，需要事先启动，等待客户端的连接。
2. 客户端主动连接服务器端，连接成功才能通信。服务端不可以主动连接客户端。

**在Java中，提供了两个类用于实现TCP通信程序：**

1. 客户端：`java.net.Socket` 类表示。创建`Socket`对象，向服务端发出连接请求，服务端响应请求，两者建立连接开始通信。
2. 服务端：`java.net.ServerSocket` 类表示。创建`ServerSocket`对象，相当于开启一个服务，并等待客户端的连接。

---

**Socket类**  

`Socket` 类：该类实现客户端套接字，套接字指的是两台设备之间通讯的端点。

**构造方法**

* `public Socket(String host, int port)` :创建套接字对象并将其连接到指定主机上的指定端口号。如果指定的host是null ，则相当于指定地址为回送地址。  

  > 小贴士：回送地址(127.x.x.x) 是本机回送地址（Loopback Address），主要用于网络软件测试以及本地机进程间通信，无论什么程序，一旦使用回送地址发送数据，立即返回，不进行任何网络传输。

构造举例，代码如下：

```java
Socket client = new Socket("127.0.0.1", 6666);
```

**成员方法**

* `public InputStream getInputStream()` ： 返回此套接字的输入流。
* 如果此Scoket具有相关联的通道，则生成的InputStream 的所有操作也关联该通道。
  * 关闭生成的InputStream也将关闭相关的Socket。
  
* `public OutputStream getOutputStream()` ： 返回此套接字的输出流。

  * 如果此Scoket具有相关联的通道，则生成的OutputStream 的所有操作也关联该通道。
  * 关闭生成的OutputStream也将关闭相关的Socket。

* `public void close()` ：关闭此套接字。

  * 一旦一个socket被关闭，它不可再使用。
  * 关闭此socket也将关闭相关的InputStream和OutputStream 。 

* `public void shutdownOutput()` ： 禁用此套接字的输出流。   

  * 任何先前写出的数据将被发送，随后终止输出流。 

---

**ServerSocket类**

`ServerSocket`类：这个类实现了服务器套接字，该对象等待通过网络的请求。

**构造方法**

* `public ServerSocket(int port)` ：使用该构造方法在创建ServerSocket对象时，就可以将其绑定到一个指定的端口号上，参数port就是端口号。

构造举例，代码如下：

```java
ServerSocket server = new ServerSocket(6666);
```

**成员方法**

* `public Socket accept()` ：侦听并接受连接，返回一个新的Socket对象，用于和客户端实现通信。该方法会一直阻塞直到建立连接。 

---

**简单的TCP网络程序**	

**TCP通信分析图解**

1. 【服务端】启动,创建ServerSocket对象，等待连接。
2. 【客户端】启动,创建Socket对象，请求连接。
3. 【服务端】接收连接,调用accept方法，并返回一个Socket对象。
4. 【客户端】Socket对象，获取OutputStream，向服务端写出数据。
5. 【服务端】Scoket对象，获取InputStream，读取客户端发送的数据。

> 到此，客户端向服务端发送数据成功。

![](/Users/momo/Desktop/讲义资料/02.java语言进阶/day11_网络编程/img/5_简单通信.jpg)

> 自此，服务端向客户端回写数据。

6. 【服务端】Socket对象，获取OutputStream，向客户端回写数据。
7. 【客户端】Scoket对象，获取InputStream，解析回写数据。
8. 【客户端】释放资源，断开连接。

**客户端向服务器发送数据**

**服务端实现：**

```java
public class ServerTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动 , 等待连接 .... ");
        // 1.创建 ServerSocket对象，绑定端口，开始等待连接
        ServerSocket ss = new ServerSocket(6666);
        // 2.接收连接 accept 方法, 返回 socket 对象.
        Socket server = ss.accept();
        // 3.通过socket 获取输入流
        InputStream is = server.getInputStream();
        // 4.一次性读取数据
      	// 4.1 创建字节数组
        byte[] b = new byte[1024];
      	// 4.2 据读取到字节数组中.
        int len = is.read(b)；
        // 4.3 解析数组,打印字符串信息
        String msg = new String(b, 0, len);
        System.out.println(msg);
        //5.关闭资源.
        is.close();
        server.close();
    }
}
```

**客户端实现：**

```java
public class ClientTCP {
	public static void main(String[] args) throws Exception {
		System.out.println("客户端 发送数据");
		// 1.创建 Socket ( ip , port ) , 确定连接到哪里.
		Socket client = new Socket("localhost", 6666);
		// 2.获取流对象 . 输出流
		OutputStream os = client.getOutputStream();
		// 3.写出数据.
		os.write("你好么? tcp ,我来了".getBytes());
		// 4. 关闭资源 .
		os.close();
		client.close();
	}
}
```

**服务器向客户端回写数据**

**服务端实现：**

```java
public class ServerTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动 , 等待连接 .... ");
        // 1.创建 ServerSocket对象，绑定端口，开始等待连接
        ServerSocket ss = new ServerSocket(6666);
        // 2.接收连接 accept 方法, 返回 socket 对象.
        Socket server = ss.accept();
        // 3.通过socket 获取输入流
        InputStream is = server.getInputStream();
        // 4.一次性读取数据
      	// 4.1 创建字节数组
        byte[] b = new byte[1024];
      	// 4.2 据读取到字节数组中.
        int len = is.read(b)；
        // 4.3 解析数组,打印字符串信息
        String msg = new String(b, 0, len);
        System.out.println(msg);
      	// =================回写数据=======================
      	// 5. 通过 socket 获取输出流
      	 OutputStream out = server.getOutputStream();
      	// 6. 回写数据
      	 out.write("我很好,谢谢你".getBytes());
      	// 7.关闭资源.
      	out.close();
        is.close();
        server.close();
    }
}
```

**客户端实现：**

```java
public class ClientTCP {
	public static void main(String[] args) throws Exception {
		System.out.println("客户端 发送数据");
		// 1.创建 Socket ( ip , port ) , 确定连接到哪里.
		Socket client = new Socket("localhost", 6666);
		// 2.通过Scoket,获取输出流对象 
		OutputStream os = client.getOutputStream();
		// 3.写出数据.
		os.write("你好么? tcp ,我来了".getBytes());
      	// ==============解析回写=========================
      	// 4. 通过Scoket,获取 输入流对象
      	InputStream in = client.getInputStream();
      	// 5. 读取数据数据
      	byte[] b = new byte[100];
      	int len = in.read(b);
      	System.out.println(new String(b, 0, len));
		// 6. 关闭资源 .
      	in.close();
		os.close();
		client.close();
	}
}
```

---

**综合案例**

**文件上传案例**

**文件上传分析图解**

1. 【客户端】输入流，从硬盘读取文件数据到程序中。
2. 【客户端】输出流，写出文件数据到服务端。
3. 【服务端】输入流，读取文件数据到服务端程序。
4. 【服务端】输出流，写出文件数据到服务器硬盘中。    

**基本实现**

**服务端实现：**

```java
public class FileUpload_Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器 启动.....  ");
        // 1. 创建服务端ServerSocket
      	ServerSocket serverSocket = new ServerSocket(6666);
  		// 2. 建立连接 
        Socket accept = serverSocket.accept();
      	// 3. 创建流对象
      	// 3.1 获取输入流,读取文件数据
        BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
        // 3.2 创建输出流,保存到本地 .
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.jpg"));
		// 4. 读写数据
        byte[] b = new byte[1024 * 8];
        int len;
        while ((len = bis.read(b)) != -1) {
            bos.write(b, 0, len);
        }
        //5. 关闭 资源
        bos.close();
        bis.close();
        accept.close();
        System.out.println("文件上传已保存");
    }
}
```

**客户端实现：**

```java
public class FileUPload_Client {
	public static void main(String[] args) throws IOException {
        // 1.创建流对象
        // 1.1 创建输入流,读取本地文件  
        BufferedInputStream bis  = new BufferedInputStream(new FileInputStream("test.jpg"));
        // 1.2 创建输出流,写到服务端 
        Socket socket = new Socket("localhost", 6666);
        BufferedOutputStream   bos   = new BufferedOutputStream(socket.getOutputStream());

        //2.写出数据. 
        byte[] b  = new byte[1024 * 8 ];
        int len ; 
        while (( len  = bis.read(b))!=-1) {
            bos.write(b, 0, len);
            bos.flush();
        }
        System.out.println("文件发送完毕");
        // 3.释放资源

        bos.close(); 
        socket.close();
        bis.close(); 
        System.out.println("文件上传完毕 ");
	}
}
```

**文件上传优化分析**

1. **文件名称写死的问题**

   服务端，保存文件的名称如果写死，那么最终导致服务器硬盘，只会保留一个文件，建议使用系统时间优化，保证文件名称唯一，代码如下：

```java
FileOutputStream fis = new FileOutputStream(System.currentTimeMillis()+".jpg") // 文件名称
BufferedOutputStream bos = new BufferedOutputStream(fis);
```

2. **循环接收的问题**

   服务端，指保存一个文件就关闭了，之后的用户无法再上传，这是不符合实际的，使用循环改进，可以不断的接收不同用户的文件，代码如下：

```java
// 每次接收新的连接,创建一个Socket
while（true）{
    Socket accept = serverSocket.accept();
    ......
}
```

3. **效率问题**

   服务端，在接收大文件时，可能耗费几秒钟的时间，此时不能接收其他用户上传，所以，使用多线程技术优化，代码如下：

```java
while（true）{
    Socket accept = serverSocket.accept();
    // accept 交给子线程处理.
    new Thread(() -> {
      	......
        InputStream bis = accept.getInputStream();
      	......
    }).start();
}
```

**优化实现**

```java
public class FileUpload_Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器 启动.....  ");
        // 1. 创建服务端ServerSocket
        ServerSocket serverSocket = new ServerSocket(6666);
      	// 2. 循环接收,建立连接
        while (true) {
            Socket accept = serverSocket.accept();
          	/* 
          	3. socket对象交给子线程处理,进行读写操作
               Runnable接口中,只有一个run方法,使用lambda表达式简化格式
            */
            new Thread(() -> {
                try (
                    //3.1 获取输入流对象
                    BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
                    //3.2 创建输出流对象, 保存到本地 .
                    FileOutputStream fis = new FileOutputStream(System.currentTimeMillis() + ".jpg");
                    BufferedOutputStream bos = new BufferedOutputStream(fis);) {
                    // 3.3 读写数据
                    byte[] b = new byte[1024 * 8];
                    int len;
                    while ((len = bis.read(b)) != -1) {
                      bos.write(b, 0, len);
                    }
                    //4. 关闭 资源
                    bos.close();
                    bis.close();
                    accept.close();
                    System.out.println("文件上传已保存");
                } catch (IOException e) {
                  	e.printStackTrace();
                }
            }).start();
        }
    }
}
```

**信息回写分析图解**

前四步与基本文件上传一致.

5. 【服务端】获取输出流，回写数据。
6. 【客户端】获取输入流，解析回写数据。

**回写实现**

```java
public class FileUpload_Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器 启动.....  ");
        // 1. 创建服务端ServerSocket
        ServerSocket serverSocket = new ServerSocket(6666);
        // 2. 循环接收,建立连接
        while (true) {
            Socket accept = serverSocket.accept();
          	/*
          	3. socket对象交给子线程处理,进行读写操作
               Runnable接口中,只有一个run方法,使用lambda表达式简化格式
            */
            new Thread(() -> {
                try (
                    //3.1 获取输入流对象
                    BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
                    //3.2 创建输出流对象, 保存到本地 .
                    FileOutputStream fis = new FileOutputStream(System.currentTimeMillis() + ".jpg");
                    BufferedOutputStream bos = new BufferedOutputStream(fis);
                ) {
                    // 3.3 读写数据
                    byte[] b = new byte[1024 * 8];
                    int len;
                    while ((len = bis.read(b)) != -1) {
                        bos.write(b, 0, len);
                    }

                    // 4.=======信息回写===========================
                    System.out.println("back ........");
                    OutputStream out = accept.getOutputStream();
                    out.write("上传成功".getBytes());
                    out.close();
                    //================================

                    //5. 关闭 资源
                    bos.close();
                    bis.close();
                    accept.close();
                    System.out.println("文件上传已保存");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
```

**客户端实现：**

```java
public class FileUpload_Client {
    public static void main(String[] args) throws IOException {
        // 1.创建流对象
        // 1.1 创建输入流,读取本地文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("test.jpg"));
        // 1.2 创建输出流,写到服务端
        Socket socket = new Socket("localhost", 6666);
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

        //2.写出数据.
        byte[] b  = new byte[1024 * 8 ];
        int len ;
        while (( len  = bis.read(b))!=-1) {
            bos.write(b, 0, len);
        }
      	// 关闭输出流,通知服务端,写出数据完毕
        socket.shutdownOutput();
        System.out.println("文件发送完毕");
        // 3. =====解析回写============
        InputStream in = socket.getInputStream();
        byte[] back = new byte[20];
        in.read(back);
        System.out.println(new String(back));
        in.close();
        // ============================

        // 4.释放资源
        socket.close();
        bis.close();
    }
}
```

### 10.3 模拟B\S服务器(扩展知识点)

模拟网站服务器，使用浏览器访问自己编写的服务端程序，查看网页效果。

**案例分析**

1. 准备页面数据，web文件夹。

   复制到我们Module中，比如复制到day08中

   ![](/Users/momo/Desktop/讲义资料/02.java语言进阶/day11_网络编程/img\复制.png)

2. 我们模拟服务器端，ServerSocket类监听端口，使用浏览器访问

   ~~~java
   public static void main(String[] args) throws IOException {
       	ServerSocket server = new ServerSocket(8000);
       	Socket socket = server.accept();
       	InputStream in = socket.getInputStream();
      	    byte[] bytes = new byte[1024];
       	int len = in.read(bytes);
       	System.out.println(new String(bytes,0,len));
       	socket.close();
       	server.close();
   }
   ~~~

   ![](/Users/momo/Desktop/讲义资料/02.java语言进阶/day11_网络编程/img\无法访问.jpg)

3. 服务器程序中字节输入流可以读取到浏览器发来的请求信息

   ![](/Users/momo/Desktop/讲义资料/02.java语言进阶/day11_网络编程/img\读取访问信息.jpg)


GET/web/index.html HTTP/1.1是浏览器的请求消息。/web/index.html为浏览器想要请求的服务器端的资源,使用字符串切割方式获取到请求的资源。

~~~java
//转换流,读取浏览器请求第一行
BufferedReader readWb = new BufferedReader(new InputStreamReader(socket.getInputStream()));
String requst = readWb.readLine();
//取出请求资源的路径
String[] strArr = requst.split(" ");
//去掉web前面的/
String path = strArr[1].substring(1);
System.out.println(path);
~~~

**案例实现**

服务端实现：

```java
public class SerDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端  启动 , 等待连接 .... ");
        // 创建ServerSocket 对象
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        // 转换流读取浏览器的请求消息
        BufferedReader readWb = new
        BufferedReader(new InputStreamReader(socket.getInputStream()));
        String requst = readWb.readLine();
        // 取出请求资源的路径
        String[] strArr = requst.split(" ");
        // 去掉web前面的/
        String path = strArr[1].substring(1);
        // 读取客户端请求的资源文件
        FileInputStream fis = new FileInputStream(path);
        byte[] bytes= new byte[1024];
        int len = 0 ;
        // 字节输出流,将文件写会客户端
        OutputStream out = socket.getOutputStream();
        // 写入HTTP协议响应头,固定写法
        out.write("HTTP/1.1 200 OK\r\n".getBytes());
        out.write("Content-Type:text/html\r\n".getBytes());
        // 必须要写入空行,否则浏览器不解析
        out.write("\r\n".getBytes());
        while((len = fis.read(bytes))!=-1){
            out.write(bytes,0,len);
        }
        fis.close();
        out.close();
        readWb.close();	
        socket.close();
        server.close();
    }
}

```

**访问效果**

* **火狐**

![](/Users/momo/Desktop/讲义资料/02.java语言进阶/day11_网络编程/img/效果图1.png)

> 小贴士：不同的浏览器，内核不一样，解析效果有可能不一样。

发现浏览器中出现很多的叉子,说明浏览器没有读取到图片信息导致。

浏览器工作原理是遇到图片会开启一个线程进行单独的访问,因此在服务器端加入线程技术。

~~~java
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        while(true){
            Socket socket = server.accept();
            new Thread(new Web(socket)).start();
        }
    }
    static class Web implements Runnable{
        private Socket socket;

        public Web(Socket socket){
            this.socket=socket;
        }

        public void run() {
            try{
                //转换流,读取浏览器请求第一行
                BufferedReader readWb = new
                        BufferedReader(new InputStreamReader(socket.getInputStream()));
                String requst = readWb.readLine();
                //取出请求资源的路径
                String[] strArr = requst.split(" ");
                System.out.println(Arrays.toString(strArr));
                String path = strArr[1].substring(1);
                System.out.println(path);

                FileInputStream fis = new FileInputStream(path);
                System.out.println(fis);
                byte[] bytes= new byte[1024];
                int len = 0 ;
                //向浏览器 回写数据
                OutputStream out = socket.getOutputStream();
                out.write("HTTP/1.1 200 OK\r\n".getBytes());
                out.write("Content-Type:text/html\r\n".getBytes());
                out.write("\r\n".getBytes());
                while((len = fis.read(bytes))!=-1){
                    out.write(bytes,0,len);
                }
                fis.close();
                out.close();
                readWb.close();
                socket.close();
            }catch(Exception ex){

            }
        }
    }

}
~~~

**访问效果：**

![](/Users/momo/Desktop/讲义资料/02.java语言进阶/day11_网络编程/img/效果图2.png)图解：

![](/Users/momo/Desktop/讲义资料/02.java语言进阶/day11_网络编程/img\BS通信.bmp)

---

## 11 枚举、注解、反射

### 11.1 枚举

类的对象只有有限个、确定的【定义 **一组** 常量时，强烈建议使用枚举类】

>星期：Monday.....Sunday
>
>性别：Man、Woman
>
>季节：Spring.....Winter

```java
public class DemoMeiju {
    public static void main(String[] args) {
        Season summer = Season.SUMMER;

        //toString():返回枚举类对象的名称
        System.out.println(summer.toString());
        System.out.println("-------------");

        //values():返回所有的枚举类对象构成的数组
        Season[] values = Season.values();
        for(int i = 0;i < values.length;i++){
            System.out.println(values[i]);
            values[i].show();
        }
        System.out.println("-------------");

        //valueOf(String objName):返回枚举类中对象名是objName的对象。
        Season winter = Season.valueOf("WINTER");
        System.out.println(winter);
        winter.show();
    }
}

interface Info {
    void show();
}

//定义的枚举类默认继承于java.lang.Enum类
enum Season implements Info{
    //提供枚举类的对象
    SPRING("春天","春暖花开"){
        @Override
        public void show() {
            System.out.println("春天在哪里？");
        }
    },
    SUMMER("夏天","夏日炎炎"){
        @Override
        public void show() {
            System.out.println("宁夏");
        }
    },
    AUTUMN("秋天","秋高气爽"){
        @Override
        public void show() {
            System.out.println("秋天不回来");
        }
    },
    WINTER("冬天","冰天雪地"){
        @Override
        public void show() {
            System.out.println("大约在冬季");
        }
    };

    /*SPRING("春天","春暖花开"),
    SUMMER("夏天","夏日炎炎"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天","冰天雪地");
		*/
  
    /*public static final Season SPRING = new Season("春天","春暖花开");
    public static final Season SUMMER = new Season("夏天","夏日炎炎");
    public static final Season AUTUMN = new Season("秋天","秋高气爽");
    public static final Season WINTER = new Season("冬天","冰天雪地");*/

    //2.声明Season对象的属性:private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //3.私有化类的构造器,并给对象属性赋值
    private Season(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //4.其他诉求：获取枚举类对象的属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
}

运行结果：
SUMMER
-------------
SPRING
春天在哪里？
SUMMER
宁夏
AUTUMN
秋天不回来
WINTER
大约在冬季
-------------
WINTER
大约在冬季
```

---

### 11.2 注解

框架 = 注解 + 反射 + 设计模式

**@Override:** 限定重写父类方法, 该注解只能用于方法

**@Deprecated:** 用于表示所修饰的元素(类, 方法等)已过时。通常是因为 所修饰的结构危险或存在更好的选择

**@SuppressWarnings:** 抑制编译器警告

---

### 11.3 反射

	* 框架：半成品软件。可以在框架的基础上进行软件开发，简化编码
	* 反射：将类的各个组成部分封装为其他对象，这就是反射机制
		* 好处：
			1. 可以在程序运行过程中，操作这些对象。
			2. 可以解耦，提高程序的可扩展性。


	* 获取Class对象的方式：
		1. Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
			* 多用于配置文件，将类名定义在配置文件中。读取文件，加载类
		2. 类名.class：通过类名的属性class获取
			* 多用于参数的传递
		3. 对象.getClass()：getClass()方法在Object类中定义着。
			* 多用于对象的获取字节码的方式
	
		* 结论：
			同一个字节码文件(*.class)在一次程序运行过程中，只会被加载一次，不论通过哪一种方式获取的Class对象都是同一个。


	* Class对象功能：
		* 获取功能：
			1. 获取成员变量们
				* Field[] getFields() ：获取所有public修饰的成员变量
				* Field getField(String name)   获取指定名称的 public修饰的成员变量
	
				* Field[] getDeclaredFields()  获取所有的成员变量，不考虑修饰符
				* Field getDeclaredField(String name)  
			2. 获取构造方法们
				* Constructor<?>[] getConstructors()  
				* Constructor<T> getConstructor(类<?>... parameterTypes)  
	
				* Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)  
				* Constructor<?>[] getDeclaredConstructors()  
			3. 获取成员方法们：
				* Method[] getMethods()  
				* Method getMethod(String name, 类<?>... parameterTypes)  
	
				* Method[] getDeclaredMethods()  
				* Method getDeclaredMethod(String name, 类<?>... parameterTypes)  
	
			4. 获取全类名	
				* String getName()  


	* Field：成员变量
		* 操作：
			1. 设置值
				* void set(Object obj, Object value)  
			2. 获取值
				* get(Object obj) 
	
			3. 忽略访问权限修饰符的安全检查
				* setAccessible(true):暴力反射

	* Constructor:构造方法
		* 创建对象：
			* T newInstance(Object... initargs)  
	
			* 如果使用空参数构造方法创建对象，操作可以简化：Class对象的newInstance方法


	* Method：方法对象
		* 执行方法：
			* Object invoke(Object obj, Object... args)  
	
		* 获取方法名称：
			* String getName:获取方法名






















































## 附录

![](jpg/IMG_6183.jpg)

![](jpg/IMG_6187.jpg)

![](jpg/IMG_6188.jpg)

 <a name="继承内存分析">继承内存分析</a>

![](jpg/IMG_6191.jpg)

<a name="异常产生过程解析">异常产生过程解析</a>

![](jpg/IMG_6202.jpg)

