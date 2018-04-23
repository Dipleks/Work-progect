package Ноябрь_20;/*Properties - свойства.*/
/*В наше время почти в каждом проекте используются
различные статические файлы и данные, необходимые классам
для безопасного и быстрого доступа. Примером таких
конфигурационных файлов являются так называемые Файлы
свойств, более известные как *.properties.
    .properties  — файловое расширение для файлов,
которые используются в основном в технологиях Java для
хранения конфигурационных параметров программы. Они также
могут использоваться для хранения переменных строчной типа
для локализации; они известны как Property Resource Bundles.
Каждый параметр сохраняется парой двух переменных строчной
типа, одна сохраняет имя параметра (так называемый ключ),
а другой сохраняет значение. Каждая строка файла .properties,
как правило, хранит значения одного параметра. Несколько
форматов являются допустимыми для .properties, в том числе
ключ = значение, ключ: значение и сам ключ.
.properties файлы могут использовать знак решетки (#) или
восклицательный знак (!) как первый, не пустой символ в строке
для обозначения последующего текста в качестве комментария.*/
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
public class PropertiesClass {
    public static void main(String[] args) throws Exception{
        //Создадим фаил с ключем:
        Properties properties = new Properties();
        properties.setProperty("One", "1"); //One - ключ, 1 - значение ключа.
        //Примечание! Если написать русскими буквами, то в
        //файле my.properties будет написано все в юникоде!
        //System.out.println(properties.getProperty("One"));
        //Создадим фаил с ключами:
        FileOutputStream out = new FileOutputStream("my.properties");
        properties.store(out, "my commets"); //мои коментарии

        //Достним значения из файла:
        FileInputStream in = new FileInputStream("my.properties");
        properties.load(in); //считываем фаил
        System.out.println(properties.getProperty("One")); //получаем ключ.

        //Если пытаемся достать значение которого нет в файле:
        System.out.println(properties.getProperty("bla")); //получим значение null
        //или можно записать так:
        System.out.println(properties.getProperty("bla", "no object")); //получим значение "no object"
        }}