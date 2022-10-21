package com.example.demo.RestServer;

import org.springframework.cglib.core.Local;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;

public class CurrentDay {
    String weekDay;

    public String getWeekDay() {
        return weekDay;
    }

    public String dateDay(){
        LocalDate date = LocalDate.now();
        return String.valueOf(date.getDayOfWeek());
    }

    public static String[] getLangAbb(String language){
        String[] arr = new String[2];
        if(language.equalsIgnoreCase("Italian")){
            arr[0] = "it";
            arr[1] = "IT";
            return arr;
        }if(language.equalsIgnoreCase("Russian")){
            arr[0] = "ru";
            arr[1] = "RU";
            return arr;
        }
        return null;
    }

    public static String getDayOfWeek(String language) {
        String[] arr = getLangAbb(language);
        Locale localeRu = new Locale(arr[0], arr[1]);
        LocalDate date = LocalDate.now();
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL,localeRu);
    }

    public CurrentDay(String language) {
        this.weekDay = getDayOfWeek(language);
    }

//    public CurrentDay() {
//        this.weekDay = dateDay();
//    }

    @Override
    public String toString() {
        return "CurrentDay{" +
                "weekDay='" + weekDay + '\'' +
                '}';
    }
}
