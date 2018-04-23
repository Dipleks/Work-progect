package ru.sklad;

public class Stat_2 {
    //Создаем переменую со значением static
    public static int a = 458; //такую запись я могу использовать, например, в классе Stat_1
    //Так же за счет static мы можем работать с функциями, например, создадим конструктор:

    public static void funkziya (String t){
        System.out.print(t);
    }
}
