package Практические_занятия.Dnevnik;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalTest {
    public static void main(String[] args) {
        Date date = new Date();
//        System.out.println("date: " + date); //выводит сегодняшнию дату

        GregorianCalendar gC = new GregorianCalendar();
        int today = gC.get(Calendar.DAY_OF_MONTH); //сегодняшний день
        int month = gC.get(Calendar.MONTH); //месяц
        gC.set(Calendar.DAY_OF_MONTH, 1); //задаем первый день месяца, т.е DAY_OF_MONTH - число (день), 1 - день недели (Пн)
        int weekday = gC.get(Calendar.DAY_OF_WEEK); //следующий день
        int FirstDayOfWeek = gC.getFirstDayOfWeek(); //первый день недели
//        int in = 0;

//        System.out.println("сегодняшний день: " + today);
//        System.out.println("месяц: " + month);
//        System.out.println("следующий день: " + weekday);
//        System.out.println("первый день недели: " + FirstDayOfWeek);

//        while (weekday != FirstDayOfWeek){
//            in++; //счетчик
//            gC.add(Calendar.DAY_OF_MONTH, -1);
//            weekday = gC.get(Calendar.DAY_OF_WEEK);
//        }

        String[] WeekDayNames = new DateFormatSymbols().getShortWeekdays(); //получаем массив Пн, Вт...

        //Выводим ПН, ВТ...:
        do{
            System.out.printf("%4s", WeekDayNames[weekday]); //%4s -  пробелы между Пн, Вт... (т.е означет, что
                                                                // Пн знимает 4 символа, Вт знамает 4 символа и т.д.)
            gC.add(Calendar.DAY_OF_MONTH, 1); //получаем формат: Пн, Вт, Ср: 1 - Пн, Вт...; 2 - Пн, Ср...
            weekday = gC.get(Calendar.DAY_OF_WEEK); //выводим Пн, Вт...
        } while(weekday != FirstDayOfWeek); //повторяет цикл до тех пор пока weekday не равен FirstDayOfWeek,
                                            //т.е пн,вт,ср,чт,пт,сб,вс и как только пн повторится цикл остановится!
        System.out.println();

//        for(int i = 1; i<=in; i++)
//            System.out.print("  ");//тут выводит пробелы на первой неделе месяця

        //выводим дни:
        gC.set(Calendar.DAY_OF_MONTH, 1); //день с которого начнется месяц
        do{
            int day = gC.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d", day); //"%3d" - пробелы между датами

            if(day == today) {
                System.out.print("*"); //Если сегодняшний день равен day то ставим *, в остальных случаях пробел
            } else {
                System.out.print(" ");}

            gC.add(Calendar.DAY_OF_MONTH, 1); //выводим дни (1 - каждый день, 2 - каждый 2 день и т.д.)

            //задаем условие, чтобы даты не вывелись в столбик:
            weekday = gC.get(Calendar.DAY_OF_WEEK);
            if (weekday == FirstDayOfWeek)
                System.out.println();
        }
        while(gC.get(Calendar.MONTH) == month);
        //проверяет когда закончится месяц:
        if(weekday != FirstDayOfWeek)
            System.out.println();
    }
}
