package com.gawa.algorithm.test;

import com.gawa.algorithm.linear.TwoWayLinkList;

public class TowWayLinkListTest {
    public static void main(String[] args) {
        //创建双向链表对象
        TwoWayLinkList<String> sl = new TwoWayLinkList<>();
        //测试插入
        sl.insert("姚明");
        sl.insert("科比");
        sl.insert("麦迪");
        sl.insert(1, "詹姆斯");

        for (Object s : sl) {
            System.out.println(s);
        }

        System.out.println("--------------------------------------");
        System.out.println("第一个元素是：" + sl.getFirst());
        System.out.println("最后一个元素是：" + sl.getLast());
        System.out.println("元素在链表中第一次出现的位置是：" + sl.indexof("詹姆斯"));

        System.out.println("------------------------------------------");

        //测试获取
        String getResult = sl.get(1);
        System.out.println("获取索引1处的结果为：" + getResult);
        //测试删除
        String removeResult = sl.remove(0);
        System.out.println("删除的元素是：" + removeResult);
        //测试清空
        sl.clear();
        System.out.println("清空后的线性表中的元素个数为:" + sl.length());
    }
}
