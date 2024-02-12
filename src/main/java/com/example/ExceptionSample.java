package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionSample {
    
    private static Logger log = Logger.getLogger(ExceptionSample.class.getName());

    public static void test1() {

        try {
            System.out.println(1 / 0);
        } finally {
            System.out.println("[test] finally is called.");
        }
    }

    public static void test2() {

        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
        } finally {
            System.out.println("[test2] finally is called.");
        }
    }

    public static void test3() {
        try {
            int x = 1 / 0;
        } catch (Exception e) {
            log.log(Level.INFO, "テスト", e);
            e.printStackTrace();
        }
    }
}
