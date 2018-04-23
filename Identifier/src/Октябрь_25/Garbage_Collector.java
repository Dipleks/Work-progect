package Октябрь_25;

import java.util.Date;

//Garbage Collector - сборщик мусора! Про него часто спрашивают на собеседовании!
public class Garbage_Collector {
 //   public static void main(String[] args) {
            /*Date data = new Date(); /*в такой форме записи кода идет указание что для date выделилась память, можно
              записать прсто new Date, в этом случае просто выделится память без указания ссылки на объект.*/
  //      metod(); /*как Carbage Collector понимает когда удалять? Он улавливает ссылки, т.е когда метод Date
  //          * доходит до этого момента, мусорщик смотрит что ссылок на этот объект после metod(); больше нет, значит
  //          * можно осободить память!*/
  //      System.gc(); //Garbage Collector можно вызвать самостоятельно данной командой, но он так же будет работать
                     //рандормно. Поэтому вызывать данную команду особого смысла нет.
  //  }
  //  private static void metod (){
  //      Date date = new Date();
  //      System.out.println(date); /*после того как метод выполнится, происоходит пееход к metod(); и данный void metod
  //      нам больше не нужен, сборщик очищает память*/
        /*Если наш метод что-то возращает, то ссылка будет существовать до конца выполнения всех методов, наппример,
        * если будет так private static Date metod (){
        Date date = new Date();
        return date;
        System.out.println(date);
         Можно схитрить и пометить объект как null, тогда Garbage Collector пометит объект на удаление.*/
  //  }
    /*Пример*/
      public static void main(String[] args) {
          metod(); }
       private static void metod (){
          Runtime runtime = Runtime.getRuntime();
           System.out.println("Общая память до создания 10000000 объектов, байт: "+runtime.totalMemory());
           System.out.println("Свободная память до создания 10000000 объектов, байт: "+runtime.freeMemory());
          for (int i=0; i<10_000_000; i++);{
               Date date = new Date();
               date = null; //таким образом помечаем на удаление.
           }
           System.out.println("Общая память после создания 10000000 объектов, байт: "+runtime.totalMemory());
           System.out.println("Свободная память после создания 10000000 объектов, байт: "+runtime.freeMemory());
           System.gc();
           System.out.println("Общая память после Garbage Collector, байт: "+runtime.totalMemory());
           System.out.println("Свободная память после Garbage Collector, байт: "+runtime.freeMemory());

           /*   Ответ!
           * Общая память до создания 10000000 объектов, байт: 16252928
             Свободная память до создания 10000000 объектов, байт: 15156296
             Общая память после создания 10000000 объектов, байт: 16252928
             Свободная память после создания 10000000 объектов, байт: 15156296
             Общая память после Garbage Collector, байт: 16318464
             Свободная память после Garbage Collector, байт: 15859328*/
       }
       @Override
    public void finalize() {
           System.out.println("Метод Finalize"); /*В скрытом режиме Garbage Collector запускает метод finalize,
                                                   т.е. при запуске если надпись "Метод Finalize" появляется значит
                                                   Garbage Collector сработал!*/
       }
}
