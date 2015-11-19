package com.ZouSheng;

import java.util.HashMap;
/**
 * Created by Zou Sheng on 2015/11/19.
 */
public class UsingHashMap {
    public UsingHashMap(){

    }
    public void Use(){
        HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
        //学长学姐都到碗里来
        hashMap.put(0,"凌霄学姐");
        hashMap.put(1,"武侠学长");
        hashMap.put(2,"冰冰学姐");
        hashMap.put(3,"子沂学长");
        //凌霄学姐先拖出去斩了^_^
        hashMap.remove(0);
        //这波黑TAT
        for (int i=0;i<3;i++){
            if (hashMap.get(i)=="冰冰学姐"){
                System.out.println("冰冰学姐在"+i+"号位置");
            }
        }
    }
}
