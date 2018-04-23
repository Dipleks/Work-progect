package Ноябрь_13;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.Callable;

/*Dynamic Proxy*/
/*Dynamic Proxy позволяет принимать нам массив интерфейсов.
* Методы этих интерфейсов перехватываются InvocationHandler-ом.
* На выходе получаем экземпляр некого класса(прокси), дающий
* следующую НУЖНУЮ функциональность:
    -он исполняет все методы интерфейсов;
    -при вызове этих методов этого экземпляра ВЫЗЫВАЕТСЯ МЕТОД
     INVOKE InvocationHandler-а. InvocationHandler уже дальше решает, как
    ему поступить - либо вызвать соответствующий метод реального класса,
    либо делать чтото еще.*/
public class DProxy {
    /*Как это все работает:*/
    public static void main(String[] args) {
        InvocationHandler handler = new MyProxy(new Integer(5));
 //Есть у нас интерфейс комперебл, колабл и мы хотим их реализовать!
 //Для этого мы берем массив интерфейсов и записываем
 //в него все интерфейсы которые хотим имплементровать:
        Class[] classes = new Class[]{Comparable.class, Callable.class};
 //Далее создаем прокси и передаем в него наши параметры:
        Object proxy = Proxy.newProxyInstance(null, classes, handler);
 //Теперь у нас есть прохи (proxy) и у него мы можем вызвать любой метод:
        proxy.getClass(); //он наследует все методы класса Object;
        proxy.toString();
        System.out.println(((Comparable)proxy).compareTo(3)); //Приведем наш proxy так же к интерфейсу Comparable.
        /*Т.е. proxy. мы вызываем invoke, из которого получем:
         * прокси (о), метод (method) и аргумент (objects) */
    }
    //для передачи 3го параметра нам нужен класс, создаем:
    static class MyProxy implements InvocationHandler{
        //создадим конструктор:
        Object target;
        public MyProxy(Object target) {
            this.target = target;
        }
        @Override
        public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
//Теперь можно делать все что нам необходимо: вызовим список передадим метод...:
            System.out.println(objects); //выведем список аргументов.
            return method.invoke(target, objects); //передадим метод конструктора
        }
    }
}
/*Вывод, прохси это обычный объект который может имплементровать сразу несколько
* интерфейсов и можем вызывать любые их методы, мы не заходим в оригинтальные методы,
* мы вызываем сначало наш инвок и из него мы можем вызвать оригинальные методы.*/
