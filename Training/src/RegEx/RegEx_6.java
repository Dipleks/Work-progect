package RegEx;/*Начало и конец строки*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_6 {
    public static void main(String[] args) {
/* ^ - символ начала строки
*  $ - символ конца строки*/
//        Pattern p = Pattern.compile("^a"); //отобразит строки начинающиеся на букву а,
//если заменить буквой b, то результата не будет т.к. у нас нет строк начинающихся с этой буквы.
//        Pattern p = Pattern.compile("c$");
//        Matcher m = p.matcher("abc");
//        while (m.find()){
//            System.out.print(m.start()+" "+m.group()+" ");
//        }
//        System.out.println("");

        //Pattern p = Pattern.compile("\\d+"); //так заработает it's a number
//        Pattern p = Pattern.compile("^\\d+$"); //так не заработает, но если заменить ab4c на цифры то все заработает
//        Matcher m = p.matcher("ab4c");
//        while (m.find()){
//            System.out.println("it's a number");
//        }
//        System.out.println("Error");

        Pattern p = Pattern.compile("ne$", Pattern.MULTILINE);
        /*Pattern.MULTILINE - режим многострочности, без него программа найдет только последнею "ne"*/
        //Pattern p = Pattern.compile("ne\\z", Pattern.MULTILINE); //\z учитывает \n и закончит чтение на нем.
        Matcher m = p.matcher("first line\nsecond line");
        while (m.find()){
            System.out.print(m.start()+" "+m.group()+" ");
        }
        System.out.println("");
    }
}
