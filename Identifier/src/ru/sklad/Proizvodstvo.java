package ru.sklad;

public class Proizvodstvo {
    //В щиток заходит короб 40х80, растояние от щитка до 1й границы 0,5м, растояние до входа 1,3м
    //От щитка в команту идет короб 20х40, растояние от щитка до поворота 2,9м, толщина стены 0,4м, в комнате по длине
    //короб проходит 4м, по ширине 1,5 и в высоту 1,5м. Узнать необходимое колличество коробов.
    public static void main(String[] args) {
        Koroba koroba =new Koroba() {};
        Razmer razmer =new Razmer() {};
        double dkb = 0.5;
        double dkb1 = 1.3;
        double dk2 = 2.9;
        double dk3 = 0.4;
        double dk4 = 4;
        double dk5 = 1.5;
        double dk6 = 1.5;
        double ko = dkb+dkb1; //общая длина короба 40х80
        double ko1 = dk2+dk3+dk4+dk5+dk6; //общая длина короба 20х40
        System.out.println("Рзамеры помещений, вход: "+razmer.a1()+"м. - длина, "+razmer.b1()+"м. - ширина, "+razmer.c1()+"м. - высота. ");
        System.out.println("Комната: "+razmer.e1()+"м. - длина, "+razmer.f1()+"м. - ширина, "+razmer.g1()+"м. - высота. ");
        System.out.println("Короб 40х80х2000, будет не обходим в количестве: "+(ko/(koroba.f1()/1000))*2+"м.; ");
        System.out.println("Короб 20х40х2000, будет не обходим в количестве: "+(ko1/(koroba.c1()/1000))*2+"м..");
    }
}
