package Повторение;

import java.io.*;

public class One {
    public static void main(String[] args) throws Exception {
        File file = new File("/D: one.txt");
        FileWriter fileWriter = new FileWriter(file);
        FileReader fileReader = new FileReader(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        bufferedWriter.write("Проверка знаний!");
        bufferedWriter.newLine();
        bufferedWriter.write("Вторая строка!");
        bufferedWriter.flush();
        bufferedWriter.close();
        while (bufferedReader.ready()){
        System.out.println(bufferedReader.readLine());}
    }
}
