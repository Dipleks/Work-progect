package Patterns.Patterns_1_15;/*Prototype - облегчает доступ к данным.
К примеру, скопировали мы из базы данные, через некоторое время
нам могут они понадобиться еще, потом еще и т.д. и что бы постоянно
их не копировать нужен прототип, который помещает данные в кэш и
мы их теперь просто клонируем! Т.е Prototype - это объект, который
может клонировать себя!*/


/*имплементим клонабл и переопределяем его метод клон:*/
public class Patterns_7 {
    public static void main(String[] args) throws CloneNotSupportedException {
//Теперь мы можем использовать наш кэш:
        Cash cash = new Cash();
        cash.setStudent(new Student());

        //и получаем клон студента:
        Student student = cash.getStudent();
    }
}

//Создадим класс студент и класс кэш, который будет хранить нашего студента:
class Student implements Cloneable {
    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student)super.clone();
    }
}
//кэш который хранит наших студентов:
class Cash {
    private Student student;

    //только возвращем клон студента:
    public Student getStudent() throws CloneNotSupportedException {
        return student.clone();
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
