package ru.sklad;

public interface Koroba {
    //Размеры коробов под электрику в мм.
    int a = 20;                    //Короб 20х40х2000
    int b = 40;
    int c = 2000;
    default int a1(){return a;}
    default int b1(){return b;}
    default int c1(){return c;}

    int d = 40;                    //Короб 40х80х2000
    int e = 80;
    int f = 2000;
    default int d1(){return d;}
    default int e1(){return e;}
    default int f1(){return f;}
}
