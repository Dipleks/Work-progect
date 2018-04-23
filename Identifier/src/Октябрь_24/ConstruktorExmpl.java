package Октябрь_24;

class MyParent{
    MyParent (){
        System.out.println("MyParent Construktor!");
    }
}
public class ConstruktorExmpl extends MyParent {
    /*Конструктор это метод у которого нет возвращаемого значения и имя которого совпадает с именем класса.*/

    ConstruktorExmpl(){
        //super(); компелятор вызывает данный параметр автоматически и этот параметр идет всегда первы, он не видем.
        System.out.println("Construktor Exmpl!");
    }

    public static void main(String[] args) {
        new ConstruktorExmpl();
    }
}

