package RegEx;/*Группы*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_10 {
    /*Группы выражений заключаются в круглые скобки ()
    * преимущество групп в том что к ним происходит повторное обращение!
    * Внутри группы может быть так же любое регулярное выражение.*/
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("Set(Value)?"); //если поставить перед Value "?:", то
//                               //выражение запоминаться не будет и у него не будет обратной связи.
//        Matcher m = p.matcher("Set or SetValue");
//        while (m.find()){
//            System.out.print(m.start()+" "+m.group()+" ");
//        }
//        System.out.println("");

//        Pattern p = Pattern.compile("EditPad (Lite|Pro)");
//        Matcher m = p.matcher("EditPad Lite version");
//        while (m.find()){
//            System.out.print(m.start()+" "+m.group()+" ");
//        }
//        System.out.println("");

        /*Переиспользование групп:*/
//        System.out.println("EditPad Lite".replaceAll("EditPad (Lite|Pro)", "$1 version")); //берет Lite version
//        System.out.println("EditPad Lite".replaceAll("EditPad (Lite|Pro)", "$0 version")); //берет все выражение
//        System.out.println("EditPad Lite".replaceAll("EditPad (Lite|Pro)", "$1 version").toUpperCase()); //получим LITE VERSION
//        System.out.println("EditPad Lite".replaceAll("EditPad (Lite|Pro)", "$1 version").toLowerCase()); //получим lite version

//        Pattern p = Pattern.compile("<([A-Z][A-Z0-9]*)[^>]*>.*?</\\1>"); // \\1 - означает что мы должны повторно
//                                                                //просматривать выражение из 1й группы ([A-Z][A-Z0-9]*)
//        Matcher m = p.matcher("This is a <EM>first</EM> test");
//        while (m.find()){
//            System.out.print(m.start()+" "+m.group()+" ");
//        }
//        System.out.println("");

//        Pattern p = Pattern.compile("([a-c])x\\1x\\1");
//        /*Компилятор берет выражение из первой группы, затем х, затем опять
//        * выражение из первой группы, затем х и опять выражение из первой группы, в
//        * итоге получим: ахаха! Но если мы подменим "а" на "b" выражение не сработает,
//        * т.к. после "х" у нас идет обращение (обратная ссылка) к 1й группе, т.е  найденной "а"!*/
//        Matcher m = p.matcher("axaxa");
//        while (m.find()){
//            System.out.println(m.start()+" "+m.group()+" ");
//        }
//        System.out.println();

        /*Нельзя ссылаться на группу, внутри самой группы:*/
//        Pattern p = Pattern.compile("([a-c]\\1)"); //error
//        Matcher m = p.matcher("axaxa");
//        while (m.find()){
//            System.out.print(m.start()+" "+m.group()+" ");
//        }
//        System.out.println("");

//        Pattern p = Pattern.compile("<([A-Z][A-Z0-9]*)[^>]*>.*?</\\1>");
//        Matcher m = p.matcher("Testing <B><I>bold italic</I></B> text");
//        while (m.find()){
//            System.out.print(m.start()+" "+m.group()+" ");
//        }
//        System.out.println("");

        /*Разница между тем где будет стоять "+":*/
        //Pattern p = Pattern.compile("([abc]+)");
        //Пример:
        //Pattern p = Pattern.compile("([abc]+)=\\1"); //ответ cab=cab, т.к мы обратились к "целым словам"
        /*Тут "+" гшоаорит что у нас три группы, из 1й [abc] получим "с", 2я перезапишется на "a"
        * 3я перезапишется на "b"*/
//        Pattern p = Pattern.compile("([abc])+");
        //Пример:
//        Pattern p = Pattern.compile("([abc])+=\\1");
////        Matcher m = p.matcher("cab=cab"); //не отработает т.к когда произойдет обратное обращение,
//                                  //то программа запомнит "b", т.е при таком условии, все отработает:
//        Matcher m = p.matcher("cab=b"); //ответ cab=b. Обратное обращение верно!
//        while (m.find()){
//            System.out.print(m.start()+" "+m.group()+" ");
//        }
//        System.out.println("");

        /*К примеру у нас есть текст в котором переодически повторяются слова,
        * данное регуляроне выражение позволяет найти нам слово после которых через пробел написано
        * такое же слово и позволяет убрать повторяющееся слово:*/
//        System.out.println("the the".replaceAll("\\b(\\w+)\\s+\\1\\b", "$1"));

        /*В этом прмере создвнная группа помещена в [], что означает что группа
        * создаваться не будет и обратного обращения тоже не будет! И всё выражение
        * будет восприниматься буквально, т.е будет искаться на abc, а будет искаться:
        * (, a, ), b, \, 1.*/
        Pattern p = Pattern.compile("[(a)b\1]");
        Matcher m = p.matcher("abc()\\1"); //Ответ: a, b, (, ).
        while (m.find()){
            System.out.print(m.start()+" "+m.group()+" ");
        }
        System.out.println("");
    }
}
