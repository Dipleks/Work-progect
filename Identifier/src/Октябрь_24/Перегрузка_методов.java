package Октябрь_24;

public class Перегрузка_методов {
   int addOvertloid (int a, int b) {
        return a+b;
    }
    double addOvertloid (double a, double b){
        return a+b;
    }
    public static void main(String[] args){
        Перегрузка_методов перегрузка_методов = new Перегрузка_методов();
        System.out.println(перегрузка_методов.addOvertloid(5, 8));
        System.out.println(перегрузка_методов.addOvertloid(5.689, 5.69566));
        Obdgect.addOvertloid();
    }
}
class Obdgect extends Перегрузка_методов {
    static void addOvertloid() {
        System.out.println("Yes!");
    }
}
