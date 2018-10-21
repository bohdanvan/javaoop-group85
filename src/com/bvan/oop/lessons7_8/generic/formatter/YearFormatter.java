package com.bvan.oop.lessons7_8.generic.formatter;

import java.time.LocalDate;

/**
 * @author bvanchuhov
 */
public class YearFormatter implements Formatter<LocalDate> {

    @Override
    public String format(LocalDate value) {
        return String.valueOf(value.getYear());
    }
}
