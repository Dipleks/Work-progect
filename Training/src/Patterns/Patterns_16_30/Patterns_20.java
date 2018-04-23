package Patterns.Patterns_16_30;/*Iterator*/

public class Patterns_20 {
    public static void main(String[] args) {
        ArryConteiner arryConteiner = new ArryConteiner();
        Iterator iterator = arryConteiner.getIterator();
        while (iterator.hesNext()){
            System.out.println(iterator.next());
        }
    }
}
interface Iterator{
    boolean hesNext();
    Object next();
}
interface Conteiner{
    Iterator getIterator();
}
class ArryConteiner implements Conteiner{
    String[] arry = {"Max", "Jone", "Denis"};

    @Override
    public Iterator getIterator() {
        return new ArryIterator();
    }
    class ArryIterator implements Iterator{
        int index;
        @Override
        public boolean hesNext() {
            return (index < arry.length) ? true : false;
        }
        @Override
        public Object next() {
            if (hesNext()){
                return arry[index++];
            }
            return null; }}}