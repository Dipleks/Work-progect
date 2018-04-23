import java.util.Arrays;

public class Zadacha2 {
    public static void main(String[] args) {

        int[] r = new int[50];
        for (int l = 0; l < r.length; ++l) {
            r[l] = (l + 1) + l;

            System.out.print(r[l]+" ");
        }
        String p ="\n";
        System.out.println(p); //если написать .print, то просто отделятся две задачи друг от друга;
                               //если написать .println, то между задачами будет выведен пробел с новой строки.
        int[] s=new int[50];
        for (int g = 0; g<s.length; ++g) {
            s[g]= (99-g)-g;
            System.out.print(s[g]+" ");
        }
    }
}
