package Collections;/*Коллекции — это контейнеры, группы элементов,
которые представляют собой единое целое.
    Интерфейс итератора (Iterator)
Итератор предоставляет методы для перебора элементов любой коллекции.
Мы можем получить экземпляр итератора из коллекции с помощью метода
iterator. Итераторы позволяют удалить элементы из базовой коллекции
во время выполнения итерации.

    Интерфейс множества (Set)
Набор представляет собой коллекцию, которая не может содержать повторяющиеся
элементы. Этот интерфейс представляет математическую абстракцию для
представления множеств в виде колоды карт.
Платформа Java содержит три реализации Set : HashSet, TreeSet и LinkedHashSet.
Интерфейс Set не позволяет осуществлять произвольный доступ к элементу в коллекции.
Мы можем использовать итератор или цикл по каждому элементу для перебора элементов.

    Интерфейс Список (List)
Список представляет собой упорядоченный набор элементов и может
содержать повторяющиеся элементы. Вы можете получить доступ к любому элементу
по индексу. Список представляет собой динамический массив. Список является
одним из наиболее используемых типов коллекций. ArrayList и LinkedList
классы являются реализацией интерфейса List.

Интерфейс Очередь (Queue)
Очередь — коллекция, которая используется для хранения нескольких элементов.
В очереди обычно, но не обязательно, элементы располагаются по принципу FIFO
(first-in, first-out = первый вошел, первый вышел). В очереди FIFO, все
новые элементы вставляются в конец очереди.

Интерфейс Dequeue
Коллекция Dequeue поддерживает вставку элемента и удаление элемента как
в начало, так и в конец коллекции. Название Deque это сокращение от «двухконцевой
очереди» и, как правило, произносится как «deck». Большинство реализаций DEQUE
не устанавливают ограничения на количество элементов.
Этот интерфейс определяет методы для доступа к элементам на концах дека.
Методы предоставляются для вставки, удаления, извлечения элемента.

Интерфейс Map
Map является объектом, который содержит ключи и значения. Map не может содержать
дубли ключей: Каждый ключ может иметь только одно значение.
Платформа Java содержит три реализации Map: HashMap, TreeMap и LinkedHashMap.

Интерфейс ListIterator
ListIterator (итератор для списков) позволяет программисту проходить список
в любом направлении, изменять список во итерации, и получать текущую позицию итератора в списке.

Интерфейс SortedSet
SortedSet представляет собой множество, в котором элементы хранятся в порядке возрастания.

Интерфейс SortedMap
SortedMap содержит элементы в порядке возрастания ключей. Эта Map является
аналогом SortedSet. SortedMap используются для естественно упорядоченных пар
ключ/значение, например, словарей и телефонных справочников.

Классы реализующие Java коллекции!
Java Collections framework предоставляет большое количество классов с реализацией
интерфейсов коллекций. Наиболее используемыми и распространенными реализациями
являются ArrayList, HashMap и HashSet. Обычно классы, реализующие коллекции,
не являются потокобезопасными.

HashSet Класс
Это базовая реализация интерфейса Set, которая базируется на HashMap.
Этот класс предлагает одинаковое время выполнения базовых операций
(add, remove, contains и size). Мы можем установить начальную емкость и
коэффициент нагрузки для этой коллекции.

Класс TreeSet
NavigableSet создан на основе TreeMap. Элементы могут быть упорядочены
в порядке их добавления или с помощью компаратора.
Эта реализация обеспечивает log(n) время выполнения для основных операций (add, remove и contains).

Класс ArrayList
ArrayList — реализация интерфейса List в виде массива переменной длины.
Реализует все операции со списком. Плюс к этому ArrayList обеспечивает
методы для манипулирования размером массива, который используется для
хранения списка. (Этот класс примерно соответствует вектору, но не является synchronized).

LinkedList класс
LinkedList — реализация интерфейсов List и Deque в виде двусвязного списка.
Осуществляет все дополнительные операции со списком.

Класс HashMap
HashMap представляет собой реализацию интерфейса Map. Эта реализация
обеспечивает все дополнительные операции Map и позволяет нулевые значения и
ключи со значением null. Класс HashMap примерно эквивалентно Hashtable,
кроме того, что он не синхронизирован и позволяет null. Этот класс не дает
никаких гарантий упорядоченного размещения элементов.
   Класс TreeMap
TreeMap представляет собой красно-черное дерево, основанное на NavigableMap.
Map сортируются с помощью компаратора.
Эта реализация обеспечивает log(n) время выполнения для операций containsKey, get, put и remove.
   Класс PriorityQueue
В очереди элементы додаются в порядке FIFO, но иногда мы хотим добавлять
элементы на основании их приоритета. В этом случае мы можем использовать
PriorityQueue, обеспечив при этом реализацию компаратора для элементов PriorityQueue.
Следует отметить, что PriorityQueue не позволяют хранить null.
    Класс Collections
Этот класс состоит исключительно из статических методов, которые работают
или возвращают коллекции. Он содержит полиморфные алгоритмы, которые используются
при работе с коллекциями.
Этот класс содержит методы основных алгоритмов Сollection framework, а именно
методы бинарного поиска, сортировка, перемешивание, а также метод, возвращающий
обратный порядок элементов и многие другие.*/
import java.util.*;
public class CollectionLesson {
    public static void main(String[] args) {
        /*Есть основной интерфейс коллекции и его имплементации и основной интерфес мап*/
        Collection<String> collection;
        List<String> list; //работают на основе индексов
        Set<String> set; //унакльные
        Queue<String> queue; //работают на основе очередей
        Map<String, String> map;}} //работают как ключ-значение