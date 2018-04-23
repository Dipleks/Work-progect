package Patterns.Patterns_16_30;/*Visitor позволяет нам менять код
который мы не можем менять.*/

public class Patterns_28 {
    public static void main(String[] args) {
/*После создания Visitor и ConkretVisitor, у нас появляется позможность
* менять динамически код в классах Dog и Cat, которые, например, могут
* находится на другом сервере!*/
        Animall dog = new Dog();
        dog.doJob(new ConkretVisitor());
        Animall cat = new Cat();
        cat.doJob(new ConkretVisitor());
    }
}
interface Animall{
    void doJob(Visitor visitor);
}
class Dog implements Animall{
    @Override
    public void doJob(Visitor visitor) {
        visitor.doDog();
    }
}
class Cat implements Animall{
    @Override
    public void doJob(Visitor visitor) {
       visitor.doCat();
    }
}

interface Visitor{
    void doDog();
    void doCat();
}
class ConkretVisitor implements Visitor{
    @Override
    public void doDog() {
        System.out.println("gav");
    }

    @Override
    public void doCat() {
        System.out.println("may");
    }
}