package Ноябрь_27;

import java.text.MessageFormat;
import java.util.GregorianCalendar;

public class Форматирование_строк {
    public static void main(String[] args) throws Exception {
        /*Представим у нас есть несколько строк
        * в которых говорится о погоде, в первой о том,
        * что был ураган, во 2й что солнечно:*/
        String s1 = "On 22.02.2017 was hurricane";
        String s2 = "On 23.02.2017 was sunni";

        /*Но что если таких строк будет очень много,
        * для этого существует форматирование, которое
        * позволяет подставлять значения:*/
        //String s3 = "On {0} was {1}";
        //теперь вывдем желаемую строку:
//        String s4 = MessageFormat.format(s3, "22.02.2017", "hurricane");
//        System.out.println(s4);

        //Так же через запятую мы можем указывать параметры:
        //number;  дополнительно через запятую можно вызвать: integer, currency, percent
        //time, date; дополнительно через запятую можно вызвать: short, medium, long, full.
        //choice
//        String s3 = "On {0, date} was {1}, {2, number, percent} buildings was destroyed";
//        String s4 = MessageFormat.format(s3,new GregorianCalendar(2017,1,22).getTime()
//                /*месяц указываем 1 - т.к отсчет начинается с 0*/, "hurricane", 10);
//        System.out.println(s4);

        //самый интересный параметр choice, который позволяет выбирать что будет выведено:
        String s3 = "On {0} was {1}, {2, choice,0#no houses|1#one house|2#{2} houses} was destroyed";
        String s4 = MessageFormat.format(s3,"22.02.2017", "hurricane", 0);
        System.out.println(s4);
    }
}
