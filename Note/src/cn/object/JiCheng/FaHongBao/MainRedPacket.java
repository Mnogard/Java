package cn.object.JiCheng.FaHongBao;

import java.util.ArrayList;

public class MainRedPacket {

    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);

        Member m1 = new Member("A",0);
        Member m2 = new Member("B",0);
        Member m3 = new Member("C",0);

        manager.show();
        m1.show();
        m2.show();
        m3.show();
        System.out.println("-------------------------");

        //群主发20，分3个红包
        ArrayList<Integer> redList = manager.send(50,3);
        //收红包
        m1.receive(redList);
        m2.receive(redList);
        m3.receive(redList);

        manager.show();
        m1.show();
        m2.show();
        m3.show();

    }
}
