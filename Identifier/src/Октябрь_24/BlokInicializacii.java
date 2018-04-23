package Октябрь_24;
class Parents{
    Parents(){
        System.out.println("Construktor Parens!");
    }
}
public class BlokInicializacii extends Parents { //Блок инициализации!
    BlokInicializacii() {    /*Если создать, например, конструктор, то сначало запустится статический блок,
                               затем обычный, и в конце блок конструктора. Если мы создадим конструктор вне данного
                               класса, например Parens в классе Parens, то произойдет следующий порядок обращения:
                               статический блок, блок конструктора Parens (его вызовед, скрытый метод super в
                               конструкторе BlokInicializacii), обычный блок, и блок первого конструктора.*/

        /*super () {System.out.println("Construktor Parens!");} - это невидимый блок обращения SUPER!!!*/
        System.out.println("Construktor");
    }
    static {
        System.out.println("Hello!"); //статический блок запустится при первом обращении.
    }
    {
        System.out.println("Yes!");  //обычный блок запустится через обращение public static void main
    }

    public static void main(String[] args) {
        new BlokInicializacii();    //для запуска блока Yes!
    }
}
