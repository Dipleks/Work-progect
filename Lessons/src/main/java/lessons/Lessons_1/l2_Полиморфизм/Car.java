package lessons.Lessons_1.l2_Полиморфизм;
/*
*   Полиморфизм в программировании — это способность предоставлять
* один и тот же интерфейс для различных базовых форм (типов данных).
* Это означает, что классы, имеющие различную функциональность,
* совместно используют один и тот же интерфейс и могут быть динамически
* вызваны передачей параметров по ссылке.
*   Красота полиморфизма заключается в том, что код, работая с различными
* классами, не должен знать, какой класс он использует, так как все они
* работают по одному принципу. Процесс, применяемый объектно-ориентированными
* языками программирования для реализации динамического полиморфизма,
* называется динамическим связыванием.
*
* Примечание: Полиморфизм — это способность выбирать более конкретные методы
* для ис4полнения в зависимости от объекта. Полиморфизм осуществляется тогда,
* когда не задействованы абстракные классы.
* */
//Создадим клас Car у который возращает скорость и кол-во сидений:
public class Car {
    //скорость машины:
    public void driving() {
        System.out.println("driving");
    }
    //кол-во сидений:
    private int numOfSeets = 4;

    //создадим геттор, который вернет нам кол-во сидений:
    public int getNumOfSeets() {
        return numOfSeets;
    }
}
//Создадим метод Main, который будет реализовать класс Car.
