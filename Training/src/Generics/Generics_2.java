package Generics;/*Наследование Generics*/

public class Generics_2 {
    public static void main(String[] args) {
        Parent parent = new GetParen<>();
    }
}
//Варианты наследования джинериков:
class Parent{}

class GetParen<T> extends Parent {}

class Chill extends GetParen {}
class Chill1 extends GetParen<String> {}
class Chill2<T> extends GetParen<T> {}
class Chill3<X, T, Y> extends GetParen<T> {}
class Chill4<X, T, Y> extends GetParen {}
class Chill5<X, T, Y> extends Chill4<X, T, Y> {}
class Chill6<X, T, Y> extends Chill4<Integer, T, String> {}

//с интерфейсами:
interface Giner<T> { T getT();}

class One implements Giner{
    @Override
    public Object getT() { return null; }}
class Two implements Giner<String>{
    @Override
    public String getT() { return null; }}
class Three<T> implements Giner<T> {
    @Override
    public T getT() { return null; }}