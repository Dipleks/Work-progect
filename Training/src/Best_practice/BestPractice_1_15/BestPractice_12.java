package Best_practice.BestPractice_1_15;/*Чем копмозиция лучше наследования*/

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class BestPractice_12 {
    public static void main(String[] args) {
  /*Проблем наследования в том, что оно нарушает инкапсуляцию.*/
//        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        InstrumentedSet<String> s = new InstrumentedSet<>();
        s.addAll(Arrays.asList("Snap", "Crackle", "Pop")); //добавим 3 элемента
        System.out.println(s.getAddCount());
        /*Но в результате получим ответ 6 (6 элементов).
        * Это произошло в результате двух заходов, сначало мы добавили 3 элемента в add,
        * затем добавили еще 3 элемента в addAll. Результатом стал баг вместо 3 элементов 6.
        * Лучше применить композицию, тем самым можно избежать данной проблемы, т.к проподает полиморфный
        * вызов. Есть и исключения: Stack наследуется от вектора но неявляется им, Properties
        * наследуются от хэштейбл, но неявляются ими.*/
    }
}
//Наследование:
class InstrumentedHashSet<E> extends HashSet<E>{
    private int addCount = 0;
    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e); }
    @Override
    public boolean addAll(Collection<? extends E> collection) {
        addCount += collection.size();
        return super.addAll(collection); }
    public int getAddCount() { return addCount; }}
//Композиция:
class InstrumentedSet<E> {
    private int addCount = 0;
    private final Set<E> set = new HashSet<>();
    public boolean add(E e) { addCount++;
        return set.add(e); }
    public boolean addAll(Collection<? extends E> collection) {
        addCount += collection.size(); return set.addAll(collection); }
    public int getAddCount() { return addCount; }}