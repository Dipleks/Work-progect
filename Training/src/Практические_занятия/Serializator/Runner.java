package Практические_занятия.Serializator;

import java.io.InvalidObjectException;

public class Runner {
    public static void main(String[] args) {

        Student student = new Student("FacultyX", "Ivan Ivanov", 123, "qwerty");
        Student student1 = new Student("FacultyX1", "Ivan Ivanov1", 1234, "qwerty1");
        System.out.println(student + "\n-------------");
        System.out.println(student1 + "\n------------");

        String file = "D:\\demo.data";
        Serializator sr = new Serializator();
        boolean b = sr.serialization(student, file);
        System.out.println(b + "\n--------------");

        Student.faculty = "YYY";
        System.out.println(student + "\n-------------");

        Student rezault = null;
        try {
            rezault = sr.desiarialization(file);
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
        System.out.println(rezault + "\n-------------");

    }
}
