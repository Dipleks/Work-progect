package Декабрь_12;/*Stack Queue Dequeue*/
import java.util.*;

public class Stack_Queue_Dequeue {
    public static void main(String[] args) {
//        Stack<String> stack = new Stack<>();
//        stack.add("One"); //можем поместить в стек так
//        stack.push("Two"); //можем поместить в стек так
//        System.out.println(stack.peek()); //достает последний элемент
//        System.out.println(stack.peek());
//        System.out.println(stack.pop()); //достает элеметы поледний и удалит его
//        System.out.println(stack.pop()); //если вызвать повторно достанит последний (из оставшихся) и удалит его
 /*Стек достает все значения с последнего добавленного (в обратном порядке).*/

//        Queue<String> queue = new PriorityQueue<>();
//        //два способа добавления:
//        queue.add("ONE");
//        queue.offer("TWO");
//        queue.offer("TRHEE");
//        queue.remove(); //удаляет первый элемент
//        //queue.poll(); //тоже удаляет первый элемент
//        queue.peek(); //дастает элемент
//        for (String s : queue) {
//            System.out.println(s); }

        Deque<String> deque = new ArrayDeque<>(10);
        Deque<String> deque2 = new LinkedList<>();
        deque.add("One");
        deque.offer("Two");
        deque.addLast("Three");
        deque.offerLast("Four");
        //обратный порядок:
        deque.addFirst("Zero");
        deque.offerFirst("minus one");
        deque.push("minus two");
        deque.removeLast(); //удаление с конца
        deque.remove(); //удаление с начала
        //достают элементы:
        deque.element();
        deque.getFirst();
        deque.peek();
        deque.peekFirst();
        //достают и удаляют:
        deque.poll();
        deque.pollFirst();
        for (String s : deque){ System.out.println(s); } }}