package Ноябрь_21;/*Переопределение equals*/

public class Переопределение_equals {
    public static void main(String[] args) {
        //Создадим наши Book и сравним их:
        Book x = new Book("one");
        Book y = new Book("one");
        Book z = new Book("one");

        /*Переопределение equals должно отвечать нескольким параметрам:*/
        //reflexive
        System.out.println("reflexive");
        System.out.println(x.equals(x)); //должен быть true
        System.out.println("");

        //symmetric
        System.out.println("symmetric");
        System.out.println(x.equals(y)); //сравним х с у
        System.out.println(y.equals(x)); //сравним у с х
        System.out.println("");

        //transitive
        System.out.println("transitive");
        System.out.println(x.equals(y));
        System.out.println(y.equals(z));
        System.out.println(x.equals(z));
        System.out.println("");

        //consistent
        System.out.println("consistent");
        System.out.println(x.equals(y));
        System.out.println(x.equals(y));
        System.out.println(x.equals(y));
        System.out.println(x.equals(y));
        System.out.println("");

        //not null
        System.out.println("not null");
        System.out.println(x.equals(null)); //должен быть false
    }
}
/*Для переопределения создадим класс Book:*/
class Book{
    //у него будет одно поле и конструктор:
    String title;

    public Book(String title) {
        this.title = title;
    }
    //и будем переопределять наш equals (к примеру если хотим
    //что книги с одним параметром ONE были эквивалентны):
    //Мы можем сгененрировать код или написать сами:

    //гененрируем:
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Book book = (Book) o;
//        return title != null ? title.equals(book.title) : book.title == null;
//    }
//    @Override
//    public int hashCode() {
//        return title != null ? title.hashCode() : 0;
//    }

    //пишем сами (нажимаем Ctrl+O и имплементим иквелс):
    @Override
    public boolean equals(Object o) {
        /*возвращаем "о" не равен null и переопределяем это значение*/
        if (o instanceof Book) //instanceof проверяет что наш объект "о" является наследником Book.
            /*Используя instanceof, можно не писать "o != null", проверка пройдет всеравно павильно!*/
        { return o != null && this.title.equals(((Book) o).title);
        } return false;
    }
}
