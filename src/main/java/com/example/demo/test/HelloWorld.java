package com.example.demo.test;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * @class: HelloWorld
 * @description:
 * @author: sunzhichao
 * @date: 2020/2/16 18:16
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world!");

        LocalDate localDate = LocalDate.now();
        System.out.println("今天的日期是：" + localDate);

        LocalDate date = LocalDate.of(2020, 02, 16);
        System.out.println("date 的时间是:" + date);
        // 获取当前时间
        Clock clock = Clock.systemUTC();
        System.out.println("当前时刻为：" + clock.instant());
        System.out.println("当前时刻1 :" + clock.millis());
        System.out.println("当前时刻2 :" + System.currentTimeMillis());

        //----下面是关于Duration的用法------
        Duration dur = Duration.ofSeconds(6000);
        System.out.println("6000秒相当于: " + dur.toMinutes() + "分");
        System.out.println("6000秒相当于：" + dur.toHours() + "小时");
        System.out.println("6000秒相当于：" + dur.toDays() + "天");
        //在clock基础上增加6000秒,返回新的clock
        Clock clock2 = Clock.offset(clock, dur);
        System.out.println("当前时刻加6000秒为：" + clock2.instant());
        //下面是instant的用法
        //获取当前时间
        Instant instant = Instant.now();
        System.out.println("instant:" + instant);
        //instant添加6000秒,返回新的Instant
        Instant instant1 = instant.plusSeconds(6000);
        System.out.println("instant1: " + instant1);
        //根据字符串解析Instant对象
        Instant instant3 = Instant.parse("2020-01-08T11:57:43.054Z");
        System.out.println("instant3: " + instant3);
        // 在当前的基础上增加5小时4分钟
        Instant instant4 = instant3.plus(Duration.ofHours(5).plusMinutes(4));
        System.out.println("instant4: " + instant4);
        //获取instant4五天前的时刻
        Instant instant5 = instant4.minus(Duration.ofDays(5));
        System.out.println("instant5: " + instant5);
        //-----下面是关于LocalDate的用法-----
        localDate = LocalDate.now();
        System.out.println("localDate: " + localDate);
        //获得2020年的第345天
        localDate = LocalDate.ofYearDay(2020, 345);
        System.out.println("localDate: " + localDate);
        // 设置时间2020年5月1号
        localDate = LocalDate.of(2020, 5, 1);
        System.out.println("localDate: " + localDate);
        //---下面是关于LocalTime---的用法
        //获取当前时间
        LocalTime time = LocalTime.now();
        System.out.println("time : " + time);
        // 设置当前时间为22 点 10 分
        time = LocalTime.of(22, 10);
        System.out.println("time: " + time);
        //返回一天中的第5503秒
        time = LocalTime.ofSecondOfDay(5503);
        System.out.println("time: " + time);
        //---下面是关于localDateTime的用法
        //获取当前时间
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime: " + localDateTime);
        //当前日期,时间加上25小时3分钟
        LocalDateTime future = localDateTime.plusHours(25).plusMinutes(3);
        System.out.println("future: " + future);
        //---下面是关于year,yearMonth,MonthDay的用法示例---
        Year year = Year.now();
        System.out.println("当前Year:" + year);
        year = year.plusYears(5);
        System.out.println("当前Year过5年:" + year);
        YearMonth month = year.atMonth(10);
        System.out.println("当前Year的10月：" + month);
        //当前年月再加5年.减三个月
        month = month.plusYears(5).minusMonths(3);
        System.out.println("year年10月再加5年,减3个月: " + month);
        MonthDay md = MonthDay.now();
        System.out.println("当前月日：" + md);
        //设置为5月23日
        MonthDay md2 = md.withMonth(5).withDayOfMonth(23);
        System.out.println("5月23号：" + md2);
        /////////////////////////////////////////////////////////
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDate.now()));

        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.now()));

        System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now()));
        /////////////////////////////////////////////////////////

        String  aa="2019-01-02 22:13:10";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime time1 = LocalDateTime.parse(aa, dateTimeFormatter);
        String format = time1.format(dateTimeFormatter);
        System.out.println(format);

    }
}
