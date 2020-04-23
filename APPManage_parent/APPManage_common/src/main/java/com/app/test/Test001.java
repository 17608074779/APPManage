package com.app.test;

import java.util.ArrayList;
import java.util.List;

public class Test001 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("哈哈");
        list.add("赫赫");
        list.add("黑黑");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
