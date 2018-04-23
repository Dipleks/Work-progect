package Практические_занятия.On;

public class OneThread {
    public static void main(String[] args) {
        Testing testing1 = new Testing();
        Testing testing2 = new Testing();
        Testing testing3 = new Testing();
        testing1.start();
        testing2.start();
        testing3.start();

    }
    static class Testing extends Thread{
        @Override
        public void run() {
            System.out.println(getName()+" Run thread!");
        }
    }
}
