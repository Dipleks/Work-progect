package RegEx;/*Границы слов*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_5 {
    public static void main(String[] args) {
        /* \b - означает границу слова
        *  \B - любое слово кроме разрыва слов*/
        Pattern p = Pattern.compile("\\bis\\b");
        Matcher m = p.matcher("This island is beautiful");
        while (m.find()){
            System.out.println(m.start()+" "+m.group()+" ");
        }
        System.out.println("");
    }} /*В данном примере в предложении "This island is beautiful" присутствует
       * несколько "is", но меня интересует конкретно то, которое разделено
       * пробелами, для этого используем \b*/

