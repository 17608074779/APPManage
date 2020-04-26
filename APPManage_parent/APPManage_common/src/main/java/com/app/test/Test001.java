package com.app.test;

import java.util.*;

public class Test001 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("02", "aa");
        map.put("01", "5");
        map.put("05", "bb");
        map.put("05", "456");
        /*Set set = map.entrySet();
        for (Object s: set) {
            System.out.println(s);
        }*/
        System.out.println(map.get("0001"));

    }
}
