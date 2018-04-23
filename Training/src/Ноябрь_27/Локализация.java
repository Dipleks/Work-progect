package Ноябрь_27;

import java.util.Locale;
import java.util.ResourceBundle;
/*Как делать приложения интернациональными, т.е запуская программу в России
* он будет на русском, в Англии на английском и т.д.*/
public class Локализация {
    public static void main(String[] args) throws  Exception{
        /*Делаем локализацию с помощью пропертей:
        * Создаем 4 файла: Ноябрь_27.resources.properties, resources_de.properties,
        * resources_fr.properties, resources_en.properties.
        * В них пишем: somevalue=Это на русском, somevalue=Is English и т.д.
        * Добавляем наши ресурсы:*/
//        ResourceBundle bundleDefault = ResourceBundle.getBundle("Ноябрь_27.resources", new Locale("ru", "RU"));
//        ResourceBundle bundleEn = ResourceBundle.getBundle("Ноябрь_27.resources", new Locale("en", "US"));
//        ResourceBundle bundleDe = ResourceBundle.getBundle("Ноябрь_27.resources", new Locale("de", "GR"));
//        ResourceBundle bundleFr = ResourceBundle.getBundle("Ноябрь_27.resources", new Locale("fr"));
//
//        /*Выводим наши ресуры (для русского языка требуется кодировка):*/
//        System.out.println(new String(bundleDefault.getString("somevalue").getBytes("ISO-8859-1"),"UTF-8"));
//        System.out.println(bundleEn.getString("somevalue"));
//        System.out.println(bundleDe.getString("somevalue"));
//        System.out.println(bundleFr.getString("somevalue"));

        /*Помимо пропертей мы можем использовать данные непосредственно в самих классах.
        * Для этого создим пакет Ноябрь_27.resources и в нем 4 класса: Resource, ResourceEn, ResourceDe, ResourceFr.
        * Вот как они будут выглядеть:
        *
public class Resource extends ListResourceBundle {
    private static final Object[][]contents ={
                    {"samevalue", "Is Russia"},
                    {"backgroundColor", Color.black},
                    {"defaultPaperSize", new double[]{210, 297}}};
    @Override
    public Object[][] getContents() {
        return contents;}}
public class ResourceEn extends ListResourceBundle {
    private static final Object[][]contents ={
                    {"samevalue", "Is English"},
                    {"backgroundColor", Color.black},
                    {"defaultPaperSize", new double[]{210, 297}}};
    @Override
    public Object[][] getContents() {
        return contents;}}
public class ResourceDe extends ListResourceBundle {
    private static final Object[][]contents ={
                    {"samevalue", "Is Germane"},
                    {"backgroundColor", Color.black},
                    {"defaultPaperSize", new double[]{210, 297}}};
    @Override
    public Object[][] getContents() {
        return contents;}}
public class ResourceFr extends ListResourceBundle {
    private static final Object[][]contents =
                    {{"samevalue", "Is France"},
                    {"backgroundColor", Color.black},
                    {"defaultPaperSize", new double[]{210, 297}}};
    @Override
    public Object[][] getContents() {
        return contents;}}*/

        //Выведем из классов:
        ResourceBundle bundleDefault = ResourceBundle.getBundle("Ноябрь_27.resources.Resource", new Locale("ru", "RU"));
        ResourceBundle bundleEn = ResourceBundle.getBundle("Ноябрь_27.resources.ResourceEn", new Locale("en", "US"));
        ResourceBundle bundleDe = ResourceBundle.getBundle("Ноябрь_27.resources.ResourceDe", new Locale("de", "GR"));
        ResourceBundle bundleFr = ResourceBundle.getBundle("Ноябрь_27.resources.ResourceFr", new Locale("fr"));

        /*Выводим наши ресуры (для русского языка требуется кодировка):*/
        System.out.println(bundleDefault.getString("somevalue"));
        System.out.println(bundleEn.getString("somevalue"));
        System.out.println(bundleDe.getString("somevalue"));
        System.out.println(bundleFr.getString("somevalue"));
    }
}
