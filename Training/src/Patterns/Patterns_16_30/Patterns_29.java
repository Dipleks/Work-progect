package Patterns.Patterns_16_30;/*MVC - очень распространен
и часто используется.*/

public class Patterns_29 {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.execute(); //запустим контроллер
    }
}
//этот контроллер контролирует весь код программы (он берет данные из модели и помещает их во вьюху):
class Controller{
    //Тепрь помещаем все в контроллер:
    ModelLyaer modelLyaer = new DBLyaer(); //сама модель может менятся,
                     //все что нужно нам будет сделать это заменить "new DBLyaer()" на новую модель!
    View view = new ConsolView();

    void execute(){
        Student student = modelLyaer.getStudent();
        view.showStudent(student); }}
//Моделью может быть все что угодно (БД, файловая система, сеть и т.д) он будет получать данные
interface ModelLyaer{
    Student getStudent();
}
//Наш студент как бы отображает данные (на его месте может быть фаил со списком например):
class Student{
    String name = "Dennis";
    int age = 30;
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
//Создадим класс который будет доставать данные:
class DBLyaer implements ModelLyaer {
    @Override
    public Student getStudent() { return new Student(); }
}
//Тепрь создвдим вьюху (то кудв будем выводить данные):
interface View{ void showStudent(Student student);}
class ConsolView implements View{
    @Override
    public void showStudent(Student student) {
        System.out.println("student name: "+ student.getName() + "; age: " + student.getAge()); }
}