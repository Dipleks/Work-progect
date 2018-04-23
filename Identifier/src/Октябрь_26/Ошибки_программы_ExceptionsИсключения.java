package Октябрь_26;

import java.io.File;
import java.io.IOException;

public class Ошибки_программы_ExceptionsИсключения {
    public static void main(String[] args) {
        new Ошибки_программы_ExceptionsИсключения().someMethod();
        //System.out.println("Метод!");
    }
    /*void someMethod(){
        try {
            //Ошибки бываю различные, самые частые Object, расмотрим пример:
            Object o = null;
            o.hashCode(); /*В данном случае мы пытаемся вызвать несуществующий объект.
            Когда мы так делаем, то у нас сразу программа "падает". Чтобы не
            происходило "падения" программы, был придуман блок try, в него мы
            можем поместить код, который вызовет Exception.
            Если мы, например, сейчас удалим try, то в консоле получим:
            Exception in thread "main" java.lang.NullPointerException
	at Октябрь_26.Ошибки_программы_ExceptionsИсключения.someMethod(Ошибки_программы_ExceptionsИсключения.java:11)
	at Октябрь_26.Ошибки_программы_ExceptionsИсключения.main(Ошибки_программы_ExceptionsИсключения.java:5)
	        Тут кампелятор нам говорит об ошибке в 11 строке кода. А т.к. у нас
	        есть метод try, то при выполнении программы в консоле ничего не произойдет,
	        т.к. try нашел ошибку (Exception).*/
           // throw new Exception(); /*В программе могут иногда возникать различные ошибки (Exception)*/
        //} catch (Exception a) {}}
    /*void someMethod(){
        try {
            Object o = null;
            o.hashCode();}
        catch (NullPointerException a) { //Блок catch отлавливает различные Exception
                                         //(например: RuntimeException).
            a.printStackTrace(); /*У catch есть различные методы, например
                                 * printStackTrace, им мы можем посмотреть список вызова методов.
                                 * Выведем на консоль и получим:
                                 * java.lang.NullPointerException
	at Октябрь_26.Ошибки_программы_ExceptionsИсключения.someMethod(Ошибки_программы_ExceptionsИсключения.java:28)
	at Октябрь_26.Ошибки_программы_ExceptionsИсключения.main(Ошибки_программы_ExceptionsИсключения.java:5)
	                             * Тут говорится, что у нас при запуске был NullPointerException,
	                             * он был вызван в 28 строке, при вызове метода main 5й строки.*/
        // }
      //  finally {      //Ещё у нас может быть блок finally, он выполняется всегда!
       //     System.out.println("finally");}


      /*void someMethod(){
          try {
              System.out.println("try");
              Object o = null;
              o.hashCode();}
          catch (NullPointerException a) {
              System.out.println("catch");
          }
          finally {
              System.out.println("finally");
          }
          /*Запустив метод выше у нас выполнятся все команды try, catch, finally.
          * Но если мы убрем  o.hashCode, то после вызова try catch выполнен не будет,
          * а сразу выполнится finally. Ответ: try, finally.
          * Блок finally не обязателен, он нужен для запуска программ
          * после "падения", например, мы вызвали программу неожиданно происходит
          * ошика в try, программа на этом остановится и не позволит выполнятся другим
          * программам, finally же предотвратит это и после try, позволит выполняться
          * другим программам!
          * finally может быть только один!!! Тогда как try и catch может быть несколько!*/

      /*Блок finally у нас выполняется всегда, но его можно остновить exit-ом:*/
      /*void someMethod(){
          try {
              System.out.println("try"); //выполнится
              Object o = null;
              o.hashCode();}
          finally {
              System.out.println("finally"); //выполнится, т.к. положение до exit.
              System.exit(0);         //заврешит метод.
              System.out.println("Yes!");    //не выполнится.
              //System.out.println("Метод!") не выплонится, т.к. System.exit закроет метод.
              /*Так же можно обойтись без System.exit, а создать
              * бесконечный цикл while (true) {}, в этом случае System.out.println("Метод!")
              * тоже не выполнится, т.к. программа будет в бесконечном цикле!
              * Так же можно вместо System.exit вызвать throw new Error();, в этом
              * случае System.out.println("Метод!") тоже не сработает.
              * Все эти условия можно применить и для try и для catch.*/
          //}


