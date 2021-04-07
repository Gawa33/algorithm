package com.gawa.algorithm.linear;

import java.util.Iterator;

public class LinkList<T> implements Iterable<T>{
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
    public boolean isEmpty() {
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

    //向链表中添加元素t
    public void insert(T t) {
        //找到当前最后一个结点

        Node n = head;
        while(n.next!=null){
            n=n.next;
        }


        //创建新结点，保存元素t
        Node newNode = new Node(t, null);
        //让当前最后一个结点指向新结点
        n.next=newNode;
        //元素的个数+1
        N++;
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

    //用来反转整个链表
    public void reverse(){

        //判断当前链表是否为空链表，如果是空链表，则结束运行，如果不是，则调用重载的reverse方法完成反转
        if (isEmpty()){
            return;
        }

        reverse(head.next);
    }

    //反转指定的结点curr，并把反转后的结点返回
    public Node reverse(Node curr){
        if (curr.next==null){
            head.next=curr;
            return curr;
        }
        //递归的反转当前结点curr的下一个结点；返回值就是链表反转后，当前结点的上一个结点
        Node pre = reverse(curr.next);
        //让返回的结点的下一个结点变为当前结点curr；
        pre.next=curr;
        //把当前结点的下一个结点变为null
        curr.next=null;
        return curr;
    }

    @Override
    public Iterator<T> iterator() {
        return new LIterator();
    }

    private class LIterator implements Iterator{
        private Node n;
        public LIterator(){
            this.n=head;
        }

        @Override
        public boolean hasNext() {
            return n.next!=null;
        }

        @Override
        public Object next() {
            n = n.next;
            return n.item;
        }
    }


}
