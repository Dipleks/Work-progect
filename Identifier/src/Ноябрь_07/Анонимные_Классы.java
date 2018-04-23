package Ноябрь_07;

/*Изучим Анонимные классы!*/
/*Для начала создадим новый класс Popcorn:*/
/*class Popcorn{
    void doSomthing (){
        System.out.println("popcorn");
    }
    void secondMetod(){
        System.out.println("second");
    }
}

public class Анонимные_Классы {
    public static void main(String[] args) throws Exception {
*//*Теперь создаем наш анонимный метод:*//*
       Popcorn popcorn = new Popcorn(){
           void doSomthing (){
               System.out.println("main");
       }
    };
       //Вызываем наш метод:
       popcorn.doSomthing(); //вызовем переопределенный метод, ответ main
       popcorn.secondMetod();//вызовем метод который был, ответ second
}}*/
/*И так что тут произошло, в psvm мы создали новый класс
* (new Popcorn) который обладает всем методами класса Popcorn,
* но он переопределяет какие-то его методы. Этот класс неимеет имени
* ,т.е он анонимный и является полиморфическим! Др. словами,
* когда мы вызываем метод doSomthing, мы полиморфно вызываем
* метод doSomthing из psvm. Этим приемом очень удобно переопределять
* классы!*/

/*Таким же способом мы можем переопределять и интерфесы:*/
/*class Popcorn{
    void doSomthing (){
        System.out.println("popcorn");
    }
    void secondMetod(){
        System.out.println("second");
    }
}
public class Анонимные_Классы {
    public static void main(String[] args) throws Exception {
        Comparable comparable = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0; //переопределим Alt+Insert - Implement
            }
        };
        comparable.compareTo(new Object());
    }}*/
/*Таким образом мы можем реализовывать интерфейсы, это
* очень удобно!*/

    /*Есть еще один вариант со статическим методом:*/
    class Popcorn{
        void doSomthing (){
            System.out.println("popcorn");
        }
        void secondMetod(){
            System.out.println("second");
        }
    }
public class Анонимные_Классы {
    public static void main(String[] args) throws Exception {
     /*Мы бы могли вызвать наш метод static void metod (Popcorn popcorn)
     * таким образом:*/
     method(new Popcorn(){
         void doSomthing (){
             System.out.println("bla");
     }
    });}
    //Допустим у нас есть метод, который принимает наш попкорн
    //или интерфейс, или что-либо еще:
    static void method (Popcorn popcorn){
        popcorn.doSomthing();
    }
}
