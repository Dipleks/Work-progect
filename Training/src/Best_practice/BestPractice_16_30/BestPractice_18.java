package Best_practice.BestPractice_16_30;/*Wild cards*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.EmptyStackException;

public class BestPractice_18 {
    public static void main(String[] args) {
        /*Интеджеры я вляются наследниками намберов*/
        Stack<Number> numberStack = new Stack<>();
        Iterable<Integer> integers = new ArrayList<>();
        /*если я захочу в numberStack положить integers, то нам нужно дописать
        * в pushAll ? extend, и тогда это станет возможным:*/
        numberStack.pushAll(integers);
        //и допустим хочу считать это все в коллекцию, тогда нам нужно добамить в метод popAll ? super:
        Collection<Object> objects = new ArrayList<>();
        numberStack.popAll(objects);
/*
 *    Из всего этого следуют правила:
 * 1. Если мы что-то получаем и отдаем нам необходимо использовать extends и super.
 * 2. Нельзя делать, т.е никогда не использовать ваилкард: "E extends ?"
 */
    }
}
/*Допустим у нас есть класс Стэк:*/
class Stack<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    public Stack() {
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY]; }
    public void push(E e){ elements[size++] = e; }
    public E pop(){
        if (size == 0)
            throw new EmptyStackException();
            E result = elements[--size];
            elements[size] = null;
            return result;
    }
    //Теперь представим что мы захотели добавить 2 метода:
    public void pushAll(Iterable<? extends E> src){ for(E e : src) push(e); }
    public void popAll(Collection<? super E> dsr){
        while (!dsr.isEmpty()) dsr.add(pop());
    }
}
