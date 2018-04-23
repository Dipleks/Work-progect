package Декабрь_18;/*Как обычную строку поместить в пул*/

public class StringPool {
    public static void main(String[] args) {
//        String one = "one";
//        String two = "one";
//        System.out.println(one.equals(two)); //сравним
//        System.out.println(one == two); //приравняем
        //получим в обоих случаях true

        //теперь сделаем так:
//        String one = "one";
//        String two = new String("one");
//        System.out.println(one.equals(two));
//        System.out.println(one == two);
        //получим: true и false, т.е теперь это два разных объекта!
        //По equals они равны, по сравнению == нет!

        //Теперь положим в пул нашу стрингу:
        String one = "one";
        String two = new String("one").intern();
        System.out.println(one.equals(two));
        System.out.println(one == two);
        /*Тепрь после вызова intern, стринга поместилась в пул, и
        * т.к в пулле уже присутствоало значение one, то наша новая
        * стринга пометилась ссылкой, в результате получим в обоих
        * случаях: true и true*/
    }
}
