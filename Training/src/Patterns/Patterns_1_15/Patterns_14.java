package Patterns.Patterns_1_15;/*Facade - помогает спрятать сложность
функционала за приметивным интерфесом.*/

import java.io.BufferedReader;
import java.io.FileReader;

public class Patterns_14 {
    public static void main(String[] args) throws Exception{
//А тут у нас будет лишь ссылка на большой код, а выгледит все как маленький:
        FileReadFacade fileReadFacade = new FileReadFacade();
        System.out.println(fileReadFacade.readFile("FileTest.txt"));
    }
}
//Спрячем наш большой код:
class FileReadFacade {
    String readFile (String filename)throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        StringBuilder stringBuilder = new StringBuilder();
        int j = 0;
        while ((j = reader.read()) != -1){
            stringBuilder.append((char)j);
        }
        return stringBuilder.toString();
    }
}
