package Patterns.Patterns_16_30;/*Template*/

public class Patterns_27 {
    public static void main(String[] args) {
//Теперь всего лишь делаем:
        Template template = new Job();
        template.run();
    }
}
abstract class Template{
    abstract void stepOne();
    abstract void stepTwo();
    abstract void stepThree();

    void run(){
        stepOne();
        stepTwo();
        stepThree();
    }
}
class Job extends Template{
    @Override
    void stepOne() {
        System.out.println("fist step");
    }

    @Override
    void stepTwo() {
        System.out.println("second step");
    }

    @Override
    void stepThree() {
        System.out.println("third step");
    }
}
