package Октябрь_23;

public class Enum_ {
    //Разберем класс enum.
    enum Coffe {SMALL(25), MEDIUM(35), BIG(45){
        String getCoffeclass(){
            return "B"; }

    };
    String coffeclass = "A";
    int millilitrs;
    Coffe(int millilitrs) {
        this.millilitrs=millilitrs; }
    int getMillilitrs (){
        return millilitrs;
    }
    String getCoffeclass(){
        return coffeclass;
    }}
    public static void main(String[] args) {
        Coffe capuchino = Coffe.SMALL;
        Coffe capuchino3 = Coffe.BIG;
        System.out.println(capuchino);
        System.out.println(capuchino.getMillilitrs());
        System.out.println(capuchino.getCoffeclass());
        System.out.println(capuchino3.getCoffeclass());
    }
}
