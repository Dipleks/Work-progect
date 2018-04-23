package Ноябрь_28.RMI;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*RMI позволяет взаимодействовать между двумя приложениями находящихся на разных ПК.
*
* Создадим пакет RMI и в нем классы Server и Client. Для взаимодействия между ними создадим
* интерфейс. И создадим класс который будет имплементить наш интерфейс.*/
public class Server {
    public static void main(String[] args) throws Exception {
        Context context = new InitialContext();
        context.bind("rmi://localhost:1099/imath", new IMathImpl()); //добавим адрес обращения и объект
        //rmi - протокол, localhost:1099 - адрес и порт, imaht - название приложение (любое!)
        /*есть метод bind он будет работать нормально, но если есть работающая
        * программа с такимже именем он выкинит эсепшен.
        * И есть rebind - он днлает все тоже что и bind, но в случае работающей программы с
        * таким же именем он ее заглушает и запускает свою!*/
    }

}
interface IMath  extends Remote{
    int add(int a, int b) throws RemoteException; //добавим throws RemoteException
}
class IMathImpl extends UnicastRemoteObject implements IMath {
    protected IMathImpl() throws RemoteException {
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }
} /*Перед запуском необходимо прописать параметр:
  * Edit Configurations - VM options - "-Djava.rmi.server.codebase=http://localhost:1099/imath"*/