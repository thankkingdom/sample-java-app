package com.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ComparisonSample {

    public static void test01() {

        Item selectItem = new Item("c", "3", "c3");
        //Item selectItem = new Item();
        //Item selectItem = null;

        Set<Item> allOptSet = new HashSet<>();
        allOptSet.add(new Item("a", "1", "a1"));
        allOptSet.add(new Item("b", "2", "b2"));
        allOptSet.add(new Item("c", "3", "c3"));
        allOptSet.add(new Item());

        boolean isNeedOpt = allOptSet.stream()
            .filter(opt -> Objects.equals(opt.getConditionId(), selectItem.getConditionId()))
            .filter(opt -> Objects.equals(opt.getConditionSelectNo(), selectItem.getConditionSelectNo()))
            .count() > 0;

        print(isNeedOpt);

        Set<Item> findSet = allOptSet.stream()
            .filter(opt -> Objects.equals(opt.getConditionId(), selectItem.getConditionId()))
            .filter(opt -> Objects.equals(opt.getConditionSelectNo(), selectItem.getConditionSelectNo()))
            .collect(Collectors.toSet());
        print(findSet);
    }

    public static void test02() {

        Set<String> unique = new HashSet<String>();
        List<Item> list = new ArrayList<>();
        //list.add(new Item("a", "1", "a1"));
        
        list.stream().filter(item -> unique.add(item.getConditionSelectCd())).forEach(item -> {
            print(item);
        });
        
    }

    public static void test03() {

        // 例外が発生するかの検証
        print("null equals null = " + Objects.equals(null, null));
        print("'' equals null = " + Objects.equals("", null));
        print("null equals '' = " + Objects.equals(null, ""));
    }

    public static void test04() {

        // アプリバージョンチェック
        BigDecimal rejebd = new BigDecimal(3.81);
        BigDecimal reqbd = new BigDecimal(3.80);
        print(rejebd.compareTo(reqbd));
        if (rejebd.compareTo(reqbd) < 0) {
            print("true");
            return;
        }
        print("false");
    }
    public static void print(Object o) {

        System.out.println(o);
    }
}
