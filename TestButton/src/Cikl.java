public class Cikl {
    public static void main(String[] args) {
        int[] r = new int[3];
        r[0] = 5;
        r[1] = 7;
        r[2] = 9;

        for (int i = 0; i < r.length; i++) {
            System.out.println(r[i]);
            if (r[1] == 7){
                r[1] = 11;
            }
        }
    }
}
