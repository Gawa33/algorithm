package com.gawa.algorithm.test;

import com.gawa.algorithm.linear.SequenceList;

public class SequenceListTest {
    public static void main(String[] args) {
        //创建顺序表对象
        SequenceList<String> sl = new SequenceList<>(10);
        //测试插入
        sl.insert("姚明");
        sl.insert("科比");
        sl.insert("麦迪");
        sl.insert(1,"詹姆斯");

        for (String s:sl) {
            System.out.println(s);
        }
        //测试获取
        String getResult = sl.get(1);
        System.out.println("获取索引1处的结果为："+getResult);
        //测试删除
        sl.clear();
        System.out.println("清空后的线性表中的2元素个数为："+sl.length());
    }
}
