package RegEx;/*Символы звездочка и плюс*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_9 {
    public static void main(String[] args) {
/* * - символ который идет перед ней означает, что символ может быть повторен от 0 до
* бесконечности;
*  + - означет то же что и *, только не от 0, а от 1.*/
//        Pattern p = Pattern.compile("<[A-Za-z][A-Za-z0-9]*");
//        Matcher m = p.matcher("<h1>");
//        while (m.find()){
//            System.out.print(m.start()+" "+m.group()+" ");
//        }
//        System.out.println("");

        /*Если нет необходимости искать от 0 до бесконечности, то можно указать промежуток {2,4}*/
//        Pattern p = Pattern.compile("\\b[1-9][0-9]{2,4}\\b");
//        Matcher m = p.matcher("100 99999");
//        while (m.find()){
//            System.out.print(m.start()+" "+m.group()+" ");
//        }
//        System.out.println("");

        /*+ - жадный оператор поэтому он найдет все выражение <EM>first</EM>*/
//        Pattern p = Pattern.compile("<.+>");
//        /*Если добавим в конце ?, то получим <EM> </EM>*/
////        Pattern p = Pattern.compile("<.+?>");
//        /*или можно записать так (получим <EM> </EM>):*/
////        Pattern p = Pattern.compile("<[^>]+>");
//        Matcher m = p.matcher("This is a <EM>first</EM> test");
//        while (m.find()){
//            System.out.println(m.start()+" "+m.group()+" ");
//        }
//        System.out.println("");

        Pattern p = Pattern.compile("\\Q*\\d+*\\E+");
//        Pattern p = Pattern.compile("\\Q*\\d+\\E*+");
//        Pattern p = Pattern.compile("(?:\\Q*\\d+*\\E)+");
        Matcher m = p.matcher("*\\d+**\\d+*");
        while (m.find()){
            System.out.print(m.start()+" "+m.group()+" ");
        }
        System.out.println(""); }}