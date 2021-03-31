package com.gawa.algorithm.linear;

public class LinkList<T> {
    //记录头结点
    private Node head;
    //记录链表的长度
    private int N;

    //结点类
    private class Node {
        //存储数据
        T item;
        //下一个结点
        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public LinkList() {
        //初始化头结点
        this.head = new Node(null, null);
        //初始化元素个数
        this.N = 0;
    }

    //清空链表
    public void clear() {
        head.next=null;
        this.N=0;
    }

    //获取链表的长度
    public int length() {
        return N;
    }

    //判断链表是否为空
    public boolean isEnpty() {
        return N==0;
    }

    //获取指定位置i处的元素
    public T get(int i) {
        //通过循环，从头结点开始往后找，依次找i次，就可以找到对应的元素
        Node n = head.next;
        for (int index =0;index<i;index++){
            n=n.next;
        }
        return n.item;
    }

    //向指定位置i处，添加元素t
    public void insert(int i, T t) {
        //找到当前最后一个结点
        Node n =head;
        //创建新节点，保存元素t
        while (n.next!=null){
            n=n.next;
        }
        //让当前最后一个结点指向新结点
        Node  newNode = new Node(t,null);
        n.next=newNode;
        //元素的个数+1
        N++;

    }

    //删除指定位置i处的元素，并返回被删除的元素
    public T remove(int i) {
        return null;
    }

    //查找元素t在链表中第一次出现的位置
    public int iondexof(T t) {
        return -1;
    }
}
