package Ноябрь_22;/*Enum_подробнее*/
/*Расмотрим перечисления подробнее, как они выглядят на самом деле
* и какие возможности предоставляют. Создадим Enum:*/

//enum Level {BEGGINER, INTERMEDIATE, EXPERT}
/*компилируем*/
/*В результате компиляции получили класс Level.class
* лежащий в папке out/production/Training/Ноябрь_22/Level.class.
* Он принимает вид:
* package Ноябрь_22;
enum Level {
    BEGGINER,
    INTERMEDIATE,
    EXPERT;
    private Level() {
    }
}*/
/*На самом деле наш класс принимает другой вид и наш
* класс наследуется от класса Enum:*/
//final class Level extends Enum {
//    public static final Level BEGGINER;
//    public static final Level INTERMEDIATE;
//    public static final Level EXPERT;
//
//    private static final Level $VALUES[];
//    static {
//        BEGGINER = new Level("BEGGINER", 0);
//        INTERMEDIATE = new Level("INTERMEDIATE", 1);
//        EXPERT = new Level("EXPERT", 2);
//        $VALUES = (new Level[]{BEGGINER, INTERMEDIATE, EXPERT});
//    }
//    public static Level[] values() {
//        return (Level[])$VALUES.clone();
//    }
//    public static Level valueOf(String s){
//        return (Level)Enum.valueOf(Level, s);
//    }
//    private Level (String s, int i){
//        super(s, i);
//    }
//}
/*Другими словами, одной строчкой enum Level {BEGGINER, INTERMEDIATE, EXPERT},
* мы заменяем целый код, описанный выше!
*
* Т.к. enum это класс, то он предоставляет нам такие же возможности
* как и обычный класс. Мы его не можем расширит (extends) в виду того,
* что он у нас уже заэктенден от класса Enum, но мы можем его имплементить,
* переопределять его методы, создавать конструкторы (конструторы не могут быть протектод
* или паблик)!*/

public class Enum_подробнее {
    public static void main(String[] args) {

    }
}
