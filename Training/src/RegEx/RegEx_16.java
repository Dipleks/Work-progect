package RegEx;/*LookAround
* он делится на две части: loockahead и loogbehind.
* loockahead создает регулярное выражение после регулярным выражением,
* loogbehind создает регулярное выражение перед регулярного выражения.
* Создается при помощи ?=*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_16 {
    public static void main(String[] args) {
        //Ищем букву q после которой идет u:
        Pattern p = Pattern.compile("q(?=u)"); //loockahead бывает позитивный
        //Ищем букву q после которой нет буквы u:
        //Pattern p = Pattern.compile("q(?!u)"); //loockahead бывает посивный
        //Matcher m = p.matcher("quqa");
        Matcher m = p.matcher("Irag");
        while (m.find()){
            System.out.print(m.start()+" "+m.group()+" ");
        }
        System.out.println("");

        //loogbehind:
        Pattern p1 = Pattern.compile("(?<!a)b"); //найдем букву "b" перед которой нет "a"
        //Pattern p1 = Pattern.compile("(?<=a)b"); //найдем букву "b" перед которой есть "a"
        Matcher m1 = p1.matcher("cb");
        while (m1.find()){
            System.out.print(m1.start()+" "+m1.group()+" ");
        }
        System.out.println("");

        //work that ends with s
//        Pattern p2 = Pattern.compile("\\b\\w+(?<!s)\\b"); //найдем все слова не заканчивающиеся на "s"
//        Pattern p2 = Pattern.compile("\\b\\w+[^s]\\b"); //ищем все символы пока не дойдем до "s"
        Pattern p2 = Pattern.compile("\\b\\w*[^s\\W]\\b"); //ищем все символы пока не дойдем до "s" и символа не являющегося буквой.
        Matcher m2 = p2.matcher("John's");
        while (m2.find()){
            System.out.print(m2.start()+" "+m2.group()+" ");
        }
        System.out.println("");
    }
}
