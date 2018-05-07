package lesson01;

public class OverloadingMethod
{
    public static void main(String[] args) {

        OverloadingTwo om = new OverloadingTwo();
        OverloadingMethod overloadingMethod = new OverloadingMethod();

        System.out.println(overMeth(4, 3));
        System.out.println(overloadingMethod.overMeth(4.5, 5.1));
        om.overMeth();
    }

    private static int overMeth(int a, int b){
        return a+b;
    }
    protected final double overMeth(double a, double b){
        return a+b;
    }
}
class OverloadingTwo
{
    void overMeth(){
        System.out.println("Тестируем перегрузку методов!");
    }
}
