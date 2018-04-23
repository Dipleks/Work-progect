package Collections;/*Queue*/

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueLesson {
    public static void main(String[] args) {
        Queue<String> linkedList = new LinkedList<>();
        //обратная очередь
        Deque<String> linkedDeque = new LinkedList<>();
        Deque<String> arrayDeque = new ArrayDeque<>();
        Queue<String> priorityQueue = new PriorityQueue<>();
        /*LinkedBlockingQueue блокирует очередь, например, у нас есть 10 элементов
        * в листе, мы их добовляем по порядку и когда дойдем до 10 очередь
        * заблокируется до тех пор пока, скажем, другой поток не заберет элементы:*/
        Queue<String> linkedBlockingQueue = new LinkedBlockingQueue<>();
    }
}
