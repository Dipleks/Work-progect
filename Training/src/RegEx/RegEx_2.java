package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_2 {
    public static void main(String[] args) {
        //Создаем шаблон по которому будет идти проверка:
        //Pattern p = Pattern.compile("a");
        //Pattern p = Pattern.compile("1\\+1=2");
        //Pattern p = Pattern.compile("\\Q1+1=2\\E");
        Pattern p = Pattern.compile("cat");
        //Ищем совпадения из шаблона:
        //Matcher m = p.matcher("Jack is a boy");
        //Matcher m = p.matcher("1+1=2");
        //Matcher m = p.matcher("1+1=2");
        Matcher m = p.matcher("He captured a catfish for his cat");
        while (m.find()){
            System.out.println(m.start() + " "+ m.group() + " ");
        }
        System.out.println("");
    } //Ответ: 1 а, 8 а (найдена буква "а" в 1-м символе и 8-м. Нумерация начинается от 0).
} //Символы []\^$.|?*+() - это все метосимволы.
/*Допустим чтобы проверить выражение 1+1=2, + нужно заэкранировать таким двойным слэшем \\.
* Так же есть такое выражение \Q....\E все что между ними считается дословным.*/
