package RegEx;/*Unicode*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_12 {
    public static void main(String[] args) {
/*Изучим поддержку unicode в регулярных выражениях:*/
//        System.out.println("\u0061\u0300"); //à, u0061 -юникод буквы "а"; u0300 - это юникод "̀ "!
//        System.out.println("\u00E0"); //юникод буквы "à"!

        /*Иногда может быть такая ситуация когда необходимо искать символы по юникоду:*/
        //Pattern p = Pattern.compile("à");
//        Pattern p = Pattern.compile("\u00E0");
        //или
//        Pattern p = Pattern.compile("\\x{00E0}");
//        Matcher m = p.matcher("à");
//        while (m.find()){
//            System.out.print(m.start()+" "+m.group()+" ");
//        }
//        System.out.println("");

        /*Рассмотрим наборы сиволов:*/
        /*Указываем \p{ИМЯ_НАБОРА}*/
//        Pattern p = Pattern.compile("\\p{L}"); //можно ввести сокращение имени группы L - unicode letter
        //Их можно также объединять:
//        Pattern p = Pattern.compile("\\p{L}\\p{Digit}");
//        Matcher m = p.matcher("à1");
//        while (m.find()){
//            System.out.print(m.start()+" "+m.group()+" ");
//        }
//        System.out.println("");
  /*Все сокращения и наборы можно посмотреть в документации JAVA или погуглить!*/

        Pattern p = Pattern.compile("à", Pattern.CANON_EQ);
        /*В данном примере à - это два символа, в Matcher мы указываем одиин
        * символ, но в Pattern мы добавили Pattern.CANON_EQ - что означает, если значения
        * похожы то считать их одинаковыми, т.е "à" = "à"*/
        Matcher m = p.matcher("à");
        while (m.find()){
            System.out.print(m.start()+" "+m.group()+" ");
        } System.out.println(""); }}
