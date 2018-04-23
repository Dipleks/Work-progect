package ru;

import Октябрь_23.Данные;

public class Данные_2 {
    void metod() {
        Данные mod = new Данные();
        System.out.print(mod.d); //Тут нам может быть доступено только значение d из класса Данные, пакета Октябрь_23.
    }
}
