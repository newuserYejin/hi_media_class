package com.ohgiraffers.section04.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Application1 {
    public static void main(String[] args) {

        // 기운 글씨체는 static 메소드다.
        LocalTime timeNow = LocalTime.now();
        LocalDate DateNow = LocalDate.now();
        LocalDate DateOf = LocalDate.of(2024,8,15);

        System.out.println("timeNow = " + timeNow);
        System.out.println("DateNow = " + DateNow);
        System.out.println("DateOf = " + DateOf);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime);
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(DateOf,timeNow, ZoneId.of("Europe/Paris"));
        System.out.println("zonedDateTime2 = " + zonedDateTime2);

    }
}
