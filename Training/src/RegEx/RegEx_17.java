package RegEx;/*Множественные требования*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*Сделаем регулярное выражение которое соответсвет нескольким требованием!
* Представим нам нужно найти слово из 6 букв в которм есть сочетание "cat".*/
public class RegEx_17 {
    public static void main(String[] args) {
        /*Разбиваем нашу задачу на две:
        * 1. нам необходимо найти слово из 6 букв b\w{6}\b
        * 2. нам необходимо найти слово в котором будет cat \b\w*cat\w*\b
        * в слове могут быть начальные символы и конечные символы.
        * (?=\b\w{6}\b) - это условие вернет нам true или false,
        * они ищет только слова с 6ю символами;
        * \b\w*cat\w*\b - в этом выражении \b говорящие о начале и конце слова,
        * значения не имеют, их можно опустить.
        * В результате мы получим запрос такого вида: (?=\b\w{6}\b)\w*cat\w*.
        * */
        Pattern p = Pattern.compile("(?=\\b\\w{6}\\b)\\w*cat\\w*");
        Matcher m = p.matcher("wecate rrrrcatto");
        while (m.find()){
            System.out.print(m.start()+" "+m.group()+" ");
        }
        System.out.println("");

        /*Теперь найдем слово из 6-12 символов в котором может быть cat или dog или mouse:*/
        Pattern p1 = Pattern.compile("\\b(?=\\w{6,12}\\b)\\w{0,9}(cat|dog|mouse)\\w*");
        Matcher m1 = p1.matcher("wecate rrrrcatto dog");
        while (m1.find()){
            System.out.print(m1.start()+" "+m1.group()+" ");
        }
        System.out.println("");
    }
}
