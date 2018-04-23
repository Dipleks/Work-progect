import java.lang.reflect.Array;
import java.util.Arrays;

public class Three {
    public static void main(String[] args) {
        String text1="    Задача 1. \n Создать массив, содержащий 10 первых нечетных чисел. \n";
        String text2="Вариант 1 \n";
        String text3="Вариант 2 \n";
        String text4="    Задача 2. \n Создать массив, содержащий 100 первых четных чисел. \n";

             // 1й способ, тут мы присваеваем каждому индексу свой элемент.
        int[] zadaca1v1 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

             // 2й способ, тут мы создаём определенное кол-во индексов и создаем условие для заполнения их элементами.
        int[] zadacha1v2 = new int[20];
        for (int a=0; a<zadacha1v2.length; ++a) {
            zadacha1v2[a]=++a;
        }
             // Задача 2. Тут мы создаем 100 индексов для ста четных цифр и создаем условия для получения элементов.
        int[] zadacha2 = new int[100];
        for (int b = 0; b<zadacha2.length; ++b) {
            zadacha2[b]= (b+2)+b; //создаем условия для получения элементов.
        }
        // Выводим решение на консоль!
        System.out.println(text1+text2+Arrays.toString(zadaca1v1));
        System.out.println("\n"+text3+Arrays.toString(zadacha1v2));
        System.out.println("\n"+text4+Arrays.toString(zadacha2));
    }
}
