package RegEx;/*Optional Items или знак вопроса*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_8 {
    public static void main(String[] args) {
        /*? - означает что стоящий перед ним символ может быть или не быть или группа символов ([a-c]?)*/
//        Pattern p = Pattern.compile("colou?r");
//        Matcher m = p.matcher("color colour");
//        while (m.find()){
//            System.out.print(m.start()+" "+m.group()+" ");
//        }
//        System.out.println("");

//        Pattern p = Pattern.compile("Nov(ember)?");
//        /*Если указать два знака ??, то программа найдет Nov и Nov*/
//        Matcher m = p.matcher("November Nov");
//        while (m.find()){
//            System.out.print(m.start()+" "+m.group()+" ");
//        }
//        System.out.println("");

        Pattern p = Pattern.compile("Feb(ruary)? 23(rd)?");
        Matcher m = p.matcher("February 23rg, February 23, Feb 23rg, Feb 23");
        while (m.find()){
            System.out.print(m.start()+" "+m.group()+" ");
        }
        System.out.println("");
    }
}
