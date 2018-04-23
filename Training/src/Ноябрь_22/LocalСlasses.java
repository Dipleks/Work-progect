package Ноябрь_22;/*Local classes - локальные классы!*/
/*Рассмотрим локальный класс внутри метода.*/
public class LocalСlasses {
    static int i = 5;
    int j = 7;

    void method(int e){
        int r = 8;
    /*Локальный класс имеет теже ограничения что и внутрений,
    * плюс */
        class Local {
            final static int q = 4;
            int w = j;
        }
    }
    /*При этом у нас может быть несколько методов
    * с таким же классаом, этот класс используется только на уровне метода.
    * Мы не можем его переопределить в другом методе, но его можно переопределить
    * на уровне своего методв:*/
    void method2(){
        class Local {
        }
        Local local = new Local(); //переопределили на уровне метода
    }

    public static void main(String[] args) {

    }
}
