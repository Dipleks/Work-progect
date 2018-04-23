package com.Four;

public class Two extends One {
    //Размеры коробки q=50, w=60, h=70


    public static void main(String[] args) {
        One one = new One();
        int q = 50;
        int w = 60;
        int h = 70;
        System.out.print("Размеры коробки: Ширина-"+q+" Длина-"+w+" Выстоа-"+h+".\nВес вместе с котом: "+one.c());
    }
}
