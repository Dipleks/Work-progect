package Октябрь_27;

import com.sun.org.apache.bcel.internal.generic.ArithmeticInstruction;
import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

public class One extends In{
    public static void main(String[] args) {
        In in = new In();
        int d = in.y;
        if (d > 0 ){System.out.println(d);} else {
            System.out.println("Ложь!");
        }
        try {

            if (d>0){}
            System.out.println("NO");
        } catch (ArithmeticException y){
            System.out.println("Yes");
        }
        try {
            int[] a = {10, 20, 30};
            for (int i = 0; i<3; i++)
                System.out.println(a[i]);
        } catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Имеется одна ошибка!");
        }
            System.out.println("Выполнено без ошибок!");
    }
}
class In {
    int r = 4;
    int t = 6;
    int y = r/t;
}

