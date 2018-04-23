public class Урок_5 {
    public static void main(String... args) {
        String t1 = "Необходимо установить верно или не верно выражение 4.5+4=>8.2+2.1! ";
        String t2 = "Рещение: ";
        double a1 = 4.5;
        double a2 = 8.2;
        double a3 = 2.1;
        double a4 = 4;
        if (a1+a4>=a2+a3) {
            System.out.println(t1 + t2 + "Верно!");
        } else {
            System.out.println(t1 + t2 + "Не верно!");
        }
    }

}