      /*void someMethod(){
          try {
              System.out.println("try");
              throw new IOException();
              //Object o = null;
              //o.hashCode();
              }
              catch (ArrayIndexOutOfBoundsException e) {}
              catch (RuntimeException e) {}
              catch (IOException e) {}}
      /*Блоков catch может быть множество, в этих блоках может быть один блок finally и другие блоки
      * (блок внутри блока).
      * Блок catch не может повторяться! Он должеть следовать иерархии,
      * т.е. мы сначало выполняем более конкретные значения, а потом более общие.
      * Например, ArrayIndexOutOfBoundsException не может стоять после RuntimeException,
      * т.к. он является наследником RuntimeException, а значит более меньший по значению.
      * (наследование => class ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException =>
      * => class IndexOutOfBoundsException extends RuntimeException).
      * Приведем пример подблоков в catch:*/

    /*void someMethod(){
        try {
            System.out.println("try");
            throw new IOException();
            //Object o = null;
            //o.hashCode();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            try {
                throw new RuntimeException(); //создаем try
            } catch (ArrayIndexOutOfBoundsException er){}   //и даже можем создать catch или finally или и то и то.
        }
        catch (RuntimeException e) {}
        catch (IOException e) {}}
        /*Exception происходят от Throwable, среди кодов-ошибок он является самым главным.
        * Exception бывают двух видов: checked и unchecked.*/
    /*void someMethod(){
        throw new RuntimeException();} /*это unchecked Exception, он выбрасывает ошибку и не
                                      * и не проверяет компилятор!*/

    /*checked Exception нельзя записать подобным образом, программа его сразу подчеркнет красным.
    * Данные checked необходимо помещать в try, напрммер:*/
    /*void someMethod(){
        try {
            throw new IOException();
        } catch (IOException a){} } /*тут мы IOException помещаем в try, т.к. он является checked.
        * Так же если мы нехотим помещать Exception в try, то
        * можно записать Exception так:*/
    /*void someMethod() throws IOException{
            throw new IOException();} /*Но при такой записи, в "шапке" нам необходимо
            * добавить блок try и полность метод будет выглядить так:
            * public static void main(String[] args) {
                  try {
        new Ошибки_программы_ExceptionsИсключения().someMethod();
        } catch (Exception e){}}
             void someMethod() throws IOException{
            throw new IOException();}*/

