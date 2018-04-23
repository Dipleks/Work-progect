public class Урок_9_4 {
    public static void main(String[] args) {
        int a = 4;
        double b = -4.5;
        double c = a+b;
        boolean c1;
        c1 = c<0;
        boolean c2;
        c2 = c>0;
        System.out.println("Ответ: с=" + c);
        if (c1) {
            System.out.println("Выражение с<0 верно!"); // если результат с<0, то ответ правельный
        } else {
            System.out.println("Нет");  // если результат с>0, то ответ не правельный
        }
        if (c2) {
            System.out.println("Нет");  // если результат с>0, то ответ не правельный
        } else {
            System.out.println("Выржение с>0 не верно!"); // если результат с<0, то ответ правельный
        }
    }


}
