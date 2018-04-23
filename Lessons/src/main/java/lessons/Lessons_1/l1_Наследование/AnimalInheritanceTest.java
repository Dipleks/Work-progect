package lessons.Lessons_1.l1_Наследование;

public class AnimalInheritanceTest {
    public static void main(String[] args) {
        Cat cat = new Cat(false, "milk", 4, "black");

        System.out.println("Cat is vegetaring? " + cat.isVegetarian());
        System.out.println("Cat eats " + cat.getEats());
        System.out.println("Cat has " + cat.getNoOfLegs() + " legs.");
        System.out.println("Cat color is " + cat.getColor());
    }
}
/*
* Результат выполнения программы:
* Cat is vegetaring? false
* Cat eats milk
* Cat has 4 legs.
* Cat color is black
*
* Из результатов выполнения программы видно, что класс Cat не имеет метода getEats(),
* но он до сих пор работает, потому что унаследован от класса Animal.
*
* Важные моменты наследования в Java:
    1) Private-члены суперкласса недоступные для подклассов.
        Как и в нашем примере, переменная класс Animal noOfLegs недоступна
        для класса Cat. Однако эта проблема решается созданием методов getter и setter.
    2) Подкласс с уровнем доступа default (по умолчанию) доступен другим подклассам
        только если они находятся в том же пакете!
    3) Конструкторы суперкласса не наследуются подклассами.
    4) Если суперкласс не имеет конструктора по умолчанию, то подкласс
        должен иметь явный конструктор. В противном случае он будет бросать
        compile time exception (исключение времени компиляции).
    5) Java не поддерживает множественное наследование, поэтому подкласс
        может наследовать только один класс!
*/