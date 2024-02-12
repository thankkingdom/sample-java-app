package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListSample {
    
    public static void test20230710() {
        List<Map<String,Object>> list = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("filterNo", 100);
        list.add(map);
        Object obj = list.get(list.size() - 1).get("filterNo");
        print(obj);
    }
    public static void test20230211() {
        String value = "null";
        String[] strings = value.split(",");
        print(strings == null ? "null" : strings.length);
    }

    public static void test20230210() {
        System.out.println( "Hello World!" );
        List<String> list = new ArrayList<>();
        list.addAll(new ArrayList<>());
        print(list.size());
    }

    public static void print(Object obj) {

        System.out.println(obj);
    }
}
