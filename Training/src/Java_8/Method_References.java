package Java_8;/*Method_References*/

import java.util.stream.Stream;

public class Method_References {
    public static void main(String[] args) {
        Stream.of("one", "two").map(x -> x.toUpperCase());
        //данную запись можно еще сократить:
        Stream.of("one", "two").map(String::toUpperCase);
        //расмотрим пример данного кода, создадим класс и поместим значения в наш код:
        Stream.of(new Studient("Denis"), new Studient("Max")).map(Studient::getName).forEach(System.out::println);
        //так же мы можем вызвать конструктор из нашего студента:
        Stream.of("Jone", "Andre").map(String::new).forEach(System.out::println);
    }
}
class Studient {
    String name;

    public Studient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
