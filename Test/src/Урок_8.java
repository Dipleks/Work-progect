import java.util.Arrays;

public class Урок_8 {
    public static void main(String... args) {
        String a= "Изучаем масивы! ";
        int[] massiv;
        massiv = new int[10];
        System.out.println(a + massiv.length);


        int[] massiv1 = new int[5];
        massiv1[4] = 4;
        System.out.println(massiv1.length);


        int[] massiv2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(massiv2));

        int[] massiv3 = {1, 2, 5, 8, 10};
        for(int r=0; r < massiv3.length; r++)
            System.out.println(massiv3[r]);


        int t = 0;
        int t1 = ++t;
        System.out.println(t1); // Проверяю знау ++ (Инкримент - значение увеличивающее оперенду t на 1)

    }
}
