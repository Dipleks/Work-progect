package Ноябрь_10;

import java.util.concurrent.Semaphore;

/*Semaphore - семафоры.*/
/*Данный класс помогает работать с ресурсами потока.
* Приведем пример, в ресторане есть 2 столика,
* в него приходят люди они могут сесть кушать,
* пока столики заняты остальным людям придется подождать:*/
public class многопоточность_17 {
    public static void main(String[] args) {
/*Для управления доступом к ресурсу семафор использует счетчик,
представляющий количество разрешений. Если значение счетчика
больше нуля, то поток получает доступ к ресурсу, при этом
счетчик уменьшается на единицу. После окончания работы с ресурсом
поток освобождает семафор, и счетчик увеличивается на единицу.
Если же счетчик равен нулю, то поток блокируется и ждет, пока
не получит разрешение от семафора.

Установить количество разрешений для доступа к ресурсу можно
с помощью конструкторов класса Semaphore: Semaphore(int permits)
и Semaphore(int permits, boolean fair)!*/

/*Параметр permits указывает на количество допустимых разрешений
для доступа к ресурсу. Параметр fair во втором конструкторе
позволяет установить очередность получения доступа. Если он
равен true, то разрешения будут предоставляться ожидающим потокам
в том порядке, в каком они запрашивали доступ. Если же он равен
false, то разрешения будут предоставляться в неопределенном порядке.
Для получения разрешения у семафора надо вызвать метод acquire(),
который имеет две формы: void acquire() throws InterruptedException
и void acquire(int permits) throws InterruptedЕxception.

Для получения одного разрешения применяется первый вариант,
а для получения нескольких разрешений - второй вариант.
После вызова этого метода пока поток не получит разрешение, он блокируется.
После окончания работы с ресурсом полученное ранее разрешение
надо освободить с помощью метода release(): void release() и
void release(int permits). Первый вариант метода освобождает
одно разрешение, а второй вариант - количество разрешений,
указанных в permits.*/
        Semaphore stol = new Semaphore(2); //создаем коллчисетво ресурса.
        Person person = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();
        Person person6 = new Person();
        Person person7 = new Person();

        person.stol = stol;
        person2.stol = stol;
        person3.stol = stol;
        person4.stol = stol;
        person5.stol = stol;
        person6.stol = stol;
        person7.stol = stol;

        person.start();
        person2.start();
        person3.start();
        person4.start();
        person5.start();
        person6.start();
        person7.start();
    }
}
class Person extends Thread {
    Semaphore stol;
    @Override
    public void run() {
        System.out.println(getName()+" ждет столик!");
        try {
            stol.acquire();
            System.out.println(getName()+" кушает");
            this.sleep(1000);
            System.out.println(getName()+" освобождает стол!");
            stol.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
