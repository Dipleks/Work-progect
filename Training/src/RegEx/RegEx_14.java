package RegEx;/*Possesive Quantifier
* Работает так же как гриди (жадный оператор), но разница в том,
* что гриди дойдет до конца и пойдет в обратную сторону, а Possesive
* не возвращается обратно. И поэтому он работает намного быстрее.
* В конце регульярного выражения добавляем "+".*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_14 {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("\"[^\"]*+\"");
//        Matcher m = p.matcher("\"abc\"");
//        while (m.find()){
//            System.out.print(m.start()+" "+m.group()+" ");
//        }
//        System.out.println("");

//        Pattern p = Pattern.compile("\".*+\"");
        /*Если мы уберем "+", т.е сделаем его гриди, то выражение "abc"
        * отработает, т.к гриди идет до конца и приэтом хранит в памяти
        * все что нашел перед этим, но если мы оставим "+", то выражение не отработает,
        * т.к Possesive тоже идет до конца, но приэтом нехранит в памяти то
        * что находи перед этим.*/
//        Matcher m = p.matcher("\"abc\"x");
//        while (m.find()){
//            System.out.println(m.start()+" "+m.group()+" ");
//        }
//        System.out.println("");

        //Possesive можно заменить на аттомарную группу:
        //Pattern p = Pattern.compile("(a|b)*+b"); //в этом варианте он пойдет до конца и ничего не найдет
        //Pattern p = Pattern.compile("(?>(?:a|b)*)b"); //тут атомрная группа, тут мы ничего не найдем
        Pattern p = Pattern.compile("(?>a|b)*b"); //тут тоже атомарная группа, но выражение выполнится
        Matcher m = p.matcher("b");
        while (m.find()){
            System.out.println(m.start()+" "+m.group()+" ");
        }
        System.out.println("");
    }
}
