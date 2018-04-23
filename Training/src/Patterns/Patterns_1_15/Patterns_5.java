package Patterns.Patterns_1_15;/*Singelton он всегда один,
мы не можем создавать несколько объектов класса.*/

public class Patterns_5 {
    public static void main(String[] args) {
//Теперь мы можем работать с нашим классом:
        Singlton singlton = Singlton.getSinglton();
/*Продемонстрируем что у нас только один объект,
* присвоем singlton.i = 5, и вызовем i в singlton2,
* и всеравно получим 5, т.к значение присвоется только 1 раз.*/
        Singlton singlton2 = Singlton.getSinglton();
        singlton.i = 5;
        System.out.println(singlton2.i);
    }
}
/*Создадим наш синглтон:*/
class Singlton {
//создадим приватный конструктро, чтобы его нельзя было создать:
    private Singlton(){}
//Теперь чтобы получить экземпляр этого класса,
//мы создадим его екземпляр в этом классе:
    static Singlton singlton = new Singlton();
    //теперь вернем его:
    public static Singlton getSinglton() {
        return singlton;
    }
    //для демонстрации добавим:
    int i = 0;
}
