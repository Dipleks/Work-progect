package lessons.Lessons_1.l5_Интерфейсы;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double w, double h){
        this.width=w;
        this.height=h;
    }
    @Override
    public void draw() {
        System.out.println("Рисуем прямоугольник");
    }

    @Override
    public double getArea() {
        return this.height*this.width;
    }
}
/* Теперь напишем программу для тестирования реализаций нашего интерфейса
 * в классе ShapeTest.*/
