package Patterns.Patterns_1_15;/*FlyWeight - проверяет есть ли
такойже объект, если есть использовать его, если нет создавать новый.
Т.е. помогает экономать место и не создавать повторяющихся объектов!*/

import java.util.HashMap;
import java.util.Map;

public class Patterns_15 {
    public static void main(String[] args) {
        FlyWiethtGarag flyWiethtGarag = new FlyWiethtGarag();
        Mersedece mersedece = flyWiethtGarag.getMersedece("green");
        Mersedece mersedece2 = flyWiethtGarag.getMersedece("green");
        Mersedece mersedece3 = flyWiethtGarag.getMersedece("red");
        System.out.println(mersedece.color);
        System.out.println(mersedece2.color); //при этом тут вернется значение mersedece, т.к цвет одинаковый!
        System.out.println(mersedece3.color);
    }
}
class Mersedece {
    String color;
}
//создадим объект для хранения мерседесов, но они не могут повторять
// один и тот же цвет:
class FlyWiethtGarag{
    Map<String, Mersedece> map = new HashMap();
    Mersedece getMersedece (String color){
        Mersedece mersedece = map.get(color);
        //проверяем, если нет такого мерседеса мы его создаем:
        if (mersedece == null){
            mersedece = new Mersedece();
            mersedece.color = color;
            map.put(color, mersedece);
        }
        return mersedece;
    }
}
