public class Family {
    public static void main(String[] args) {
        byte father = 1;
        byte mather = 1;
        byte daughter1 = 1;
        byte daughter2 = 1;
        byte son = 1;
        byte daughter1m = 1;
        byte daughter1s = 1;
        int sum = father+mather+daughter1+daughter2+son+daughter1m+daughter1s;
        System.out.println("Количество человек: "+sum);  //ответ: 7 членов семьи.

        String f = "Денис - ";
        String m = "Кристина - ";
        String d1 = "Ксенья - ";
        String d2 = "Екатерина - ";
        String s = "Иван - ";
        String d1m = "Роман - ";
        String d1s = "Леонид - ";
        short f1 = 52;
        short m1 = 48;
        short d11 = 24;
        short d21 = 21;
        short s1 = 15;
        short d1m1 = 28;
        short d1s1 = 3;
        System.out.print(f+f1+"; "+m+m1+"; "+d1+d11+"; "+d2+d21+"; "+s+s1+"; "+d1m+d1m1+"; "+d1s+d1s1+".\n");
    }
    String dsr = "Ксенья";
    String ds(){return dsr;}


}
