package lessons.Lessons_1.l4_Абстрактные_классы;
/*Подкласс Employee наследует свойства и методы суперкласса
* Person используя наследование в Java.
* */
public class Employee extends Person {
    //Создадим переменную:
    private int empId;
    //Создадим конструктор, принимающий значения Person + Employee:
    public Employee(String nm, String gen, int id) {
        super(nm, gen);
        this.empId=id;
    }
    //Переопредилим метод:
    @Override
    public void work() {
        if(empId == 0){
            System.out.println("Безработный");
        }else{
            System.out.println("Работник по найму");
        }
    }
    //Реализуем метод:
    public static void main(String args[]){

        Person student = new Employee("Andrew","Male", 0);
        Person employee = new Employee("Alesya","Female", 1);

        //вызываем переопределенные методы
        student.work();
        employee.work();
    }
}
/*Как правильно создать абстрактный класс. Важные моменты и советы.
    1) Abstract  — ключевое слово при объявлении класса.
    2) Нельзя создать экземпляр абстрактного класса.
    3) Используйте ключевое слово abstract, чтобы создать абстрактный метод.
        Такой метод не имеет реализации.
    4) Если в классе есть абстрактные методы, то класс также должен быть объявлен
        абстрактным с помощью ключевого слова abstract, иначе программа не будет
        компилироваться.
    5) Если в абстрактном классе нет ни одного метода с хоть какой-то реализацией,
        то лучше использовать интерфейс, потому что Java не поддерживает
        наследование нескольких классов.
    6) Подкласс абстрактного класса должен реализовать все абстрактные методы,
        если подкласс сам не является абстрактным классом.
    7) Все методы в интерфейсе неявно абстрактные, если методы интерфейса не статичны
        или по умолчанию. Статические методы и методы по умолчанию в интерфейсах
        добавлены в Java 8.
    8) Абстрактные классы могут реализовывать интерфейсы, даже не обеспечивая
        реализацию методов интерфейса.
    9) Абстрактные классы используются для обеспечения базы подклассов.
    10) Мы можем работать с абстрактным классом, как и с любым другим
        классом, если он имеет main() метод.
*/
