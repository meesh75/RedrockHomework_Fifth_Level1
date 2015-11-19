package com.ZouSheng;
import java.util.ArrayList;

/**
 * Created by Zou Sheng on 2015/11/19.
 */
public class UsingArrayList {
    public UsingArrayList(){
    }
    public void Use(){
        ArrayList<String> arrayList=new ArrayList<String>();
        //添加元素到该List中
        arrayList.add("凌霄学姐真漂亮!");
        arrayList.add("武侠学长真帅!");
        //从该List中取元素
        String s1=arrayList.get(0);
        String s2=arrayList.get(1);
        System.out.println(s1+"\n"+s2+"\n");
        //删除List中的元素
        arrayList.remove(0);
        //删除第一个位置的元素，后面的元素一次向前移动一位
        System.out.println(arrayList.get(0));
        arrayList.remove(0);
        //查找凌霄学姐的位置
        arrayList.add("凌霄学姐");
        arrayList.add("武侠学长");
        arrayList.add("子沂学长");
        arrayList.add("冰冰学姐");
        for (int i=0;i<4;i++){
            if (arrayList.get(i)=="凌霄学姐"){
                System.out.println("凌霄学姐在"+i+"号位置。");
            }
        }
    }
}
