package com.tqy.mykt;

import java.util.HashMap;
import java.util.Map;

public class JA {

public static void main(String[] args) {
    fun2();
}


public static void fun2() {
    String str = "abcdab";
    Map<String, Integer> mymap = new HashMap<String, Integer>();
    for(int i=0;i<str.length();i++) {
        char c = str.charAt(i);
        if(mymap.containsKey(""+c)) {
            mymap.put(""+c, 1+mymap.get(""+c));
        }else {
            mymap.put(""+c, 1);
        }
    }
    System.out.println(mymap);
}



}
