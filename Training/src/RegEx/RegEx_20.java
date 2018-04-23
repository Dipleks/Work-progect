package RegEx;/*Коментарии*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_20 {
    public static void main(String[] args) {
 /*Коментарии у нас есть несколько видов:
 * 1. #comment - коментарии идут после решетки;
 * 2. вставляем не посредственно в выражение: (?#year)(19|20)\d\d[-/.];
 * 3. a(#aLetter) но подобные коментарии работают только при использовании
 * библиотеки jregex1.2_01.*/

 /*В JAVA комнтарии включаются двумя способами, при помощи Pattern.COMMENTS:*/
        //Pattern p = Pattern.compile("a#aLetter", Pattern.COMMENTS);
        //и при помощи (?x), но данный код подключая коментарии отключает whitespace (пробел):
        Pattern p = Pattern.compile("(?x)a#aLetter"); //подключили коментарии
        Pattern p1 = Pattern.compile("(?x)a b c"); //подключили коментарии и данный код отработает,
                                      //а не должен, т.к между символами присутствуют пробелы
        Matcher m = p.matcher("a");
        Matcher m1 = p1.matcher("abc");
        while (m.find()){
            System.out.print(m.start()+" "+m.group()+" ");
        }
        System.out.println("");
        while (m1.find()){
            System.out.print(m1.start()+" "+m1.group()+" ");
        }
        System.out.println("");
    }
}
