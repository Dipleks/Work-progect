package Ноябрь_28;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

public class Пример_работы_с_аннотациями {
    public static void main(String[] args) throws IllegalAccessException {
        Пример_работы_с_аннотациями pr = new Пример_работы_с_аннотациями();
        Person person = new Person();
        pr.print(person, person.getClass());
    }
    /*у нас есть объект, в котором мы будем печатать
    информацию, только ту которая помечена аннотацией Show:*/
    void print(Object o, Class c) throws IllegalAccessException {
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields){
            Annotation[] annotation = field.getDeclaredAnnotations();
            for (Annotation a : annotation){
                if (a.annotationType().equals(Show.class)){
                    System.out.println(field.get(o));
                }
            }
        }
    }
}
//Создадим аннотацию:
@Retention(RetentionPolicy.RUNTIME) //добавим чтоб наш Show был виден при запуске! Без него код просто отработает!
@interface Show{
    boolean value()default true;
}

class Person {
    @Show
    String name = "Denis";
    int age = 18;
}