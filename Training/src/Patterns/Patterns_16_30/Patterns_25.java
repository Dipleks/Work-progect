package Patterns.Patterns_16_30;/*Null Object позоляет избежать NullPointerException*/

import java.io.File;

public class Patterns_25 {
    public static void main(String[] args) {
        Animal animal = getAnimal();
        animal.eat();
 /*Тут вылетит ошибка NullPointerException, т.к. файла не существует,
 * что бы этого избежать создаем класс NoAnimal и имплементим Animal,
 * в нем ничего не далаем, в вместо null подставляем new NoAnimal().
 * Все теперь код отработает!*/
    }
    static Animal getAnimal (){
        try {
            if (new File("lionet.txt").exists()){
                return new Leon();
            }
        } finally {
            //return  null;
            return new NoAnimal();
        }
    }
}
interface Animal {
    void eat();
}
class Leon implements Animal{
    @Override
    public void eat() {
        System.out.println("Lion eat");
    }
}
class NoAnimal implements Animal{
    public void eat() {}
}
