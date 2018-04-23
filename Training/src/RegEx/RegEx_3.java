package RegEx;/*Наборы символов*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_3 {
    public static void main(String[] args) {
        //Pattern p = Pattern.compile("[a-bA-Z1-5]"); //Определим диапазон символов которые необходимо найти.
        //Pattern p = Pattern.compile("gr[ae]y"); //Допустим у нас есть 2 словав англ.яз и американском они
                                                  //пишутся по разному gray и grey
        //Для квадратных скобок только 4 спецюсивола: ]\^-
        /*^ - это символ отрицания, т.е если после q будет u, то программа неотобразит q, но
        * если после q будет другой сивол то q отобразится. Он должен стоять строго вначале:*/
        Pattern p = Pattern.compile("q[^u]");

        //Matcher m = p.matcher("abc15S");
        //Matcher m = p.matcher("gray");
        Matcher m = p.matcher("Iraq is a country");
        while (m.find()){
            System.out.print(m.start() + " "+ m.group() + " ");
        }
        System.out.print("");
    } /*https://docs.oracle.com/javase/8/docs/api/ можно посмотреть класс Pattern
      * в нем более подробно овсех сокращениях.*/
}
