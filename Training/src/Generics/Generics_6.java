package Generics;/*Обобщеный и не обобщенный код*/

public class Generics_6 {
    public static void main(String[] args) {
        Cili<? super Taouta> cili = new Cili<Car>(); //? означает любой параметр,
                                    // но для работы нужно указать суппер класс.
 /*С левой стороны указываются все выше стоящие классы Taouta, Car, Object.
 * Но при этом сетать мы можем только нижестоящие классы:*/
        cili.setT(new Taouta());
        cili.setT(new Corola());

 /*Так же мы можем за экстендить класс:
 *      тут зависимость обратная мы можем добавить классы неже стоящие
 *      и теперь появилась возможность применять гетторы:*/
        Cili<? extends Taouta> cili1 = new Cili<Corola>();
        Taouta t = cili1.getT();
    }
}
class Car{}
class Taouta extends Car{}
class Corola extends Taouta{}

class Cili<T>{
    T t;
    public T getT() { return t; }
    public void setT(T t) { this.t = t; }
}