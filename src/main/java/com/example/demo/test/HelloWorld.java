package com.example.demo.test;

import java.time.Clock;
import java.time.LocalDate;

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


    }
}
