public class One {
    public static void main(String[] args) {
        String uslovie = ("Необходимо найти n: 41457+132,5*5-50231/2=n. Проверить, что n>0. \n"); // Условие задачи.
        String uslovie2 = ("Присвоить значению n инкременту. \n"); // Второе условие задачи.
        String reshenie = ("n равно: "); // Решение первой части условия один задачи.
        String reshenie2 = ("n>0: "); // Решение второй части условия задачи один.
        String reshenie3 = ("n присвоена инкремента: "); // Решение второго услоия задачи.
        System.out.println(uslovie + uslovie2);

        // Решение 1й части первого условия.
        int a = 41457;
        double b = 132.5;
        int c = 5;
        int d = 50231;
        int e = 2;
        double n = a+b*c-d/e;
        System.out.println(reshenie + n);

        //Решение 2й части первого условия.
        if (n>0) {
            System.out.println(reshenie2 + "Верно!");
        } else {
            System.out.println(reshenie2 + "Не верно!");
        }

        // Решение второго условия.
        double n1 = ++n;
        System.out.println(reshenie3 + n1);
    }
}
