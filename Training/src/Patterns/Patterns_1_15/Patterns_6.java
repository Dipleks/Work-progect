package Patterns.Patterns_1_15;/*Builder*/

public class Patterns_6 {
    public static void main(String[] args) {
        /*Теперь передаем наш класс и помещаем в него все наши параметры:*/
        SportCar sportCar = new SportCar.Builder("Audi").setCollor("red").setMaxSpeed(200).build();
        System.out.println(sportCar.getName());
        System.out.println(sportCar.getCollor());
        System.out.println(sportCar.getMaxSpeed()); }}
/*У нас есть класс спорт кар и у него есть куча
параметров, на которые нам надо создать конструкторы
и их может быть за 100 и это очень неудобно, так же помимо этого
у нас могут быть гэторы и сеторы, что делает код еще длинее. Для
решения этой проблемы существует билдер который может сократить наш
код до нескольких строк:*/
class SportCar{
    private String name;
    private String collor;
    private int maxSpeed;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCollor() { return collor; }
    public void setCollor(String collor) { this.collor = collor; }
    public int getMaxSpeed() { return maxSpeed; }
    public void setMaxSpeed(int maxSpeed) { this.maxSpeed = maxSpeed; }
    /*Для начала нам необходим приватный конструктор:*/
    private SportCar (Builder builder){
        this.name = builder.name;
        this.collor = builder.collor;
        this.maxSpeed = builder.maxSpeed; }
/*И нам нужен статический внутренний класс, назовем его билдер:*/
    static class Builder {
/*В нем будут повторятся все наши поля и он будет передаваться в конструктор!*/
    private String name;
    private String collor;
    private int maxSpeed;
/*Теперь создадим конструктор только для тех полей который обязательны,
* в нашем случае это name и создадим сеторы для остальных (тех которые можно и не задавать):*/
    public Builder(String name) { this.name = name; }

    public Builder setCollor(String collor) {
        this.collor = collor;
        return this; }
    public Builder setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this; }
/*Далее создаем метод в котором создаем наш спорт кар:*/
    public SportCar build(){
        return new SportCar(this); }}}