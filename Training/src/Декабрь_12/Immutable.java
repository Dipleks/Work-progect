package Декабрь_12;/*Immutable классы
Immutable - объекты которые нельзя изменять.*/
import java.util.Date;

public class Immutable {
    public static void main(String[] args) {
        Student student = new Student(30, "Denis", new Date());
        System.out.println(student.getAge());
        System.out.println(student.getName());
        System.out.println(student.getDate());
    }
}
/*что бы он был Immutable, надо сделать класс финальным:*/
final class Student {
    //все элементы должны быть приватны:
    private int age;
    private String name;
    private Date date;
    //должен быть конструктор:
    public Student(int age, String name, Date date) {
        this.age = age;
        this.name = name;
        this.date = date;
    }
    //должны быть только гетторы, и все сылочные типы должны быть клонированы:
    public int getAge() {
        return age; }
    public String getName() {
        return name; }
    public Date getDate() {
        return (Date)date.clone(); } //дата является ссылочным типом, значит клонируем ее!
}
