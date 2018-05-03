package lesson01;

public class EnumLess
{
    enum CoffeeSize {SMALL(100), MEDIUM(200), BIG(300){
        String getClassCoffee(){
            return "B";
        }
    };
        int i;
        String classCoffee = "A";
        CoffeeSize(int i){
            this.i = i;
        }
        String getClassCoffee(){
            return classCoffee;
        }
    }

    public static void main(String[] args) {
        CoffeeSize coffeeSize = CoffeeSize.BIG;
        System.out.println("Название переменной Enum: " + coffeeSize);
        System.out.println("Значение вызываемой переменной: " + coffeeSize.i);
        System.out.println("Метод вызываемой для переменной (для BIG, метод переопределен): " + coffeeSize.getClassCoffee());
    }
}
