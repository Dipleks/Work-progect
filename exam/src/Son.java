import com.tre.Btest;

public class Son {
    public static void main(String[] args) {
        Family family = new Family();
        Btest btest = new Btest();
        System.out.println(btest.f);
        int sn = 1;
        boolean st = sn < 1;
        if (st) {
            System.out.println(family.dsr + " не имеет детей!");
        } else {
            System.out.println(family.dsr + " имеет одного сына!");
        }
    }

}
