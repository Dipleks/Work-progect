package ru.sklad;

public class Конструкторы_Person {
    //Используем класс ООП_Person
    int рост;
    float вес;
    void say (String str) {
        System.out.println(str);
    }
    //Создаем конструктор для класса Конструкторы
    Конструкторы_Person ( int рост, float вес) {
        this.рост = рост;
        this.вес = вес;
    }
    //Добавляем пустой конструктор для выполнения условия:
    /*ООП_Person denis = new ООП_Person();
        denis.рост = 174;
        denis.вес = 71.4f;
        max.say("Мой рост и мой вес: ");
        System.out.println(denis.рост+"\n"+denis.вес);*/
    Конструкторы_Person (){}
}
