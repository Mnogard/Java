package cn.SClass;

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

        //-------------------获取功能的方法------------------------

        //创建字符串对象
        String s = "helloworld";

        // int length():获取字符串的长度，其实也就是字符个数
        System.out.println(s.length());

        // String concat (String str):将将指定的字符串连接到该字符串的末尾.
        String s2 = s.concat("**hello itheima");
        System.out.println(s2);  // helloworld**hello itheima

        // char charAt(int index):获取指定索引处的字符
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));

        // int indexOf(String str):获取str在字符串对象中第一次出现的索引,没有返回‐1
        System.out.println(s.indexOf("l"));

        // String substring(int start):从start开始截取字符串到字符串结尾
        System.out.println(s.substring(2));

        // String substring(int start,int end):从start到end截取字符串。含start，不含end。
        System.out.println(s.substring(0, s.length()));
        System.out.println(s.substring(3,8));

        //-------------------转换功能的方法------------------------

        //创建字符串对象
        String sz = "abcde";

        // char[] toCharArray():把字符串转换为字符数组
        char[] chs = sz.toCharArray();
        for(int x = 0; x < chs.length; x++) {
            System.out.println(chs[x]);
        }

        // byte[] getBytes ():把字符串转换为字节数组
        byte[] bytes = sz.getBytes();
        for(int x = 0; x < bytes.length; x++) {
            System.out.println(bytes[x]);
        }

        // 替换字母it为大写IT
        String str = "itcast itheima";
        String replace = str.replace("it", "IT");
        System.out.println(replace);  // ITcast ITheima
    }
}

