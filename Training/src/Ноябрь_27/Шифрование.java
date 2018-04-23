package Ноябрь_27;/*Работа с шифрованием MD5 и SHA-1*/

import java.lang.management.ManagementFactory;
import java.security.MessageDigest;

public class Шифрование {
    public static void main(String[] args)throws Exception {
        /*У нас есть строчка:*/
        String str = "hello world";
        /*Мы можем ее зашифровать, т.е получить из нее хэш!
        * Чаще это применяют в логинах и паролях.
        * Получаем инструменты шифрования:*/
        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        //Далее получаем из них байты:
        byte[] bytes = md5.digest(str.getBytes());
        //Переведем наши байты в 16-ую систему:
        StringBuilder builder = new StringBuilder();
        for (byte b : bytes){
            builder.append(String.format("%02X ", b));
        }
        System.out.print(builder.toString());
    }
}
