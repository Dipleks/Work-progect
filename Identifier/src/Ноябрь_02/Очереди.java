package Ноябрь_02;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Очереди {
/*PriorityQueue является неограниченной очередью.
* Элементы упорядочены по умолчанию в естественном
* порядке или же отсортированы с помощью компаратора.
* PriorityQueue не позволяет добавлять null-значения
* и non-comparable объекты. Размер приоритетной
* очереди (PriorityQueue) неограничен, но мы можем
* указать начальный размер в момент его создания.
* Когда мы добавляем элементы в приоритетную очередь,
* её размер увеличивается автоматически. PriorityQueue
* не является потобезопасной! Для этих целей в Java
* реализован класс PriorityBlockingQueue, реализующий
* интерфейс BlockingQueue. Именно он используется в
* многопоточной среде. В PriorityQueue добавление/удаление
* элементов происходит за время O(log(n)).*/
         public static void main(String[] args) {
             Queue queue = new LinkedList(); //выведет очередь как она записана 1,3,2
             queue.offer(1); //значения можно записать как offer, так и add.
             queue.add(3);
             queue.add(2);
             while (queue.size()>0){
                 System.out.println(queue.poll()); //Ответ: 1, 3, 2
             }
             Queue queue1 = new PriorityQueue(); //выведет очередь по порядку элементов
             queue1.add(1);
             queue1.add(3);
             queue1.add(2);
             while (queue1.size()>0){
                 System.out.println(queue1.poll()); //Ответ: 1,2,3
             }
}
}
