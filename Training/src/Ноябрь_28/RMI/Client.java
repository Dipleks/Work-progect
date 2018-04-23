package Ноябрь_28.RMI;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import java.util.Enumeration;

public class Client {
    public static void main(String[] args) throws Exception {
        Context context = new InitialContext();
        //Передадим ip нашего сервера:
        Enumeration<NameClassPair> e = context.list("rmi://localhost/");
        while (e.hasMoreElements())
            System.out.println(e.nextElement().getName()); //выведем список всех приложений сервера

        IMath iMath = (IMath)context.lookup("rmi://localhost/imath");
        int result = iMath.add(1,2); //выозвем метод add из нашего интерфейса и передадим в него данные.
        System.out.println(result);
    }
}
