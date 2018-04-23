package Практические_занятия.ConsoleScene;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConTwo {

    public static void main(String[] args) throws IOException {

        String[] str = new String[10];

        FileReader fileReader = new FileReader("FileTest.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        bufferedReader.read();

        str[0] = bufferedReader.readLine();
        str[1] = bufferedReader.readLine();
        str[2] = bufferedReader.readLine();
        str[3] = bufferedReader.readLine();
        str[4] = bufferedReader.readLine();
        str[5] = bufferedReader.readLine();

        System.out.println(str[3]/* +" "+ str[1]*/);





    }
}
