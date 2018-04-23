package Ноябрь_07;

import java.lang.reflect.*;

import java.lang.*;


/*Рефлексия в Java — это механизм, с помощью которого
можно вносить изменения и получать информацию о классах,
интерфейсах, полях и методах во время выполнения, при
этом не зная имен этих классов, методов и полей. Кроме
того, Reflection API дает возможность создавать новые
экземпляры классов, вызывать методы, а также получать
или устанавливать значения полей. Расмотрим рефлексию
на примере:
Создадим класс в которм есть конструкторы, значения и
какие-нибудь методы и с помощью рефлексии получим информацию!*/
//Класс из которого мы будем получать информацию:
class SomeClass{
    private int i; //значение
    String s;

    public SomeClass() { //конструктор
    }

    SomeClass (String s, String s1){ //конструктор
        this.s = s;
    }
    public String someMetod(String s){ //метод, который возращает стринговое значение
        System.out.println("Выводим "+s);
        return s;
    }
}
public class Рефлексия {
    public static void main(String[] args) throws Exception {
//Создадим для начала экземпляр нашего класса
        SomeClass someClass = new SomeClass();
//Получить информацию о классе можно тремя способами:
        Class clss = someClass.getClass(); //1й способ
        Class clss2 = SomeClass.class; //2й способ
        Class clss3 = Class.forName("Ноябрь_07.SomeClass"); //3й способ, в нем мы указываем раположение нашего класса!!!
/*Теперь можно получить доступ к нашему классу без создания new SomeClass,
* таким образом:*/
        System.out.println(clss.getName()); //выведем имя класса!
        SomeClass someClass1 = (SomeClass)clss.newInstance();

        //Выведем все наши конструкторы:
        System.out.println("");
        System.out.println("Выводим наши конструкторы: ");
        Constructor[] constructors = clss.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters){
                System.out.println(parameter.getName()); //после компиляции все имена "i",
                                                //"s" заменятся на arg (arg0, arg1 и т.д)
                System.out.println(parameter.getType().getName());
            }
        }
        //getDeclaredConstructor в отличие от getConstructor
        //выведет все конструкторы включая приватные.
        /*Получим ответ:
        * Выводим наши конструкторы:
               Ноябрь_07.SomeClass - название и расположение нашего первого конструктора
               arg0 - значение нашего 2го конструктора (String s)
               java.lang.String - отношение значения 2го конструктора
               arg1 - значение нашего 2го конструктора (String s1)
               java.lang.String - отношение значения 2го конструктора
               Ноябрь_07.SomeClass - название и расположение нашего второго конструктора*/
        System.out.println("");
        System.out.println("Выводим наши методы: ");
        Method[] methods = clss.getDeclaredMethods();
        for (Method method : methods){
            System.out.println(method.getName());
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters){
                System.out.println(parameter.getName());
                System.out.println(parameter.getType().getName());
        }
        //так же мы можем вывести все модификаторы наших методов:
            System.out.println(Modifier.toString(method.getModifiers()));
            method.invoke(someClass, "конструкторы"); //можем запустить метод
                      //получим ответ: Выводим конструкторы
    }
    /*Получим ответ:
        * Выводим наши методы:
                   someMetod - название метода
                   arg0 - параметр метода
                   java.lang.String - принадлежность метода (относится к стрингам)
                   public - модификатор нашего метода.
                   Выводим контсрукторы*/
        System.out.println("");
        System.out.println("Выводим наши филды: ");
        Field[] fields = clss.getDeclaredFields();
        for (Field field : fields){
            System.out.println(field.getName());
            System.out.println(field.getType().getName());
            System.out.println(Modifier.toString(field.getModifiers()));
            //Мы можим изменить приватные филды:
            field.setAccessible(true);
            System.out.println(field.getInt(someClass)); //получаем значение
            field.setInt(someClass, 5); //задаем новое значение
            System.out.println(field.getInt(someClass)); //получаем новое значение
        }
        /*Получим ответ:
        * Выводим наши филды:
                   i
                   int
                   private
                   0
                   5
                   s
                   java.lang.String
                   */
}
}