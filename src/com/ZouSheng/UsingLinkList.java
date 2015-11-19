package com.ZouSheng;

import java.util.LinkedList;

/**
 * Created by Zou Sheng on 2015/11/19.
 */
public class UsingLinkList {
    public UsingLinkList(){
    }
    public void Use(){
        LinkedList<String> linkedList=new LinkedList<String>();
        //添加元素到该List中
        linkedList.add("凌霄学姐真漂亮!");
        linkedList.add("武侠学长真帅!");
        //从该List中取元素
        String s1=linkedList.get(0);
        String s2=linkedList.get(1);
        System.out.println(s1+"\n"+s2+"\n");
        //删除List中的元素
        linkedList.remove(0);
        //删除第一个位置的元素，后面的元素一次向前移动一位
        System.out.println(linkedList.get(0));
        linkedList.remove(0);
        //查找凌霄学姐的位置
        linkedList.add("凌霄学姐");
        linkedList.add("武侠学长");
        linkedList.add("子沂学长");
        linkedList.add("冰冰学姐");
        for (int i=0;i<4;i++){
            if (linkedList.get(i)=="凌霄学姐"){
                System.out.println("凌霄学姐在"+i+"号位置。");
            }
        }
    }
}
