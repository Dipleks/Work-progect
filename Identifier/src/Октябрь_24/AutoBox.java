package Октябрь_24;
import java.util.ArrayList;
import java.util.List;
                                 //Обертки!
public class AutoBox {
    public static void main(String[] args) {
        byte a;
        long b;
        int c;
        short d;
        double e;
        float f;
        boolean bl;
        char ch;
     /*Зарезервированные обретки:*/
        Byte bt;
        Short sh;
        Boolean bo;
        Integer in;
        Long lg;
        Float fl;
        Character cha;
        Double db;

        //Пример:
       /*1*/ Integer i = new Integer(5); //Выведет на консоль 5 из цифры; можно записать проще Integer i = 5;
       /*2*/ Integer j = new Integer("6");  //Выведет на консоль 6 из String (текста);
       /*3*/ int k = Integer.parseInt("2"); //Преобразовываем цифру в String. Parse возвращает примитивное значение.
       /*4*/ Integer.valueOf("3");
       /*5*/ int g = i.valueOf("3"); //valueOf возвращает Integer.
       /*6*/ short s = i.shortValue(); //мы можем с помощью оберток конвертировать значения например byte в int.
       /*7*/ Integer i1 = new Integer(9);
             i1++;
        System.out.println(i1); //Ответ: 10.
       /*8*/ List<Integer> list = new ArrayList<>(); //обычный int мы не можем поместить в List, а Integer можем.
        list.add(1);
        list.add(2);
        list.add(3);
        for (int sr : list){
            System.out.println(sr); //Ответ: 1 2 3
       /*9*/ String s1 = "string";
             String s2 = "string";
             Object o1 = new Object();
             Object o2 = new Object();
             if (o1 == o2){ //== смотрит находится ли объект в одном и том же месте памяти.
                 System.out.println("=="); //Т.к. Object o1 и Object o2 записаны в разных ячейках паямяти,
                 //то ответ не выведется на консоль. Со String в данном случае по другому, одно и тоже слово
                 //может хранится в одной ячейки памяти.
                 if (s1.equals(s2)){ //таким образом == не является надежным методом сравнения 2х значений, вместо
                     //== лучше применять equals.
                     System.out.println("==");
                 }
             }
            //C Integer такая же история:
            Integer u1 = 5;
            Integer u2 = 5;
            if (u1.equals(u2)){System.out.println("equals");} //Ответ: equals
            if (u1 == u2) {System.out.println("==");} //Ответ: ==
            /*при этом одна ячейка памяти вмещает максимальное значение 127, т.е. значения 128 будут записаны в разные
            * ячейки памяти, а это значит что при одинаковом значении == на консоль не выведется ответ, что будет
            * ошибкой, а при equals значение будет точным и веным! Пример,*/
            Integer u11 = 128;
            Integer u21 = 128;
            if (u11.equals(u21)){System.out.println("equals");} //Ответ: equals
            if (u11 == u21) {System.out.println("==");} //Ответ: ответ на консоль не пришел, что является ошибкой ==!!!
        }
    }
    Object metod (){
        return 1;
    }
}
/*Обертки нужны для конвертации приметивов в String. Примитивные типы не могут быть null, в то время как обертки могут.
* Также классы-оболочки (обертки) могут быть использованы для достижения полиморфизма. Например,
* Object metod(){return 1}, на самом деле обетка скрывает такой код: Object metod(){return new Integer(1). Если бы
* оберток не было, 1 нельзя было бы вернуть!
* Разберем подробнее Integer i1 = new Integer(9);
                        i1++;
                        System.out.println(i1); //Ответ: 10.
  на самом деле скрытая форма благадаря обертке выглядит так:
                      Integer i1 = new Integer(9);
                        int t1 = i.intValue();
                        t1++
                        i = new Integer(t1);
                          System.out.println(i1)
  Другими словами t1++ заменяет нам целых 3 сторики кода одним значением!*/
