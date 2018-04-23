package RegEx;/*| - Pipeline*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_7 {
    public static void main(String[] args) {
        /*| - или. Ищет из 2х предоставленных вариантов*/
//        Pattern p = Pattern.compile("cat|dog");
//        Matcher m = p.matcher("I like my dog");
//        while (m.find()){
//            System.out.print(m.start()+" "+m.group()+" ");
//        }
//        System.out.println("");

        Pattern p = Pattern.compile("Get|GetValue|Set|SetValue");
//        Pattern p = Pattern.compile("Get|GetValue|SetValue|Set");
//        Pattern p = Pattern.compile("Get(Value)|Set(Value)");
//        Pattern p = Pattern.compile("\\b(Get|GetValue|Set|SetValue)\\b");
//        Pattern p = Pattern.compile("\\b(Get(Value)?|Set(Value)?)\\b");
//        Pattern p = Pattern.compile("\\b(Get|Set)(Value)?\\b");
        Matcher m = p.matcher("SetValue");
        while (m.find()){
            System.out.print(m.start()+" "+m.group()+" ");
        }
        System.out.println("");
    }
}
