package Solid;/*Single Responsibility
В ООП принцип единственной ответственности (англ. The Single
Responsibility Principle, SRP) обозначает, что каждый объект
должен иметь одну ответственность и эта ответственность должна
быть полностью инкапсулирована в класс. Все его поведения должны
быть направлены исключительно на обеспечение этой ответственности.*/

public class Solid_2 {
    public static void main(String[] args) {

    }
}
//Класс должен иметь только одну причину для изменения.
//Создадим класс Сотрудник:
//class Employee{
//    //он может получать зарплату:
//    int getSalary(){ return 10;}
    //умеет готовить, раздавать еду и т.д:
//    void cook() {}
//    void cleanFloor () {}
//    void deliverFood() {}}
    /*так делать не прапвильно, т.к причин для изменения класса становится более
    * чем одна, т.к может измениться время работы официанта, поменяться блюдо и т.д.
    * Поэтому наши методы необходимо раскидать!*/

/*Более правильным будет создать класс сотрудник и от него
* повар, официант и т.д.:*/
interface Employee { int getSalary();}

class Cook implements Employee {
    @Override
    public int getSalary() { return 0; }
    void cook(){}}
class Janitor implements Employee {
    @Override
    public int getSalary() { return 0; }
    void claenFloor() {}}
/*Есть еще 2й способ не самы лучший, но к примеру у нас закусочная наколесах
* и в ней сотрудник сам готовит, отдает еду, и сам убирает. Для этого
* сделаем патерн:*/
class EmployeeFacade {
    Cook cook = new Cook();
    Janitor janitor = new Janitor();
    void cook(){ cook.cook(); }
    void cleanFloor(){ janitor.claenFloor(); }}