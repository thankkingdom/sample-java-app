package com.example;

import java.math.BigDecimal;

public class MoneyFormatSample {
    
    public static void execute() {
        System.out.println("Hello World!");
        print(format(BigDecimal.valueOf(999)));
        print(format(BigDecimal.valueOf(9999)));
        print(format(BigDecimal.valueOf(99999)));
        print(format(BigDecimal.valueOf(999999)));
        print(format(BigDecimal.valueOf(9999999)));
        print(format(BigDecimal.valueOf(99999999)));
        print(format(BigDecimal.valueOf(1000000)));
    }

    public static String format(BigDecimal value) {
    
        if (value.intValue() < 10000) {
            return String.format("%,d円", value.intValue());
        }
        BigDecimal ret = value.divide(BigDecimal.valueOf(10000));
        return String.format("%,d万円", ret.intValue());
    }

    public static void print(Object obj) {

        System.out.println(obj);
    }
}
