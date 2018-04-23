package Практические_занятия.Serializator;

import java.io.Serializable;

public class Student implements Serializable {
    protected static String faculty;
    private String name;
    private int id;
    private transient String password;
    private static final long seriaLVersionUID = 1L;

    public Student (String nameOfFaculty, String name, int id, String password) {
        faculty = nameOfFaculty;
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id +
                ", name='" + name + '\'' +
                ", \npassword=" + password + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}
