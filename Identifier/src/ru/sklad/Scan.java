package ru.sklad;
import java.util.Scanner; //Вызов оператора который сканирует введеные пользователем данные в консоле.

public class Scan {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        /*int r;
        r = num.nextInt();
        System.out.println("Вы ввели число: "+r);*/ //для чисел

        String s;
        s = num.nextLine();                         //для текста
        System.out.println("Вы на писали: "+s);     //Ответ: я ввожу на консоли текст, программа мне отвечает.

    }
}
