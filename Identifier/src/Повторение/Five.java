package Повторение;

import java.text.*;
import java.util.Calendar;
import java.util.Date;

public class Five {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
   /*1*/     System.out.println(date);
        Calendar calendar = Calendar.getInstance();
  /*2*/      System.out.println(calendar.getTime());
        calendar.add(Calendar.YEAR, 5);
  /*3*/      System.out.println(calendar.getTime());

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
  /*4*/      System.out.println(dateFormat.format(calendar.getTime()));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd_MM_yyyy");
  /*5*/      System.out.println(simpleDateFormat.format(calendar.getTime()));

        SimpleDateFormat a = new SimpleDateFormat("dd.MM.yyyy");
        Calendar calendar1 = Calendar.getInstance();
        Date newDate = a.parse("31.01.1987");

  /*6*/      System.out.println(newDate);
    }
}