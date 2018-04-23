package RegEx;/*Точка*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Точка заменяет любой знак кроме конца.*/
public class RegEx_4 {
    public static void main(String[] args) {
        /*Сделаем пример с датой 02/12/03*/
//        Pattern p = Pattern.compile("\\d\\d.\\d\\d.\\d\\d"); //цифра-цифра-любой символ-цифра-цифра-любой символ-цифра-цифра
//        Matcher m = p.matcher("02/12/03");
//        while (m.find()){
//            System.out.print(m.start() + " "+ m.group() + " ");
//        }
//        System.out.print("");

        /*Точка удобна когда нужно найти что-нибудь между двумя символами:*/
//        Pattern p = Pattern.compile("\".*\""); // \" - между чем ищем, . - любой символ, * - этих символов может быть много.
//        Matcher m = p.matcher("Put a \"string\" between double quotes");
//        while (m.find()){
//            System.out.print(m.start() + " "+ m.group() + " ");
//        }
//        System.out.print("");
//    } //Ответ: "string"

        /*Но если у нас будет несколько слов, то опператор данного типа охватит все поле:*/
//        Pattern p = Pattern.compile("\".*\"");
//        Matcher m = p.matcher("Put a \"string\" between double quotes \"string\"");
//        while (m.find()){
//            System.out.print(m.start() + " "+ m.group() + " ");
//        }
//        System.out.print("");
//    } //Ответ: "string" between double quotes "string"

        /*В этом случае лучше записать так:*/
        Pattern p = Pattern.compile("\".*?\"");
        Matcher m = p.matcher("Put a \"string\" between double quotes \"string\"");
        while (m.find()){
            System.out.print(m.start() + " "+ m.group() + " ");
        }
        System.out.print("");}} //Ответ: "string" "string"

