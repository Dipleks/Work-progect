package Patterns.Patterns_1_15;/*Filter*/
import java.util.ArrayList;
import java.util.List;

public class Patterns_11 {
    public static void main(String[] args) {
        CarF carF = new CarF(150, "red", 4);
        CarF carF2 = new CarF(200, "blue", 2);
        CarF carF3 = new CarF(250, "green", 4);
 //И у нас есть список машин:
        List<CarF> cars = new ArrayList<>();
        cars.add(carF);
        cars.add(carF2);
        cars.add(carF3);
  //Отфильтруем:
        cars = new SpeedFilter().filter(cars);
        for (CarF c : cars){
            System.out.println(c.getMaxSpeed()); //ответ. 200, 250
   //Так же по аналогии мы можем добавить другие фильтры!
        } }}
//Но допустим нам нужны машины со сокорстью выше 150, для этого используем фильтры.
interface CarFilter { List<CarF> filter(List<CarF> cars);}
//Теперь создаем необходимые фильтры:
class SpeedFilter implements CarFilter{
    @Override
    public List<CarF> filter(List<CarF> cars) {
        List<CarF> list = new ArrayList<>();
        for (CarF car : cars){
            if (car.getMaxSpeed() > 180){
                list.add(car);
            } }return list; }}

//У нас есть машина с параметрами:
class CarF {
    private int maxSpeed;
    private String color;
    private int dors;
    //добавим для параметров конструктор
    public CarF(int maxSpeed, String color, int dors) {
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.dors = dors; }
    public int getMaxSpeed() { return maxSpeed; }
    public void setMaxSpeed(int maxSpeed) { this.maxSpeed = maxSpeed; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public int getDors() { return dors; }
    public void setDors(int dors) { this.dors = dors; }}