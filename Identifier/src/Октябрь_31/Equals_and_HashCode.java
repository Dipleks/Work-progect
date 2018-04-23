package Октябрь_31;

import java.util.HashMap;
import java.util.Map;

public class Equals_and_HashCode {
    /*Метод equals() — сравнивает строку с указанным объектом.
* Результатом является значение true только в том случае, если
* аргумент не равен null и является строковым объектом (String),
* который представляет ту же последовательность символов как и
* этот объект. Если проще он сравнивает объекты и по умолчанию
* проверяет адреса в пямати; и является ли один объект равным другому
* и находятся ли они в одной ячейки памяти, если нет то объекты считаются
* не равными!*/
/*Метод hashCode() — возвращает хэш-код для данной строки,
* позволяющий получить уникальный целый номер для данного объекта.
* По умолчанию он просто возращает адрес в памяти.*/

    //Создадим класс Book! У которого будет какое-либо значение.
    /*public static void main(String[] args) {
        Book book = new Book();
        book.autor = "С.Кинг";
        book.name = "Куджо";
        Map<String, Book> library = new HashMap<>(); *//*Создаем библиотеку (library),
        в которую помещаем все наши книги.*//*
        //library.put("Куджо!", book); //помещаем в библиотеку книгу.
        *//*Так же мы можем положить (put) нашу книгу по названию,
        * для этого в класс Book, записываем новую переменную name и
        * в в классе Equals_and_HashCode даем имя книге!*//*
        library.put(book.name, book);

        *//*Теперь допустим мы хотим получить нашу книгу:*//*
        Book bookКинг = library.get(book.name);
        System.out.println(bookКинг.autor); //Ответ: С.Кинг
    }
}
class Book {
    String autor;
    String name;}*/

    /*Мар у нас работает на основе Hash!
    * Если упрощенно, то допустим у нас есть ячейки
    * памяти (массив) 1,2,3...150, то наши книги помещаются в
    * эти ячейки и с помощью hash кода вызываются! hashCode как бы
    * присваевает объекту уникальный номер, по которому потом извлекает его.*/

    /*equals и hashCode, необходимо переопределять!
    * Почему нас не устраивает их работа по умолчанию,
    * допустим мы хотим извлечь книгу по читательскому билету
    * (создадим класс Ticket), извлекаем по ticket все хорошо,
    * но допустим мы дали наш билет другу, он взял книгу, у него
    * теперь тоже есть наш ticket2. Тепрь по этому новому ticket2
    * с тем же номером мы пытаемся получить книгу, в результате
    * компилятор выдаст нам ошибку, т.к наша книга не эквивалентна,
    * equals сравнил адреса и получил null (не совпадение адресов).*/

   /* public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Ticket ticket2 = new Ticket();
        Book book = new Book();
        ticket.namber = 1235;
        ticket2.namber = 1235;
        book.autor = "С.Кинг";
        book.name = "Куджо";
        Map<Ticket, Book> library = new HashMap<>();
        library.put(ticket, book); //помещаем книгу по читательсому билету.
        //Book bookКинг = library.get(ticket); //извлекаем нашу книгу по читательскому билету (ticket)
        Book bookКинг = library.get(ticket2); //получим ошибку.
        System.out.println(bookКинг.autor);
    }
}
class Book {
    String autor;
    String name;
}
class Ticket {
    int namber;
}*/
/*Для того чтоб наш ticket2 и ticket отталкивались от namber
* нам необходимо переопределить наш класс Тicket:*/

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Ticket ticket2 = new Ticket();
        Book book = new Book();
        ticket.namber = 1235;
        ticket2.namber = 1235;
        book.autor = "С.Кинг";
        book.name = "Куджо";
        Map<Ticket, Book> library = new HashMap<>();
        library.put(ticket, book);
        Book bookКинг = library.get(ticket2);
        System.out.println(bookКинг.autor);
    }
}
class Book {
    String autor;
    String name;
}
/*Переопределяем автоматически нажимаем Alt+Insert и выбираем
* equals()hashCode()*/
class Ticket {
    int namber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        return namber == ticket.namber;
    }

    @Override
    public int hashCode() {
        return namber;
    }
}
/*После генирации кода System.out.println(bookКинг.autor); заработает без ошибок!
* В оверайдах hashCode теперь нам все время будет возращать наш namber (1235).
* hashCode у нас интовое значение, и оно у нас примерно до 4 миллиардов.
* Предаствим что у нас 6 миллиардов человек взяли книги, в этом случем наши инты
* будут записываться по 2му кругу, и чтоб не было путаницы используем наш
* сгенерированный equals.
* Т.е. в одном адресе (hashCode) у нас могут хранится много книг и для того чтобы
* их можно было разлечить используется equals.
* Притаком кол-ве объекты могут быть равны по hashCode но не равны по equals.
* ticket2 это точно такой же ключ как и ticket с теме же пораметрами, но ни один и тот же!*/