package com.bvan.oop.lessons3_4.hw;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

/**
 * @author bvanchuhov
 */
public class DaysFromBirthDateCalculator {

    public static void main(String[] args) {
        long days = daysFromBirthDate("2018-10-07");
        System.out.println(days); // 1
    }

    public static long daysFromBirthDate(String birthDateString) {
        LocalDate birthDate = LocalDate.parse(birthDateString);
        LocalDate now = LocalDate.now();
        return DAYS.between(birthDate, now);
    }
}
