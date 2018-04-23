package RegEx;/*Примеры*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_21 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("ab");
        Matcher m = p.matcher("abaaaba");
        while (m.find()){
            System.out.print(m.start()+" "+m.group()+" "); //0 ab 4 ab
        }
        System.out.println("");

        Pattern p1 = Pattern.compile("aba");
        Matcher m1 = p1.matcher("abababa");
        while (m1.find()){
            System.out.print(m1.start()+" "+m1.group()+" "); //0 aba 4 aba
        }
        System.out.println("");

        Pattern p2 = Pattern.compile("\\d"); //1 1 2 2 4 3 6 4 7 5 8 6
//        Pattern p2 = Pattern.compile("\\d+"); //1 12 4 3 6 456
        Matcher m2 = p2.matcher("a12c3e456f");
        while (m2.find()){
            System.out.print(m2.start()+" "+m2.group()+" ");
        }
        System.out.println("");

        Pattern p3 = Pattern.compile("\\w");
        Matcher m3 = p3.matcher("a 1 56 _Z");
        while (m3.find()){
            System.out.print(m3.start()+" "+m3.group()+" "); //0 a 2 1 4 5 5 6 7 _ 8 Z
        }
        System.out.println("");

        Pattern p4 = Pattern.compile("[a-c]");
        Matcher m4 = p4.matcher("abc");
        while (m4.find()){
            System.out.print(m4.start()+" "+m4.group()+" "); //0 a 1 b 2 c
        }
        System.out.println("");

        Pattern p5 = Pattern.compile("proj1([^,])*");
        Matcher m5 = p5.matcher("proj3.txt,proj1sched.pdf,proj1,proj2,proj1.java");
        while (m5.find()){
            System.out.print(m5.start()+" "+m5.group()+" "); //10 proj1sched.pdf 25 proj1 37 proj1.java
        }
        System.out.println("");

        Pattern p6 = Pattern.compile("\\d\\d\\d([-\\s])?\\d\\d\\d\\d");
        Matcher m6 = p6.matcher("123 4567");
        while (m6.find()){
            System.out.print(m6.start()+" "+m6.group()+" "); //0 123 4567
        }
        System.out.println("");

        Pattern p7 = Pattern.compile("a.c");
        Matcher m7 = p7.matcher("ac abc a c");
        while (m7.find()){
            System.out.print(m7.start()+" "+m7.group()+" "); //3 abc 7 a c
        }
        System.out.println("");

        Pattern p8 = Pattern.compile(".*xx");
        Matcher m8 = p8.matcher("yyxxxyxx");
        while (m8.find()){
            System.out.print(m8.start()+" "+m8.group()+" "); //0 yyxxxyxx
        }
        System.out.println("");

        Pattern p9 = Pattern.compile(".*?xx");
        Matcher m9 = p9.matcher("yyxxxyxx");
        while (m9.find()){
            System.out.print(m9.start()+" "+m9.group()+" "); //0 yyxx 4 xyxx
        }
        System.out.println("");

        Pattern p10 = Pattern.compile(".*+xx");
        Matcher m10 = p10.matcher("yyxxxyxx");
        while (m10.find()){
            System.out.print(m10.start()+" "+m10.group()+" "); //ни чего не найдет
        }
        System.out.println(""); }}
/*На этом сайте можно попрактиковаться в использовании регулярных выражений https://regexone.com/*/