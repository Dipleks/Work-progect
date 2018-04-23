package lessons.Lessons_1.l5_Интерфейсы;
//Имплементим Shape:
public class Circle implements Shape {
    //создаем значение:
    private double radius;

    //Создаем конструктор:
    public Circle(double r){
        this.radius = r;
    }
    //Переопределяем методы Shape:
    @Override
    public void draw() {
        System.out.println("Рисуем Круг");
    }
    @Override
    public double getArea(){
        // Вычисляем площадь:
        return Math.PI*this.radius*this.radius;
    }
    //Создадим геттор Circle:
    public double getRadius(){
        return this.radius;
    }
}
/* Класс Circle реализует все методы, определенные в интерфейсе, а также
 * собственный метод getRadius(). Реализация интерфейса может иметь несколько
 * типов конструкторов. Посмотрим другую реализацию интерфейса Shape в классе Rectangle.*/
