package Октябрь_24;

class  Parent{
    int metod(){ //модификатор доступа protected не может быть ниже модификатора доступа в классе Cildr.
                         //оператор можно добавить любой strictfp и т.д., кроме final.
                         //Если метод сделать статичным или финальным, static int metod(), то никакой перегрузки
                         //метода не произойдет, полиморфизм работать не будет.
        return 1;
    }
}

class Cildr extends Parent{
    @Override
    int metod(){  //тут модификатор либо равен модификатору из класса Parent, либо выше него.
                         //оператор можно добавить любой strictfp и т.д.
                         //Если метод сделать статичным или финальным, static int metod(), то никакой перегрузки
                         //метода не произойдет, полиморфизм работать не будет.
        return 2;
    }
}
public class PereopredelenieMetoda {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent cildr = new Cildr();
        System.out.println(parent.metod());
        System.out.println(cildr.metod());
    }

}
