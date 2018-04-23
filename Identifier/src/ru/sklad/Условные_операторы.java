package ru.sklad;

public class Условные_операторы {
    public static void main(String[] args) {
        int a = 34, b = 56; //"&&" означает "и", "||" изначает "или".
        if (a != 34) {      // != - означает а не равно 34, что является ЛОЖЬю, отсюда значение выполняется "Не верно"
            System.out.println("Верно!");
        } else {
            System.out.println("Не верно!");
        }
        if (a>56 && b==56) {  //Задаем сразу 2 условия для проверки, и если хотя бы одно не верно, то выводится else.
            System.out.println("Верно!");
        } else {
            System.out.println("Не верно");
        }
        //Далее задаем 2 разных условия для проверки и 3 проверки.
        if (a<3 && b > 5){
            System.out.println("Неверно");
        } else if (a>5 || b<5) {
            System.out.println("Верно");
        } else System.out.println("Оба условия лож!");
    }
}
