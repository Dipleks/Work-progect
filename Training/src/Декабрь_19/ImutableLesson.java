package Декабрь_19;/*Imutable классы, как ранее мы изучали
volatile и synchronized, очень замедляют работу программы,
и являются не лучшим решением их использование.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImutableLesson {
    public static void main(String[] args) {
/*Теперь мы можем создать наш неизменяемый класс Imutable:*/
        MyImutable myImutable = new MyImutable(5, new ArrayList<>(), "hello", new Person());
        /*теперь мы можем получать данные!!! И даже если мы изменим их, то в
        * оригинале они останутся неизменными!!!*/
        myImutable.getPerson().age = 5; //изменим значение Person
        System.out.println(myImutable.getPerson().age); //получим оригинал Person, ответ будет 0, т.е оригинал остался неизменным!!!
    }
    /*В Imutable классе не должно быть сеторов, поля должны быть финальными и приватными,
    * и класс должен быть тоже финальным! Делаем конструктор данных!*/
    final static class MyImutable {
        private final int i;
        private final List<String> list;
        private final String str;
        private final Person person;
//        private final Object object;

        public MyImutable(int i, List<String> list, String str, Person person/*, Object object*/) {
       /*Инты можно не менять т.к они являются по умолчанию Imutable*/
            this.i = i;
        /*Но листы, например, можно изменить, для того чтоб этого не произошло делаем их инюдебл
        * а такж делаем его клон!*/
//            this.list = list;
            this.list = Collections.unmodifiableList(cloneList(list)); //теперь лист небудет меняться!!!
       /*Стринги можно не менять т.к они являются по умолчанию Imutable*/
            this.str = str;
            //person тоже необходимо клонировать!
//            this.person = person;
            this.person = (Person) person.clone();
     /*А вот object склонировать не получится, к этом классу нет доступа! Выходом
     * может послужить обертка, которую придется делать самостоятельно!!! Обертка будет
     * похожа на класс Person, но ее мы делать не будем, закоментим наш object!!!*/
//            this.object = object;
        }
        //создадим клон:
        private List<String> cloneList(List<String> list){
            List<String> clone = new ArrayList<>(list.size());
            for (String s : list){
                clone.add(s);
            }
            return clone;
        }
        //добовляем гетторы:
        public int getI() { return i; }
        public List<String> getList() { return list; }
        public String getStr() { return str; }

        public Person getPerson() {
            //тут возращаем клон:
//            return person;
            return (Person)person.clone(); }}

    static class Person implements Cloneable {
        int age;
        @Override
        protected Object clone() /*throws CloneNotSupportedException*/ {
            //поместим в тайкеч для удобства:
            try {
                return super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
                //и вернем null:
                return null;
            }
        }
    }
}
