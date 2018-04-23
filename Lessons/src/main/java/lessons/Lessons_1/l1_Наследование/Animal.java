package lessons.Lessons_1.l1_Наследование;

/*Наследование является одним из основных понятий объектно-ориентированного
* программирования. Java поддерживает наследование и определяет
* отношение is-a между суперклассом и подклассом. Например, если подкласс
* Car (Автомобиль) унаследован от суперкласса Vehicle (ТранспортноеСредство),
* то это значит, что Car is-a (это тоже) Vehicle.
*  Наследование в Java — механизм, позволяющий создать новый класс из существующих
* классов. Наследование в Java является переходным, так что если Sedan (Седан)
* расширяет класс Car (Автомобиль), то это значит, что Седан также унаследован от
* класса Vehicle (ТранспортноеСредство). Таким образом Vehicle становится
* суперклассом как для класса Car, так и для класса Sedan.
*  Наследование широко используется в Java-приложениях. Хорошим примером будет
* класс Exception — его наследуют другие классы, чтобы создать более
* специфические классы ошибок.
*  В Java каждый класс неявно, но расширяет java.lang.Object класс,
* так Object-класс находится на верхнем уровне иерархии наследования в Java.*/

//Простой пример реализации наследования в Java:
public class Animal {

    private boolean vegetarian;
    private String eats;
    private int noOfLegs;

    //Создадим пустой конструктор:
    public Animal(){}

    //Создадим конструктор возращающий наши значения:
    public Animal(boolean veg, String food, int legs){
        this.vegetarian = veg;
        this.eats = food;
        this.noOfLegs = legs;
    }

    //Создадим гетторы и сетторы:
    public boolean isVegetarian() {
        return vegetarian;
    }
    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
    public String getEats() {
        return eats;
    }
    public void setEats(String eats) {
        this.eats = eats;
    }
    public int getNoOfLegs() {
        return noOfLegs;
    }
    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
}
/*
* Класс Animal здесь является базовым. Теперь создадим класс Cat,
* который будет унаследован от Animal.
* */
