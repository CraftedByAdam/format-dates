package com.pluralsight;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatDate {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String date = currentDate.format(formatter);
        System.out.println(date);

        LocalDate currentDate2  = LocalDate.now();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date2 = currentDate2.format(formatter2);
        System.out.println(date2);
    }
}
