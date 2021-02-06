package cn.object.JiCheng.FaHongBao;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
        //随机获取一个集合中的索引编号
        int index = new Random().nextInt(list.size());

        //根据索引，从集合中删除，并得到删除的红包，给我自己
        int delta = list.remove(index);
        //当前成员本来的金钱
        int money = super.getMoney();
        //加法，重新设置回去
        super.setMoney(money + delta);
    }
}
