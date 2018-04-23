package Ноябрь_27;

import javafx.scene.input.DataFormat;

import java.sql.Date;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;
/*В разных странах некоторая информация пишется по разному,
* например дата в России пишется 20.02.2017, а в Америке 02.20.2017.
* Класс Locale_Локация позволяет создать объект, описывающий географический
* или культурный регион, обеспечивая возможность создания многонациональных
* программ с учётом региональных настроек дат, времён, чисел, валюты и т.д.
* Существуют готовые константы для популярных стран, например,
* Locale_Локация.ITALIAN и т.д. Россия константой не представлена.
* В одной стране могут использоваться несколько языков и диалектов,
* поэтому существует несколько конструкторов, учитывающих эти особенности.
    -Locale_Локация(String language) - указывается язык
    -Locale_Локация(String language, String country) - указывается язык и страна
    -Locale_Локация(String language, String country, String variant) - указывается
    язык, страна и вспомогательная информация
*/
public class Locale_Локация {
    public static void main(String[] args) throws Exception{
        Locale locale = new Locale("en"/*язык*/, "US"/*страна*/);
        //или можно вызвать непосредственно с ПК:
        Locale locale1 = Locale.getDefault();
        //существуют стандартные локали:
        //Locale locale2 = Locale.GERMAN;
        Locale locale2 = new Locale("de", "GR");

        //Выведем локаль нашего ПК:
        //System.out.println(Locale.getDefault()); //Ответ: ru_RU

        //Вызовим список всех локалей поддерживаемых системой:
//        Locale[] loc = Locale.getAvailableLocales();
//        for (Locale l : loc){
//            System.out.println(l); }

        //Локаль позволяет формировать валюту:
//        System.out.println(NumberFormat.getCurrencyInstance(locale).format(1000));
//        System.out.println(NumberFormat.getCurrencyInstance(locale1).format(1000));
//        System.out.println(NumberFormat.getCurrencyInstance(locale2).format(1000));

        //Отформатируем дату:

        System.out.println(DateFormat.getDateInstance(DateFormat.FULL, locale).format(new java.util.Date()));
        System.out.println(DateFormat.getDateInstance(DateFormat.FULL, locale1).format(new java.util.Date()));
        System.out.println(DateFormat.getDateInstance(DateFormat.FULL, locale2).format(new java.util.Date()));
    }
}
