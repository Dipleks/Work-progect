package com.two;
      //Дана машина, разгон до 100 км.ч за 8 сек, разгон до 240 20 сек.. За сколько сек. она разгонится до 150 км.ч?
public class Three extends Two {
    public void mashin(){
        System.out.print("Машина разгоняется до 150 за ");
    }
        int a = 100;
        int b = 240;
        int c = 150;
        int d = 8;
        int e = 20;
        //Находим за сколько сек. машина разгоняет оставшиеся 240-100 км.ч
        int a1 = b-a;
        int e1 = e-d;
        double x = (10*e1)/a1;
        double s = (c*e)/b;   //получили за сколько сек. машина разгоняется до 150 км.ч
       double sm (){return s;}
}
