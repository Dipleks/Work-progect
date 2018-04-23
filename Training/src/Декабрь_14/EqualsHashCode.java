package Декабрь_14;/*Переопределение Equals и HashCode*/

import java.util.Objects;

public class EqualsHashCode {
    public static void main(String[] args) {
    }
    //создадим класс:
    static class Car {
        String color;
        String name;
        //сгенерируем иквлс и хэшкод для наших переменных:

//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            Car car = (Car) o;
//            return Objects.equals(color, car.color) &&
//                    Objects.equals(name, car.name); }
/*В данном случае сравнение по equals не будет достоверным, т.к. у нас может быть несколько машин
* с одинаковым инменем (тайота) и с одинаковым цветом (синий). Для правельного сравнения нам, необходим
* уникальный идентификатор например номер машины!*/
        String number;
//в этом случаем сравнение будет достоверным!
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Car car = (Car) o;
            return Objects.equals(number, car.number);
        }
/*Что бы по hashCode было все достоверным, все наши значения должны быть константы,
* т.е возращать одно и тоже значение (например 1). В нашем случаем мы должны
* подставить такое же значение как и в equals, что бы они между собой были равны!*/
        @Override
        public int hashCode() {
            return Objects.hash(number);
        }
    }
}
