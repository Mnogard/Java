package cn.object.JiCheng.FaHongBao;

import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        //定义一个集合，用来存储若干红包金额
        ArrayList<Integer> redList = new ArrayList<>();

        //查看群主有多少钱
        int leftMoney = super.getMoney();  //群主当前余额
        if(totalMoney > leftMoney) {
            System.out.println("余额不足!");
            return redList;  //返回空集合
        }

        //扣钱（重新设置余额）
        super.setMoney(leftMoney - totalMoney);

        int avg = totalMoney / count;
        int mod = totalMoney % count;   //零头

        //除不开的零头，包在最后一个红包中
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }

        //最后一个红包
        int last = avg + mod;
        redList.add(last);

        return redList;
    }
}
