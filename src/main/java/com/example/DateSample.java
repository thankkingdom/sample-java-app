package com.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateSample {

    /** EEE MMM dd HH:mm:ss z yyyy の正規表現 （例:Wed Jan 11 00:00:00 JST 2023) */
    public static final String DATETYPE_FORMAT_PATTERN = "^[A-Za-z]{3} [A-Za-z]{3} [0-9]{2} [0-9]{2}:[0-9]{2}:[0-9]{2} [A-Za-z]{3} [0-9]{4}$";

    /** EEE MMM dd HH:mm:ss z yyyy の正規表現 （例:Wed Jan 11 00:00:00 GMT+09:00 2023) */
    public static final String DATETYPE_FORMAT_PATTERN2 = "^[A-Za-z]{3} [A-Za-z]{3} [0-9]{2} [0-9]{2}:[0-9]{2}:[0-9]{2} [A-Za-z]{3}\\+[0-9]{2}:[0-9]{2} [0-9]{4}$";

    public static String format(String strDate, String strDatePattern, String returnPattern) throws ParseException {
        // Date date = parse(strDate, strDatePattern);
        // return format(date, returnPattern);
        return null;
    }

    public static void test01() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("EEE MM dd HH:mm:ss zZ yyyy", Locale.JAPAN);
        // sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        // sdf.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));

        Date date = new Date();
        String str = sdf.format(date);
        System.out.println(str);

        String dateStr = "Thu Sep 25 00:00:00 GMT+0900 2014";
        String dateFormat = "EEE MMM dd HH:mm:ss zZ yyyy";

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(dateFormat, Locale.US);
        LocalDateTime localDate = LocalDateTime.parse(dateStr, dtf);
        System.out.println(localDate);
    }

    public static void test02() throws ParseException {
        // String dateStr = "Thu Feb 24 00:00:00 JST 2022";
        SimpleDateFormat sdf = new SimpleDateFormat("EEE LLL dd hh:mm:ss zzz yyyy");

        // Date date = sdf.parse(dateStr);
        // print(date);

        Date date2 = new Date();
        print(sdf.format(date2));
    }

    public static void test03() {
        Date d1 = new Date();
        Date d2 = toDate(LocalDateTime.now().plusDays(10));
        Date d3 = toDate(LocalDateTime.now());
        print(String.format("d1: %s, d2: %s, d3: %s", d1, d2, d3));
        print(d1.compareTo(d2));
        print(d2.compareTo(d1));
        print(d1.compareTo(d3));
        print(d1.compareTo(null));
    }

    public static Date toDate(LocalDateTime ldt) {
        if (ldt == null) {
            return null;
        }
        return Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
    }

    public static void print(Object o) {
        System.out.println(o);
    }
}
