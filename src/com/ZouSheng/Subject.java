package com.ZouSheng;

/**
 * Created by Zou Sheng on 2015/11/18.
 */
public class Subject {
    public static void main(String[] args) {
        UsingArrayList a=new UsingArrayList();
        a.Use();
        System.out.println("\n");
        UsingLinkList b=new UsingLinkList();
        //直接复制了ArrayList的代码。。。因为LinkedList和ArrayList的用法并没什么区别，只是存储方法上有差别而已。
        b.Use();
        System.out.println("\n");
        UsingHashMap c=new UsingHashMap();
        c.Use();
    }
}
