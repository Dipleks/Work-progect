package Практические_занятия.Serializator1;

import java.io.InvalidObjectException;

public class PrTest  {

    public static void main(String[] args) {
        Bd bd = new Bd("2", "3");
        System.out.println(bd + "\n------");

        String file = "D:\\bd.data";
        Ser ser = new Ser();
//        boolean b = ser.seri(bd, file);
//        System.out.println(b + "\n-------");

        Bd rez = null;
        try {
            rez = ser.dser(file);
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
        System.out.println(rez + "\n------");
    }

}
