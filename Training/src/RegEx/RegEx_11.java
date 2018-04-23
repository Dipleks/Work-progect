package RegEx;/*Именованные группы*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_11 {
    public static void main(String[] args) {
/*Научимся давать имена группам!*/
        //Зададим имя группы ?<ИМЯ>
//        System.out.println("abc".replaceAll("(?<Aletter>a)", "${Aletter}-"));
        /*${Aletter}- - этим выражением мы говорим, что хотим заменить нашу группу (а), на
        * новое выражение а-. В итоге получем a-bc. Это если мы используем replaceAll.
        *
        * Но если мы используем Pattern, то мы применяем такую концепцию \\k<ИМЯ>
        * для обращения к имени группы (когда у нас не было имени мы обращались
        * через номер \\1):*/
//        Pattern p = Pattern.compile("<(?<tag>[A-Z][A-Z0-9]*)[^>]*>.*?</\\k<tag>>");
//        Matcher m = p.matcher("This is a <EM>first</EM> test");
//        while (m.find()){
//            System.out.print(m.start()+" "+m.group()+" ");
//        }
//        System.out.println("");

        //обратимся к группе по номеру:
        System.out.println("abcd".replaceAll("(a)(?<x>b)(c)(?<y>d)", "$1$2$3$4"));
        //обратимся к группе по имени:
        System.out.println("abcd".replaceAll("(a)(?<x>b)(c)(?<y>d)", "$1${x}$3${y}"));
    }
}
