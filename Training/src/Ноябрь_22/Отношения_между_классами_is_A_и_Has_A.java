package Ноябрь_22;/*Отношения между классами is A и Has A*/

public class Отношения_между_классами_is_A_и_Has_A {
    public static void main(String[] args) {
        MyCar myCar = new MyCar();
        myCar.lister();
    }
}
/*Представим что у нас есть 2 класса  и Car, у
* них по 4 колеса можно ли экстендить классу MyCar
* класс Telega? Да, но это будет не правильно, т.к.
* у них нет связи, мы должны спросить себя а я вляется
* ли машина телегой? Допустим у нас есть еще класс Radio,
* и мы хотим слушать в машине музыку, можем ли мы экстендить
* радио, опять же нет, это будет не правельно, в этом случаем мы должны
* в классе машина создать экзепляр радио и через конструктор вызвать
* наш радио лист!*/
class Telega{
    int kolesa = 4;
}
class Radio {
    void lister (){
        System.out.println("радио лист");
    }
}
class MyCar {
    Radio radio = new Radio();
    void lister(){
        radio.lister();
    }
}