    /*иногда JAVA нам сама подсказывает что програмный код необходимо поместить в try catch,
    * например при работе с файлами:*/
    /*void someMethod(){
        File file = new File("");
        file.createNewFile(); /*тут JAVA сделает нам подчеркивание, как бы
        * говорит что данный код необходимо проверить IOException, в
        * этом случаем мы должны записать код так:*/
    /*void someMethod() throws IOException{
        File file = new File("");
        file.createNewFile();
    /*checked - проверяются компелятром*/
    //throw new Throwable();
    //throw new Exception();
    //throw new IOException();
    /*unchecked - не проверяются компелятром*/
    //throw new Error();
    //throw new RuntimeException();
    void someMethod(){}
}
/*Основные типы исключений в JAVA
* 1) ArithmeticException
*    Возникла исключительная ситуация, связанная с ошибкой при выполнении арифметического вычисления
*    (например, с попыткой целочисленного деления на нуль). Класс ArithmeticalException унаследован
*    от RuntimeException.
* 2) ArrayIndexOutOfBoundsException
*    Задано значение индекса массива, не принадлежащее допустимому диапазону.
*    Имеется дополнительный конструктор, принимающий в качестве параметра ошибочное значение
*    индекса и включающий его в текст описательного сообщения.
*    Класс ArrayIndexOutOfBoundsException унаследован от IndexOutOfBoundException
* 3) ArrayStoreException
*    Предпринята попытка сохранения в массиве объекта недопустимого типа.
*    Возникает, если попытаться записать в ячейку массива ссылку на
*    объект неправильного типа.
*    Класс ArrayStoreException унаследован от RuntimeException.
* 4) ClassCastException
*    Выполнена неверная операция преобразования типов (ошибка приведения типов).
*    Класс ClassCastException унаследован от RuntimeException.
* 5) ConcurrentModificationException
*    Осуществлена попытка изменения объекта конкурирующим потоком вычислений (thread)
*    с нарушением контракта класса (тип определен в пакете jav.util).
*    Также исключение может происходить при работе с коллекциями при обычной однопоточной работе.
*    ConcurrentModificationException возникает когда коллекция модифицируется «одновременно» с проходом по
*    коллекции итератором любыми средствами кроме самого итератора.
*    Класс ConcurrentModificationException унаследован от RuntimeException.
* 6) EmptyStackException
*    Возникает при попытке извлечения объекта из пустого стека.
*    Тип обладает только конструктором без параметров, поскольку причина ситуации очевидна
*    без дополнительных разъяснений (тип определен в пакете java.util).
*    Класс EmptyStackException унаследован от RuntimeException.
* 7) IllegalArgumentException
*    Методу передано неверное значение аргумента (например, отрицательное,
*    когда метод предполагает задание положительных значений).
*    Класс IllegalArgumentException унаследован от RuntimeException.
* 8) IllegalMonitorStateException
*    Выполнено обращение к методу wait, notifyAll или notify объекта,
*    когда текущий поток вычислений не обладает блокировкой (lock) этого объекта.
*    Класс IllegalMonitorStateException унаследован от RuntimeException.
* 9) IllegalStateException
*    Предпринята попытка выполнения операции в то время, когда объект
*    не находится в соответствующем состоянии (например при регистрации
*    или удалении ловушки события закрытия исполняющей системы (shutdown hook)
*    после начала процедуры закрытия).
*    Класс IllegalStateException унаследован от RuntimeException.
*10) IllegalThreadStateException
*    Предпринята попытка выполнения операции в то время, когда объект
*    потока вычислений не находится в соответствующем состоянии (например,
*    вызван метод start для потока, который уже приступил к работе).
*    Класс IllegalThreadStateException унаследован от IllegalArgumentException
*11) IndexOutOfBoundsException
*    Задано значение индекса массива или содержимого строки типа String,
*    не принадлежащее допустимому диапазону.
*    Класс IndexOutOfBoundsException унаследован от RuntimeException
*12) MissingResourceException
*    Не найден требуемый ресурс или пакет ресурсов (resource bundle).
*    Единственный конструктор типа предусматривает задание трех аргументов:
*    строки описательного сообщения, наименования класса ресурсов и объекта ключа,
*    отвечающего отсутствующему ресурсу. Для получения строк наименования класса и ключа
*    применяются методы detClassName и getKey соответственно (тип определен в пакете java.util).
*    Класс MissingResourceException унаследован от RuntimeException.
*13) NegativeArraySizeException
*    Предпринята попытка создания массива с размером, значение которого задано отрицательным числом.
*    Класс NegativeArraySizeException унаследован от RuntimeException.
*14) NoSuchElementException
*    Операция поиска элемента в объекте одного из контейнерных классов
*    завершилась неудачей (тип определен в пакете java.util).
*    Класс NoSuchElementException унаследован от RuntimeException.
*15) NullPointerException
*    Возникает при попытке обращения к полю, методу или объекту по ссылке,
*    равной null. Также исключение выбрасывается, когда метод, не допускающий
*    передачи аргумента null, был вызван с заданием значения null. В последнем
*    случае может быть сгенерировано и исключение типа IllegalArgumentException.
*    Класс NullPointerException унаследован от RuntimeException.
*16) NumberFormatException
*    Строка, которая, как предполагалось должна содержать представление числа,
*    не отвечает этому требованию. Исключение выбрасывается такими методами,
*    как, например, Integer.parseInt.
*    Класс NumberFormatException унаследован от IllegalArgumentException.
*17) SecurityException
*    Предпринята попытка выполнения операции, запрещенной системой
*    обеспечения безопасности в соответствии с действующей политикой безопасности.
*    Класс SecurityException унаследован от RuntimeException.
*18) StringIndexOutOfBoundsException
*    Задано значение индекса содержимого строки типа String, не
*    принадлежащее допустимому диапазону. Имеется дополнительный конструктор,
*    принимающий в качестве параметра ошибочное значение индекса и включающий
*    его в текст описательного сообщения.
*    Класс StringIndexOutOfBoundsException унаследован от IndexOutOfBoundsException.
*19) UndeclaredThrowableException
*    Выбрасывается при обращении к методу целевого объекта посредством
*    объекта рефлективного класса Proxy, если метод invoke объекта InvocationHandler
*    генерирует объявляемое исключение, которое не допускает присваивания ни одному
*    из типов исключений, упомянутых в предложении throws метода целевого объекта.
*    Рассматриваемое исключение содержит ссылку на исключение, генерируемое методом
*    invoke, которое может быть получено с помощью метода getUndeclaredThrowable.
*    Класс исключений UndeclaredThrowableException поддерживает два конструктора:
*    оба принимают в качестве параметров ссылку на объект Throwable, а один из них,
*    помимо того, строку описания (тип определен в пакете java.lang.reflect).
*    Класс UndeclaredThrowableException унаследован от RuntimeException.
*20) UnsupportedOperationException
*    Предпринята попытка выполнения операции над объектом,
*    который ее не поддерживает (например, модификация объекта, обозначенного
*    признаком «только для чтения»). используется также классами коллекций из состава
*    пакета java.util как реакция на вызов методов производного класса, реализация
*    которых не обязательна.
*    Класс UnsupportedOperationException унаследован от RuntimeException.*/


