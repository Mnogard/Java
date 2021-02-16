package cn.text5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFile {
    public static void main(String[] args) throws IOException {
        /*String pathname = "/Users/momo/Desktop/aaa.txt";
        File file1 = new File(pathname);
        FileWriter o1 = new FileWriter(file1);

        o1.write("哈哈");


        o1.close();*/

        // 绝对路径
        File f = new File("Desktop/aaa.txt");
        System.out.println(f.getAbsolutePath());

        // 相对路径
        System.out.println(f.getPath());
        //iter 遍历
    }
}
