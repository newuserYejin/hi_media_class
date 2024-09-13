package com.ohgiraffers.section04.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Application2 {
    public static void main(String[] args) {

        String timeNow = "10:17:10";
        String DateNow = "2024-09-13";

        LocalTime localTime = LocalTime.parse(timeNow);
        System.out.println("localTime = " + localTime);
        System.out.println(localTime instanceof LocalTime);

        LocalDate localDate = LocalDate.parse(DateNow);
        System.out.println("localDate = " + localDate);
        System.out.println(localDate instanceof LocalDate);

        String timeNow2 = "10-17-10";
        String dateNow2 = "20240913";

        LocalTime localTime2 = LocalTime.parse(timeNow2, DateTimeFormatter.ofPattern("HH-mm-ss"));
        System.out.println("localTime2 = " + localTime2);
        LocalDate localDate2 = LocalDate.parse(dateNow2,DateTimeFormatter.ofPattern("yyyyMMdd"));
        System.out.println("localDate2 = " + localDate2);
    }
}
