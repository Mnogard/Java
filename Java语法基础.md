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

## 3 面向对象（三大特性）

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

### 3.4 封装

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

## 4 常用类

------

### 4.1 Scanner 类

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

### 4.2 Random 类

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

### 4.3 ArrayList 类

ArrayList 是大小可变的数组的实现（数组必须定义大小，一旦定义不可变化）

+ `public boolean add(E e)` ：将指定的元素添加到此集合的尾部。
+ `public E remove(int index)` ：移除此集合中指定位置上的元素，返回被删除的元素。
+ `public E get(int index)` ：返回此集合中指定位置上的元素，返回获取的元素。
+ `public int size()` ：返回此集合中的元素数。遍历集合时，可以控制索引范围，防止越界。

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

### 4.4 String 类

+ 字符串的内容永不可改变，因此可以共享使用


+ **构造方法：**
  + `public String()` ：初始化新创建的 String对象，以使其表示空字符序列
  + `public String(char[] value)` ：通过当前参数中的字符数组来构造新的String
  + `public String(byte[] bytes)` ：通过使用平台的默认字符集解码当前参数中的字节数组来构造新的String

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

  + `public boolean equals (Object anObject)` ：将此字符串与指定对象进行比较

  + `public boolean equalsIgnoreCase (String anotherString)` ：将此字符串与指定对象进行比较，忽略大小写

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
  + `public int length ()` ：返回此字符串的长度
  + `public String concat (String str)` ：将当前的字符串连接到该字符串的末尾
  + `public char charAt (int index)` ：返回指定索引处的 char值
  + `public int indexOf (String str)` ：返回指定子字符串第一次出现在该字符串内的索引，没有返回-1
  + `public String substring (int beginIndex)` ：返回一个子字符串，从beginIndex开始截取字符串到字符
    串结尾
  + `public String substring (int beginIndex, int endIndex)` ：返回一个子字符串，从`beginIndex`到`endIndex`截取字符串。含`beginIndex`，不含`endIndex`

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
  + `public char[] toCharArray ()` ：将当前字符串拆分为字符数组作为返回值
  + `public byte[] getBytes ()` ：使用平台的默认字符集将该 String编码转换为新的字节数组
  + `public String replace (CharSequence target, CharSequence replacement)` ：将与`target`匹配的字符串使用`replacement`字符串替换（`CharSequence`：可以接受字符串类型）

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
  + `public String[] split(String regex)` ：将此字符串按照给定的`regex`（规则）拆分为字符串数组

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

### 4.5 static 关键字

