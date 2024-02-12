package com.example;

import java.text.ParseException;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) throws ParseException {
        DateSample.test01();
        DateSample.test02();
        MoneyFormatSample.execute();
        //ExceptionSample.test1();
        //ExceptionSample.test2();
        //ExceptionSample.test3();
        ComparisonSample.test01();
        ComparisonSample.test02();
        ComparisonSample.test03();
        ComparisonSample.test04();
        ListSample.test20230210();
        ListSample.test20230211();
        ListSample.test20230710();
    }

}
