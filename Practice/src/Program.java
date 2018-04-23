import java.util.HashSet;

public class Program {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(2345);
        set.add(65);
        set.add(3);
        set.add(1);
        set.add(467);
        set.add(9678);
        set.add(34733473);

        for (Integer i : set)
        {
            System.out.println(i);
        }
    }
}
