package RegEx;/*Posix символы
Java не поддерживает Posix символы, но как альтирнатива
имеется поддержка аннотаций!
Список сокращений можно посмотреть в документации.
Запись производится: \p{ИМЯ_АННОТАЦИИ}*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_19 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[x-z\\p{Digit}]"); //будет найдена 5.
        //Pattern p = Pattern.compile("[^x-z\\p{Digit}]"); //не будет найдена 5, т.к указано отрицание "^".
        Matcher m = p.matcher("5");
        while (m.find()){
            System.out.print(m.start()+" "+m.group()+" ");
        }
        System.out.println("");
    }
}
