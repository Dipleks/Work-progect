package Декабрь_14;/*Clonnable подробнее*/

public class ClonnableLesson /*implements Cloneable*/ {
    /*Заимплементим Cloneable, переопределим метод клон,
    * присвоим значение параметру i, отработаем код! В результате все
    * отработает!!! Но если оставить все как есть и убрать имплементацию, то
    * вылетет эсепшен! Но если мы уберем переопределение клон и вернем имплементацию,
    * то у нас опять всезаработает!!*/
    int i;
    public static void main(String[] args) throws CloneNotSupportedException {
        ClonnableLesson clonnableLesson = new ClonnableLesson();
        clonnableLesson.i = 5;
        ClonnableLesson clone = (ClonnableLesson) clonnableLesson.clone();
        System.out.println(clone.i);
    }
    /*@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/
}
