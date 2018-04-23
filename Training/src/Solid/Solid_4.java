package Solid;/*Liskov principle
Пусть q ( x ) является свойством, верным относительно объектов x некоторого типа T.
Тогда q ( y ) также должно быть верным для объектов y типа S, где S является
подтипом типа T.
Таким образом, идея Лисков о «подтипе» даёт определение понятия замещения —
если S является подтипом T, тогда объекты типа T в программе могут быть
замещены объектами типа S без каких-либо изменений желательных свойств
этой программы (например, корректность).*/

//public class Solid_4 {
//    static Regt getRegt(){return new Squa();}
//    public static void main(String[] args) {
//        Regt regt = getRegt();
//        regt.setWith(10);
//        regt.setHiegth(5);
//        System.out.println(regt.getSquare());}}

////добавим прямоугольник:
//class Regt {
//    int with;
//    int hiegth;
//    public int getWith() { return with; }
//    public void setWith(int with) { this.with = with; }
//    public int getHiegth() { return hiegth; }
//    public void setHiegth(int hiegth) { this.hiegth = hiegth; }
//    public int getSquare(){ return with * hiegth; }}

////завтра нам нужно будет добавить квадрат:
//class Squa extends Regt{
//    //т.к это квадрат у него стороны равны, значит нужно изменить только сеторы:
//    public void setWith(int with) {
//        this.with = with;
//        hiegth = with; }
//    public void setHiegth(int hiegth) {
//        this.hiegth = hiegth;
//        with = hiegth; }}
//и теперь получим ответ 25. С начало код просмотрел 10, потом просмотрел 5,
//прировнял высоту и ширину и перемножил две последнии 5!
//Что является не верным подходом к коду!
/*Для исправления кода добавим интерфейс:*/
public class Solid_4 {
    static Regt getRegt(){ return new Regt(); }
    public static void main(String[] args) {
        Regt regt = getRegt();
        regt.setWith(10);
        regt.setHiegth(5);
        System.out.println(regt.getSquare()); }}

interface Shape {int getSquare();}

class Regt implements Shape{
    int with;
    int hiegth;
    public int getWith() { return with; }
    public void setWith(int with) { this.with = with; }
    public int getHiegth() { return hiegth; }
    public void setHiegth(int hiegth) { this.hiegth = hiegth; }
    @Override
    public int getSquare(){ return with * hiegth; }}

class Squa implements Shape{
    int with;
    public int getWith() { return with; }
    public void setWith(int with) { this.with = with; }
    @Override
    public int getSquare() { return with * with; }}