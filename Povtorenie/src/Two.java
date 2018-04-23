import java.util.Arrays;

public class Two {

    // Создайте массив, содержащий 10 первых нечетных чисел.
    // Выведете элементы массива на консоль в одну строку, разделяя запятой.
    public static void main(String[] args) {
        int[] z1 = new int[10];                              // 1й вариант.
        z1[0]=1;
        z1[1]=3;
        z1[2]=5;
        z1[3]=7;
        z1[4]=9;
        z1[5]=11;
        z1[6]=13;
        z1[7]=15;
        z1[8]=17;
        z1[9]=19;
        System.out.println(Arrays.toString(z1));


        int[] z2 = new int[20];                               // 2й вариант.
        for (int i = 0; i<z2.length; ++i) {
            z2[i] = ++i;
        }
        System.out.println(Arrays.toString(z2));
    }
}
