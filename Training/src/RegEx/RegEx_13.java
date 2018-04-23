package RegEx;/*Режимы регулярных выражений*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_13 {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("A#this is comment", Pattern.COMMENTS);
        /*Pattern.COMMENTS - означает что у нас могут использоваться коментарии,
        * все что за знаком # будет коментарием!*/
        Pattern p = Pattern.compile("a", Pattern.CASE_INSENSITIVE); //игнорирует регистр
        Matcher m = p.matcher("A");
        while (m.find()){
            System.out.print(m.start()+" "+m.group()+" ");
        }
        System.out.println("");

        /*Мы их можем использовать не только отдельно, но и не посредственно в
        * регулярых выражениях:*/
        System.out.println("A".matches("(?i)a")); // (?i) - игнорирует реестр
        "A".matches("(?s)a"); //single line
        "A".matches("(?m)a"); //multiline
        System.out.println("A".matches("(?x)A#this is comment")); //коментарии
        System.out.println("A".matches("(?ix)a#this is comment")); //коментарии+реестр
        System.out.println("AA".matches("(?i)a(?-i)a")); // (?-i) - временно отключаем режим
        System.out.println("AAA".matches("(?i)a(?-i:A)a")); // (?-i:A) - отключает режим только
                                                               //на то выражение которое стоит после ":"
    }
}
