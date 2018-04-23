package ru.sklad;

public interface Razmer {
    //Размеры помещейний в м.
    double a = 4.5; //длина
    int b = 3; //ширина
    double c = 2.7; //высота
    default double a1() {return a;}
    default int b1() {return b;}
    default double c1() {return c;}  //Размер 1й комнаты с входящим щитком.

    int e = 5; //длина
    double f = 3.6; //ширина
    double g = 2.7; //высота
    default int e1() {return e;}
    default double f1() {return f;}
    default double g1() {return g;}  //Размер 2й комнаты.
}
