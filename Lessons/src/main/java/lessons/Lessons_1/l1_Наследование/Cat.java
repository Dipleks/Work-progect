package lessons.Lessons_1.l1_Наследование;

public class Cat extends Animal{

    //Создадим новую переменную, цвет кота:
    private String color;

    //Alt+Insert, создаем конструктор Cat со значениями Animal + возращаем новую переменную:
    public Cat(boolean veg, String food, int legs) {
        super(veg, food, legs);
        this.color="White";
    }
    //Создаем еще один конструктор с параметрами Animal и Cat:
    public Cat(boolean veg, String food, int legs, String color){
        super(veg, food, legs);
        this.color=color;
    }
    //Создаем гетторы и сетторы:
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
/*
* Ключевое слово extends используется в Java для реализации наследования.
* Теперь давайте напишем простой тестовый класс (AnimalInheritanceTest),
* чтобы проверить некоторые методы класса Cat.
 */
