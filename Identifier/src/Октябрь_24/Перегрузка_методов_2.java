package Октябрь_24;

public class Перегрузка_методов_2 {
    public static void main(String[] args) {
   Перегрузка_методов_2 перегрузка_методов_2 = new Перегрузка_методов_2();
   short b = 5;
   short c = 8;
   перегрузка_методов_2.metod(b, c); //преобразование произойдет к ближайшему наибольшему целочисленному значению!
    }                             //Выбор будет идти по порядку от примитивов, можно поэксперементировать и убрать
                                  //некоторые методы. Integer заработает только если сделать преобразование b в int:
                                  //перегрузка_методов_2.metod((int)b); так же можем добавить 2ю переменную "с" для
                                  //усложнения задачи!
    void metod (int b, long... c){
        System.out.println("int");
    }
    void metod (long b) {
        System.out.println("long");
    }
    void metod (Integer c){
        System.out.println("Integer");
    }
    void metod (double b, double c){
        System.out.println("double");
    }
    void metod (short... b){ //В данном случае если оставить только Obdgect... и short..., то short... не запустится,
                             //т.к. short... приравнивается по значению к Obdgect..., компилятор теряется!
        System.out.println("short...");
    }
    void metod (Short c){
        System.out.println("Short");
    }
    void metod (Obdgect... b){
        System.out.println("Obdgect...");
    }
    void metod (Obdgect b){
        System.out.println("Obdgect");
    }
    void metod (byte b, byte c){
        System.out.println("byte");
    }
}

