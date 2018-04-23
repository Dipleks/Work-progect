package Patterns.Patterns_16_30;/*Strategy*/

public class Patterns_26 {
/*Паттерн часто используется. Разберем данный поттерн на приере:
* У нас есть магазин, и цена на продукт (price) и выводим ее. Допустим у нас есть
* дни со скидками, и нам нужно ее установить на большое кол-во товара,
* цена у нас может браться с БД или еще от куда-либо, и менять например БД
* не логично! И вот тут нам поможет наш паттерн Стратегия, его работа будет
* заключаться в том что цену мы будем брать из программы (стратегии) а не из БД.*/
    public static void main(String[] args) {
        double startPrice = 100;
 //Тепрь если у нас день скидок мы просто прописываем new HalfPrice(), если нет new FullPrice()
        ContextS contextS = new ContextS(new HalfPrice());
        double price = contextS.getPrice(startPrice);
        System.out.println(price);
    }
}
interface Strategy {
    double getPrice (double price);
}
//полная цена
class FullPrice implements Strategy {
    @Override
    public double getPrice(double price) {
        return price;
    }
}
//цена со скидкой
class HalfPrice implements Strategy{
    @Override
    public double getPrice(double price) {
        return price * 0.5;
    }
}
//стратегия должна инкапсулироваться в отдельный объект
class ContextS{
    Strategy strategy;
    public ContextS(Strategy strategy) {
        this.strategy = strategy; }
    public double getPrice (double price){
        return strategy.getPrice(price); }}
