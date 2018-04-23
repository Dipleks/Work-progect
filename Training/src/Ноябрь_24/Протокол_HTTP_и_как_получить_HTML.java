package Ноябрь_24;

import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Протокол_HTTP_и_как_получить_HTML {
    public static void main(String[] args) throws Exception {
        //Получим HTML фаил:
        URLConnection connection = new URL ("http://www.google.com/").openConnection();
        Scanner scanner = new Scanner(connection.getInputStream());
        scanner.useDelimiter("\\Z"); //без этого вернется только доктайп
        System.out.println(scanner.next()); //выводим HTML страницу на консоль

        //Получим данные о странице:
        Map<String, List<String>> headerFields = connection.getHeaderFields();
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()){
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }
    }
}
