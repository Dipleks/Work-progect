package RegEx;/*If Then Else
Научимся использовать кондишенел условия (if/else) в регулярных выражениях.*/
/*Сама по себе java  не может использовать If Then Else, но тем неменее
* регулярные выражения такое поддерживают. Для работы нужно скачать:
* https://sourceforge.net/projects/jregex/files/
* jregex1.2_01 - подключаем к проекту*/
import jregex.Matcher;
import jregex.Pattern;

public class RegEx_18 {
    public static void main(String[] args) {
/*После добовления jregex1.2_01, мы теперь не пишем Pattern.compile,
* а используем патерн из jrx:*/

/*Работает он так: в скобках () пишем ?, затем "значение" (ifthen) далее "или" (|) и "значение" (else):
* (?ifthen|else). else не обязателен и может быть опущен. Мы можем использовать LookAround, то выражение примет
* вид: (?(?=regex)then|else). Так же группы у нас могут объединятся:
* (?(?=condition)(then1|then2|then3)|(else1|else2|else3))*/
        Pattern p = new Pattern("(a)?b(?(1)c|d)");
        /*В этом выражении сначало смотрится (а), которое может быть или нет "?",
        * далее идем к "b", далее смотрим "(1)" было ли найдено выражение "(а)", нет не было,
        * значит пропускаем "с" и смотрим "d":*/
        Matcher m = p.matcher("bd");
//        Matcher m = p.matcher("abc");
//        Matcher m = p.matcher("bc");
//        Matcher m = p.matcher("adb");
        while (m.find()){
            System.out.print(m.start()+" "+m+" ");
        }
        System.out.println("");
    } /*В данной библиотеке jregex1.2_01 мы не можем обращаться к регулярным выражениям по именам!*/
}
