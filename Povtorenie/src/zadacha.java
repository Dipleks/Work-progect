import java.util.Arrays;

public class zadacha {
    public static void main(String[] args) {
        int[] c=new int[10];
        for (int t=0; t<c.length; ++t) {
            c[t]=(t+2)+t;
            System.out.print(c[t]+" "); // " " - ставят пробел между элементами;
        }
        String r= "\n";
        System.out.print(r);
        int[] c1=new int[9];
        for (int t1=0; t1<c1.length; ++t1) {
            c1[t1] = (t1 + 4) + t1;
            System.out.print(c1[t1] + "\n"); // "\n" - выстраивает каждый элемент с новой строки.
        }
    }
}
