package Октябрь_30;

public class StringBuilder_ {
    public static void main(String[] args) {
       String a = new String("One!");
       String b = a.concat("Two!");
        System.out.println(b); //Ответ: One!Two!
/*Класс String представляет собой неизменяемые последовательности
* символов постоянной длины и частое использование объектов класса занимают много
* места в памяти. Класс StringBuffer представляет расширяемые и доступные для
* изменений последовательности символов, позволяя вставлять символы и подстроки в
* существующую строку и в любом месте. Данный класс гораздо экономичнее в плане
* потребления памяти и настоятельно рекомендуется к использованию.*/
       StringBuilder stringBuilder = new StringBuilder();
       stringBuilder.append("Приииивет! ");
       stringBuilder.append("Пока!");
       stringBuilder.insert( 4,"-"); //insert помещает значение между букв, наприер после 4 символа.
        System.out.println(stringBuilder); //Ответ: Прии-иивет! Пока!
    }
}
