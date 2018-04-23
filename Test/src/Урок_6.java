public class Урок_6 {
    public static void main(String[] args) {
        String t1 = "Необходимо решить уравнения a=b, 4.5/5, 6+3<10, 75*5/6>=30";
        String a1 = "a";
        String a2 = "b";
        boolean r = a1 == "a";
        boolean t = a2 == "b";
        if (r=t) {
            System.out.println("Верно!");
        } else {
            System.out.println("Не верно!");
        }
        double w = 4.5;
        double w1 = 5;
        double w3 = w/w1;
        {
            System.out.println(w3);
        }
        int i1=6;
        int i2=3;
        int i3=10;
        if (i1+i2<i3) {
            System.out.println("Верно!");
        } else {
            System.out.println("Не верно!");
        }
        int y1=75;
        int y2=5;
        int y3=6;
        int y4=30;
        int y5=y1*y2;
        double y6=y5/y3;
        {
            System.out.println(y5);
        }
        {
            System.out.println(y6);
        }
        if (y6>=y4) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }

    }
}
