package Практические_занятия.Dnevnik;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/*Скопированный код:*/
public class S {
    public static void main(String[] args){
        Date time = new Date();
        System.out.println(time);
        GregorianCalendar now = new GregorianCalendar();
        int today = now.get(Calendar.DAY_OF_MONTH);
        int month = now.get(Calendar.MONTH);
        now.set(Calendar.DAY_OF_MONTH, 1);
        int weekday = now.get(Calendar.DAY_OF_WEEK);
        int FirstDayOfWeek = now.getFirstDayOfWeek();
        int in = 0;
        while (weekday != FirstDayOfWeek){
            in++; //счетчик
            now.add(Calendar.DAY_OF_MONTH, -1);
            weekday = now.get(Calendar.DAY_OF_WEEK);
        }
        String [] WeekDayNames = new DateFormatSymbols().getShortWeekdays();
        do{
            System.out.printf("%4s", WeekDayNames[weekday]);
            now.add(Calendar.DAY_OF_MONTH, 1);
            weekday = now.get(Calendar.DAY_OF_WEEK);
        }while(weekday != FirstDayOfWeek);
        System.out.println();
        for(int i = 1; i<=in; i++)
            System.out.print(" ");//тут выводит пробелы на первой неделе месяця

        now.set(Calendar.DAY_OF_MONTH, 1);
        do{
            int day = now.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d", day);
            if(day == today)
                System.out.print("*");
            else
                System.out.print(" ");
            now.add(Calendar.DAY_OF_MONTH, 1);
            weekday = now.get(Calendar.DAY_OF_WEEK);
            if (weekday == FirstDayOfWeek)
                System.out.println();
        }
        while(now.get(Calendar.MONTH) == month);
        if(weekday != FirstDayOfWeek)
            System.out.println();
    }}