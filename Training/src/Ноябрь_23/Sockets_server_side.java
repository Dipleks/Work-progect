package Ноябрь_23;/*Sockets server side - Сокеты со стороны сервера.*/

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*Создадим свой сервер и получим с него информацию предыдущей программой.*/
public class Sockets_server_side {
    public static void main(String[] args) throws Exception{
        try (ServerSocket serverSocket = new ServerSocket(8189);
             Socket socket = serverSocket.accept();
             Scanner scanner = new Scanner(socket.getInputStream())){
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            //printWriter.println("Hello!");

            //сделаем интересеней, программа не закроется до тех пор пока мы не вернем ей exit.
            while (scanner.hasNextLine()){
                String str = scanner.nextLine();
                printWriter.println("you ve send: " + str);
                System.out.println(str);
                if (str.equals("exit")){
                    break;
                }
            } /*В командной строке набираем telnet localhost 8189 и общаемся
              * с программой до тех пор пока не напишем exit.*/
        }
    }
}
